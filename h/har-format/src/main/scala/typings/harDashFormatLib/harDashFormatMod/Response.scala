package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** _non-standard_  */
  var _transferSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Size of the received response body in bytes.
    *
    * - Set to zero in case of responses coming from the cache (`304`).
    * - Set to `-1` if the info is not available.
    */
  var bodySize: scala.Double
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** Details about the response body. */
  var content: Content
  /** List of cookie objects. */
  var cookies: js.Array[Cookie]
  /** List of header objects. */
  var headers: js.Array[Header]
  /**
    * Total number of bytes from the start of the HTTP response message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    *
    * _The size of received response-headers is computed only from headers
    * that are really received from the server. Additional headers appended by
    * the browser are not included in this number, but they appear in the list
    * of header objects._
    */
  var headersSize: scala.Double
  /** Response HTTP Version. */
  var httpVersion: java.lang.String
  /** Redirection target URL from the Location response header. */
  var redirectURL: java.lang.String
  /** Response status. */
  var status: scala.Double
  /** Response status description. */
  var statusText: java.lang.String
}

object Response {
  @scala.inline
  def apply(
    bodySize: scala.Double,
    content: Content,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: scala.Double,
    httpVersion: java.lang.String,
    redirectURL: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    _transferSize: scala.Int | scala.Double = null,
    comment: java.lang.String = null
  ): Response = {
    val __obj = js.Dynamic.literal(bodySize = bodySize, content = content, cookies = cookies, headers = headers, headersSize = headersSize, httpVersion = httpVersion, redirectURL = redirectURL, status = status, statusText = statusText)
    if (_transferSize != null) __obj.updateDynamic("_transferSize")(_transferSize.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[Response]
  }
}


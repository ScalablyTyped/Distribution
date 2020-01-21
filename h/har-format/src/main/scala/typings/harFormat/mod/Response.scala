package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** _non-standard_  */
  var _transferSize: js.UndefOr[Double | Null] = js.undefined
  /**
    * Size of the received response body in bytes.
    *
    * - Set to zero in case of responses coming from the cache (`304`).
    * - Set to `-1` if the info is not available.
    */
  var bodySize: Double
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
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
  var headersSize: Double
  /** Response HTTP Version. */
  var httpVersion: String
  /** Redirection target URL from the Location response header. */
  var redirectURL: String
  /** Response status. */
  var status: Double
  /** Response status description. */
  var statusText: String
}

object Response {
  @scala.inline
  def apply(
    bodySize: Double,
    content: Content,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: Double,
    httpVersion: String,
    redirectURL: String,
    status: Double,
    statusText: String,
    _transferSize: Int | Double = null,
    comment: String = null
  ): Response = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    if (_transferSize != null) __obj.updateDynamic("_transferSize")(_transferSize.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


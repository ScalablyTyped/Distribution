package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Size of the request body (POST data payload) in bytes.
    *
    * Set to `-1` if the info is not available.
    */
  var bodySize: scala.Double
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** List of cookie objects. */
  var cookies: js.Array[Cookie]
  /** List of header objects. */
  var headers: js.Array[Header]
  /**
    * Total number of bytes from the start of the HTTP request message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    */
  var headersSize: scala.Double
  /** Request HTTP Version. */
  var httpVersion: java.lang.String
  /** Request method (`GET`, `POST`, ...). */
  var method: java.lang.String
  /** Posted data info. */
  var postData: js.UndefOr[PostData] = js.undefined
  /** List of query parameter objects. */
  var queryString: js.Array[QueryString]
  /** Absolute URL of the request (fragments are not included). */
  var url: java.lang.String
}

object Request {
  @scala.inline
  def apply(
    bodySize: scala.Double,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: scala.Double,
    httpVersion: java.lang.String,
    method: java.lang.String,
    queryString: js.Array[QueryString],
    url: java.lang.String,
    comment: java.lang.String = null,
    postData: PostData = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bodySize")(bodySize)
    __obj.updateDynamic("cookies")(cookies)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("headersSize")(headersSize)
    __obj.updateDynamic("httpVersion")(httpVersion)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("queryString")(queryString)
    __obj.updateDynamic("url")(url)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (postData != null) __obj.updateDynamic("postData")(postData)
    __obj.asInstanceOf[Request]
  }
}


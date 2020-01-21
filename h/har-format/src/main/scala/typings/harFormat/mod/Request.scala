package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Size of the request body (POST data payload) in bytes.
    *
    * Set to `-1` if the info is not available.
    */
  var bodySize: Double
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
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
  var headersSize: Double
  /** Request HTTP Version. */
  var httpVersion: String
  /** Request method (`GET`, `POST`, ...). */
  var method: String
  /** Posted data info. */
  var postData: js.UndefOr[PostData] = js.undefined
  /** List of query parameter objects. */
  var queryString: js.Array[QueryString]
  /** Absolute URL of the request (fragments are not included). */
  var url: String
}

object Request {
  @scala.inline
  def apply(
    bodySize: Double,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: Double,
    httpVersion: String,
    method: String,
    queryString: js.Array[QueryString],
    url: String,
    comment: String = null,
    postData: PostData = null
  ): Request = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (postData != null) __obj.updateDynamic("postData")(postData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}


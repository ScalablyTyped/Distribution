package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * Size of the request body (POST data payload) in bytes.
    *
    * Set to `-1` if the info is not available.
    */
  var bodySize: Double = js.native
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /** List of cookie objects. */
  var cookies: js.Array[Cookie] = js.native
  /** List of header objects. */
  var headers: js.Array[Header] = js.native
  /**
    * Total number of bytes from the start of the HTTP request message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    */
  var headersSize: Double = js.native
  /** Request HTTP Version. */
  var httpVersion: String = js.native
  /** Request method (`GET`, `POST`, ...). */
  var method: String = js.native
  /** Posted data info. */
  var postData: js.UndefOr[PostData] = js.native
  /** List of query parameter objects. */
  var queryString: js.Array[QueryString] = js.native
  /** Absolute URL of the request (fragments are not included). */
  var url: String = js.native
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
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodySize(value: Double): Self = this.set("bodySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookiesVarargs(value: Cookie*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[Cookie]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: Header*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[Header]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersSize(value: Double): Self = this.set("headersSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpVersion(value: String): Self = this.set("httpVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryStringVarargs(value: QueryString*): Self = this.set("queryString", js.Array(value :_*))
    @scala.inline
    def setQueryString(value: js.Array[QueryString]): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setPostData(value: PostData): Self = this.set("postData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
  }
  
}


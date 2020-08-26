package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /** _non-standard_  */
  var _transferSize: js.UndefOr[Double | Null] = js.native
  /**
    * Size of the received response body in bytes.
    *
    * - Set to zero in case of responses coming from the cache (`304`).
    * - Set to `-1` if the info is not available.
    */
  var bodySize: Double = js.native
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /** Details about the response body. */
  var content: Content = js.native
  /** List of cookie objects. */
  var cookies: js.Array[Cookie] = js.native
  /** List of header objects. */
  var headers: js.Array[Header] = js.native
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
  var headersSize: Double = js.native
  /** Response HTTP Version. */
  var httpVersion: String = js.native
  /** Redirection target URL from the Location response header. */
  var redirectURL: String = js.native
  /** Response status. */
  var status: Double = js.native
  /** Response status description. */
  var statusText: String = js.native
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
    statusText: String
  ): Response = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setContent(value: Content): Self = this.set("content", value.asInstanceOf[js.Any])
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
    def setRedirectURL(value: String): Self = this.set("redirectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def set_transferSize(value: Double): Self = this.set("_transferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_transferSize: Self = this.set("_transferSize", js.undefined)
    @scala.inline
    def set_transferSizeNull: Self = this.set("_transferSize", null)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
  
}


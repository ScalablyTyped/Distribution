package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptOptions extends js.Object {
  /**
    * Body-parsers
    */
  var as: js.UndefOr[BodyParser] = js.native
  /**
    * Match the full content-type header of the request or
    * response (depending on the phase)
    */
  var contentType: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the full request URL including protocol and hostname.
    * Patterns like /foo/ * are allowed
    */
  var fullUrl: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the host, not including :port.
    */
  var hostname: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the all-uppercase HTTP request method
    */
  var method: js.UndefOr[Filter[HttpMethod]] = js.native
  /**
    * Match just the mime type portion of the content-type header
    * of the request or response (depending on the phase). I.e.,
    * if the entire header is "text/html; charset=utf-8", just
    * match the "text/html" part
    */
  var mimeType: js.UndefOr[Filter[String]] = js.native
  /**
    * Request phase to listen to
    */
  var phase: Phase = js.native
  /**
    * Match the port number.
    */
  var port: js.UndefOr[Filter[Double | String]] = js.native
  /**
    * Match the request protocol
    */
  var protocol: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as contentType but only matches request
    */
  var requestContentType: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as mimeType but only matches request
    */
  var requestMimeType: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as contentType but only matches response
    */
  var responseContentType: js.UndefOr[Filter[String]] = js.native
  /**
    * Same as mimeType but only matches response
    */
  var responseMimeType: js.UndefOr[Filter[String]] = js.native
  /**
    * Match the request URL. Patterns like /foo/ * are allowed
    */
  var url: js.UndefOr[Filter[String]] = js.native
}

object InterceptOptions {
  @scala.inline
  def apply(phase: Phase): InterceptOptions = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptOptions]
  }
  @scala.inline
  implicit class InterceptOptionsOps[Self <: InterceptOptions] (val x: Self) extends AnyVal {
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
    def setPhase(value: Phase): Self = this.set("phase", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: BodyParser): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setContentTypeFunction1(value: String => Boolean): Self = this.set("contentType", js.Any.fromFunction1(value))
    @scala.inline
    def setContentType(value: Filter[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setFullUrlFunction1(value: String => Boolean): Self = this.set("fullUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setFullUrl(value: Filter[String]): Self = this.set("fullUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullUrl: Self = this.set("fullUrl", js.undefined)
    @scala.inline
    def setHostnameFunction1(value: String => Boolean): Self = this.set("hostname", js.Any.fromFunction1(value))
    @scala.inline
    def setHostname(value: Filter[String]): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setMethodFunction1(value: HttpMethod => Boolean): Self = this.set("method", js.Any.fromFunction1(value))
    @scala.inline
    def setMethod(value: Filter[HttpMethod]): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMimeTypeFunction1(value: String => Boolean): Self = this.set("mimeType", js.Any.fromFunction1(value))
    @scala.inline
    def setMimeType(value: Filter[String]): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setPortFunction1(value: Double | String => Boolean): Self = this.set("port", js.Any.fromFunction1(value))
    @scala.inline
    def setPort(value: Filter[Double | String]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocolFunction1(value: String => Boolean): Self = this.set("protocol", js.Any.fromFunction1(value))
    @scala.inline
    def setProtocol(value: Filter[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRequestContentTypeFunction1(value: String => Boolean): Self = this.set("requestContentType", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestContentType(value: Filter[String]): Self = this.set("requestContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestContentType: Self = this.set("requestContentType", js.undefined)
    @scala.inline
    def setRequestMimeTypeFunction1(value: String => Boolean): Self = this.set("requestMimeType", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestMimeType(value: Filter[String]): Self = this.set("requestMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMimeType: Self = this.set("requestMimeType", js.undefined)
    @scala.inline
    def setResponseContentTypeFunction1(value: String => Boolean): Self = this.set("responseContentType", js.Any.fromFunction1(value))
    @scala.inline
    def setResponseContentType(value: Filter[String]): Self = this.set("responseContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseContentType: Self = this.set("responseContentType", js.undefined)
    @scala.inline
    def setResponseMimeTypeFunction1(value: String => Boolean): Self = this.set("responseMimeType", js.Any.fromFunction1(value))
    @scala.inline
    def setResponseMimeType(value: Filter[String]): Self = this.set("responseMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMimeType: Self = this.set("responseMimeType", js.undefined)
    @scala.inline
    def setUrlFunction1(value: String => Boolean): Self = this.set("url", js.Any.fromFunction1(value))
    @scala.inline
    def setUrl(value: Filter[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}


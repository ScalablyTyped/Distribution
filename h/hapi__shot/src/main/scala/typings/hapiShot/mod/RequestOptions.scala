package typings.hapiShot.mod

import typings.hapiShot.anon.Close
import typings.node.Buffer
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /** a string specifying the HTTP HOST header value to be used if no header is provided, and the url does not include an authority component. Defaults to 'localhost'. */
  var authority: js.UndefOr[String] = js.native
  /** an optional object containing request headers. */
  var headers: js.UndefOr[Headers] = js.native
  /** a string specifying the HTTP request method, defaulting to 'GET'. */
  var method: js.UndefOr[String] = js.native
  /** an optional request payload. Can be a string, Buffer, Stream or object. */
  var payload: js.UndefOr[String | Buffer | Stream | js.Object] = js.native
  /** an optional string specifying the client remote address. Defaults to '127.0.0.1'. */
  var remoteAddress: js.UndefOr[String] = js.native
  /** an object containing flags to simulate various conditions: */
  var simulate: js.UndefOr[Close] = js.native
  /** a string specifying the request URL. */
  var url: String = js.native
  /** Optional flag to validate this options object. Defaults to true. */
  var validate: js.UndefOr[Boolean] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(url: String): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPayload(value: String | Buffer | Stream | js.Object): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setRemoteAddress(value: String): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAddress: Self = this.set("remoteAddress", js.undefined)
    @scala.inline
    def setSimulate(value: Close): Self = this.set("simulate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulate: Self = this.set("simulate", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}


package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * An object containing any HTTP headers where each key is a header name and value is the header content
    */
  var headers: js.Object = js.native
  /**
    * The formatted object used as the response payload (stringified)
    */
  var payload: Payload = js.native
  /**
    * The HTTP status code
    */
  var statusCode: Double = js.native
}

object Output {
  @scala.inline
  def apply(headers: js.Object, payload: Payload, statusCode: Double): Output = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}


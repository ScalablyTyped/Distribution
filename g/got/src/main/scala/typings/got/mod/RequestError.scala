package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestError
  extends StdError
     with GotError {
  @JSName("name")
  var name_RequestError: typings.got.gotStrings.RequestError = js.native
}

object RequestError {
  @scala.inline
  def apply(message: String, name: typings.got.gotStrings.RequestError): RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestError]
  }
  @scala.inline
  implicit class RequestErrorOps[Self <: RequestError] (val x: Self) extends AnyVal {
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
    def setName(value: typings.got.gotStrings.RequestError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


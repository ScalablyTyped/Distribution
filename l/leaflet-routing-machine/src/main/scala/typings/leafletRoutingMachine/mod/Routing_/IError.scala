package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IError extends js.Object {
  var message: String = js.native
  var status: String | Double = js.native
}

object IError {
  @scala.inline
  def apply(message: String, status: String | Double): IError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String | Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}


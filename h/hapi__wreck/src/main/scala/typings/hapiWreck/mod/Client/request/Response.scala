package typings.hapiWreck.mod.Client.request

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[T] extends js.Object {
  var payload: T = js.native
  var res: IncomingMessage = js.native
}

object Response {
  @scala.inline
  def apply[T](payload: T, res: IncomingMessage): Response[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response[_], T] (val x: Self with Response[T]) extends AnyVal {
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
    def setPayload(value: T): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: IncomingMessage): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}


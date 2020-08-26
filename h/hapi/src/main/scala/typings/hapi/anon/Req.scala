package typings.hapi.anon

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Req extends js.Object {
  var req: IncomingMessage = js.native
  var res: ServerResponse = js.native
}

object Req {
  @scala.inline
  def apply(req: IncomingMessage, res: ServerResponse): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  @scala.inline
  implicit class ReqOps[Self <: Req] (val x: Self) extends AnyVal {
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
    def setReq(value: IncomingMessage): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: ServerResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}


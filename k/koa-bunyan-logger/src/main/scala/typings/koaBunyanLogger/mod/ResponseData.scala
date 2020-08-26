package typings.koaBunyanLogger.mod

import typings.koa.mod.Request
import typings.koa.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseData extends js.Object {
  var req: Request = js.native
  var res: Response = js.native
}

object ResponseData {
  @scala.inline
  def apply(req: Request, res: Response): ResponseData = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseData]
  }
  @scala.inline
  implicit class ResponseDataOps[Self <: ResponseData] (val x: Self) extends AnyVal {
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
    def setReq(value: Request): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: Response): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}


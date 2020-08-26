package typings.hapiWreck.anon

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Req extends js.Object {
  var req: ClientRequest = js.native
  var res: js.UndefOr[IncomingMessage] = js.native
  var start: Double = js.native
  var url: URL_ = js.native
}

object Req {
  @scala.inline
  def apply(req: ClientRequest, start: Double, url: URL_): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
    def setReq(value: ClientRequest): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: URL_): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: IncomingMessage): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
  }
  
}


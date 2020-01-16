package typings.atHapiWreck

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReqRes extends js.Object {
  var req: ClientRequest
  var res: js.UndefOr[IncomingMessage] = js.undefined
  var start: Double
  var url: URL
}

object Anon_ReqRes {
  @scala.inline
  def apply(req: ClientRequest, start: Double, url: URL, res: IncomingMessage = null): Anon_ReqRes = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReqRes]
  }
}


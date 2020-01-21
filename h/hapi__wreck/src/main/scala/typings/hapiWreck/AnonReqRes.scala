package typings.hapiWreck

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReqRes extends js.Object {
  var req: ClientRequest
  var res: js.UndefOr[IncomingMessage] = js.undefined
  var start: Double
  var url: URL_
}

object AnonReqRes {
  @scala.inline
  def apply(req: ClientRequest, start: Double, url: URL_, res: IncomingMessage = null): AnonReqRes = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReqRes]
  }
}


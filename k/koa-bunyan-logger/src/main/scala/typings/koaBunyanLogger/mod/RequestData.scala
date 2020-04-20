package typings.koaBunyanLogger.mod

import typings.koa.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestData extends js.Object {
  var req: Request
}

object RequestData {
  @scala.inline
  def apply(req: Request): RequestData = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestData]
  }
}


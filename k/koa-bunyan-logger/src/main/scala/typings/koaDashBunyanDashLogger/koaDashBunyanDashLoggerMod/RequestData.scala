package typings.koaDashBunyanDashLogger.koaDashBunyanDashLoggerMod

import typings.koa.koaMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestData extends js.Object {
  var req: Request
}

object RequestData {
  @scala.inline
  def apply(req: Request): RequestData = {
    val __obj = js.Dynamic.literal(req = req)
  
    __obj.asInstanceOf[RequestData]
  }
}


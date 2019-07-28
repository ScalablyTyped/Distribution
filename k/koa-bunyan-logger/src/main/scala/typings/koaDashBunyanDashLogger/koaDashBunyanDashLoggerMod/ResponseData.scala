package typings.koaDashBunyanDashLogger.koaDashBunyanDashLoggerMod

import typings.koa.koaMod.Request
import typings.koa.koaMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseData extends js.Object {
  var req: Request
  var res: Response
}

object ResponseData {
  @scala.inline
  def apply(req: Request, res: Response): ResponseData = {
    val __obj = js.Dynamic.literal(req = req, res = res)
  
    __obj.asInstanceOf[ResponseData]
  }
}


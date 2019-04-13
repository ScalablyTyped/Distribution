package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseData extends js.Object {
  var req: koaLib.koaMod.Request
  var res: koaLib.koaMod.Response
}

object ResponseData {
  @scala.inline
  def apply(req: koaLib.koaMod.Request, res: koaLib.koaMod.Response): ResponseData = {
    val __obj = js.Dynamic.literal(req = req, res = res)
  
    __obj.asInstanceOf[ResponseData]
  }
}


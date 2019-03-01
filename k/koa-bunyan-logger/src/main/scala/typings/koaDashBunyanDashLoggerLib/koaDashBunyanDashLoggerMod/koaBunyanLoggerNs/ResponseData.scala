package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod.koaBunyanLoggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseData extends js.Object {
  var req: koaLib.koaMod.ApplicationNs.Request
  var res: koaLib.koaMod.ApplicationNs.Response
}

object ResponseData {
  @scala.inline
  def apply(req: koaLib.koaMod.ApplicationNs.Request, res: koaLib.koaMod.ApplicationNs.Response): ResponseData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[ResponseData]
  }
}


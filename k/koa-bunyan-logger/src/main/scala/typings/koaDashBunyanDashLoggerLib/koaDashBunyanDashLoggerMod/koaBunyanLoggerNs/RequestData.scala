package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod.koaBunyanLoggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestData extends js.Object {
  var req: koaLib.koaMod.ApplicationNs.Request
}

object RequestData {
  @scala.inline
  def apply(req: koaLib.koaMod.ApplicationNs.Request): RequestData = {
    val __obj = js.Dynamic.literal(req = req)
  
    __obj.asInstanceOf[RequestData]
  }
}


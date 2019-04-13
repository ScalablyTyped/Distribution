package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestData extends js.Object {
  var req: koaLib.koaMod.Request
}

object RequestData {
  @scala.inline
  def apply(req: koaLib.koaMod.Request): RequestData = {
    val __obj = js.Dynamic.literal(req = req)
  
    __obj.asInstanceOf[RequestData]
  }
}


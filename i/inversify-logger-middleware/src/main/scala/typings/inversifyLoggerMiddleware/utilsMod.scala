package typings.inversifyLoggerMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-logger-middleware/dts/utils/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  var getTime: js.Function0[js.Any] = js.native
  
  def getTimeDiference(start: Double, end: Double): String = js.native
  
  def getTimeFactory(_window: js.Any, _process: js.Any, _date: js.Any): js.Function0[_] = js.native
  
  def guid(): String = js.native
}

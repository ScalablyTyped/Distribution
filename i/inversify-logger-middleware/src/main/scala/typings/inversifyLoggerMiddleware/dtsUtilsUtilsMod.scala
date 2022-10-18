package typings.inversifyLoggerMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsUtilsUtilsMod {
  
  @JSImport("inversify-logger-middleware/dts/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify-logger-middleware/dts/utils/utils", "getTime")
  @js.native
  def getTime: js.Function0[Any] = js.native
  
  inline def getTimeDiference(start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeDiference")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTimeFactory(_window: Any, _process: Any, _date: Any): js.Function0[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeFactory")(_window.asInstanceOf[js.Any], _process.asInstanceOf[js.Any], _date.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Any]]
  
  inline def getTime_=(x: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTime")(x.asInstanceOf[js.Any])
  
  inline def guid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guid")().asInstanceOf[String]
}

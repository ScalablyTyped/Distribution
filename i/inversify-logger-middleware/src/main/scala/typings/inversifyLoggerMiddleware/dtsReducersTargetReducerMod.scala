package typings.inversifyLoggerMiddleware

import typings.inversify.libInterfacesInterfacesMod.interfaces.Target
import typings.inversifyLoggerMiddleware.dtsInterfacesInterfacesMod.interfaces.TargetLoggerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsReducersTargetReducerMod {
  
  @JSImport("inversify-logger-middleware/dts/reducers/target_reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: Target, options: TargetLoggerSettings): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}

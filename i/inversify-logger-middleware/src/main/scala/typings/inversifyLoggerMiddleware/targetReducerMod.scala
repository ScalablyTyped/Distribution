package typings.inversifyLoggerMiddleware

import typings.inversify.interfacesMod.interfaces.Target
import typings.inversifyLoggerMiddleware.interfacesMod.interfaces.TargetLoggerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetReducerMod {
  
  @JSImport("inversify-logger-middleware/dts/reducers/target_reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: Target, options: TargetLoggerSettings): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}

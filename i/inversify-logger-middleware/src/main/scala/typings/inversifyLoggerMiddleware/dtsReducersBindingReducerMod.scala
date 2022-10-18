package typings.inversifyLoggerMiddleware

import typings.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typings.inversifyLoggerMiddleware.dtsInterfacesInterfacesMod.interfaces.BindingLoggerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsReducersBindingReducerMod {
  
  @JSImport("inversify-logger-middleware/dts/reducers/binding_reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(binding: Binding[Any], options: BindingLoggerSettings): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(binding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}

package typings.inversifyLoggerMiddleware

import typings.inversify.interfacesMod.interfaces.Request
import typings.inversifyLoggerMiddleware.interfacesMod.interfaces.RequestLoggerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestReducerMod {
  
  @JSImport("inversify-logger-middleware/dts/reducers/request_reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(request: Request, options: RequestLoggerSettings): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}

package typings.inversifyLoggerMiddleware

import typings.inversify.interfacesMod.interfaces.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestSerializerMod {
  
  @JSImport("inversify-logger-middleware/dts/serializers/text/request_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(textEntry: String, depth: Double, index: Double, request: Request): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(textEntry.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], index.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[String]
}

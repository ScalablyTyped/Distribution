package typings.inversifyLoggerMiddleware

import typings.inversify.interfacesMod.interfaces.Binding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingSerializerMod {
  
  @JSImport("inversify-logger-middleware/dts/serializers/text/binding_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(textEntry: String, depth: Double, binding: Binding[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(textEntry.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], binding.asInstanceOf[js.Any])).asInstanceOf[String]
}

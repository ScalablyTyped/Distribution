package typings.inversifyLoggerMiddleware

import typings.inversify.interfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetSerializerMod {
  
  @JSImport("inversify-logger-middleware/dts/serializers/text/target_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(textEntry: String, depth: Double, target: Target): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(textEntry.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
}

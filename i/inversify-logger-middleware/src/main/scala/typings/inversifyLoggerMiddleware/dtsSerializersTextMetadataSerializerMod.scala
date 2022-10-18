package typings.inversifyLoggerMiddleware

import typings.inversify.libInterfacesInterfacesMod.interfaces.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSerializersTextMetadataSerializerMod {
  
  @JSImport("inversify-logger-middleware/dts/serializers/text/metadata_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(textEntry: String, depth: Double, tags: js.Array[Metadata[Any]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(textEntry.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[String]
}

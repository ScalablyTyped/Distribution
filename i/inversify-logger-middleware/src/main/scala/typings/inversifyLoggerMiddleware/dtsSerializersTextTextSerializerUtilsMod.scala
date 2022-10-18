package typings.inversifyLoggerMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSerializersTextTextSerializerUtilsMod {
  
  @JSImport("inversify-logger-middleware/dts/serializers/text/text_serializer_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIndentationForDepth(depth: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndentationForDepth")(depth.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makePropertyLogger(indentationForDepth: String): js.Function4[
    /* textEntry */ String, 
    /* tabCount */ Double, 
    /* key */ String, 
    /* value */ js.UndefOr[Any], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyLogger")(indentationForDepth.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* textEntry */ String, 
    /* tabCount */ Double, 
    /* key */ String, 
    /* value */ js.UndefOr[Any], 
    String
  ]]
}

package typings.inversifyLoggerMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-logger-middleware/dts/serializers/text/text_serializer_utils", JSImport.Namespace)
@js.native
object textSerializerUtilsMod extends js.Object {
  
  def getIndentationForDepth(depth: Double): String = js.native
  
  def makePropertyLogger(indentationForDepth: String): js.Function4[
    /* textEntry */ String, 
    /* tabCount */ Double, 
    /* key */ String, 
    /* value */ js.UndefOr[js.Any], 
    String
  ] = js.native
}

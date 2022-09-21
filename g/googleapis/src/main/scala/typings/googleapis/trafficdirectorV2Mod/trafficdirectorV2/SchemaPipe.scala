package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPipe extends StObject {
  
  /**
    * The mode for the Pipe. Not applicable for abstract sockets.
    */
  var mode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Unix Domain Socket path. On Linux, paths starting with '@' will use the abstract namespace. The starting '@' is replaced by a null byte by Envoy. Paths starting with '@' will result in an error in environments other than Linux.
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaPipe {
  
  inline def apply(): SchemaPipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipe]
  }
  
  extension [Self <: SchemaPipe](x: Self) {
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}

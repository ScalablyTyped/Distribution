package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeConfig extends StObject {
  
  /**
    * Maximum number of nodes in the runtime nodes.
    */
  var maxNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum number of nodes in the runtime nodes.
    */
  var minNodeCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNodeConfig {
  
  inline def apply(): SchemaNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeConfig]
  }
  
  extension [Self <: SchemaNodeConfig](x: Self) {
    
    inline def setMaxNodeCount(value: Double): Self = StObject.set(x, "maxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeCountNull: Self = StObject.set(x, "maxNodeCount", null)
    
    inline def setMaxNodeCountUndefined: Self = StObject.set(x, "maxNodeCount", js.undefined)
    
    inline def setMinNodeCount(value: Double): Self = StObject.set(x, "minNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCountNull: Self = StObject.set(x, "minNodeCount", null)
    
    inline def setMinNodeCountUndefined: Self = StObject.set(x, "minNodeCount", js.undefined)
  }
}

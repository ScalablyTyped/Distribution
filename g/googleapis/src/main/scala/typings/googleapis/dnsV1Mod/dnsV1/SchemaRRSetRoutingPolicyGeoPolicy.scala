package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicyGeoPolicy extends StObject {
  
  /**
    * Without fencing, if health check fails for all configured items in the current geo bucket, we'll failover to the next nearest geo bucket. With fencing, if health check is enabled, as long as some targets in the current geo bucket are healthy, we'll return only the healthy targets. However, if they're all unhealthy, we won't failover to the next nearest bucket, we'll simply return all the items in the current bucket even though they're unhealthy.
    */
  var enableFencing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The primary geo routing configuration. If there are multiple items with the same location, an error is returned instead.
    */
  var items: js.UndefOr[js.Array[SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem]] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaRRSetRoutingPolicyGeoPolicy {
  
  inline def apply(): SchemaRRSetRoutingPolicyGeoPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRRSetRoutingPolicyGeoPolicy]
  }
  
  extension [Self <: SchemaRRSetRoutingPolicyGeoPolicy](x: Self) {
    
    inline def setEnableFencing(value: Boolean): Self = StObject.set(x, "enableFencing", value.asInstanceOf[js.Any])
    
    inline def setEnableFencingNull: Self = StObject.set(x, "enableFencing", null)
    
    inline def setEnableFencingUndefined: Self = StObject.set(x, "enableFencing", js.undefined)
    
    inline def setItems(value: js.Array[SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

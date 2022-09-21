package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicyGeoPolicy extends StObject {
  
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
    
    inline def setItems(value: js.Array[SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaRRSetRoutingPolicyGeoPolicyGeoPolicyItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

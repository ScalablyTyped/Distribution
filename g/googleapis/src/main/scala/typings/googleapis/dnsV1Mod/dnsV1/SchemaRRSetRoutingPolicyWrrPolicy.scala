package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicyWrrPolicy extends StObject {
  
  var items: js.UndefOr[js.Array[SchemaRRSetRoutingPolicyWrrPolicyWrrPolicyItem]] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaRRSetRoutingPolicyWrrPolicy {
  
  inline def apply(): SchemaRRSetRoutingPolicyWrrPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRRSetRoutingPolicyWrrPolicy]
  }
  
  extension [Self <: SchemaRRSetRoutingPolicyWrrPolicy](x: Self) {
    
    inline def setItems(value: js.Array[SchemaRRSetRoutingPolicyWrrPolicyWrrPolicyItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaRRSetRoutingPolicyWrrPolicyWrrPolicyItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

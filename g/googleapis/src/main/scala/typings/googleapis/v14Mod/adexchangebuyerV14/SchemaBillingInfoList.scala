package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingInfoList extends StObject {
  
  /**
    * A list of billing info relevant for your account.
    */
  var items: js.UndefOr[js.Array[SchemaBillingInfo]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingInfoList {
  
  inline def apply(): SchemaBillingInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingInfoList]
  }
  
  extension [Self <: SchemaBillingInfoList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaBillingInfo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaBillingInfo*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

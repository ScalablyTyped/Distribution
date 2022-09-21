package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingInfoList extends StObject {
  
  /** A list of billing info relevant for your account. */
  var items: js.UndefOr[js.Array[BillingInfo]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}
object BillingInfoList {
  
  inline def apply(): BillingInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInfoList]
  }
  
  extension [Self <: BillingInfoList](x: Self) {
    
    inline def setItems(value: js.Array[BillingInfo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BillingInfo*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

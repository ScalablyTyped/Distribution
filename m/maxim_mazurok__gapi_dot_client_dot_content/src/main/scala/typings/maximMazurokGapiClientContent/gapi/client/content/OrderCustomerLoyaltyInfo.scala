package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderCustomerLoyaltyInfo extends StObject {
  
  /** The loyalty card/membership number. */
  var loyaltyNumber: js.UndefOr[String] = js.undefined
  
  /** Name of card/membership holder, this field will be populated when */
  var name: js.UndefOr[String] = js.undefined
}
object OrderCustomerLoyaltyInfo {
  
  inline def apply(): OrderCustomerLoyaltyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomerLoyaltyInfo]
  }
  
  extension [Self <: OrderCustomerLoyaltyInfo](x: Self) {
    
    inline def setLoyaltyNumber(value: String): Self = StObject.set(x, "loyaltyNumber", value.asInstanceOf[js.Any])
    
    inline def setLoyaltyNumberUndefined: Self = StObject.set(x, "loyaltyNumber", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

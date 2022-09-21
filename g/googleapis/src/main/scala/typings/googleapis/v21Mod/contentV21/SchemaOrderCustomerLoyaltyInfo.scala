package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderCustomerLoyaltyInfo extends StObject {
  
  /**
    * The loyalty card/membership number.
    */
  var loyaltyNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of card/membership holder, this field will be populated when
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderCustomerLoyaltyInfo {
  
  inline def apply(): SchemaOrderCustomerLoyaltyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomerLoyaltyInfo]
  }
  
  extension [Self <: SchemaOrderCustomerLoyaltyInfo](x: Self) {
    
    inline def setLoyaltyNumber(value: String): Self = StObject.set(x, "loyaltyNumber", value.asInstanceOf[js.Any])
    
    inline def setLoyaltyNumberNull: Self = StObject.set(x, "loyaltyNumber", null)
    
    inline def setLoyaltyNumberUndefined: Self = StObject.set(x, "loyaltyNumber", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

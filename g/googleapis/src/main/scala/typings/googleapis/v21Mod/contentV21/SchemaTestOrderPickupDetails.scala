package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderPickupDetails extends StObject {
  
  /**
    * Required. Code of the location defined by provider or merchant.
    */
  var locationCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Pickup location address.
    */
  var pickupLocationAddress: js.UndefOr[SchemaTestOrderAddress] = js.undefined
  
  /**
    * Pickup location type. Acceptable values are: - "`locker`" - "`store`" - "`curbside`"
    */
  var pickupLocationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. all pickup persons set by users.
    */
  var pickupPersons: js.UndefOr[js.Array[SchemaTestOrderPickupDetailsPickupPerson]] = js.undefined
}
object SchemaTestOrderPickupDetails {
  
  inline def apply(): SchemaTestOrderPickupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderPickupDetails]
  }
  
  extension [Self <: SchemaTestOrderPickupDetails](x: Self) {
    
    inline def setLocationCode(value: String): Self = StObject.set(x, "locationCode", value.asInstanceOf[js.Any])
    
    inline def setLocationCodeNull: Self = StObject.set(x, "locationCode", null)
    
    inline def setLocationCodeUndefined: Self = StObject.set(x, "locationCode", js.undefined)
    
    inline def setPickupLocationAddress(value: SchemaTestOrderAddress): Self = StObject.set(x, "pickupLocationAddress", value.asInstanceOf[js.Any])
    
    inline def setPickupLocationAddressUndefined: Self = StObject.set(x, "pickupLocationAddress", js.undefined)
    
    inline def setPickupLocationType(value: String): Self = StObject.set(x, "pickupLocationType", value.asInstanceOf[js.Any])
    
    inline def setPickupLocationTypeNull: Self = StObject.set(x, "pickupLocationType", null)
    
    inline def setPickupLocationTypeUndefined: Self = StObject.set(x, "pickupLocationType", js.undefined)
    
    inline def setPickupPersons(value: js.Array[SchemaTestOrderPickupDetailsPickupPerson]): Self = StObject.set(x, "pickupPersons", value.asInstanceOf[js.Any])
    
    inline def setPickupPersonsUndefined: Self = StObject.set(x, "pickupPersons", js.undefined)
    
    inline def setPickupPersonsVarargs(value: SchemaTestOrderPickupDetailsPickupPerson*): Self = StObject.set(x, "pickupPersons", js.Array(value*))
  }
}

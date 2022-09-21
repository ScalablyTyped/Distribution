package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOrderPickupDetails extends StObject {
  
  /** Required. Code of the location defined by provider or merchant. */
  var locationCode: js.UndefOr[String] = js.undefined
  
  /** Required. Pickup location address. */
  var pickupLocationAddress: js.UndefOr[TestOrderAddress] = js.undefined
  
  /** Pickup location type. Acceptable values are: - "`locker`" - "`store`" - "`curbside`" */
  var pickupLocationType: js.UndefOr[String] = js.undefined
  
  /** Required. all pickup persons set by users. */
  var pickupPersons: js.UndefOr[js.Array[TestOrderPickupDetailsPickupPerson]] = js.undefined
}
object TestOrderPickupDetails {
  
  inline def apply(): TestOrderPickupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderPickupDetails]
  }
  
  extension [Self <: TestOrderPickupDetails](x: Self) {
    
    inline def setLocationCode(value: String): Self = StObject.set(x, "locationCode", value.asInstanceOf[js.Any])
    
    inline def setLocationCodeUndefined: Self = StObject.set(x, "locationCode", js.undefined)
    
    inline def setPickupLocationAddress(value: TestOrderAddress): Self = StObject.set(x, "pickupLocationAddress", value.asInstanceOf[js.Any])
    
    inline def setPickupLocationAddressUndefined: Self = StObject.set(x, "pickupLocationAddress", js.undefined)
    
    inline def setPickupLocationType(value: String): Self = StObject.set(x, "pickupLocationType", value.asInstanceOf[js.Any])
    
    inline def setPickupLocationTypeUndefined: Self = StObject.set(x, "pickupLocationType", js.undefined)
    
    inline def setPickupPersons(value: js.Array[TestOrderPickupDetailsPickupPerson]): Self = StObject.set(x, "pickupPersons", value.asInstanceOf[js.Any])
    
    inline def setPickupPersonsUndefined: Self = StObject.set(x, "pickupPersons", js.undefined)
    
    inline def setPickupPersonsVarargs(value: TestOrderPickupDetailsPickupPerson*): Self = StObject.set(x, "pickupPersons", js.Array(value*))
  }
}

package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddressVerificationData extends StObject {
  
  /**
    * Address that a postcard can be sent to.
    */
  var address: js.UndefOr[SchemaPostalAddress] = js.undefined
  
  /**
    * Merchant's business name.
    */
  var business: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expected number of days it takes to deliver a postcard to the address's region.
    */
  var expectedDeliveryDaysRegion: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAddressVerificationData {
  
  inline def apply(): SchemaAddressVerificationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddressVerificationData]
  }
  
  extension [Self <: SchemaAddressVerificationData](x: Self) {
    
    inline def setAddress(value: SchemaPostalAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    inline def setBusinessNull: Self = StObject.set(x, "business", null)
    
    inline def setBusinessUndefined: Self = StObject.set(x, "business", js.undefined)
    
    inline def setExpectedDeliveryDaysRegion(value: Double): Self = StObject.set(x, "expectedDeliveryDaysRegion", value.asInstanceOf[js.Any])
    
    inline def setExpectedDeliveryDaysRegionNull: Self = StObject.set(x, "expectedDeliveryDaysRegion", null)
    
    inline def setExpectedDeliveryDaysRegionUndefined: Self = StObject.set(x, "expectedDeliveryDaysRegion", js.undefined)
  }
}

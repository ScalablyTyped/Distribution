package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalBasePlanConfig extends StObject {
  
  /**
    * Whether the base plan in the specified region is available for new subscribers. Existing subscribers will not have their subscription canceled if this value is set to false. If not
    * specified, this will default to false.
    */
  var newSubscriberAvailability: js.UndefOr[Boolean] = js.undefined
  
  /** The price of the base plan in the specified region. Must be set if the base plan is available to new subscribers. Must be set in the currency that is linked to the specified region. */
  var price: js.UndefOr[Money] = js.undefined
  
  /** Required. Region code this configuration applies to, as defined by ISO 3166-2, e.g. "US". */
  var regionCode: js.UndefOr[String] = js.undefined
}
object RegionalBasePlanConfig {
  
  inline def apply(): RegionalBasePlanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalBasePlanConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionalBasePlanConfig] (val x: Self) extends AnyVal {
    
    inline def setNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "newSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "newSubscriberAvailability", js.undefined)
    
    inline def setPrice(value: Money): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}

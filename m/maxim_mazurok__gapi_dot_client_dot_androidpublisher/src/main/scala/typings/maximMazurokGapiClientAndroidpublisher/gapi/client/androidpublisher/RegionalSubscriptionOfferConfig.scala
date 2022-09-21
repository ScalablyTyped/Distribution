package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalSubscriptionOfferConfig extends StObject {
  
  /**
    * Whether the subscription offer in the specified region is available for new subscribers. Existing subscribers will not have their subscription cancelled if this value is set to
    * false. If not specified, this will default to false.
    */
  var newSubscriberAvailability: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Immutable. Region code this configuration applies to, as defined by ISO 3166-2, e.g. "US". */
  var regionCode: js.UndefOr[String] = js.undefined
}
object RegionalSubscriptionOfferConfig {
  
  inline def apply(): RegionalSubscriptionOfferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalSubscriptionOfferConfig]
  }
  
  extension [Self <: RegionalSubscriptionOfferConfig](x: Self) {
    
    inline def setNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "newSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "newSubscriberAvailability", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}

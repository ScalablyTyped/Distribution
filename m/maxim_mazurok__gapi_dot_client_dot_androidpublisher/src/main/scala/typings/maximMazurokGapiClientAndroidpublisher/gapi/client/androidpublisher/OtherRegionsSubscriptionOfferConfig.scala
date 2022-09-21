package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherRegionsSubscriptionOfferConfig extends StObject {
  
  /** Whether the subscription offer in any new locations Play may launch in the future. If not specified, this will default to false. */
  var otherRegionsNewSubscriberAvailability: js.UndefOr[Boolean] = js.undefined
}
object OtherRegionsSubscriptionOfferConfig {
  
  inline def apply(): OtherRegionsSubscriptionOfferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherRegionsSubscriptionOfferConfig]
  }
  
  extension [Self <: OtherRegionsSubscriptionOfferConfig](x: Self) {
    
    inline def setOtherRegionsNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "otherRegionsNewSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setOtherRegionsNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "otherRegionsNewSubscriberAvailability", js.undefined)
  }
}

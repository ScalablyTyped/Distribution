package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherRegionsBasePlanConfig extends StObject {
  
  /** Required. Price in EUR to use for any new locations Play may launch in. */
  var eurPrice: js.UndefOr[Money] = js.undefined
  
  /** Whether the base plan is available for new subscribers in any new locations Play may launch in. If not specified, this will default to false. */
  var newSubscriberAvailability: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Price in USD to use for any new locations Play may launch in. */
  var usdPrice: js.UndefOr[Money] = js.undefined
}
object OtherRegionsBasePlanConfig {
  
  inline def apply(): OtherRegionsBasePlanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherRegionsBasePlanConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherRegionsBasePlanConfig] (val x: Self) extends AnyVal {
    
    inline def setEurPrice(value: Money): Self = StObject.set(x, "eurPrice", value.asInstanceOf[js.Any])
    
    inline def setEurPriceUndefined: Self = StObject.set(x, "eurPrice", js.undefined)
    
    inline def setNewSubscriberAvailability(value: Boolean): Self = StObject.set(x, "newSubscriberAvailability", value.asInstanceOf[js.Any])
    
    inline def setNewSubscriberAvailabilityUndefined: Self = StObject.set(x, "newSubscriberAvailability", js.undefined)
    
    inline def setUsdPrice(value: Money): Self = StObject.set(x, "usdPrice", value.asInstanceOf[js.Any])
    
    inline def setUsdPriceUndefined: Self = StObject.set(x, "usdPrice", js.undefined)
  }
}

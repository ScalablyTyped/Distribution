package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherRegionsSubscriptionOfferPhasePrices extends StObject {
  
  /** Required. Price in EUR to use for any new locations Play may launch in. */
  var eurPrice: js.UndefOr[Money] = js.undefined
  
  /** Required. Price in USD to use for any new locations Play may launch in. */
  var usdPrice: js.UndefOr[Money] = js.undefined
}
object OtherRegionsSubscriptionOfferPhasePrices {
  
  inline def apply(): OtherRegionsSubscriptionOfferPhasePrices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherRegionsSubscriptionOfferPhasePrices]
  }
  
  extension [Self <: OtherRegionsSubscriptionOfferPhasePrices](x: Self) {
    
    inline def setEurPrice(value: Money): Self = StObject.set(x, "eurPrice", value.asInstanceOf[js.Any])
    
    inline def setEurPriceUndefined: Self = StObject.set(x, "eurPrice", js.undefined)
    
    inline def setUsdPrice(value: Money): Self = StObject.set(x, "usdPrice", value.asInstanceOf[js.Any])
    
    inline def setUsdPriceUndefined: Self = StObject.set(x, "usdPrice", js.undefined)
  }
}

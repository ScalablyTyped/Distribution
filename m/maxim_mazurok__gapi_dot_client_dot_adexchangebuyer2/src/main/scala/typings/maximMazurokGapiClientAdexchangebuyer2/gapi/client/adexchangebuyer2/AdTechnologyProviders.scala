package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdTechnologyProviders extends StObject {
  
  /**
    * The detected ad technology provider IDs for this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/providers.csv for mapping of provider ID to provided name, a
    * privacy policy URL, and a list of domains which can be attributed to the provider. If the creative contains provider IDs that are outside of those listed in the
    * `BidRequest.adslot.consented_providers_settings.consented_providers` field on the (Google bid
    * protocol)[https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto] and the `BidRequest.user.ext.consented_providers_settings.consented_providers` field
    * on the (OpenRTB protocol)[https://developers.google.com/authorized-buyers/rtb/downloads/openrtb-adx-proto], and a bid is submitted with that creative for an impression that will
    * serve to an EEA user, the bid will be filtered before the auction.
    */
  var detectedProviderIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the creative contains an unidentified ad technology provider. If true for a given creative, any bid submitted with that creative for an impression that will serve to an EEA
    * user will be filtered before the auction.
    */
  var hasUnidentifiedProvider: js.UndefOr[Boolean] = js.undefined
}
object AdTechnologyProviders {
  
  inline def apply(): AdTechnologyProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdTechnologyProviders]
  }
  
  extension [Self <: AdTechnologyProviders](x: Self) {
    
    inline def setDetectedProviderIds(value: js.Array[String]): Self = StObject.set(x, "detectedProviderIds", value.asInstanceOf[js.Any])
    
    inline def setDetectedProviderIdsUndefined: Self = StObject.set(x, "detectedProviderIds", js.undefined)
    
    inline def setDetectedProviderIdsVarargs(value: String*): Self = StObject.set(x, "detectedProviderIds", js.Array(value*))
    
    inline def setHasUnidentifiedProvider(value: Boolean): Self = StObject.set(x, "hasUnidentifiedProvider", value.asInstanceOf[js.Any])
    
    inline def setHasUnidentifiedProviderUndefined: Self = StObject.set(x, "hasUnidentifiedProvider", js.undefined)
  }
}

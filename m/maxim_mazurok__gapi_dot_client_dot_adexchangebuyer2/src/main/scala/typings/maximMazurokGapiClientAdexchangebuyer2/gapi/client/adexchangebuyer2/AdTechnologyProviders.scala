package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdTechnologyProviders extends js.Object {
  
  /**
    * The detected ad technology provider IDs for this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/providers.csv for mapping of provider ID to provided name, a
    * privacy policy URL, and a list of domains which can be attributed to the provider. If the creative contains provider IDs that are outside of those listed in the
    * `BidRequest.adslot.consented_providers_settings.consented_providers` field on the (Google bid
    * protocol)[https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto] and the `BidRequest.user.ext.consented_providers_settings.consented_providers` field
    * on the (OpenRTB protocol)[https://developers.google.com/authorized-buyers/rtb/downloads/openrtb-adx-proto], and a bid is submitted with that creative for an impression that will
    * serve to an EEA user, the bid will be filtered before the auction.
    */
  var detectedProviderIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the creative contains an unidentified ad technology provider. If true for a given creative, any bid submitted with that creative for an impression that will serve to an EEA
    * user will be filtered before the auction.
    */
  var hasUnidentifiedProvider: js.UndefOr[Boolean] = js.native
}
object AdTechnologyProviders {
  
  @scala.inline
  def apply(): AdTechnologyProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdTechnologyProviders]
  }
  
  @scala.inline
  implicit class AdTechnologyProvidersOps[Self <: AdTechnologyProviders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectedProviderIdsVarargs(value: String*): Self = this.set("detectedProviderIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectedProviderIds(value: js.Array[String]): Self = this.set("detectedProviderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedProviderIds: Self = this.set("detectedProviderIds", js.undefined)
    
    @scala.inline
    def setHasUnidentifiedProvider(value: Boolean): Self = this.set("hasUnidentifiedProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasUnidentifiedProvider: Self = this.set("hasUnidentifiedProvider", js.undefined)
  }
}

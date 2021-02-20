package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedProviderIds extends StObject {
  
  /**
    * The detected ad technology provider IDs for this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/providers.csv for mapping of provider ID to provided name, a
    * privacy policy URL, and a list of domains which can be attributed to the provider. If this creative contains provider IDs that are outside of those listed in the
    * `BidRequest.adslot.consented_providers_settings.consented_providers` field on the  Authorized Buyers Real-Time Bidding protocol or the
    * `BidRequest.user.ext.consented_providers_settings.consented_providers` field on the OpenRTB protocol, a bid submitted for a European Economic Area (EEA) user with this creative
    * is not compliant with the GDPR policies as mentioned in the "Third-party Ad Technology Vendors" section of Authorized Buyers Program Guidelines.
    */
  var detectedProviderIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the creative contains an unidentified ad technology provider. If true, a bid submitted for a European Economic Area (EEA) user with this creative is not compliant with
    * the GDPR policies as mentioned in the "Third-party Ad Technology Vendors" section of Authorized Buyers Program Guidelines.
    */
  var hasUnidentifiedProvider: js.UndefOr[Boolean] = js.native
}
object DetectedProviderIds {
  
  @scala.inline
  def apply(): DetectedProviderIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedProviderIds]
  }
  
  @scala.inline
  implicit class DetectedProviderIdsMutableBuilder[Self <: DetectedProviderIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedProviderIds(value: js.Array[String]): Self = StObject.set(x, "detectedProviderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedProviderIdsUndefined: Self = StObject.set(x, "detectedProviderIds", js.undefined)
    
    @scala.inline
    def setDetectedProviderIdsVarargs(value: String*): Self = StObject.set(x, "detectedProviderIds", js.Array(value :_*))
    
    @scala.inline
    def setHasUnidentifiedProvider(value: Boolean): Self = StObject.set(x, "hasUnidentifiedProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUnidentifiedProviderUndefined: Self = StObject.set(x, "hasUnidentifiedProvider", js.undefined)
  }
}

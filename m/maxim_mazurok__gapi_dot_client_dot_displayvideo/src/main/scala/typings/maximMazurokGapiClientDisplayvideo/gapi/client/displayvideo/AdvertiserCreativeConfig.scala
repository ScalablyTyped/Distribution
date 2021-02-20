package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserCreativeConfig extends StObject {
  
  /** Whether or not the advertiser is enabled for dynamic creatives. */
  var dynamicCreativeEnabled: js.UndefOr[Boolean] = js.native
  
  /** An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360 system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag. */
  var iasClientId: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to use DV360's Online Behavioral Advertising (OBA) compliance. Warning: Changing OBA settings may cause the audit status of your creatives to be reset by some ad
    * exchanges, making them ineligible to serve until they are re-approved.
    */
  var obaComplianceDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * By setting this field to `true`, you, on behalf of your company, authorize Google to use video creatives associated with this Display & Video 360 advertiser to provide reporting and
    * features related to the advertiser's television campaigns. Applicable only when the advertiser has a CM360 hybrid ad server configuration.
    */
  var videoCreativeDataSharingAuthorized: js.UndefOr[Boolean] = js.native
}
object AdvertiserCreativeConfig {
  
  @scala.inline
  def apply(): AdvertiserCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserCreativeConfig]
  }
  
  @scala.inline
  implicit class AdvertiserCreativeConfigMutableBuilder[Self <: AdvertiserCreativeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicCreativeEnabled(value: Boolean): Self = StObject.set(x, "dynamicCreativeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicCreativeEnabledUndefined: Self = StObject.set(x, "dynamicCreativeEnabled", js.undefined)
    
    @scala.inline
    def setIasClientId(value: String): Self = StObject.set(x, "iasClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIasClientIdUndefined: Self = StObject.set(x, "iasClientId", js.undefined)
    
    @scala.inline
    def setObaComplianceDisabled(value: Boolean): Self = StObject.set(x, "obaComplianceDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObaComplianceDisabledUndefined: Self = StObject.set(x, "obaComplianceDisabled", js.undefined)
    
    @scala.inline
    def setVideoCreativeDataSharingAuthorized(value: Boolean): Self = StObject.set(x, "videoCreativeDataSharingAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCreativeDataSharingAuthorizedUndefined: Self = StObject.set(x, "videoCreativeDataSharingAuthorized", js.undefined)
  }
}

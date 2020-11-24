package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserCreativeConfig extends js.Object {
  
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
  implicit class AdvertiserCreativeConfigOps[Self <: AdvertiserCreativeConfig] (val x: Self) extends AnyVal {
    
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
    def setDynamicCreativeEnabled(value: Boolean): Self = this.set("dynamicCreativeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicCreativeEnabled: Self = this.set("dynamicCreativeEnabled", js.undefined)
    
    @scala.inline
    def setIasClientId(value: String): Self = this.set("iasClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIasClientId: Self = this.set("iasClientId", js.undefined)
    
    @scala.inline
    def setObaComplianceDisabled(value: Boolean): Self = this.set("obaComplianceDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObaComplianceDisabled: Self = this.set("obaComplianceDisabled", js.undefined)
    
    @scala.inline
    def setVideoCreativeDataSharingAuthorized(value: Boolean): Self = this.set("videoCreativeDataSharingAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCreativeDataSharingAuthorized: Self = this.set("videoCreativeDataSharingAuthorized", js.undefined)
  }
}

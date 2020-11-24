package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmHybridConfig extends js.Object {
  
  /** Required. Immutable. Account ID of the CM360 Floodlight configuration linked with the DV360 advertiser. */
  var cmAccountId: js.UndefOr[String] = js.native
  
  /** Required. Immutable. ID of the CM360 Floodlight configuration linked with the DV360 advertiser. */
  var cmFloodlightConfigId: js.UndefOr[String] = js.native
  
  /**
    * Required. Immutable. By setting this field to `true`, you, on behalf of your company, authorize the sharing of information from the given Floodlight configuration to this Display &
    * Video 360 advertiser.
    */
  var cmFloodlightLinkingAuthorized: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of CM360 sites whose placements will be synced to DV360 as creatives. If absent or empty in CreateAdvertiser method, the system will automatically create a CM360 site.
    * Removing sites from this list may cause DV360 creatives synced from CM360 to be deleted. At least one site must be specified.
    */
  var cmSyncableSiteIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether or not to report DV360 cost to CM360. */
  var dv360ToCmCostReportingEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to include DV360 data in CM360 data transfer reports. */
  var dv360ToCmDataSharingEnabled: js.UndefOr[Boolean] = js.native
}
object CmHybridConfig {
  
  @scala.inline
  def apply(): CmHybridConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmHybridConfig]
  }
  
  @scala.inline
  implicit class CmHybridConfigOps[Self <: CmHybridConfig] (val x: Self) extends AnyVal {
    
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
    def setCmAccountId(value: String): Self = this.set("cmAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmAccountId: Self = this.set("cmAccountId", js.undefined)
    
    @scala.inline
    def setCmFloodlightConfigId(value: String): Self = this.set("cmFloodlightConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmFloodlightConfigId: Self = this.set("cmFloodlightConfigId", js.undefined)
    
    @scala.inline
    def setCmFloodlightLinkingAuthorized(value: Boolean): Self = this.set("cmFloodlightLinkingAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmFloodlightLinkingAuthorized: Self = this.set("cmFloodlightLinkingAuthorized", js.undefined)
    
    @scala.inline
    def setCmSyncableSiteIdsVarargs(value: String*): Self = this.set("cmSyncableSiteIds", js.Array(value :_*))
    
    @scala.inline
    def setCmSyncableSiteIds(value: js.Array[String]): Self = this.set("cmSyncableSiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmSyncableSiteIds: Self = this.set("cmSyncableSiteIds", js.undefined)
    
    @scala.inline
    def setDv360ToCmCostReportingEnabled(value: Boolean): Self = this.set("dv360ToCmCostReportingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDv360ToCmCostReportingEnabled: Self = this.set("dv360ToCmCostReportingEnabled", js.undefined)
    
    @scala.inline
    def setDv360ToCmDataSharingEnabled(value: Boolean): Self = this.set("dv360ToCmDataSharingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDv360ToCmDataSharingEnabled: Self = this.set("dv360ToCmDataSharingEnabled", js.undefined)
  }
}

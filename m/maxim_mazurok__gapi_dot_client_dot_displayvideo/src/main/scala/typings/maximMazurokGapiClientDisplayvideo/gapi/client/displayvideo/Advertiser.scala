package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advertiser extends js.Object {
  
  /** Required. Immutable. Ad server related settings of the advertiser. */
  var adServerConfig: js.UndefOr[AdvertiserAdServerConfig] = js.native
  
  /** Output only. The unique ID of the advertiser. Assigned by the system. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Required. Creative related settings of the advertiser. */
  var creativeConfig: js.UndefOr[AdvertiserCreativeConfig] = js.native
  
  /** Settings that control how advertiser data may be accessed. */
  var dataAccessConfig: js.UndefOr[AdvertiserDataAccessConfig] = js.native
  
  /** Required. The display name of the advertiser. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Required. Controls whether or not insertion orders and line items of the advertiser can spend their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE` and
    * `ENTITY_STATUS_SCHEDULED_FOR_DELETION`. * If set to `ENTITY_STATUS_SCHEDULED_FOR_DELETION`, the advertiser will be deleted 30 days from when it was first scheduled for deletion.
    */
  var entityStatus: js.UndefOr[String] = js.native
  
  /** Required. General settings of the advertiser. */
  var generalConfig: js.UndefOr[AdvertiserGeneralConfig] = js.native
  
  /**
    * Integration details of the advertiser. Only integrationCode is currently applicable to advertiser. Other fields of IntegrationDetails are not supported and will be ignored if
    * provided.
    */
  var integrationDetails: js.UndefOr[IntegrationDetails] = js.native
  
  /** Output only. The resource name of the advertiser. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The unique ID of the partner that the advertiser belongs to. */
  var partnerId: js.UndefOr[String] = js.native
  
  /** Targeting settings related to ad serving of the advertiser. */
  var servingConfig: js.UndefOr[AdvertiserTargetingConfig] = js.native
  
  /** Output only. The timestamp when the advertiser was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.native
}
object Advertiser {
  
  @scala.inline
  def apply(): Advertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advertiser]
  }
  
  @scala.inline
  implicit class AdvertiserOps[Self <: Advertiser] (val x: Self) extends AnyVal {
    
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
    def setAdServerConfig(value: AdvertiserAdServerConfig): Self = this.set("adServerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdServerConfig: Self = this.set("adServerConfig", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setCreativeConfig(value: AdvertiserCreativeConfig): Self = this.set("creativeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeConfig: Self = this.set("creativeConfig", js.undefined)
    
    @scala.inline
    def setDataAccessConfig(value: AdvertiserDataAccessConfig): Self = this.set("dataAccessConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAccessConfig: Self = this.set("dataAccessConfig", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = this.set("entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityStatus: Self = this.set("entityStatus", js.undefined)
    
    @scala.inline
    def setGeneralConfig(value: AdvertiserGeneralConfig): Self = this.set("generalConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneralConfig: Self = this.set("generalConfig", js.undefined)
    
    @scala.inline
    def setIntegrationDetails(value: IntegrationDetails): Self = this.set("integrationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationDetails: Self = this.set("integrationDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
    
    @scala.inline
    def setServingConfig(value: AdvertiserTargetingConfig): Self = this.set("servingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServingConfig: Self = this.set("servingConfig", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}

package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Campaign extends js.Object {
  
  /** Output only. The unique ID of the advertiser the campaign belongs to. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Required. The planned spend and duration of the campaign. */
  var campaignFlight: js.UndefOr[CampaignFlight] = js.native
  
  /** Required. The goal of the campaign. */
  var campaignGoal: js.UndefOr[CampaignGoal] = js.native
  
  /** Output only. The unique ID of the campaign. Assigned by the system. */
  var campaignId: js.UndefOr[String] = js.native
  
  /** Required. The display name of the campaign. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Required. Controls whether or not the insertion orders under this campaign can spend their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE`,
    * `ENTITY_STATUS_ARCHIVED`, and `ENTITY_STATUS_PAUSED`. * For CreateCampaign method, `ENTITY_STATUS_ARCHIVED` is not allowed.
    */
  var entityStatus: js.UndefOr[String] = js.native
  
  /** Required. The frequency cap setting of the campaign. */
  var frequencyCap: js.UndefOr[FrequencyCap] = js.native
  
  /** Output only. The resource name of the campaign. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp when the campaign was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.native
}
object Campaign {
  
  @scala.inline
  def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  
  @scala.inline
  implicit class CampaignOps[Self <: Campaign] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setCampaignFlight(value: CampaignFlight): Self = this.set("campaignFlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignFlight: Self = this.set("campaignFlight", js.undefined)
    
    @scala.inline
    def setCampaignGoal(value: CampaignGoal): Self = this.set("campaignGoal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignGoal: Self = this.set("campaignGoal", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = this.set("entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityStatus: Self = this.set("entityStatus", js.undefined)
    
    @scala.inline
    def setFrequencyCap(value: FrequencyCap): Self = this.set("frequencyCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyCap: Self = this.set("frequencyCap", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}

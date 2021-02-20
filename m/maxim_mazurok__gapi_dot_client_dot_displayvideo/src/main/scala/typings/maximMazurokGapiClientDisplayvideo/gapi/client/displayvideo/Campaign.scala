package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Campaign extends StObject {
  
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
  implicit class CampaignMutableBuilder[Self <: Campaign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setCampaignFlight(value: CampaignFlight): Self = StObject.set(x, "campaignFlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignFlightUndefined: Self = StObject.set(x, "campaignFlight", js.undefined)
    
    @scala.inline
    def setCampaignGoal(value: CampaignGoal): Self = StObject.set(x, "campaignGoal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignGoalUndefined: Self = StObject.set(x, "campaignGoal", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    @scala.inline
    def setFrequencyCap(value: FrequencyCap): Self = StObject.set(x, "frequencyCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyCapUndefined: Self = StObject.set(x, "frequencyCap", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

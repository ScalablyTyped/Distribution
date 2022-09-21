package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Campaign extends StObject {
  
  /** Output only. The unique ID of the advertiser the campaign belongs to. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** The list of budgets available to this campaign. If this field is not set, the campaign uses an unlimited budget. */
  var campaignBudgets: js.UndefOr[js.Array[CampaignBudget]] = js.undefined
  
  /** Required. The planned spend and duration of the campaign. */
  var campaignFlight: js.UndefOr[CampaignFlight] = js.undefined
  
  /** Required. The goal of the campaign. */
  var campaignGoal: js.UndefOr[CampaignGoal] = js.undefined
  
  /** Output only. The unique ID of the campaign. Assigned by the system. */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the campaign. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Controls whether or not the insertion orders under this campaign can spend their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE`,
    * `ENTITY_STATUS_ARCHIVED`, and `ENTITY_STATUS_PAUSED`. * For CreateCampaign method, `ENTITY_STATUS_ARCHIVED` is not allowed.
    */
  var entityStatus: js.UndefOr[String] = js.undefined
  
  /** Required. The frequency cap setting of the campaign. */
  var frequencyCap: js.UndefOr[FrequencyCap] = js.undefined
  
  /** Output only. The resource name of the campaign. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The timestamp when the campaign was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Campaign {
  
  inline def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  
  extension [Self <: Campaign](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCampaignBudgets(value: js.Array[CampaignBudget]): Self = StObject.set(x, "campaignBudgets", value.asInstanceOf[js.Any])
    
    inline def setCampaignBudgetsUndefined: Self = StObject.set(x, "campaignBudgets", js.undefined)
    
    inline def setCampaignBudgetsVarargs(value: CampaignBudget*): Self = StObject.set(x, "campaignBudgets", js.Array(value*))
    
    inline def setCampaignFlight(value: CampaignFlight): Self = StObject.set(x, "campaignFlight", value.asInstanceOf[js.Any])
    
    inline def setCampaignFlightUndefined: Self = StObject.set(x, "campaignFlight", js.undefined)
    
    inline def setCampaignGoal(value: CampaignGoal): Self = StObject.set(x, "campaignGoal", value.asInstanceOf[js.Any])
    
    inline def setCampaignGoalUndefined: Self = StObject.set(x, "campaignGoal", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setFrequencyCap(value: FrequencyCap): Self = StObject.set(x, "frequencyCap", value.asInstanceOf[js.Any])
    
    inline def setFrequencyCapUndefined: Self = StObject.set(x, "frequencyCap", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCampaign extends StObject {
  
  /**
    * Output only. The unique ID of the advertiser the campaign belongs to.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of budgets available to this campaign. If this field is not set, the campaign uses an unlimited budget.
    */
  var campaignBudgets: js.UndefOr[js.Array[SchemaCampaignBudget]] = js.undefined
  
  /**
    * Required. The planned spend and duration of the campaign.
    */
  var campaignFlight: js.UndefOr[SchemaCampaignFlight] = js.undefined
  
  /**
    * Required. The goal of the campaign.
    */
  var campaignGoal: js.UndefOr[SchemaCampaignGoal] = js.undefined
  
  /**
    * Output only. The unique ID of the campaign. Assigned by the system.
    */
  var campaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the campaign. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Controls whether or not the insertion orders under this campaign can spend their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and `ENTITY_STATUS_PAUSED`. * For CreateCampaign method, `ENTITY_STATUS_ARCHIVED` is not allowed.
    */
  var entityStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The frequency cap setting of the campaign.
    */
  var frequencyCap: js.UndefOr[SchemaFrequencyCap] = js.undefined
  
  /**
    * Output only. The resource name of the campaign.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the campaign was last updated. Assigned by the system.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCampaign {
  
  inline def apply(): SchemaCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaign]
  }
  
  extension [Self <: SchemaCampaign](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCampaignBudgets(value: js.Array[SchemaCampaignBudget]): Self = StObject.set(x, "campaignBudgets", value.asInstanceOf[js.Any])
    
    inline def setCampaignBudgetsUndefined: Self = StObject.set(x, "campaignBudgets", js.undefined)
    
    inline def setCampaignBudgetsVarargs(value: SchemaCampaignBudget*): Self = StObject.set(x, "campaignBudgets", js.Array(value*))
    
    inline def setCampaignFlight(value: SchemaCampaignFlight): Self = StObject.set(x, "campaignFlight", value.asInstanceOf[js.Any])
    
    inline def setCampaignFlightUndefined: Self = StObject.set(x, "campaignFlight", js.undefined)
    
    inline def setCampaignGoal(value: SchemaCampaignGoal): Self = StObject.set(x, "campaignGoal", value.asInstanceOf[js.Any])
    
    inline def setCampaignGoalUndefined: Self = StObject.set(x, "campaignGoal", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusNull: Self = StObject.set(x, "entityStatus", null)
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setFrequencyCap(value: SchemaFrequencyCap): Self = StObject.set(x, "frequencyCap", value.asInstanceOf[js.Any])
    
    inline def setFrequencyCapUndefined: Self = StObject.set(x, "frequencyCap", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

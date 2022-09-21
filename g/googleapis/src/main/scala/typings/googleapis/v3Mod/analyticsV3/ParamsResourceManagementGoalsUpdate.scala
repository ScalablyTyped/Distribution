package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementGoalsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to update the goal.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the goal to be updated.
    */
  var goalId: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) ID to update the goal.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoal] = js.undefined
  
  /**
    * Web property ID to update the goal.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementGoalsUpdate {
  
  inline def apply(): ParamsResourceManagementGoalsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementGoalsUpdate]
  }
  
  extension [Self <: ParamsResourceManagementGoalsUpdate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setGoalId(value: String): Self = StObject.set(x, "goalId", value.asInstanceOf[js.Any])
    
    inline def setGoalIdUndefined: Self = StObject.set(x, "goalId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setRequestBody(value: SchemaGoal): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}

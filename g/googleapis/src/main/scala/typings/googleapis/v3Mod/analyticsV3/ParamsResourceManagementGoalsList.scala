package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementGoalsList
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to retrieve goals for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of goals to include in this response.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * View (Profile) ID to retrieve goals for. Can either be a specific view (profile) ID or '~all', which refers to all the views (profiles) that user has access to.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
  
  /**
    * Web property ID to retrieve goals for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementGoalsList {
  
  inline def apply(): ParamsResourceManagementGoalsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementGoalsList]
  }
  
  extension [Self <: ParamsResourceManagementGoalsList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}

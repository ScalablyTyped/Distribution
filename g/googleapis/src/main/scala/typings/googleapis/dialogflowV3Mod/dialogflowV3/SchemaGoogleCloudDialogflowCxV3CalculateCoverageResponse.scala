package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse extends StObject {
  
  /**
    * The agent to calculate coverage for. Format: `projects//locations//agents/`.
    */
  var agent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Intent coverage.
    */
  var intentCoverage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3IntentCoverage] = js.undefined
  
  /**
    * Transition route group coverage.
    */
  var routeGroupCoverage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverage] = js.undefined
  
  /**
    * Transition (excluding transition route groups) coverage.
    */
  var transitionCoverage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TransitionCoverage] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3CalculateCoverageResponse](x: Self) {
    
    inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentNull: Self = StObject.set(x, "agent", null)
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setIntentCoverage(value: SchemaGoogleCloudDialogflowCxV3IntentCoverage): Self = StObject.set(x, "intentCoverage", value.asInstanceOf[js.Any])
    
    inline def setIntentCoverageUndefined: Self = StObject.set(x, "intentCoverage", js.undefined)
    
    inline def setRouteGroupCoverage(value: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverage): Self = StObject.set(x, "routeGroupCoverage", value.asInstanceOf[js.Any])
    
    inline def setRouteGroupCoverageUndefined: Self = StObject.set(x, "routeGroupCoverage", js.undefined)
    
    inline def setTransitionCoverage(value: SchemaGoogleCloudDialogflowCxV3TransitionCoverage): Self = StObject.set(x, "transitionCoverage", value.asInstanceOf[js.Any])
    
    inline def setTransitionCoverageUndefined: Self = StObject.set(x, "transitionCoverage", js.undefined)
  }
}

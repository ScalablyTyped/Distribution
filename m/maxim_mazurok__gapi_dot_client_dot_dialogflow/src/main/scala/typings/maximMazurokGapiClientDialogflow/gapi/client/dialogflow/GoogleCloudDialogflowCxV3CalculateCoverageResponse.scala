package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3CalculateCoverageResponse extends StObject {
  
  /** The agent to calculate coverage for. Format: `projects//locations//agents/`. */
  var agent: js.UndefOr[String] = js.undefined
  
  /** Intent coverage. */
  var intentCoverage: js.UndefOr[GoogleCloudDialogflowCxV3IntentCoverage] = js.undefined
  
  /** Transition route group coverage. */
  var routeGroupCoverage: js.UndefOr[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverage] = js.undefined
  
  /** Transition (excluding transition route groups) coverage. */
  var transitionCoverage: js.UndefOr[GoogleCloudDialogflowCxV3TransitionCoverage] = js.undefined
}
object GoogleCloudDialogflowCxV3CalculateCoverageResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3CalculateCoverageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3CalculateCoverageResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3CalculateCoverageResponse](x: Self) {
    
    inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setIntentCoverage(value: GoogleCloudDialogflowCxV3IntentCoverage): Self = StObject.set(x, "intentCoverage", value.asInstanceOf[js.Any])
    
    inline def setIntentCoverageUndefined: Self = StObject.set(x, "intentCoverage", js.undefined)
    
    inline def setRouteGroupCoverage(value: GoogleCloudDialogflowCxV3TransitionRouteGroupCoverage): Self = StObject.set(x, "routeGroupCoverage", value.asInstanceOf[js.Any])
    
    inline def setRouteGroupCoverageUndefined: Self = StObject.set(x, "routeGroupCoverage", js.undefined)
    
    inline def setTransitionCoverage(value: GoogleCloudDialogflowCxV3TransitionCoverage): Self = StObject.set(x, "transitionCoverage", value.asInstanceOf[js.Any])
    
    inline def setTransitionCoverageUndefined: Self = StObject.set(x, "transitionCoverage", js.undefined)
  }
}

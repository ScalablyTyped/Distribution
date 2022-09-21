package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1CalculateCoverageResponse extends StObject {
  
  /**
    * The agent to calculate coverage for. Format: `projects//locations//agents/`.
    */
  var agent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Intent coverage.
    */
  var intentCoverage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1IntentCoverage] = js.undefined
  
  /**
    * Transition route group coverage.
    */
  var routeGroupCoverage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage] = js.undefined
  
  /**
    * Transition (excluding transition route groups) coverage.
    */
  var transitionCoverage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverage] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1CalculateCoverageResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1CalculateCoverageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1CalculateCoverageResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1CalculateCoverageResponse](x: Self) {
    
    inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentNull: Self = StObject.set(x, "agent", null)
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setIntentCoverage(value: SchemaGoogleCloudDialogflowCxV3beta1IntentCoverage): Self = StObject.set(x, "intentCoverage", value.asInstanceOf[js.Any])
    
    inline def setIntentCoverageUndefined: Self = StObject.set(x, "intentCoverage", js.undefined)
    
    inline def setRouteGroupCoverage(value: SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage): Self = StObject.set(x, "routeGroupCoverage", value.asInstanceOf[js.Any])
    
    inline def setRouteGroupCoverageUndefined: Self = StObject.set(x, "routeGroupCoverage", js.undefined)
    
    inline def setTransitionCoverage(value: SchemaGoogleCloudDialogflowCxV3beta1TransitionCoverage): Self = StObject.set(x, "transitionCoverage", value.asInstanceOf[js.Any])
    
    inline def setTransitionCoverageUndefined: Self = StObject.set(x, "transitionCoverage", js.undefined)
  }
}

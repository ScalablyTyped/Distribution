package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage extends StObject {
  
  /** The percent of transition routes in the transition route group that are covered. */
  var coverageScore: js.UndefOr[Double] = js.undefined
  
  /** Transition route group metadata. Only name and displayName will be set. */
  var routeGroup: js.UndefOr[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.undefined
  
  /** The list of transition routes and coverage in the transition route group. */
  var transitions: js.UndefOr[
    js.Array[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition]
  ] = js.undefined
}
object GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage {
  
  inline def apply(): GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage] (val x: Self) extends AnyVal {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setRouteGroup(value: GoogleCloudDialogflowCxV3TransitionRouteGroup): Self = StObject.set(x, "routeGroup", value.asInstanceOf[js.Any])
    
    inline def setRouteGroupUndefined: Self = StObject.set(x, "routeGroup", js.undefined)
    
    inline def setTransitions(value: js.Array[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setTransitionsVarargs(value: GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition*): Self = StObject.set(x, "transitions", js.Array(value*))
  }
}

package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage extends StObject {
  
  /**
    * The percent of transition routes in the transition route group that are covered.
    */
  var coverageScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Transition route group metadata. Only name and displayName will be set.
    */
  var routeGroup: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.undefined
  
  /**
    * The list of transition routes and coverage in the transition route group.
    */
  var transitions: js.UndefOr[
    js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition]
  ] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverage](x: Self) {
    
    inline def setCoverageScore(value: Double): Self = StObject.set(x, "coverageScore", value.asInstanceOf[js.Any])
    
    inline def setCoverageScoreNull: Self = StObject.set(x, "coverageScore", null)
    
    inline def setCoverageScoreUndefined: Self = StObject.set(x, "coverageScore", js.undefined)
    
    inline def setRouteGroup(value: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup): Self = StObject.set(x, "routeGroup", value.asInstanceOf[js.Any])
    
    inline def setRouteGroupUndefined: Self = StObject.set(x, "routeGroup", js.undefined)
    
    inline def setTransitions(value: js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setTransitionsVarargs(value: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition*): Self = StObject.set(x, "transitions", js.Array(value*))
  }
}

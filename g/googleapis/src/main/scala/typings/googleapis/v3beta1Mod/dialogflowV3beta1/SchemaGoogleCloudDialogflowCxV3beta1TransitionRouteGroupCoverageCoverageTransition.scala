package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition extends StObject {
  
  /**
    * Whether or not the transition route is covered by at least one of the agent's test cases.
    */
  var covered: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Intent route or condition route.
    */
  var transitionRoute: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1TransitionRoute] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition](x: Self) {
    
    inline def setCovered(value: Boolean): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
    
    inline def setCoveredNull: Self = StObject.set(x, "covered", null)
    
    inline def setCoveredUndefined: Self = StObject.set(x, "covered", js.undefined)
    
    inline def setTransitionRoute(value: SchemaGoogleCloudDialogflowCxV3beta1TransitionRoute): Self = StObject.set(x, "transitionRoute", value.asInstanceOf[js.Any])
    
    inline def setTransitionRouteUndefined: Self = StObject.set(x, "transitionRoute", js.undefined)
  }
}

package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition extends StObject {
  
  /** Whether or not the transition route is covered by at least one of the agent's test cases. */
  var covered: js.UndefOr[Boolean] = js.undefined
  
  /** Intent route or condition route. */
  var transitionRoute: js.UndefOr[GoogleCloudDialogflowCxV3TransitionRoute] = js.undefined
}
object GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition {
  
  inline def apply(): GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3TransitionRouteGroupCoverageCoverageTransition] (val x: Self) extends AnyVal {
    
    inline def setCovered(value: Boolean): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
    
    inline def setCoveredUndefined: Self = StObject.set(x, "covered", js.undefined)
    
    inline def setTransitionRoute(value: GoogleCloudDialogflowCxV3TransitionRoute): Self = StObject.set(x, "transitionRoute", value.asInstanceOf[js.Any])
    
    inline def setTransitionRouteUndefined: Self = StObject.set(x, "transitionRoute", js.undefined)
  }
}

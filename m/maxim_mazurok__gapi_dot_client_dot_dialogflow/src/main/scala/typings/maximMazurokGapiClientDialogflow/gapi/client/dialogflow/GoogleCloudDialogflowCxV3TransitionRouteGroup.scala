package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TransitionRouteGroup extends StObject {
  
  /** Required. The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format:
    * `projects//locations//agents//flows//transitionRouteGroups/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Transition routes associated with the TransitionRouteGroup. */
  var transitionRoutes: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TransitionRoute]] = js.undefined
}
object GoogleCloudDialogflowCxV3TransitionRouteGroup {
  
  inline def apply(): GoogleCloudDialogflowCxV3TransitionRouteGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TransitionRouteGroup]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TransitionRouteGroup](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTransitionRoutes(value: js.Array[GoogleCloudDialogflowCxV3TransitionRoute]): Self = StObject.set(x, "transitionRoutes", value.asInstanceOf[js.Any])
    
    inline def setTransitionRoutesUndefined: Self = StObject.set(x, "transitionRoutes", js.undefined)
    
    inline def setTransitionRoutesVarargs(value: GoogleCloudDialogflowCxV3TransitionRoute*): Self = StObject.set(x, "transitionRoutes", js.Array(value*))
  }
}

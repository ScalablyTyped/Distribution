package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup extends StObject {
  
  /**
    * Required. The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Transition routes associated with the TransitionRouteGroup.
    */
  var transitionRoutes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRoute]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTransitionRoutes(value: js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRoute]): Self = StObject.set(x, "transitionRoutes", value.asInstanceOf[js.Any])
    
    inline def setTransitionRoutesUndefined: Self = StObject.set(x, "transitionRoutes", js.undefined)
    
    inline def setTransitionRoutesVarargs(value: SchemaGoogleCloudDialogflowCxV3TransitionRoute*): Self = StObject.set(x, "transitionRoutes", js.Array(value*))
  }
}

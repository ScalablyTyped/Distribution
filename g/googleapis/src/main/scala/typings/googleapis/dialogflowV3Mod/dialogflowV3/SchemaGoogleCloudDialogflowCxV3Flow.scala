package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3Flow extends StObject {
  
  /**
    * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The human-readable name of the flow.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
    */
  var eventHandlers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3EventHandler]] = js.undefined
  
  /**
    * The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * NLU related settings of the flow.
    */
  var nluSettings: js.UndefOr[SchemaGoogleCloudDialogflowCxV3NluSettings] = js.undefined
  
  /**
    * A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
    */
  var transitionRouteGroups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
    */
  var transitionRoutes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRoute]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3Flow {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3Flow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3Flow]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3Flow](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEventHandlers(value: js.Array[SchemaGoogleCloudDialogflowCxV3EventHandler]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setEventHandlersVarargs(value: SchemaGoogleCloudDialogflowCxV3EventHandler*): Self = StObject.set(x, "eventHandlers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNluSettings(value: SchemaGoogleCloudDialogflowCxV3NluSettings): Self = StObject.set(x, "nluSettings", value.asInstanceOf[js.Any])
    
    inline def setNluSettingsUndefined: Self = StObject.set(x, "nluSettings", js.undefined)
    
    inline def setTransitionRouteGroups(value: js.Array[String]): Self = StObject.set(x, "transitionRouteGroups", value.asInstanceOf[js.Any])
    
    inline def setTransitionRouteGroupsNull: Self = StObject.set(x, "transitionRouteGroups", null)
    
    inline def setTransitionRouteGroupsUndefined: Self = StObject.set(x, "transitionRouteGroups", js.undefined)
    
    inline def setTransitionRouteGroupsVarargs(value: String*): Self = StObject.set(x, "transitionRouteGroups", js.Array(value*))
    
    inline def setTransitionRoutes(value: js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRoute]): Self = StObject.set(x, "transitionRoutes", value.asInstanceOf[js.Any])
    
    inline def setTransitionRoutesUndefined: Self = StObject.set(x, "transitionRoutes", js.undefined)
    
    inline def setTransitionRoutesVarargs(value: SchemaGoogleCloudDialogflowCxV3TransitionRoute*): Self = StObject.set(x, "transitionRoutes", js.Array(value*))
  }
}

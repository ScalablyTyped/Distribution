package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Flow extends StObject {
  
  /** The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The human-readable name of the flow. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event
    * handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike
    * transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
    */
  var eventHandlers: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3EventHandler]] = js.undefined
  
  /** The unique identifier of the flow. Format: `projects//locations//agents//flows/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** NLU related settings of the flow. */
  var nluSettings: js.UndefOr[GoogleCloudDialogflowCxV3NluSettings] = js.undefined
  
  /**
    * A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition
    * route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
    */
  var transitionRouteGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes
    * and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined
    * in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified. * TransitionRoutes
    * with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
    */
  var transitionRoutes: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TransitionRoute]] = js.undefined
}
object GoogleCloudDialogflowCxV3Flow {
  
  inline def apply(): GoogleCloudDialogflowCxV3Flow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Flow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3Flow] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEventHandlers(value: js.Array[GoogleCloudDialogflowCxV3EventHandler]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setEventHandlersVarargs(value: GoogleCloudDialogflowCxV3EventHandler*): Self = StObject.set(x, "eventHandlers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNluSettings(value: GoogleCloudDialogflowCxV3NluSettings): Self = StObject.set(x, "nluSettings", value.asInstanceOf[js.Any])
    
    inline def setNluSettingsUndefined: Self = StObject.set(x, "nluSettings", js.undefined)
    
    inline def setTransitionRouteGroups(value: js.Array[String]): Self = StObject.set(x, "transitionRouteGroups", value.asInstanceOf[js.Any])
    
    inline def setTransitionRouteGroupsUndefined: Self = StObject.set(x, "transitionRouteGroups", js.undefined)
    
    inline def setTransitionRouteGroupsVarargs(value: String*): Self = StObject.set(x, "transitionRouteGroups", js.Array(value*))
    
    inline def setTransitionRoutes(value: js.Array[GoogleCloudDialogflowCxV3TransitionRoute]): Self = StObject.set(x, "transitionRoutes", value.asInstanceOf[js.Any])
    
    inline def setTransitionRoutesUndefined: Self = StObject.set(x, "transitionRoutes", js.undefined)
    
    inline def setTransitionRoutesVarargs(value: GoogleCloudDialogflowCxV3TransitionRoute*): Self = StObject.set(x, "transitionRoutes", js.Array(value*))
  }
}

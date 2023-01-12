package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1Page extends StObject {
  
  /** Required. The human-readable name of the page, unique within the flow. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The fulfillment to call when the session is entering the page. */
  var entryFulfillment: js.UndefOr[GoogleCloudDialogflowCxV3beta1Fulfillment] = js.undefined
  
  /** Handlers associated with the page to handle events such as webhook errors, no match or no input. */
  var eventHandlers: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1EventHandler]] = js.undefined
  
  /** The form associated with the page, used for collecting parameters relevant to the page. */
  var form: js.UndefOr[GoogleCloudDialogflowCxV3beta1Form] = js.undefined
  
  /** The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to
    * the same intent, then the precedence order is: page's transition route -> page's transition route group -> flow's transition routes. * If multiple transition route groups within a
    * page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
    */
  var transitionRouteGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the
    * TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with
    * intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes
    * defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
    */
  var transitionRoutes: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1TransitionRoute]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1Page {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1Page]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1Page] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntryFulfillment(value: GoogleCloudDialogflowCxV3beta1Fulfillment): Self = StObject.set(x, "entryFulfillment", value.asInstanceOf[js.Any])
    
    inline def setEntryFulfillmentUndefined: Self = StObject.set(x, "entryFulfillment", js.undefined)
    
    inline def setEventHandlers(value: js.Array[GoogleCloudDialogflowCxV3beta1EventHandler]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setEventHandlersVarargs(value: GoogleCloudDialogflowCxV3beta1EventHandler*): Self = StObject.set(x, "eventHandlers", js.Array(value*))
    
    inline def setForm(value: GoogleCloudDialogflowCxV3beta1Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTransitionRouteGroups(value: js.Array[String]): Self = StObject.set(x, "transitionRouteGroups", value.asInstanceOf[js.Any])
    
    inline def setTransitionRouteGroupsUndefined: Self = StObject.set(x, "transitionRouteGroups", js.undefined)
    
    inline def setTransitionRouteGroupsVarargs(value: String*): Self = StObject.set(x, "transitionRouteGroups", js.Array(value*))
    
    inline def setTransitionRoutes(value: js.Array[GoogleCloudDialogflowCxV3beta1TransitionRoute]): Self = StObject.set(x, "transitionRoutes", value.asInstanceOf[js.Any])
    
    inline def setTransitionRoutesUndefined: Self = StObject.set(x, "transitionRoutes", js.undefined)
    
    inline def setTransitionRoutesVarargs(value: GoogleCloudDialogflowCxV3beta1TransitionRoute*): Self = StObject.set(x, "transitionRoutes", js.Array(value*))
  }
}

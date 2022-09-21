package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1FormParameterFillBehavior extends StObject {
  
  /**
    * Required. The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
    */
  var initialPromptFulfillment: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1Fulfillment] = js.undefined
  
  /**
    * The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user's response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user's response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can't be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
    */
  var repromptEventHandlers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1EventHandler]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1FormParameterFillBehavior {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1FormParameterFillBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1FormParameterFillBehavior]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1FormParameterFillBehavior](x: Self) {
    
    inline def setInitialPromptFulfillment(value: SchemaGoogleCloudDialogflowCxV3beta1Fulfillment): Self = StObject.set(x, "initialPromptFulfillment", value.asInstanceOf[js.Any])
    
    inline def setInitialPromptFulfillmentUndefined: Self = StObject.set(x, "initialPromptFulfillment", js.undefined)
    
    inline def setRepromptEventHandlers(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1EventHandler]): Self = StObject.set(x, "repromptEventHandlers", value.asInstanceOf[js.Any])
    
    inline def setRepromptEventHandlersUndefined: Self = StObject.set(x, "repromptEventHandlers", js.undefined)
    
    inline def setRepromptEventHandlersVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1EventHandler*): Self = StObject.set(x, "repromptEventHandlers", js.Array(value*))
  }
}

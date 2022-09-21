package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2Intent extends StObject {
  
  /**
    * Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
    */
  var defaultResponsePlatforms: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The name of this intent.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an end user. Default is false.
    */
  var endInteraction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for an event to trigger this intent. Event names are limited to 150 characters.
    */
  var events: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Read-only. Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only in the output.
    */
  var followupIntentInfo: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.undefined
  
  /**
    * Optional. The list of context names required for this intent to be triggered. Format: `projects//agent/sessions/-/contexts/`.
    */
  var inputContextNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Indicates whether this is a fallback intent.
    */
  var isFallback: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Indicates that a live agent should be brought in to handle the interaction with the user. In most cases, when you set this flag to true, you would also want to set end_interaction to true as well. Default is false.
    */
  var liveAgentHandoff: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console.
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]] = js.undefined
  
  /**
    * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
    */
  var mlDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Format: `projects//agent/intents/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.undefined
  
  /**
    * Optional. The collection of parameters associated with the intent.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentParameter]] = js.undefined
  
  /**
    * Read-only after creation. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
    */
  var parentFollowupIntentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Indicates whether to delete all contexts in the current session when this intent is matched.
    */
  var resetContexts: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Read-only. The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents chain for this intent. We populate this field only in the output. Format: `projects//agent/intents/`.
    */
  var rootFollowupIntentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The collection of examples that the agent is trained on.
    */
  var trainingPhrases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrase]] = js.undefined
  
  /**
    * Optional. Indicates whether webhooks are enabled for the intent.
    */
  var webhookState: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2Intent {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Intent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2Intent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDefaultResponsePlatforms(value: js.Array[String]): Self = StObject.set(x, "defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    inline def setDefaultResponsePlatformsNull: Self = StObject.set(x, "defaultResponsePlatforms", null)
    
    inline def setDefaultResponsePlatformsUndefined: Self = StObject.set(x, "defaultResponsePlatforms", js.undefined)
    
    inline def setDefaultResponsePlatformsVarargs(value: String*): Self = StObject.set(x, "defaultResponsePlatforms", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndInteraction(value: Boolean): Self = StObject.set(x, "endInteraction", value.asInstanceOf[js.Any])
    
    inline def setEndInteractionNull: Self = StObject.set(x, "endInteraction", null)
    
    inline def setEndInteractionUndefined: Self = StObject.set(x, "endInteraction", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFollowupIntentInfo(value: js.Array[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]): Self = StObject.set(x, "followupIntentInfo", value.asInstanceOf[js.Any])
    
    inline def setFollowupIntentInfoUndefined: Self = StObject.set(x, "followupIntentInfo", js.undefined)
    
    inline def setFollowupIntentInfoVarargs(value: SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo*): Self = StObject.set(x, "followupIntentInfo", js.Array(value*))
    
    inline def setInputContextNames(value: js.Array[String]): Self = StObject.set(x, "inputContextNames", value.asInstanceOf[js.Any])
    
    inline def setInputContextNamesNull: Self = StObject.set(x, "inputContextNames", null)
    
    inline def setInputContextNamesUndefined: Self = StObject.set(x, "inputContextNames", js.undefined)
    
    inline def setInputContextNamesVarargs(value: String*): Self = StObject.set(x, "inputContextNames", js.Array(value*))
    
    inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    inline def setIsFallbackNull: Self = StObject.set(x, "isFallback", null)
    
    inline def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
    
    inline def setLiveAgentHandoff(value: Boolean): Self = StObject.set(x, "liveAgentHandoff", value.asInstanceOf[js.Any])
    
    inline def setLiveAgentHandoffNull: Self = StObject.set(x, "liveAgentHandoff", null)
    
    inline def setLiveAgentHandoffUndefined: Self = StObject.set(x, "liveAgentHandoff", js.undefined)
    
    inline def setMessages(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMlDisabled(value: Boolean): Self = StObject.set(x, "mlDisabled", value.asInstanceOf[js.Any])
    
    inline def setMlDisabledNull: Self = StObject.set(x, "mlDisabled", null)
    
    inline def setMlDisabledUndefined: Self = StObject.set(x, "mlDisabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: SchemaGoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParameters(value: js.Array[SchemaGoogleCloudDialogflowV2IntentParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaGoogleCloudDialogflowV2IntentParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setParentFollowupIntentNameNull: Self = StObject.set(x, "parentFollowupIntentName", null)
    
    inline def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    inline def setResetContextsNull: Self = StObject.set(x, "resetContexts", null)
    
    inline def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    inline def setRootFollowupIntentName(value: String): Self = StObject.set(x, "rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setRootFollowupIntentNameNull: Self = StObject.set(x, "rootFollowupIntentName", null)
    
    inline def setRootFollowupIntentNameUndefined: Self = StObject.set(x, "rootFollowupIntentName", js.undefined)
    
    inline def setTrainingPhrases(value: js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrase]): Self = StObject.set(x, "trainingPhrases", value.asInstanceOf[js.Any])
    
    inline def setTrainingPhrasesUndefined: Self = StObject.set(x, "trainingPhrases", js.undefined)
    
    inline def setTrainingPhrasesVarargs(value: SchemaGoogleCloudDialogflowV2IntentTrainingPhrase*): Self = StObject.set(x, "trainingPhrases", js.Array(value*))
    
    inline def setWebhookState(value: String): Self = StObject.set(x, "webhookState", value.asInstanceOf[js.Any])
    
    inline def setWebhookStateNull: Self = StObject.set(x, "webhookState", null)
    
    inline def setWebhookStateUndefined: Self = StObject.set(x, "webhookState", js.undefined)
  }
}

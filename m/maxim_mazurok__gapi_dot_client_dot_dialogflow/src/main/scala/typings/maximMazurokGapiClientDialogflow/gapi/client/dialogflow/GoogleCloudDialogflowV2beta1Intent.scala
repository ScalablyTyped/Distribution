package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1Intent extends StObject {
  
  /** Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces. */
  var action: js.UndefOr[String] = js.native
  
  /** Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform). */
  var defaultResponsePlatforms: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The name of this intent. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an
    * end user. Default is false.
    */
  var endInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for
    * an event to trigger this intent. Event names are limited to 150 characters.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only in the output. */
  var followupIntentInfo: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo]] = js.native
  
  /** Optional. The list of context names required for this intent to be triggered. Formats: - `projects//agent/sessions/-/contexts/` - `projects//locations//agent/sessions/-/contexts/` */
  var inputContextNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Indicates whether this is a fallback intent. */
  var isFallback: js.UndefOr[Boolean] = js.native
  
  /** Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console. */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessage]] = js.native
  
  /**
    * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference
    * in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
    */
  var mlDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Indicates whether Machine Learning is enabled for the intent. Note: If `ml_enabled` setting is set to false, then this intent is not taken into account during inference in
    * `ML ONLY` match mode. Also, auto-markup in the UI is turned off. DEPRECATED! Please use `ml_disabled` field instead. NOTE: If both `ml_enabled` and `ml_disabled` are either not set
    * or false, then the default value is determined as follows: - Before April 15th, 2018 the default is: ml_enabled = false / ml_disabled = true. - After April 15th, 2018 the default
    * is: ml_enabled = true / ml_disabled = false.
    */
  var mlEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Supported formats: - `projects//agent/intents/` -
    * `projects//locations//agent/intents/`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the
    * `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
    */
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1Context]] = js.native
  
  /** Optional. The collection of parameters associated with the intent. */
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentParameter]] = js.native
  
  /**
    * Optional. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or
    * BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
    */
  var parentFollowupIntentName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which
    * corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /** Optional. Indicates whether to delete all contexts in the current session when this intent is matched. */
  var resetContexts: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents chain for this intent. Format:
    * `projects//agent/intents/`.
    */
  var rootFollowupIntentName: js.UndefOr[String] = js.native
  
  /** Optional. The collection of examples that the agent is trained on. */
  var trainingPhrases: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentTrainingPhrase]] = js.native
  
  /** Optional. Indicates whether webhooks are enabled for the intent. */
  var webhookState: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1Intent {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1Intent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMutableBuilder[Self <: GoogleCloudDialogflowV2beta1Intent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDefaultResponsePlatforms(value: js.Array[String]): Self = StObject.set(x, "defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResponsePlatformsUndefined: Self = StObject.set(x, "defaultResponsePlatforms", js.undefined)
    
    @scala.inline
    def setDefaultResponsePlatformsVarargs(value: String*): Self = StObject.set(x, "defaultResponsePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEndInteraction(value: Boolean): Self = StObject.set(x, "endInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndInteractionUndefined: Self = StObject.set(x, "endInteraction", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFollowupIntentInfo(value: js.Array[GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo]): Self = StObject.set(x, "followupIntentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupIntentInfoUndefined: Self = StObject.set(x, "followupIntentInfo", js.undefined)
    
    @scala.inline
    def setFollowupIntentInfoVarargs(value: GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo*): Self = StObject.set(x, "followupIntentInfo", js.Array(value :_*))
    
    @scala.inline
    def setInputContextNames(value: js.Array[String]): Self = StObject.set(x, "inputContextNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContextNamesUndefined: Self = StObject.set(x, "inputContextNames", js.undefined)
    
    @scala.inline
    def setInputContextNamesVarargs(value: String*): Self = StObject.set(x, "inputContextNames", js.Array(value :_*))
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GoogleCloudDialogflowV2beta1IntentMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setMlDisabled(value: Boolean): Self = StObject.set(x, "mlDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlDisabledUndefined: Self = StObject.set(x, "mlDisabled", js.undefined)
    
    @scala.inline
    def setMlEnabled(value: Boolean): Self = StObject.set(x, "mlEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlEnabledUndefined: Self = StObject.set(x, "mlEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2beta1Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2beta1Context*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[GoogleCloudDialogflowV2beta1IntentParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: GoogleCloudDialogflowV2beta1IntentParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    @scala.inline
    def setRootFollowupIntentName(value: String): Self = StObject.set(x, "rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFollowupIntentNameUndefined: Self = StObject.set(x, "rootFollowupIntentName", js.undefined)
    
    @scala.inline
    def setTrainingPhrases(value: js.Array[GoogleCloudDialogflowV2beta1IntentTrainingPhrase]): Self = StObject.set(x, "trainingPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingPhrasesUndefined: Self = StObject.set(x, "trainingPhrases", js.undefined)
    
    @scala.inline
    def setTrainingPhrasesVarargs(value: GoogleCloudDialogflowV2beta1IntentTrainingPhrase*): Self = StObject.set(x, "trainingPhrases", js.Array(value :_*))
    
    @scala.inline
    def setWebhookState(value: String): Self = StObject.set(x, "webhookState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookStateUndefined: Self = StObject.set(x, "webhookState", js.undefined)
  }
}

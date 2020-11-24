package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an intent. Intents convert a number of user expressions or
  * patterns into an action. An action is an extraction of a user command or
  * sentence semantics.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2Intent extends js.Object {
  
  /**
    * Optional. The name of the action associated with the intent. Note: The
    * action name must not contain whitespaces.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Optional. The list of platforms for which the first response will be
    * taken from among the messages assigned to the DEFAULT_PLATFORM.
    */
  var defaultResponsePlatforms: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The name of this intent.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of event names that trigger the intent. If the
    * collection of input contexts is not empty, all of the contexts must be
    * present in the active user session for an event to trigger this intent.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Read-only. Information about all followup intents that have this intent
    * as a direct or indirect parent. We populate this field only in the
    * output.
    */
  var followupIntentInfo: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.native
  
  /**
    * Optional. The list of context names required for this intent to be
    * triggered. Format: `projects/&lt;Project
    * ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
    */
  var inputContextNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Indicates whether this is a fallback intent.
    */
  var isFallback: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The collection of rich messages corresponding to the `Response`
    * field in the Dialogflow console.
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]] = js.native
  
  /**
    * Optional. Indicates whether Machine Learning is disabled for the intent.
    * Note: If `ml_diabled` setting is set to true, then this intent is not
    * taken into account during inference in `ML ONLY` match mode. Also,
    * auto-markup in the UI is turned off.
    */
  var mlDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique identifier of this intent. Required for Intents.UpdateIntent
    * and Intents.BatchUpdateIntents methods. Format: `projects/&lt;Project
    * ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of contexts that are activated when the intent
    * is matched. Context messages in this collection should not set the
    * parameters field. Setting the `lifespan_count` to 0 will reset the
    * context when the intent is matched. Format: `projects/&lt;Project
    * ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.native
  
  /**
    * Optional. The collection of parameters associated with the intent.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentParameter]] = js.native
  
  /**
    * Read-only after creation. The unique identifier of the parent intent in
    * the chain of followup intents. You can set this field when creating an
    * intent, for example with CreateIntent or BatchUpdateIntents, in order to
    * make this intent a followup intent.  It identifies the parent followup
    * intent. Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent
    * ID&gt;`.
    */
  var parentFollowupIntentName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The priority of this intent. Higher numbers represent higher
    * priorities. If this is zero or unspecified, we use the default priority
    * 500000.  Negative numbers mean that the intent is disabled.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Indicates whether to delete all contexts in the current session
    * when this intent is matched.
    */
  var resetContexts: js.UndefOr[Boolean] = js.native
  
  /**
    * Read-only. The unique identifier of the root intent in the chain of
    * followup intents. It identifies the correct followup intents chain for
    * this intent. We populate this field only in the output.  Format:
    * `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var rootFollowupIntentName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of examples that the agent is trained on.
    */
  var trainingPhrases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrase]] = js.native
  
  /**
    * Optional. Indicates whether webhooks are enabled for the intent.
    */
  var webhookState: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2Intent {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Intent]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentOps[Self <: SchemaGoogleCloudDialogflowV2Intent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDefaultResponsePlatformsVarargs(value: String*): Self = this.set("defaultResponsePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setDefaultResponsePlatforms(value: js.Array[String]): Self = this.set("defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultResponsePlatforms: Self = this.set("defaultResponsePlatforms", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFollowupIntentInfoVarargs(value: SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo*): Self = this.set("followupIntentInfo", js.Array(value :_*))
    
    @scala.inline
    def setFollowupIntentInfo(value: js.Array[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]): Self = this.set("followupIntentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowupIntentInfo: Self = this.set("followupIntentInfo", js.undefined)
    
    @scala.inline
    def setInputContextNamesVarargs(value: String*): Self = this.set("inputContextNames", js.Array(value :_*))
    
    @scala.inline
    def setInputContextNames(value: js.Array[String]): Self = this.set("inputContextNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputContextNames: Self = this.set("inputContextNames", js.undefined)
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = this.set("isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFallback: Self = this.set("isFallback", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMlDisabled(value: Boolean): Self = this.set("mlDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMlDisabled: Self = this.set("mlDisabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: SchemaGoogleCloudDialogflowV2Context*): Self = this.set("outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setOutputContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = this.set("outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputContexts: Self = this.set("outputContexts", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SchemaGoogleCloudDialogflowV2IntentParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[SchemaGoogleCloudDialogflowV2IntentParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = this.set("parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFollowupIntentName: Self = this.set("parentFollowupIntentName", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = this.set("resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetContexts: Self = this.set("resetContexts", js.undefined)
    
    @scala.inline
    def setRootFollowupIntentName(value: String): Self = this.set("rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootFollowupIntentName: Self = this.set("rootFollowupIntentName", js.undefined)
    
    @scala.inline
    def setTrainingPhrasesVarargs(value: SchemaGoogleCloudDialogflowV2IntentTrainingPhrase*): Self = this.set("trainingPhrases", js.Array(value :_*))
    
    @scala.inline
    def setTrainingPhrases(value: js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrase]): Self = this.set("trainingPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingPhrases: Self = this.set("trainingPhrases", js.undefined)
    
    @scala.inline
    def setWebhookState(value: String): Self = this.set("webhookState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookState: Self = this.set("webhookState", js.undefined)
  }
}

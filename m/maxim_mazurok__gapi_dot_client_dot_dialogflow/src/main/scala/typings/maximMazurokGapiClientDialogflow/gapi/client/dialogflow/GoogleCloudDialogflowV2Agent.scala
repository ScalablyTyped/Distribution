package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2Agent extends js.Object {
  
  /**
    * Optional. API version displayed in Dialogflow console. If not specified, V2 API is assumed. Clients are free to query different service endpoints for different API versions.
    * However, bots connectors and webhook calls will follow the specified API version.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * Optional. The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web
    * Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
    */
  var avatarUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold.
    * If the returned score value is less than the threshold value, then a fallback intent will be triggered or, if there are no fallback intents defined, no intent will be triggered. The
    * score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
    */
  var classificationThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Required. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the currently
    * supported language codes. This field cannot be set by the `Update` method.
    */
  var defaultLanguageCode: js.UndefOr[String] = js.native
  
  /** Optional. The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. The name of this agent. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. Determines whether this agent should log conversation queries. */
  var enableLogging: js.UndefOr[Boolean] = js.native
  
  /** Optional. Determines how intents are detected from user queries. */
  var matchMode: js.UndefOr[String] = js.native
  
  /** Required. The project of this agent. Format: `projects/`. */
  var parent: js.UndefOr[String] = js.native
  
  /** Optional. The list of all languages supported by this agent (except for the `default_language_code`). */
  var supportedLanguageCodes: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The agent tier. If not specified, TIER_STANDARD is assumed. */
  var tier: js.UndefOr[String] = js.native
  
  /** Required. The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. */
  var timeZone: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2Agent {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Agent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Agent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2AgentOps[Self <: GoogleCloudDialogflowV2Agent] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setAvatarUri(value: String): Self = this.set("avatarUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatarUri: Self = this.set("avatarUri", js.undefined)
    
    @scala.inline
    def setClassificationThreshold(value: Double): Self = this.set("classificationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassificationThreshold: Self = this.set("classificationThreshold", js.undefined)
    
    @scala.inline
    def setDefaultLanguageCode(value: String): Self = this.set("defaultLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguageCode: Self = this.set("defaultLanguageCode", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEnableLogging(value: Boolean): Self = this.set("enableLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLogging: Self = this.set("enableLogging", js.undefined)
    
    @scala.inline
    def setMatchMode(value: String): Self = this.set("matchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchMode: Self = this.set("matchMode", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setSupportedLanguageCodesVarargs(value: String*): Self = this.set("supportedLanguageCodes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLanguageCodes(value: js.Array[String]): Self = this.set("supportedLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLanguageCodes: Self = this.set("supportedLanguageCodes", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}

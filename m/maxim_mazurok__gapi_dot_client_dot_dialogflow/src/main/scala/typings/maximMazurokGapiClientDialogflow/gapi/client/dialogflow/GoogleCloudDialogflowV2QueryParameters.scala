package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2QueryParameters extends js.Object {
  
  /** The collection of contexts to be activated before this query is executed. */
  var contexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.native
  
  /** The geo location of this conversational query. */
  var geoLocation: js.UndefOr[GoogleTypeLatLng] = js.native
  
  /**
    * This field can be used to pass custom data to your webhook. Arbitrary JSON objects are supported. If supplied, the value is used to populate the
    * `WebhookRequest.original_detect_intent_request.payload` field sent to your webhook.
    */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters with TopLevel[js.Any]
  ] = js.native
  
  /** Specifies whether to delete all contexts in the current session before the new ones are activated. */
  var resetContexts: js.UndefOr[Boolean] = js.native
  
  /** Configures the type of sentiment analysis to perform. If not provided, sentiment analysis is not performed. */
  var sentimentAnalysisRequestConfig: js.UndefOr[GoogleCloudDialogflowV2SentimentAnalysisRequestConfig] = js.native
  
  /** Additional session entity types to replace or extend developer entity types with. The entity synonyms apply to all languages and persist for the session of this query. */
  var sessionEntityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2SessionEntityType]] = js.native
  
  /**
    * The time zone of this conversational query from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. If not provided, the time zone
    * specified in agent settings is used.
    */
  var timeZone: js.UndefOr[String] = js.native
  
  /**
    * This field can be used to pass HTTP headers for a webhook call. These headers will be sent to webhook along with the headers that have been configured through Dialogflow web
    * console. The headers defined within this field will overwrite the headers configured through Dialogflow console if there is a conflict. Header names are case-insensitive. Google's
    * specified headers are not allowed. Including: "Host", "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding", "If-Modified-Since", "If-None-Match",
    * "X-Forwarded-For", etc.
    */
  var webhookHeaders: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudDialogflowV2QueryParameters {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryParameters]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2QueryParametersOps[Self <: GoogleCloudDialogflowV2QueryParameters] (val x: Self) extends AnyVal {
    
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
    def setContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setGeoLocation(value: GoogleTypeLatLng): Self = this.set("geoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoLocation: Self = this.set("geoLocation", js.undefined)
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters with TopLevel[js.Any]
    ): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = this.set("resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetContexts: Self = this.set("resetContexts", js.undefined)
    
    @scala.inline
    def setSentimentAnalysisRequestConfig(value: GoogleCloudDialogflowV2SentimentAnalysisRequestConfig): Self = this.set("sentimentAnalysisRequestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentimentAnalysisRequestConfig: Self = this.set("sentimentAnalysisRequestConfig", js.undefined)
    
    @scala.inline
    def setSessionEntityTypesVarargs(value: GoogleCloudDialogflowV2SessionEntityType*): Self = this.set("sessionEntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setSessionEntityTypes(value: js.Array[GoogleCloudDialogflowV2SessionEntityType]): Self = this.set("sessionEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionEntityTypes: Self = this.set("sessionEntityTypes", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setWebhookHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters with TopLevel[js.Any]
    ): Self = this.set("webhookHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookHeaders: Self = this.set("webhookHeaders", js.undefined)
  }
}

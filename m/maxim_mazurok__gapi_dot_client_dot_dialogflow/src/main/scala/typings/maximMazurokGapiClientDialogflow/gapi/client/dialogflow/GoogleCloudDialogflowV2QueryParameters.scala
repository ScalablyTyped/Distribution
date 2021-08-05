package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2QueryParameters extends StObject {
  
  /** The collection of contexts to be activated before this query is executed. */
  var contexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  
  /** The geo location of this conversational query. */
  var geoLocation: js.UndefOr[GoogleTypeLatLng] = js.undefined
  
  /**
    * This field can be used to pass custom data to your webhook. Arbitrary JSON objects are supported. If supplied, the value is used to populate the
    * `WebhookRequest.original_detect_intent_request.payload` field sent to your webhook.
    */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters & TopLevel[js.Any]
  ] = js.undefined
  
  /** Specifies whether to delete all contexts in the current session before the new ones are activated. */
  var resetContexts: js.UndefOr[Boolean] = js.undefined
  
  /** Configures the type of sentiment analysis to perform. If not provided, sentiment analysis is not performed. */
  var sentimentAnalysisRequestConfig: js.UndefOr[GoogleCloudDialogflowV2SentimentAnalysisRequestConfig] = js.undefined
  
  /** Additional session entity types to replace or extend developer entity types with. The entity synonyms apply to all languages and persist for the session of this query. */
  var sessionEntityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2SessionEntityType]] = js.undefined
  
  /**
    * The time zone of this conversational query from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. If not provided, the time zone
    * specified in agent settings is used.
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /**
    * This field can be used to pass HTTP headers for a webhook call. These headers will be sent to webhook along with the headers that have been configured through Dialogflow web
    * console. The headers defined within this field will overwrite the headers configured through Dialogflow console if there is a conflict. Header names are case-insensitive. Google's
    * specified headers are not allowed. Including: "Host", "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding", "If-Modified-Since", "If-None-Match",
    * "X-Forwarded-For", etc.
    */
  var webhookHeaders: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters & TopLevel[js.Any]
  ] = js.undefined
}
object GoogleCloudDialogflowV2QueryParameters {
  
  inline def apply(): GoogleCloudDialogflowV2QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryParameters]
  }
  
  extension [Self <: GoogleCloudDialogflowV2QueryParameters](x: Self) {
    
    inline def setContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    inline def setGeoLocation(value: GoogleTypeLatLng): Self = StObject.set(x, "geoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "geoLocation", js.undefined)
    
    inline def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters & TopLevel[js.Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    inline def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    inline def setSentimentAnalysisRequestConfig(value: GoogleCloudDialogflowV2SentimentAnalysisRequestConfig): Self = StObject.set(x, "sentimentAnalysisRequestConfig", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisRequestConfigUndefined: Self = StObject.set(x, "sentimentAnalysisRequestConfig", js.undefined)
    
    inline def setSessionEntityTypes(value: js.Array[GoogleCloudDialogflowV2SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    inline def setSessionEntityTypesVarargs(value: GoogleCloudDialogflowV2SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setWebhookHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2QueryParameters & TopLevel[js.Any]
    ): Self = StObject.set(x, "webhookHeaders", value.asInstanceOf[js.Any])
    
    inline def setWebhookHeadersUndefined: Self = StObject.set(x, "webhookHeaders", js.undefined)
  }
}

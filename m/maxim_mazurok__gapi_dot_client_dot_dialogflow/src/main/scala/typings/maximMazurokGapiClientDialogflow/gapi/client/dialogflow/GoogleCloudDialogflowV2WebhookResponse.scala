package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2WebhookResponse extends StObject {
  
  /** Optional. Invokes the supplied events. When this field is set, Dialogflow ignores the `fulfillment_text`, `fulfillment_messages`, and `payload` fields. */
  var followupEventInput: js.UndefOr[GoogleCloudDialogflowV2EventInput] = js.undefined
  
  /**
    * Optional. The rich response messages intended for the end-user. When provided, Dialogflow uses this field to populate QueryResult.fulfillment_messages sent to the integration or API
    * caller.
    */
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.undefined
  
  /**
    * Optional. The text response message intended for the end-user. It is recommended to use `fulfillment_messages.text.text[0]` instead. When provided, Dialogflow uses this field to
    * populate QueryResult.fulfillment_text sent to the integration or API caller.
    */
  var fulfillmentText: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The collection of output contexts that will overwrite currently active contexts for the session and reset their lifespans. When provided, Dialogflow uses this field to
    * populate QueryResult.output_contexts sent to the integration or API caller.
    */
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  
  /**
    * Optional. This field can be used to pass custom data from your webhook to the integration or API caller. Arbitrary JSON objects are supported. When provided, Dialogflow uses this
    * field to populate QueryResult.webhook_payload sent to the integration or API caller. This field is also used by the [Google Assistant
    * integration](https://cloud.google.com/dialogflow/docs/integrations/aog) for rich response messages. See the format definition at [Google Assistant Dialogflow webhook
    * format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
    */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2WebhookResponse & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Optional. Additional session entity types to replace or extend developer entity types with. The entity synonyms apply to all languages and persist for the session. Setting this data
    * from a webhook overwrites the session entity types that have been set using `detectIntent`, `streamingDetectIntent` or SessionEntityType management methods.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2SessionEntityType]] = js.undefined
  
  /**
    * Optional. A custom field used to identify the webhook source. Arbitrary strings are supported. When provided, Dialogflow uses this field to populate QueryResult.webhook_source sent
    * to the integration or API caller.
    */
  var source: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2WebhookResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2WebhookResponseMutableBuilder[Self <: GoogleCloudDialogflowV2WebhookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowupEventInput(value: GoogleCloudDialogflowV2EventInput): Self = StObject.set(x, "followupEventInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupEventInputUndefined: Self = StObject.set(x, "followupEventInput", js.undefined)
    
    @scala.inline
    def setFulfillmentMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    @scala.inline
    def setFulfillmentMessagesVarargs(value: GoogleCloudDialogflowV2IntentMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value :_*))
    
    @scala.inline
    def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2WebhookResponse & TopLevel[js.Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSessionEntityTypes(value: js.Array[GoogleCloudDialogflowV2SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    @scala.inline
    def setSessionEntityTypesVarargs(value: GoogleCloudDialogflowV2SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

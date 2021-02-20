package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for a webhook call.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1WebhookResponse extends StObject {
  
  /**
    * Optional. Indicates that this intent ends an interaction. Some
    * integrations (e.g., Actions on Google or Dialogflow phone gateway) use
    * this information to close interaction with an end user. Default is false.
    */
  var endInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Makes the platform immediately invoke another `DetectIntent`
    * call internally with the specified event as input.
    */
  var followupEventInput: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1EventInput] = js.native
  
  /**
    * Optional. The collection of rich messages to present to the user. This
    * value is passed directly to `QueryResult.fulfillment_messages`.
    */
  var fulfillmentMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessage]] = js.native
  
  /**
    * Optional. The text to be shown on the screen. This value is passed
    * directly to `QueryResult.fulfillment_text`.
    */
  var fulfillmentText: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of output contexts. This value is passed
    * directly to `QueryResult.output_contexts`.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Context]] = js.native
  
  /**
    * Optional. This value is passed directly to `QueryResult.webhook_payload`.
    * See the related `fulfillment_messages[i].payload field`, which may be
    * used as an alternative to this field.  This field can be used for Actions
    * on Google responses. It should have a structure similar to the JSON
    * message shown here. For more information, see [Actions on Google Webhook
    * Format](https://developers.google.com/actions/dialogflow/webhook)
    * &lt;pre&gt;{   &quot;google&quot;: {     &quot;expectUserResponse&quot;:
    * true,     &quot;richResponse&quot;: {       &quot;items&quot;: [ {
    * &quot;simpleResponse&quot;: {             &quot;textToSpeech&quot;:
    * &quot;this is a simple response&quot;           }         }       ]     }
    * } }&lt;/pre&gt;
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Optional. This value is passed directly to `QueryResult.webhook_source`.
    */
  var source: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1WebhookResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1WebhookResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1WebhookResponseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1WebhookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndInteraction(value: Boolean): Self = StObject.set(x, "endInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndInteractionUndefined: Self = StObject.set(x, "endInteraction", js.undefined)
    
    @scala.inline
    def setFollowupEventInput(value: SchemaGoogleCloudDialogflowV2beta1EventInput): Self = StObject.set(x, "followupEventInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupEventInputUndefined: Self = StObject.set(x, "followupEventInput", js.undefined)
    
    @scala.inline
    def setFulfillmentMessages(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    @scala.inline
    def setFulfillmentMessagesVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value :_*))
    
    @scala.inline
    def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Context*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

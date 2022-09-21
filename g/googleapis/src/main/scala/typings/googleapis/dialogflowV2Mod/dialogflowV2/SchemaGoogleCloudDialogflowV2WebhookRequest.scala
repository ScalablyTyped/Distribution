package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2WebhookRequest extends StObject {
  
  /**
    * Optional. The contents of the original request that was passed to `[Streaming]DetectIntent` call.
    */
  var originalDetectIntentRequest: js.UndefOr[SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.undefined
  
  /**
    * The result of the conversational query or event processing. Contains the same value as `[Streaming]DetectIntentResponse.query_result`.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryResult] = js.undefined
  
  /**
    * The unique identifier of the response. Contains the same value as `[Streaming]DetectIntentResponse.response_id`.
    */
  var responseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of detectIntent request session. Can be used to identify end-user inside webhook implementation. Format: `projects//agent/sessions/`, or `projects//agent/environments//users//sessions/`.
    */
  var session: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2WebhookRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2WebhookRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2WebhookRequest](x: Self) {
    
    inline def setOriginalDetectIntentRequest(value: SchemaGoogleCloudDialogflowV2OriginalDetectIntentRequest): Self = StObject.set(x, "originalDetectIntentRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalDetectIntentRequestUndefined: Self = StObject.set(x, "originalDetectIntentRequest", js.undefined)
    
    inline def setQueryResult(value: SchemaGoogleCloudDialogflowV2QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}

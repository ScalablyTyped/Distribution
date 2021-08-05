package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The collection of simple response candidates. This message in
  * `QueryResult.fulfillment_messages` and
  * `WebhookResponse.fulfillment_messages` should contain only one
  * `SimpleResponse`.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses extends StObject {
  
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses](x: Self) {
    
    inline def setSimpleResponses(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSimpleResponsesVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value :_*))
  }
}

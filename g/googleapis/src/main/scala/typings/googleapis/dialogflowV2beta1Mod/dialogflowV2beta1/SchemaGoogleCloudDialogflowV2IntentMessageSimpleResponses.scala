package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The collection of simple response candidates. This message in
  * `QueryResult.fulfillment_messages` and
  * `WebhookResponse.fulfillment_messages` should contain only one
  * `SimpleResponse`.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses extends StObject {
  
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponsesMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSimpleResponses(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    @scala.inline
    def setSimpleResponsesVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value :_*))
  }
}

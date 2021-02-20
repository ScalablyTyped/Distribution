package typings.googleapis.dialogflowV2Mod.dialogflowV2

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
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends StObject {
  
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSimpleResponses(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    @scala.inline
    def setSimpleResponsesVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value :_*))
  }
}

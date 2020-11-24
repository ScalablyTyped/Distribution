package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

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
trait SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses extends js.Object {
  
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
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponsesOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
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
    def setSimpleResponsesVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse*): Self = this.set("simpleResponses", js.Array(value :_*))
    
    @scala.inline
    def setSimpleResponses(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse]): Self = this.set("simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleResponses: Self = this.set("simpleResponses", js.undefined)
  }
}

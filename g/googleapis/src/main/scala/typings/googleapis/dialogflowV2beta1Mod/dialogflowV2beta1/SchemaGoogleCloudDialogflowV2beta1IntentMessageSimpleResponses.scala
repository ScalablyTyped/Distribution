package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of simple response candidates. This message in
  * `QueryResult.fulfillment_messages` and
  * `WebhookResponse.fulfillment_messages` should contain only one
  * `SimpleResponse`.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends js.Object {
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  @scala.inline
  def apply(simpleResponses: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse] = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
}


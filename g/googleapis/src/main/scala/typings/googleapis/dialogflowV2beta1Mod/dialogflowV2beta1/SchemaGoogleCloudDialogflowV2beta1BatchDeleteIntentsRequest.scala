package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Intents.BatchDeleteIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest extends js.Object {
  /**
    * Required. The collection of intents to delete. Only intent `name` must be
    * filled in.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest {
  @scala.inline
  def apply(intents: js.Array[SchemaGoogleCloudDialogflowV2beta1Intent] = null): SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest]
  }
}


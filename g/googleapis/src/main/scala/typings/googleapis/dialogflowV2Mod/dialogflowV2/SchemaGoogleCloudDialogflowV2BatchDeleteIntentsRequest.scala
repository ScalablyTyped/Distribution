package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Intents.BatchDeleteIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest extends js.Object {
  /**
    * Required. The collection of intents to delete. Only intent `name` must be
    * filled in.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Intent]] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest {
  @scala.inline
  def apply(intents: js.Array[SchemaGoogleCloudDialogflowV2Intent] = null): SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest]
  }
}


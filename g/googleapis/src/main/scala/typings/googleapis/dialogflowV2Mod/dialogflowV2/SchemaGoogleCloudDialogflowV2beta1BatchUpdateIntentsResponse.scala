package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Intents.BatchUpdateIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse extends js.Object {
  /**
    * The collection of updated or created intents.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse {
  @scala.inline
  def apply(intents: js.Array[SchemaGoogleCloudDialogflowV2beta1Intent] = null): SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse]
  }
}


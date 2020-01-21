package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is a wrapper around a collection of intents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentBatch extends js.Object {
  /**
    * A collection of intents.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Intent]] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentBatch {
  @scala.inline
  def apply(intents: js.Array[SchemaGoogleCloudDialogflowV2Intent] = null): SchemaGoogleCloudDialogflowV2IntentBatch = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentBatch]
  }
}


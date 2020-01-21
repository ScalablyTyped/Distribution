package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is a wrapper around a collection of intents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentBatch extends js.Object {
  /**
    * A collection of intents.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentBatch {
  @scala.inline
  def apply(intents: js.Array[SchemaGoogleCloudDialogflowV2beta1Intent] = null): SchemaGoogleCloudDialogflowV2beta1IntentBatch = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentBatch]
  }
}


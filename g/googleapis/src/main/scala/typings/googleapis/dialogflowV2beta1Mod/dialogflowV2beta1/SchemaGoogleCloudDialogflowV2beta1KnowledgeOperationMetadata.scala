package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata in google::longrunning::Operation for Knowledge operations.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata extends js.Object {
  /**
    * Required. The current state of this operation.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata {
  @scala.inline
  def apply(state: String = null): SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata]
  }
}


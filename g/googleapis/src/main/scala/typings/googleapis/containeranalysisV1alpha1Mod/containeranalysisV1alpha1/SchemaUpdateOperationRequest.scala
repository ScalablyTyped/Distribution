package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for updating an existing operation
  */
@js.native
trait SchemaUpdateOperationRequest extends js.Object {
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * The fields to update.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateOperationRequest {
  @scala.inline
  def apply(operation: SchemaOperation = null, updateMask: String = null): SchemaUpdateOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateOperationRequest]
  }
}


package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for creating an operation
  */
@js.native
trait SchemaCreateOperationRequest extends js.Object {
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * The ID to use for this operation.
    */
  var operationId: js.UndefOr[String] = js.native
}

object SchemaCreateOperationRequest {
  @scala.inline
  def apply(operation: SchemaOperation = null, operationId: String = null): SchemaCreateOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateOperationRequest]
  }
}


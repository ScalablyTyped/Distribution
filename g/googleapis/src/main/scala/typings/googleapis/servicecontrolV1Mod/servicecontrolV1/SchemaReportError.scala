package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the processing error of one Operation in the request.
  */
@js.native
trait SchemaReportError extends js.Object {
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Details of the error when processing the Operation.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaReportError {
  @scala.inline
  def apply(operationId: String = null, status: SchemaStatus = null): SchemaReportError = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportError]
  }
}


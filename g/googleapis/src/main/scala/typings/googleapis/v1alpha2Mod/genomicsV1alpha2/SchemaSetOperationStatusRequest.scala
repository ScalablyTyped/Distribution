package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to set operation status. Should only be used by VMs created by the
  * Pipelines Service and not by end users.
  */
@js.native
trait SchemaSetOperationStatusRequest extends js.Object {
  var errorCode: js.UndefOr[String] = js.native
  var errorMessage: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var timestampEvents: js.UndefOr[js.Array[SchemaTimestampEvent]] = js.native
  var validationToken: js.UndefOr[String] = js.native
}

object SchemaSetOperationStatusRequest {
  @scala.inline
  def apply(
    errorCode: String = null,
    errorMessage: String = null,
    operationId: String = null,
    timestampEvents: js.Array[SchemaTimestampEvent] = null,
    validationToken: String = null
  ): SchemaSetOperationStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (timestampEvents != null) __obj.updateDynamic("timestampEvents")(timestampEvents.asInstanceOf[js.Any])
    if (validationToken != null) __obj.updateDynamic("validationToken")(validationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetOperationStatusRequest]
  }
}


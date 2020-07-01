package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the metadata of the long-running operation.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * [Output only] API version used to start the operation.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * [Output only] Identifies whether the user has requested cancellation of
    * the operation. Operations that have successfully been cancelled have
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to `Code.CANCELLED`.
    */
  var cancelRequested: js.UndefOr[Boolean] = js.native
  /**
    * [Output only] The time the operation was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the operation finished running.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * [Output only] Human-readable status of the operation, if any.
    */
  var statusDetail: js.UndefOr[String] = js.native
  /**
    * [Output only] Server-defined resource path for the target of the
    * operation.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * [Output only] Name of the verb executed by the operation.
    */
  var verb: js.UndefOr[String] = js.native
}

object SchemaOperationMetadata {
  @scala.inline
  def apply(
    apiVersion: String = null,
    cancelRequested: js.UndefOr[Boolean] = js.undefined,
    createTime: String = null,
    endTime: String = null,
    statusDetail: String = null,
    target: String = null,
    verb: String = null
  ): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelRequested)) __obj.updateDynamic("cancelRequested")(cancelRequested.get.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (statusDetail != null) __obj.updateDynamic("statusDetail")(statusDetail.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
}


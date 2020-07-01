package typings.googleapis.redisV1Mod.redisV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the v1 metadata of the long-running operation.
  */
@js.native
trait SchemaGoogleCloudRedisV1OperationMetadata extends js.Object {
  /**
    * API version.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * Specifies if cancellation was requested for the operation.
    */
  var cancelRequested: js.UndefOr[Boolean] = js.native
  /**
    * Creation timestamp.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * End timestamp.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Operation status details.
    */
  var statusDetail: js.UndefOr[String] = js.native
  /**
    * Operation target.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Operation verb.
    */
  var verb: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudRedisV1OperationMetadata {
  @scala.inline
  def apply(
    apiVersion: String = null,
    cancelRequested: js.UndefOr[Boolean] = js.undefined,
    createTime: String = null,
    endTime: String = null,
    statusDetail: String = null,
    target: String = null,
    verb: String = null
  ): SchemaGoogleCloudRedisV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelRequested)) __obj.updateDynamic("cancelRequested")(cancelRequested.get.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (statusDetail != null) __obj.updateDynamic("statusDetail")(statusDetail.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1OperationMetadata]
  }
}


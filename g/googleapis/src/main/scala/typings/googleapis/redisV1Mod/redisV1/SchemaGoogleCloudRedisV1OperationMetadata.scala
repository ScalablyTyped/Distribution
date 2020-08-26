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
  def apply(): SchemaGoogleCloudRedisV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1OperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleCloudRedisV1OperationMetadataOps[Self <: SchemaGoogleCloudRedisV1OperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setCancelRequested(value: Boolean): Self = this.set("cancelRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelRequested: Self = this.set("cancelRequested", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStatusDetail(value: String): Self = this.set("statusDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetail: Self = this.set("statusDetail", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
  
}


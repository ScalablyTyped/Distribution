package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing an operation.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * Output only. The time the operation was submitted to the server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the operation terminated, regardless of its
    * success. This field is unset if the operation is still ongoing.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The type of operation being performed.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * Output only. The resource being operated on, as a [relative resource
    * name]( /apis/design/resource_names#relative_resource_name).
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Output only. The UUID of the resource being operated on.
    */
  var resourceUuid: js.UndefOr[String] = js.native
  /**
    * Output only. The current operation state.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaOperationMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    operationType: String = null,
    resource: String = null,
    resourceUuid: String = null,
    state: String = null
  ): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceUuid != null) __obj.updateDynamic("resourceUuid")(resourceUuid.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
}


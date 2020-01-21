package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A work item that represents the different operations that can be performed
  * on a user-defined Source specification.
  */
@js.native
trait SchemaSourceOperationRequest extends js.Object {
  /**
    * Information about a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[SchemaSourceGetMetadataRequest] = js.native
  /**
    * User-provided name of the Read instruction for this source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * System-defined name for the Read instruction for this source in the
    * original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.native
  /**
    * Information about a request to split a source.
    */
  var split: js.UndefOr[SchemaSourceSplitRequest] = js.native
  /**
    * System-defined name of the stage containing the source operation. Unique
    * across the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of the Read instruction for this source. Unique
    * across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
}

object SchemaSourceOperationRequest {
  @scala.inline
  def apply(
    getMetadata: SchemaSourceGetMetadataRequest = null,
    name: String = null,
    originalName: String = null,
    split: SchemaSourceSplitRequest = null,
    stageName: String = null,
    systemName: String = null
  ): SchemaSourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (getMetadata != null) __obj.updateDynamic("getMetadata")(getMetadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceOperationRequest]
  }
}


package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a SourceOperationRequest, specified in
  * ReportWorkItemStatusRequest.source_operation when the work item is
  * completed.
  */
@js.native
trait SchemaSourceOperationResponse extends js.Object {
  /**
    * A response to a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[SchemaSourceGetMetadataResponse] = js.native
  /**
    * A response to a request to split a source.
    */
  var split: js.UndefOr[SchemaSourceSplitResponse] = js.native
}

object SchemaSourceOperationResponse {
  @scala.inline
  def apply(getMetadata: SchemaSourceGetMetadataResponse = null, split: SchemaSourceSplitResponse = null): SchemaSourceOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (getMetadata != null) __obj.updateDynamic("getMetadata")(getMetadata.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceOperationResponse]
  }
}


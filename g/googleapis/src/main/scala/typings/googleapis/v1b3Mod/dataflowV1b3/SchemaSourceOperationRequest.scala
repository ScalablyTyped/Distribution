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
  def apply(): SchemaSourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceOperationRequest]
  }
  @scala.inline
  implicit class SchemaSourceOperationRequestOps[Self <: SchemaSourceOperationRequest] (val x: Self) extends AnyVal {
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
    def setGetMetadata(value: SchemaSourceGetMetadataRequest): Self = this.set("getMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetMetadata: Self = this.set("getMetadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalName(value: String): Self = this.set("originalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalName: Self = this.set("originalName", js.undefined)
    @scala.inline
    def setSplit(value: SchemaSourceSplitRequest): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    @scala.inline
    def setSystemName(value: String): Self = this.set("systemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
  }
  
}


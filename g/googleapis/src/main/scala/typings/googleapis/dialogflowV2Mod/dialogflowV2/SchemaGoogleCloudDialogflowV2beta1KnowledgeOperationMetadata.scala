package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata in google::longrunning::Operation for Knowledge operations.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata extends js.Object {
  /**
    * Required. The current state of this operation.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadataOps[Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata] (val x: Self) extends AnyVal {
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}


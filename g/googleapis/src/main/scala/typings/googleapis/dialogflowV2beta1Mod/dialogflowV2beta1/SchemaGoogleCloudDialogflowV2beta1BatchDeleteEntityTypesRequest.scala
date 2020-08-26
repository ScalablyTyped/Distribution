package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchDeleteEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest extends js.Object {
  /**
    * Required. The names entity types to delete. All names must point to the
    * same agent as `parent`.
    */
  var entityTypeNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequestOps[Self <: SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest] (val x: Self) extends AnyVal {
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
    def setEntityTypeNamesVarargs(value: String*): Self = this.set("entityTypeNames", js.Array(value :_*))
    @scala.inline
    def setEntityTypeNames(value: js.Array[String]): Self = this.set("entityTypeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityTypeNames: Self = this.set("entityTypeNames", js.undefined)
  }
  
}


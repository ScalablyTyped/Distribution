package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for EntityTypes.BatchUpdateEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse extends js.Object {
  /**
    * The collection of updated or created entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse] (val x: Self) extends AnyVal {
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
    def setEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityType*): Self = this.set("entityTypes", js.Array(value :_*))
    @scala.inline
    def setEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
  }
  
}


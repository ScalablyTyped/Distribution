package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is a wrapper around a collection of entity types.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch extends js.Object {
  /**
    * A collection of entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1EntityTypeBatchOps[Self <: SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch] (val x: Self) extends AnyVal {
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


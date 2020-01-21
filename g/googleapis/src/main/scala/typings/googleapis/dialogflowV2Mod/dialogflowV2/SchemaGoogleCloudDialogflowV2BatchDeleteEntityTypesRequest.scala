package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchDeleteEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchDeleteEntityTypesRequest extends js.Object {
  /**
    * Required. The names entity types to delete. All names must point to the
    * same agent as `parent`.
    */
  var entityTypeNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchDeleteEntityTypesRequest {
  @scala.inline
  def apply(entityTypeNames: js.Array[String] = null): SchemaGoogleCloudDialogflowV2BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityTypeNames != null) __obj.updateDynamic("entityTypeNames")(entityTypeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchDeleteEntityTypesRequest]
  }
}


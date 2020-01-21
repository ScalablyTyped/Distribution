package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for EntityTypes.BatchUpdateEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesResponse extends js.Object {
  /**
    * The collection of updated or created entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityType]] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesResponse {
  @scala.inline
  def apply(entityTypes: js.Array[SchemaGoogleCloudDialogflowV2EntityType] = null): SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesResponse]
  }
}


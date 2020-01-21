package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

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
  def apply(entityTypes: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType] = null): SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse]
  }
}


package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from deleting developer metadata.
  */
@js.native
trait SchemaDeleteDeveloperMetadataResponse extends js.Object {
  /**
    * The metadata that was deleted.
    */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
}

object SchemaDeleteDeveloperMetadataResponse {
  @scala.inline
  def apply(deletedDeveloperMetadata: js.Array[SchemaDeveloperMetadata] = null): SchemaDeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (deletedDeveloperMetadata != null) __obj.updateDynamic("deletedDeveloperMetadata")(deletedDeveloperMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataResponse]
  }
}


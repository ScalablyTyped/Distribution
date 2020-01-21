package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from updating developer metadata.
  */
@js.native
trait SchemaUpdateDeveloperMetadataResponse extends js.Object {
  /**
    * The updated developer metadata.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
}

object SchemaUpdateDeveloperMetadataResponse {
  @scala.inline
  def apply(developerMetadata: js.Array[SchemaDeveloperMetadata] = null): SchemaUpdateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateDeveloperMetadataResponse]
  }
}


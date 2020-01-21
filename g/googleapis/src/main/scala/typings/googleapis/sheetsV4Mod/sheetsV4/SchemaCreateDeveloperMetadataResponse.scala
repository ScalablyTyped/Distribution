package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from creating developer metadata.
  */
@js.native
trait SchemaCreateDeveloperMetadataResponse extends js.Object {
  /**
    * The developer metadata that was created.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
}

object SchemaCreateDeveloperMetadataResponse {
  @scala.inline
  def apply(developerMetadata: SchemaDeveloperMetadata = null): SchemaCreateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateDeveloperMetadataResponse]
  }
}


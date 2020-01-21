package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to create developer metadata.
  */
@js.native
trait SchemaCreateDeveloperMetadataRequest extends js.Object {
  /**
    * The developer metadata to create.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
}

object SchemaCreateDeveloperMetadataRequest {
  @scala.inline
  def apply(developerMetadata: SchemaDeveloperMetadata = null): SchemaCreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateDeveloperMetadataRequest]
  }
}


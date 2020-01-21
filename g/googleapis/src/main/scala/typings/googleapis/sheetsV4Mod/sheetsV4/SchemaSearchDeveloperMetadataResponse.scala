package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to a developer metadata search request.
  */
@js.native
trait SchemaSearchDeveloperMetadataResponse extends js.Object {
  /**
    * The metadata matching the criteria of the search request.
    */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[SchemaMatchedDeveloperMetadata]] = js.native
}

object SchemaSearchDeveloperMetadataResponse {
  @scala.inline
  def apply(matchedDeveloperMetadata: js.Array[SchemaMatchedDeveloperMetadata] = null): SchemaSearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (matchedDeveloperMetadata != null) __obj.updateDynamic("matchedDeveloperMetadata")(matchedDeveloperMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchDeveloperMetadataResponse]
  }
}


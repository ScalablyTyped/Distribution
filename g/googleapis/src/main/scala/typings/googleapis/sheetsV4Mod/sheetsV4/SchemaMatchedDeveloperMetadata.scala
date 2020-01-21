package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A developer metadata entry and the data filters specified in the original
  * request that matched it.
  */
@js.native
trait SchemaMatchedDeveloperMetadata extends js.Object {
  /**
    * All filters matching the returned developer metadata.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * The developer metadata matching the specified filters.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
}

object SchemaMatchedDeveloperMetadata {
  @scala.inline
  def apply(dataFilters: js.Array[SchemaDataFilter] = null, developerMetadata: SchemaDeveloperMetadata = null): SchemaMatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMatchedDeveloperMetadata]
  }
}


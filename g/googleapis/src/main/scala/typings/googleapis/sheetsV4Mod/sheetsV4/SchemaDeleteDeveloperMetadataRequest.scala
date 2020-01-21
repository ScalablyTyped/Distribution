package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to delete developer metadata.
  */
@js.native
trait SchemaDeleteDeveloperMetadataRequest extends js.Object {
  /**
    * The data filter describing the criteria used to select which developer
    * metadata entry to delete.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
}

object SchemaDeleteDeveloperMetadataRequest {
  @scala.inline
  def apply(dataFilter: SchemaDataFilter = null): SchemaDeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataRequest]
  }
}


package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for clearing more than one range selected by a DataFilter in a
  * spreadsheet.
  */
@js.native
trait SchemaBatchClearValuesByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to determine which ranges to clear.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
}

object SchemaBatchClearValuesByDataFilterRequest {
  @scala.inline
  def apply(dataFilters: js.Array[SchemaDataFilter] = null): SchemaBatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchClearValuesByDataFilterRequest]
  }
}


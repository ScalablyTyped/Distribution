package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value range that was matched by one or more data filers.
  */
@js.native
trait SchemaMatchedValueRange extends js.Object {
  /**
    * The DataFilters from the request that matched the range of values.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * The values matched by the DataFilter.
    */
  var valueRange: js.UndefOr[SchemaValueRange] = js.native
}

object SchemaMatchedValueRange {
  @scala.inline
  def apply(dataFilters: js.Array[SchemaDataFilter] = null, valueRange: SchemaValueRange = null): SchemaMatchedValueRange = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMatchedValueRange]
  }
}


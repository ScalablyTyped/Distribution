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
  def apply(): SchemaMatchedValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchedValueRange]
  }
  @scala.inline
  implicit class SchemaMatchedValueRangeOps[Self <: SchemaMatchedValueRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    @scala.inline
    def setValueRange(value: SchemaValueRange): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
  }
  
}


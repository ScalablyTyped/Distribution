package typings.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rendered cell object with computed properties.
  */
@js.native
trait CellProperties extends CellMeta {
  var col: Double = js.native
  var instance: typings.handsontable.mod.Handsontable = js.native
  var prop: String | Double = js.native
  var row: Double = js.native
  var visualCol: Double = js.native
  var visualRow: Double = js.native
}

object CellProperties {
  @scala.inline
  def apply(
    col: Double,
    instance: typings.handsontable.mod.Handsontable,
    prop: String | Double,
    row: Double,
    visualCol: Double,
    visualRow: Double
  ): CellProperties = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], visualCol = visualCol.asInstanceOf[js.Any], visualRow = visualRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProperties]
  }
  @scala.inline
  implicit class CellPropertiesOps[Self <: CellProperties] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: typings.handsontable.mod.Handsontable): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setProp(value: String | Double): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualCol(value: Double): Self = this.set("visualCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualRow(value: Double): Self = this.set("visualRow", value.asInstanceOf[js.Any])
  }
  
}


package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rendered cell object with computed properties.
  */
trait CellProperties extends CellMeta {
  var col: scala.Double
  var instance: handsontableLib.handsontableMod.Handsontable
  var prop: java.lang.String | scala.Double
  var row: scala.Double
  var visualCol: scala.Double
  var visualRow: scala.Double
}

object CellProperties {
  @scala.inline
  def apply(
    col: scala.Double,
    instance: handsontableLib.handsontableMod.Handsontable,
    prop: java.lang.String | scala.Double,
    row: scala.Double,
    visualCol: scala.Double,
    visualRow: scala.Double,
    comment: handsontableLib.handsontableMod.HandsontableNs.commentsNs.CommentObject = null,
    data: java.lang.String | scala.Double | ColumnDataGetterSetterFunction = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    isSearchResult: js.UndefOr[scala.Boolean] = js.undefined,
    skipRowOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): CellProperties = {
    val __obj = js.Dynamic.literal(col = col, instance = instance, prop = prop.asInstanceOf[js.Any], row = row, visualCol = visualCol, visualRow = visualRow)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(isSearchResult)) __obj.updateDynamic("isSearchResult")(isSearchResult)
    if (!js.isUndefined(skipRowOnPaste)) __obj.updateDynamic("skipRowOnPaste")(skipRowOnPaste)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[CellProperties]
  }
}


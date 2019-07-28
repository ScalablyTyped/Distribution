package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableMod.Handsontable
import typings.handsontable.handsontableMod.HandsontableNs.commentsNs.CommentObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rendered cell object with computed properties.
  */
trait CellProperties extends CellMeta {
  var col: Double
  var instance: Handsontable
  var prop: String | Double
  var row: Double
  var visualCol: Double
  var visualRow: Double
}

object CellProperties {
  @scala.inline
  def apply(
    col: Double,
    instance: Handsontable,
    prop: String | Double,
    row: Double,
    visualCol: Double,
    visualRow: Double,
    comment: CommentObject = null,
    data: String | Double | ColumnDataGetterSetterFunction = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isSearchResult: js.UndefOr[Boolean] = js.undefined,
    skipRowOnPaste: js.UndefOr[Boolean] = js.undefined,
    valid: js.UndefOr[Boolean] = js.undefined
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


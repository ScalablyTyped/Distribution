package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSettings extends CellMeta {
  var col: scala.Double
  var row: scala.Double
}

object CellSettings {
  @scala.inline
  def apply(
    col: scala.Double,
    row: scala.Double,
    comment: handsontableLib.handsontableMod.HandsontableNs.commentsNs.CommentObject = null,
    data: java.lang.String | scala.Double | ColumnDataGetterSetterFunction = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    isSearchResult: js.UndefOr[scala.Boolean] = js.undefined,
    skipRowOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): CellSettings = {
    val __obj = js.Dynamic.literal(col = col, row = row)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(isSearchResult)) __obj.updateDynamic("isSearchResult")(isSearchResult)
    if (!js.isUndefined(skipRowOnPaste)) __obj.updateDynamic("skipRowOnPaste")(skipRowOnPaste)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[CellSettings]
  }
}


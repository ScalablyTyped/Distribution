package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableMod.HandsontableNs.commentsNs.CommentObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSettings extends CellMeta {
  var col: Double
  var row: Double
}

object CellSettings {
  @scala.inline
  def apply(
    col: Double,
    row: Double,
    comment: CommentObject = null,
    data: String | Double | ColumnDataGetterSetterFunction = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isSearchResult: js.UndefOr[Boolean] = js.undefined,
    skipRowOnPaste: js.UndefOr[Boolean] = js.undefined,
    valid: js.UndefOr[Boolean] = js.undefined
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


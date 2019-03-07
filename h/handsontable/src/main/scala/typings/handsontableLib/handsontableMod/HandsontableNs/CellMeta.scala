package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional cell-specific meta data.
  */
trait CellMeta extends ColumnSettings {
  var comment: js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.commentsNs.CommentObject] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var isSearchResult: js.UndefOr[scala.Boolean] = js.undefined
  var skipRowOnPaste: js.UndefOr[scala.Boolean] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object CellMeta {
  @scala.inline
  def apply(
    comment: handsontableLib.handsontableMod.HandsontableNs.commentsNs.CommentObject = null,
    data: java.lang.String | scala.Double | ColumnDataGetterSetterFunction = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    isSearchResult: js.UndefOr[scala.Boolean] = js.undefined,
    skipRowOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): CellMeta = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(isSearchResult)) __obj.updateDynamic("isSearchResult")(isSearchResult)
    if (!js.isUndefined(skipRowOnPaste)) __obj.updateDynamic("skipRowOnPaste")(skipRowOnPaste)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[CellMeta]
  }
}


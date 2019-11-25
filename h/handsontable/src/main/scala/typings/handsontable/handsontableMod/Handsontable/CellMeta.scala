package typings.handsontable.handsontableMod.Handsontable

import typings.handsontable.handsontableMod.Handsontable.comments.CommentObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional cell-specific meta data.
  */
trait CellMeta extends ColumnSettings {
  var comment: js.UndefOr[CommentObject] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var isSearchResult: js.UndefOr[Boolean] = js.undefined
  var skipRowOnPaste: js.UndefOr[Boolean] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object CellMeta {
  @scala.inline
  def apply(
    comment: CommentObject = null,
    data: String | Double | ColumnDataGetterSetterFunction = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isSearchResult: js.UndefOr[Boolean] = js.undefined,
    skipRowOnPaste: js.UndefOr[Boolean] = js.undefined,
    valid: js.UndefOr[Boolean] = js.undefined
  ): CellMeta = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchResult)) __obj.updateDynamic("isSearchResult")(isSearchResult.asInstanceOf[js.Any])
    if (!js.isUndefined(skipRowOnPaste)) __obj.updateDynamic("skipRowOnPaste")(skipRowOnPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMeta]
  }
}


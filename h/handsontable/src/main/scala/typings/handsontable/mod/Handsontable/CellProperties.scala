package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.comments.CommentObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rendered cell object with computed properties.
  */
trait CellProperties extends CellMeta {
  var col: Double
  var instance: typings.handsontable.mod.Handsontable
  var prop: String | Double
  var row: Double
  var visualCol: Double
  var visualRow: Double
}

object CellProperties {
  @scala.inline
  def apply(
    col: Double,
    instance: typings.handsontable.mod.Handsontable,
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
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], visualCol = visualCol.asInstanceOf[js.Any], visualRow = visualRow.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchResult)) __obj.updateDynamic("isSearchResult")(isSearchResult.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipRowOnPaste)) __obj.updateDynamic("skipRowOnPaste")(skipRowOnPaste.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProperties]
  }
}


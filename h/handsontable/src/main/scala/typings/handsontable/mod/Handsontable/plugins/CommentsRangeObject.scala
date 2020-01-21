package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.wot.CellCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsRangeObject extends js.Object {
  var from: CellCoords
  var to: js.UndefOr[CellCoords] = js.undefined
}

object CommentsRangeObject {
  @scala.inline
  def apply(from: CellCoords, to: CellCoords = null): CommentsRangeObject = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsRangeObject]
  }
}


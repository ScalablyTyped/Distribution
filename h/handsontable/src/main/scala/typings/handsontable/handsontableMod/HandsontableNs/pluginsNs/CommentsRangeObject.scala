package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.handsontable.handsontableMod.HandsontableNs.wotNs.CellCoords
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
    val __obj = js.Dynamic.literal(from = from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[CommentsRangeObject]
  }
}


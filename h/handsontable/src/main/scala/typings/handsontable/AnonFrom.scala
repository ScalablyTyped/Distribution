package typings.handsontable

import typings.handsontable.mod.Handsontable.wot.CellCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: CellCoords
  var to: CellCoords
}

object AnonFrom {
  @scala.inline
  def apply(from: CellCoords, to: CellCoords): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}


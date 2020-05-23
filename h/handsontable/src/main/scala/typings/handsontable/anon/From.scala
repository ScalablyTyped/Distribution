package typings.handsontable.anon

import typings.handsontable.mod.Handsontable.wot.CellCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var from: CellCoords
  var to: CellCoords
}

object From {
  @scala.inline
  def apply(from: CellCoords, to: CellCoords): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}


package typings.handsontable

import typings.handsontable.handsontableMod.Handsontable.wot.CellCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: CellCoords
  var to: CellCoords
}

object Anon_From {
  @scala.inline
  def apply(from: CellCoords, to: CellCoords): Anon_From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_From]
  }
}


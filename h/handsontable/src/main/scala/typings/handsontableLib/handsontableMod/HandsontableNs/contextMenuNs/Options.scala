package typings
package handsontableLib.handsontableMod.HandsontableNs.contextMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var end: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
  var start: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
}

object Options {
  @scala.inline
  def apply(
    end: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords,
    start: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Options]
  }
}


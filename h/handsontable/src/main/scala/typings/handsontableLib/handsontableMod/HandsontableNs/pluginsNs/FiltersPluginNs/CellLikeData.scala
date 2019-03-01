package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellLikeData extends js.Object {
  var meta: handsontableLib.Anon_Col
  var value: java.lang.String
}

object CellLikeData {
  @scala.inline
  def apply(meta: handsontableLib.Anon_Col, value: java.lang.String): CellLikeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CellLikeData]
  }
}


package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeType extends js.Object {
  var endCol: scala.Double
  var endRow: scala.Double
  var startCol: scala.Double
  var startRow: scala.Double
}

object RangeType {
  @scala.inline
  def apply(endCol: scala.Double, endRow: scala.Double, startCol: scala.Double, startRow: scala.Double): RangeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endCol")(endCol)
    __obj.updateDynamic("endRow")(endRow)
    __obj.updateDynamic("startCol")(startCol)
    __obj.updateDynamic("startRow")(startRow)
    __obj.asInstanceOf[RangeType]
  }
}


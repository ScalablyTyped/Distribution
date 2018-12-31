package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var args: js.Array[_]
  var name: ConditionName
  def func(dataRow: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CellValue, values: js.Array[_]): scala.Boolean
}


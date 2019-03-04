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

object Condition {
  @scala.inline
  def apply(
    args: js.Array[_],
    func: js.Function2[
      handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CellValue, 
      js.Array[_], 
      scala.Boolean
    ],
    name: ConditionName
  ): Condition = {
    val __obj = js.Dynamic.literal(args = args, func = func, name = name)
  
    __obj.asInstanceOf[Condition]
  }
}


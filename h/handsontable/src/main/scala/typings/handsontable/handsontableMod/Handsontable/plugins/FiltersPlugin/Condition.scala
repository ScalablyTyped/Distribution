package typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var args: js.Array[_]
  var name: ConditionName
  def func(dataRow: typings.handsontable.handsontableMod.Handsontable.plugins.CellValue, values: js.Array[_]): Boolean
}

object Condition {
  @scala.inline
  def apply(
    args: js.Array[_],
    func: (typings.handsontable.handsontableMod.Handsontable.plugins.CellValue, js.Array[_]) => Boolean,
    name: ConditionName
  ): Condition = {
    val __obj = js.Dynamic.literal(args = args, func = js.Any.fromFunction2(func), name = name)
  
    __obj.asInstanceOf[Condition]
  }
}


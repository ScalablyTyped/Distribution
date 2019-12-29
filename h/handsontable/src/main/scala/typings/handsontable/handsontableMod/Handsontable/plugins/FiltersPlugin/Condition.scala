package typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.handsontableMod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var args: js.Array[_]
  var name: ConditionName
  def func(dataRow: CellValue, values: js.Array[_]): Boolean
}

object Condition {
  @scala.inline
  def apply(args: js.Array[_], func: (CellValue, js.Array[_]) => Boolean, name: ConditionName): Condition = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Condition]
  }
}


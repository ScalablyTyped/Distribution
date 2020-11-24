package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.mod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
  var args: js.Array[_] = js.native
  
  def func(dataRow: CellValue, values: js.Array[_]): Boolean = js.native
  
  var name: ConditionName = js.native
}
object Condition {
  
  @scala.inline
  def apply(args: js.Array[_], func: (CellValue, js.Array[_]) => Boolean, name: ConditionName): Condition = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: (CellValue, js.Array[_]) => Boolean): Self = this.set("func", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: ConditionName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}

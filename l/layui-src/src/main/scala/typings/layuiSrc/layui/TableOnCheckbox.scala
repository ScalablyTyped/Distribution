package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.layuiSrc.layuiSrcBooleans.`true`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 以下TableOn 开头interface，在调用地方使用
@js.native
trait TableOnCheckbox extends StObject {
  
  var checked: `true` = js.native
  
  var data: js.Object = js.native
  
  def del(): Unit = js.native
  
  var tr: JQuery[HTMLElement] = js.native
  
  var `type`: String = js.native
  
  def update(fields: js.Object): Unit = js.native
}
object TableOnCheckbox {
  
  @scala.inline
  def apply(
    checked: `true`,
    data: js.Object,
    del: () => Unit,
    tr: JQuery[HTMLElement],
    `type`: String,
    update: js.Object => Unit
  ): TableOnCheckbox = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], del = js.Any.fromFunction0(del), tr = tr.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOnCheckbox]
  }
  
  @scala.inline
  implicit class TableOnCheckboxMutableBuilder[Self <: TableOnCheckbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: `true`): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: () => Unit): Self = StObject.set(x, "del", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTr(value: JQuery[HTMLElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: js.Object => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}

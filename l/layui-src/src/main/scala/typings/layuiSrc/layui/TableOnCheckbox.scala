package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.layuiSrc.layuiSrcBooleans.`true`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 以下TableOn 开头interface，在调用地方使用
trait TableOnCheckbox extends StObject {
  
  var checked: `true`
  
  var data: js.Object
  
  def del(): Unit
  
  var tr: JQuery[HTMLElement]
  
  var `type`: String
  
  def update(fields: js.Object): Unit
}
object TableOnCheckbox {
  
  inline def apply(
    data: js.Object,
    del: () => Unit,
    tr: JQuery[HTMLElement],
    `type`: String,
    update: js.Object => Unit
  ): TableOnCheckbox = {
    val __obj = js.Dynamic.literal(checked = true, data = data.asInstanceOf[js.Any], del = js.Any.fromFunction0(del), tr = tr.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOnCheckbox]
  }
  
  extension [Self <: TableOnCheckbox](x: Self) {
    
    inline def setChecked(value: `true`): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDel(value: () => Unit): Self = StObject.set(x, "del", js.Any.fromFunction0(value))
    
    inline def setTr(value: JQuery[HTMLElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: js.Object => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}

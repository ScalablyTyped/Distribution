package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOnEdit extends StObject {
  
  var data: js.Object = js.native
  
  def del(): Unit = js.native
  
  var field: String = js.native
  
  var tr: JQuery[HTMLElement] = js.native
  
  def update(fields: js.Object): Unit = js.native
  
  var value: String = js.native
}
object TableOnEdit {
  
  @scala.inline
  def apply(
    data: js.Object,
    del: () => Unit,
    field: String,
    tr: JQuery[HTMLElement],
    update: js.Object => Unit,
    value: String
  ): TableOnEdit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], del = js.Any.fromFunction0(del), field = field.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOnEdit]
  }
  
  @scala.inline
  implicit class TableOnEditMutableBuilder[Self <: TableOnEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: () => Unit): Self = StObject.set(x, "del", js.Any.fromFunction0(value))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: JQuery[HTMLElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: js.Object => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

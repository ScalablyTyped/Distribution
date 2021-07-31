package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOnTool extends StObject {
  
  var data: js.Object
  
  def del(): Unit
  
  var event: String
  
  var tr: JQuery[HTMLElement]
  
  def update(fields: js.Object): Unit
}
object TableOnTool {
  
  @scala.inline
  def apply(
    data: js.Object,
    del: () => Unit,
    event: String,
    tr: JQuery[HTMLElement],
    update: js.Object => Unit
  ): TableOnTool = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], del = js.Any.fromFunction0(del), event = event.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableOnTool]
  }
  
  @scala.inline
  implicit class TableOnToolMutableBuilder[Self <: TableOnTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: () => Unit): Self = StObject.set(x, "del", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: JQuery[HTMLElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: js.Object => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}

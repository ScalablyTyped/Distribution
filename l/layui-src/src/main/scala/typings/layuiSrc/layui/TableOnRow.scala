package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOnRow extends StObject {
  
  var data: js.Object = js.native
  
  def del(): Unit = js.native
  
  var tr: JQuery[HTMLElement] = js.native
  
  def update(fields: js.Object): Unit = js.native
}
object TableOnRow {
  
  @scala.inline
  def apply(data: js.Object, del: () => Unit, tr: JQuery[HTMLElement], update: js.Object => Unit): TableOnRow = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], del = js.Any.fromFunction0(del), tr = tr.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableOnRow]
  }
  
  @scala.inline
  implicit class TableOnRowMutableBuilder[Self <: TableOnRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: () => Unit): Self = StObject.set(x, "del", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTr(value: JQuery[HTMLElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: js.Object => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}

package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOnRow extends js.Object {
  
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
  implicit class TableOnRowOps[Self <: TableOnRow] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: () => Unit): Self = this.set("del", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTr(value: JQuery[HTMLElement]): Self = this.set("tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: js.Object => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}

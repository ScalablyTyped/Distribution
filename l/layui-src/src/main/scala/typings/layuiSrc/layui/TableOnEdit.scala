package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOnEdit extends js.Object {
  var data: js.Object = js.native
  var field: String = js.native
  var tr: JQuery[HTMLElement] = js.native
  var value: String = js.native
  def del(): Unit = js.native
  def update(fields: js.Object): Unit = js.native
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
  implicit class TableOnEditOps[Self <: TableOnEdit] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setTr(value: JQuery[HTMLElement]): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: js.Object => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


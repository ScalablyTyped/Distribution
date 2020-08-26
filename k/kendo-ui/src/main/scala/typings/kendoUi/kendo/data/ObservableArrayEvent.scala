package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableArrayEvent extends js.Object {
  var action: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  var items: js.UndefOr[js.Array[Model]] = js.native
}

object ObservableArrayEvent {
  @scala.inline
  def apply(): ObservableArrayEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableArrayEvent]
  }
  @scala.inline
  implicit class ObservableArrayEventOps[Self <: ObservableArrayEvent] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Model*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Model]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}


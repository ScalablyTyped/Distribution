package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListColumnReorderEvent extends TreeListEvent {
  var column: js.UndefOr[js.Any] = js.native
  var newIndex: js.UndefOr[Double] = js.native
  var oldIndex: js.UndefOr[Double] = js.native
}

object TreeListColumnReorderEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListColumnReorderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnReorderEvent]
  }
  @scala.inline
  implicit class TreeListColumnReorderEventOps[Self <: TreeListColumnReorderEvent] (val x: Self) extends AnyVal {
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
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewIndex: Self = this.set("newIndex", js.undefined)
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldIndex: Self = this.set("oldIndex", js.undefined)
  }
  
}


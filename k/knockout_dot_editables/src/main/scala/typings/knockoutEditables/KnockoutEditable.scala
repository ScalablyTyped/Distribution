package typings.knockoutEditables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// bestowed by ko.editable(target)
@js.native
trait KnockoutEditable extends js.Object {
  def addEditable(target: js.Any): js.Any = js.native
  def beginEdit(): Unit = js.native
  def commit(): Unit = js.native
  def hasChanges(): Boolean = js.native
  def rollback(): Unit = js.native
}

object KnockoutEditable {
  @scala.inline
  def apply(
    addEditable: js.Any => js.Any,
    beginEdit: () => Unit,
    commit: () => Unit,
    hasChanges: () => Boolean,
    rollback: () => Unit
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal(addEditable = js.Any.fromFunction1(addEditable), beginEdit = js.Any.fromFunction0(beginEdit), commit = js.Any.fromFunction0(commit), hasChanges = js.Any.fromFunction0(hasChanges), rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[KnockoutEditable]
  }
  @scala.inline
  implicit class KnockoutEditableOps[Self <: KnockoutEditable] (val x: Self) extends AnyVal {
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
    def setAddEditable(value: js.Any => js.Any): Self = this.set("addEditable", js.Any.fromFunction1(value))
    @scala.inline
    def setBeginEdit(value: () => Unit): Self = this.set("beginEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setCommit(value: () => Unit): Self = this.set("commit", js.Any.fromFunction0(value))
    @scala.inline
    def setHasChanges(value: () => Boolean): Self = this.set("hasChanges", js.Any.fromFunction0(value))
    @scala.inline
    def setRollback(value: () => Unit): Self = this.set("rollback", js.Any.fromFunction0(value))
  }
  
}


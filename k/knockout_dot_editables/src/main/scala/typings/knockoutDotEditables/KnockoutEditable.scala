package typings.knockoutDotEditables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// bestowed by ko.editable(target)
trait KnockoutEditable extends js.Object {
  def addEditable(target: js.Any): js.Any
  def beginEdit(): Unit
  def commit(): Unit
  def hasChanges(): Boolean
  def rollback(): Unit
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
}


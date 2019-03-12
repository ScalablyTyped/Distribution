package typings
package knockoutDotEditablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// bestowed by ko.editable(target)
trait KnockoutEditable extends js.Object {
  def addEditable(target: js.Any): js.Any
  def beginEdit(): scala.Unit
  def commit(): scala.Unit
  def hasChanges(): scala.Boolean
  def rollback(): scala.Unit
}

object KnockoutEditable {
  @scala.inline
  def apply(
    addEditable: js.Any => js.Any,
    beginEdit: () => scala.Unit,
    commit: () => scala.Unit,
    hasChanges: () => scala.Boolean,
    rollback: () => scala.Unit
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal(addEditable = js.Any.fromFunction1(addEditable), beginEdit = js.Any.fromFunction0(beginEdit), commit = js.Any.fromFunction0(commit), hasChanges = js.Any.fromFunction0(hasChanges), rollback = js.Any.fromFunction0(rollback))
  
    __obj.asInstanceOf[KnockoutEditable]
  }
}


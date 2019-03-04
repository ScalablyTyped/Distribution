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
    addEditable: js.Function1[js.Any, js.Any],
    beginEdit: js.Function0[scala.Unit],
    commit: js.Function0[scala.Unit],
    hasChanges: js.Function0[scala.Boolean],
    rollback: js.Function0[scala.Unit]
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal(addEditable = addEditable, beginEdit = beginEdit, commit = commit, hasChanges = hasChanges, rollback = rollback)
  
    __obj.asInstanceOf[KnockoutEditable]
  }
}


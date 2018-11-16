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


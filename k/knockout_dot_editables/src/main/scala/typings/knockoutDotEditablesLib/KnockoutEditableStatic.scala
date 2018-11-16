package typings
package knockoutDotEditablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutEditableStatic extends js.Object {
  def apply(viewModel: js.Any): scala.Unit = js.native
  def apply(viewModel: js.Any, autoInit: scala.Boolean): scala.Unit = js.native
  def beginEdit(scope: java.lang.String): scala.Unit = js.native
  def commit(scope: java.lang.String): scala.Unit = js.native
  def hasChanges(scope: java.lang.String): scala.Boolean = js.native
  def rollback(scope: java.lang.String): scala.Unit = js.native
}


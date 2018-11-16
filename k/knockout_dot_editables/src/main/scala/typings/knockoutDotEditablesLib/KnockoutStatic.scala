package typings
package knockoutDotEditablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// extend ko global
@js.native
trait KnockoutStatic extends js.Object {
  @JSName("editable")
  var editable_Original: KnockoutEditableStatic = js.native
  def editable(viewModel: js.Any): scala.Unit = js.native
  def editable(viewModel: js.Any, autoInit: scala.Boolean): scala.Unit = js.native
}


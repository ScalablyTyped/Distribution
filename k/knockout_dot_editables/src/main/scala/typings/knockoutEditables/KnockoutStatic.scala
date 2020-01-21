package typings.knockoutEditables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// extend ko global
@js.native
trait KnockoutStatic extends js.Object {
  @JSName("editable")
  var editable_Original: KnockoutEditableStatic = js.native
  def editable(viewModel: js.Any): Unit = js.native
  def editable(viewModel: js.Any, autoInit: Boolean): Unit = js.native
}


package typings.knockoutEditables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// extend ko global
@js.native
trait KnockoutStatic extends js.Object {
  
  def editable(viewModel: js.Any): Unit = js.native
  def editable(viewModel: js.Any, autoInit: Boolean): Unit = js.native
  @JSName("editable")
  var editable_Original: KnockoutEditableStatic = js.native
}

package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedTextBox extends Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_MaskedTextBox: MaskedTextBoxOptions = js.native
  
  def raw(): String = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def value(): String = js.native
  def value(value: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}

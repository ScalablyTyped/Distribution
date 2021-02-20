package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextArea extends Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  @JSName("options")
  var options_TextArea: TextAreaOptions = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def value(): String = js.native
  def value(value: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}

package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitButton
  extends StObject
     with Widget {
  
  def close(): Unit = js.native
  
  def enable(state: Boolean, items: String): Unit = js.native
  def enable(state: Boolean, items: JQuery): Unit = js.native
  
  def hide(items: String): Unit = js.native
  def hide(items: JQuery): Unit = js.native
  
  def items(): JQuery = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_SplitButton: SplitButtonOptions = js.native
  
  def show(items: String): Unit = js.native
  def show(items: JQuery): Unit = js.native
  
  var wrapper: JQuery = js.native
}

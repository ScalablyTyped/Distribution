package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatColorPicker extends Widget {
  
  def color(): Unit = js.native
  def color(color: Color): Unit = js.native
  @JSName("color")
  def color_Color(): Color = js.native
  
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  @JSName("options")
  var options_FlatColorPicker: FlatColorPickerOptions = js.native
  
  def value(): String = js.native
  def value(color: String): Unit = js.native
  @JSName("value")
  def value_Unit(): Unit = js.native
  
  var wrapper: JQuery = js.native
}

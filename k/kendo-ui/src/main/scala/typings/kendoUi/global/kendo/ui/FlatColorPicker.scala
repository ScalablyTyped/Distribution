package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FlatColorPickerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.FlatColorPicker")
@js.native
open class FlatColorPicker protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.FlatColorPicker {
  def this(element: Element) = this()
  def this(element: Element, options: FlatColorPickerOptions) = this()
}
object FlatColorPicker {
  
  @JSGlobal("kendo.ui.FlatColorPicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.FlatColorPicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.FlatColorPicker]
  
  /* static member */
  @JSGlobal("kendo.ui.FlatColorPicker.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.FlatColorPicker = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.FlatColorPicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

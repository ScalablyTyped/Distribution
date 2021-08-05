package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ColorPickerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ColorPicker")
@js.native
class ColorPicker protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ColorPicker {
  def this(element: Element) = this()
  def this(element: Element, options: ColorPickerOptions) = this()
}
object ColorPicker {
  
  @JSGlobal("kendo.ui.ColorPicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ColorPicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ColorPicker]
  
  /* static member */
  @JSGlobal("kendo.ui.ColorPicker.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ColorPicker = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ColorPicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

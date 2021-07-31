package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ColorPaletteOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ColorPalette")
@js.native
class ColorPalette protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ColorPalette {
  def this(element: Element) = this()
  def this(element: Element, options: ColorPaletteOptions) = this()
}
object ColorPalette {
  
  @JSGlobal("kendo.ui.ColorPalette")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.ColorPalette = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ColorPalette]
  
  /* static member */
  @JSGlobal("kendo.ui.ColorPalette.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ColorPalette = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.ColorPalette): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

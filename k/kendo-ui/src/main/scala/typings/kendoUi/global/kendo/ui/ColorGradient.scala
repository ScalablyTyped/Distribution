package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ColorGradientOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ColorGradient")
@js.native
open class ColorGradient protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ColorGradient {
  def this(element: Element) = this()
  def this(element: Element, options: ColorGradientOptions) = this()
}
object ColorGradient {
  
  @JSGlobal("kendo.ui.ColorGradient")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ColorGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ColorGradient]
  
  /* static member */
  @JSGlobal("kendo.ui.ColorGradient.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ColorGradient = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ColorGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

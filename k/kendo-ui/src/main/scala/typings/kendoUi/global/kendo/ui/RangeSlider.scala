package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.RangeSliderOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.RangeSlider")
@js.native
open class RangeSlider protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.RangeSlider {
  def this(element: Element) = this()
  def this(element: Element, options: RangeSliderOptions) = this()
}
object RangeSlider {
  
  @JSGlobal("kendo.ui.RangeSlider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.RangeSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.RangeSlider]
  
  /* static member */
  @JSGlobal("kendo.ui.RangeSlider.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.RangeSlider = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.RangeSlider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SliderOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Slider")
@js.native
class Slider protected ()
  extends typings.kendoUi.kendo.ui.Slider {
  def this(element: Element) = this()
  def this(element: Element, options: SliderOptions) = this()
}
object Slider {
  
  @JSGlobal("kendo.ui.Slider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Slider.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Slider = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Slider.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Slider = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Slider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

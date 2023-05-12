package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TimeDurationPickerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TimeDurationPicker")
@js.native
open class TimeDurationPicker protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.TimeDurationPicker {
  def this(element: Element) = this()
  def this(element: Element, options: TimeDurationPickerOptions) = this()
}
object TimeDurationPicker {
  
  @JSGlobal("kendo.ui.TimeDurationPicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.TimeDurationPicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.TimeDurationPicker]
  
  /* static member */
  @JSGlobal("kendo.ui.TimeDurationPicker.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TimeDurationPicker = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.TimeDurationPicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

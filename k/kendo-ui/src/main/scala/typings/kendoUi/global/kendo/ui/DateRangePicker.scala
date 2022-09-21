package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DateRangePickerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DateRangePicker")
@js.native
open class DateRangePicker protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DateRangePicker {
  def this(element: Element) = this()
  def this(element: Element, options: DateRangePickerOptions) = this()
}
object DateRangePicker {
  
  @JSGlobal("kendo.ui.DateRangePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.DateRangePicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.DateRangePicker]
  
  /* static member */
  @JSGlobal("kendo.ui.DateRangePicker.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.DateRangePicker = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.DateRangePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

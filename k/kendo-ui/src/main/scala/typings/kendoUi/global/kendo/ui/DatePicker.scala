package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DatePickerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DatePicker")
@js.native
open class DatePicker protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DatePicker {
  def this(element: Element) = this()
  def this(element: Element, options: DatePickerOptions) = this()
}
object DatePicker {
  
  @JSGlobal("kendo.ui.DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.DatePicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.DatePicker]
  
  /* static member */
  @JSGlobal("kendo.ui.DatePicker.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.DatePicker = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.DatePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

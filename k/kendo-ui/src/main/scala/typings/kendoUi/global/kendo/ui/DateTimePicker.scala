package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DateTimePickerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DateTimePicker")
@js.native
class DateTimePicker protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DateTimePicker {
  def this(element: Element) = this()
  def this(element: Element, options: DateTimePickerOptions) = this()
}
object DateTimePicker {
  
  @JSGlobal("kendo.ui.DateTimePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.DateTimePicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.DateTimePicker]
  
  /* static member */
  @JSGlobal("kendo.ui.DateTimePicker.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.DateTimePicker = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.DateTimePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

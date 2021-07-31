package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.CalendarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Calendar")
@js.native
class Calendar protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Calendar {
  def this(element: Element) = this()
  def this(element: Element, options: CalendarOptions) = this()
}
object Calendar {
  
  @JSGlobal("kendo.ui.Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Calendar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Calendar]
  
  /* static member */
  @JSGlobal("kendo.ui.Calendar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Calendar = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Calendar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

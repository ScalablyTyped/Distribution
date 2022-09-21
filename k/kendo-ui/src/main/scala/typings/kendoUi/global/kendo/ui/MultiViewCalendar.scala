package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.MultiViewCalendarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.MultiViewCalendar")
@js.native
open class MultiViewCalendar protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.MultiViewCalendar {
  def this(element: Element) = this()
  def this(element: Element, options: MultiViewCalendarOptions) = this()
}
object MultiViewCalendar {
  
  @JSGlobal("kendo.ui.MultiViewCalendar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.MultiViewCalendar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.MultiViewCalendar]
  
  /* static member */
  @JSGlobal("kendo.ui.MultiViewCalendar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.MultiViewCalendar = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.MultiViewCalendar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

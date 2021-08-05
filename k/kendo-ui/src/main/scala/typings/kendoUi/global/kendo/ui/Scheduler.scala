package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SchedulerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Scheduler")
@js.native
class Scheduler protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Scheduler {
  def this(element: Element) = this()
  def this(element: Element, options: SchedulerOptions) = this()
}
object Scheduler {
  
  @JSGlobal("kendo.ui.Scheduler")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Scheduler]
  
  /* static member */
  @JSGlobal("kendo.ui.Scheduler.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Scheduler = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Scheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

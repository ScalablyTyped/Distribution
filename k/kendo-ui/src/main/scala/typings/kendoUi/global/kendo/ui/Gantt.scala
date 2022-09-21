package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.GanttOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Gantt")
@js.native
open class Gantt protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Gantt {
  def this(element: Element) = this()
  def this(element: Element, options: GanttOptions) = this()
}
object Gantt {
  
  @JSGlobal("kendo.ui.Gantt")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Gantt = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Gantt]
  
  /* static member */
  @JSGlobal("kendo.ui.Gantt.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Gantt = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Gantt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

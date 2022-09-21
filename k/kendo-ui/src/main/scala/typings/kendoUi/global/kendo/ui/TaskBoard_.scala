package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TaskBoardOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TaskBoard")
@js.native
open class TaskBoard_ protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.TaskBoard_ {
  def this(element: Element) = this()
  def this(element: Element, options: TaskBoardOptions) = this()
}
object TaskBoard_ {
  
  @JSGlobal("kendo.ui.TaskBoard")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.TaskBoard_ = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.TaskBoard_]
  
  /* static member */
  @JSGlobal("kendo.ui.TaskBoard.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TaskBoard_ = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.TaskBoard_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

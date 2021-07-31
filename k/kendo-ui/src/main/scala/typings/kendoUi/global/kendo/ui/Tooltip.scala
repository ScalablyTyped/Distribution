package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TooltipOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Tooltip")
@js.native
class Tooltip protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Tooltip {
  def this(element: Element) = this()
  def this(element: Element, options: TooltipOptions) = this()
}
object Tooltip {
  
  @JSGlobal("kendo.ui.Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Tooltip]
  
  /* static member */
  @JSGlobal("kendo.ui.Tooltip.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Tooltip = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

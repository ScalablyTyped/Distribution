package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.PivotGridOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.PivotGrid")
@js.native
class PivotGrid protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.PivotGrid {
  def this(element: Element) = this()
  def this(element: Element, options: PivotGridOptions) = this()
}
object PivotGrid {
  
  @JSGlobal("kendo.ui.PivotGrid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.PivotGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.PivotGrid]
  
  /* static member */
  @JSGlobal("kendo.ui.PivotGrid.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.PivotGrid = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.PivotGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

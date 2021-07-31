package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.PaneOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Pane")
@js.native
class Pane protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.Pane {
  def this(element: Element) = this()
  def this(element: Element, options: PaneOptions) = this()
}
object Pane {
  
  @JSGlobal("kendo.mobile.ui.Pane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.Pane = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.Pane]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Pane.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.Pane = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.Pane): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

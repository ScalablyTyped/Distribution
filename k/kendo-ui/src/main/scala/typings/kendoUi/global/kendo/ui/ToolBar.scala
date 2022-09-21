package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ToolBarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ToolBar")
@js.native
open class ToolBar protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ToolBar {
  def this(element: Element) = this()
  def this(element: Element, options: ToolBarOptions) = this()
}
object ToolBar {
  
  @JSGlobal("kendo.ui.ToolBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ToolBar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ToolBar]
  
  /* static member */
  @JSGlobal("kendo.ui.ToolBar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ToolBar = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ToolBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

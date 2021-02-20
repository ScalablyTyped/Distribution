package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ToolBarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ToolBar")
@js.native
class ToolBar protected ()
  extends typings.kendoUi.kendo.ui.ToolBar {
  def this(element: Element) = this()
  def this(element: Element, options: ToolBarOptions) = this()
}
object ToolBar {
  
  @JSGlobal("kendo.ui.ToolBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.ToolBar.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.ToolBar = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.ToolBar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ToolBar = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.ToolBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

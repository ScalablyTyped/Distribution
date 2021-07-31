package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.AppBarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.AppBar")
@js.native
class AppBar protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.AppBar {
  def this(element: Element) = this()
  def this(element: Element, options: AppBarOptions) = this()
}
object AppBar {
  
  @JSGlobal("kendo.ui.AppBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.AppBar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.AppBar]
  
  /* static member */
  @JSGlobal("kendo.ui.AppBar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.AppBar = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.AppBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

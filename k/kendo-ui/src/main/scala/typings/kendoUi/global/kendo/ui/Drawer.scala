package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DrawerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Drawer")
@js.native
class Drawer protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Drawer {
  def this(element: Element) = this()
  def this(element: Element, options: DrawerOptions) = this()
}
object Drawer {
  
  @JSGlobal("kendo.ui.Drawer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Drawer = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Drawer]
  
  /* static member */
  @JSGlobal("kendo.ui.Drawer.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Drawer = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Drawer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

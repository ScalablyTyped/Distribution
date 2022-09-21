package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.BottomNavigationOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.BottomNavigation")
@js.native
open class BottomNavigation protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.BottomNavigation {
  def this(element: Element) = this()
  def this(element: Element, options: BottomNavigationOptions) = this()
}
object BottomNavigation {
  
  @JSGlobal("kendo.ui.BottomNavigation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.BottomNavigation = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.BottomNavigation]
  
  /* static member */
  @JSGlobal("kendo.ui.BottomNavigation.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.BottomNavigation = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.BottomNavigation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

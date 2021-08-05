package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.NavBarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.NavBar")
@js.native
class NavBar protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.NavBar {
  def this(element: Element) = this()
  def this(element: Element, options: NavBarOptions) = this()
}
object NavBar {
  
  @JSGlobal("kendo.mobile.ui.NavBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.NavBar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.NavBar]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.NavBar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.NavBar = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.NavBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

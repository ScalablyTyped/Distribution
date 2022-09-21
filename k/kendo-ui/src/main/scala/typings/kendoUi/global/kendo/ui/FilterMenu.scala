package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FilterMenuOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.FilterMenu")
@js.native
open class FilterMenu protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.FilterMenu {
  def this(element: Element) = this()
  def this(element: Element, options: FilterMenuOptions) = this()
}
object FilterMenu {
  
  @JSGlobal("kendo.ui.FilterMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.FilterMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.FilterMenu]
  
  /* static member */
  @JSGlobal("kendo.ui.FilterMenu.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.FilterMenu = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.FilterMenu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

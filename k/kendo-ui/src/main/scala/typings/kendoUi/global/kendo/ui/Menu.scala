package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.MenuOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Menu")
@js.native
class Menu protected ()
  extends typings.kendoUi.kendo.ui.Menu {
  def this(element: Element) = this()
  def this(element: Element, options: MenuOptions) = this()
}
object Menu {
  
  @JSGlobal("kendo.ui.Menu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Menu.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Menu = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Menu.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Menu = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Menu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ContextMenuOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ContextMenu")
@js.native
class ContextMenu protected ()
  extends typings.kendoUi.kendo.ui.ContextMenu {
  def this(element: Element) = this()
  def this(element: Element, options: ContextMenuOptions) = this()
}
object ContextMenu {
  
  @JSGlobal("kendo.ui.ContextMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.ContextMenu.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.ContextMenu = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.ContextMenu.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ContextMenu = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.ContextMenu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TreeViewOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TreeView")
@js.native
class TreeView protected ()
  extends typings.kendoUi.kendo.ui.TreeView {
  def this(element: Element) = this()
  def this(element: Element, options: TreeViewOptions) = this()
}
object TreeView {
  
  @JSGlobal("kendo.ui.TreeView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.TreeView.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.TreeView = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.TreeView.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TreeView = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.TreeView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

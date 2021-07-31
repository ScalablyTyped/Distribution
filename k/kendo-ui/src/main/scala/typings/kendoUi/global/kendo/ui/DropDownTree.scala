package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DropDownTreeOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DropDownTree")
@js.native
class DropDownTree protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DropDownTree {
  def this(element: Element) = this()
  def this(element: Element, options: DropDownTreeOptions) = this()
}
object DropDownTree {
  
  @JSGlobal("kendo.ui.DropDownTree")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.DropDownTree = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.DropDownTree]
  
  /* static member */
  @JSGlobal("kendo.ui.DropDownTree.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.DropDownTree = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.DropDownTree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

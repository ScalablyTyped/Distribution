package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TreeListOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TreeList")
@js.native
class TreeList protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.TreeList {
  def this(element: Element) = this()
  def this(element: Element, options: TreeListOptions) = this()
}
object TreeList {
  
  @JSGlobal("kendo.ui.TreeList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.TreeList = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.TreeList]
  
  /* static member */
  @JSGlobal("kendo.ui.TreeList.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TreeList = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.TreeList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

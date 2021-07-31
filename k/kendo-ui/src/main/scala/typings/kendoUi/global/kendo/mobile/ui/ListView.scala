package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.ListViewOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.ListView")
@js.native
class ListView protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.ListView {
  def this(element: Element) = this()
  def this(element: Element, options: ListViewOptions) = this()
}
object ListView {
  
  @JSGlobal("kendo.mobile.ui.ListView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.ListView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.ListView]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.ListView.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.ListView = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.ListView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ListViewOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ListView")
@js.native
open class ListView protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ListView {
  def this(element: Element) = this()
  def this(element: Element, options: ListViewOptions) = this()
}
object ListView {
  
  @JSGlobal("kendo.ui.ListView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ListView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ListView]
  
  /* static member */
  @JSGlobal("kendo.ui.ListView.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ListView = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ListView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

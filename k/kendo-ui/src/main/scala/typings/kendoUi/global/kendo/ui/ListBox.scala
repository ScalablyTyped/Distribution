package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ListBoxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ListBox")
@js.native
class ListBox protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ListBox {
  def this(element: Element) = this()
  def this(element: Element, options: ListBoxOptions) = this()
}
object ListBox {
  
  @JSGlobal("kendo.ui.ListBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.ListBox = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ListBox]
  
  /* static member */
  @JSGlobal("kendo.ui.ListBox.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ListBox = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.ListBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

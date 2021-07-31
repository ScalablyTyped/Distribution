package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.LayoutOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Layout")
@js.native
class Layout protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.Layout {
  def this(element: Element) = this()
  def this(element: Element, options: LayoutOptions) = this()
}
object Layout {
  
  @JSGlobal("kendo.mobile.ui.Layout")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.Layout = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.Layout]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Layout.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.Layout = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

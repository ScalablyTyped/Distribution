package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.ScrollViewOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.ScrollView")
@js.native
class ScrollView protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.ScrollView {
  def this(element: Element) = this()
  def this(element: Element, options: ScrollViewOptions) = this()
}
object ScrollView {
  
  @JSGlobal("kendo.mobile.ui.ScrollView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.ScrollView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.ScrollView]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.ScrollView.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.ScrollView = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.ScrollView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

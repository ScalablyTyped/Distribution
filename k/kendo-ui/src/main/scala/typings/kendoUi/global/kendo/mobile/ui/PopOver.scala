package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.PopOverOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.PopOver")
@js.native
class PopOver protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.PopOver {
  def this(element: Element) = this()
  def this(element: Element, options: PopOverOptions) = this()
}
object PopOver {
  
  @JSGlobal("kendo.mobile.ui.PopOver")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.PopOver = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.PopOver]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.PopOver.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.PopOver = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.PopOver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

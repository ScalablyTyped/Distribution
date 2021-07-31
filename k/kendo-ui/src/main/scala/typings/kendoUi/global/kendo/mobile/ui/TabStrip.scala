package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.TabStripOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.TabStrip")
@js.native
class TabStrip protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.TabStrip {
  def this(element: Element) = this()
  def this(element: Element, options: TabStripOptions) = this()
}
object TabStrip {
  
  @JSGlobal("kendo.mobile.ui.TabStrip")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.TabStrip = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.TabStrip]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.TabStrip.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.TabStrip = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.TabStrip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

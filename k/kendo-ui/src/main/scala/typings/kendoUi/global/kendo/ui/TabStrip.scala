package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TabStripOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TabStrip")
@js.native
class TabStrip protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.TabStrip {
  def this(element: Element) = this()
  def this(element: Element, options: TabStripOptions) = this()
}
object TabStrip {
  
  @JSGlobal("kendo.ui.TabStrip")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.TabStrip = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.TabStrip]
  
  /* static member */
  @JSGlobal("kendo.ui.TabStrip.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TabStrip = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.TabStrip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.PanelBarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.PanelBar")
@js.native
open class PanelBar protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.PanelBar {
  def this(element: Element) = this()
  def this(element: Element, options: PanelBarOptions) = this()
}
object PanelBar {
  
  @JSGlobal("kendo.ui.PanelBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.PanelBar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.PanelBar]
  
  /* static member */
  @JSGlobal("kendo.ui.PanelBar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.PanelBar = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.PanelBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

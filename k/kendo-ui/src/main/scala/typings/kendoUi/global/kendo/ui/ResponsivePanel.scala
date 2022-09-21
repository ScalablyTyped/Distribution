package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ResponsivePanelOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ResponsivePanel")
@js.native
open class ResponsivePanel protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ResponsivePanel {
  def this(element: Element) = this()
  def this(element: Element, options: ResponsivePanelOptions) = this()
}
object ResponsivePanel {
  
  @JSGlobal("kendo.ui.ResponsivePanel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ResponsivePanel = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ResponsivePanel]
  
  /* static member */
  @JSGlobal("kendo.ui.ResponsivePanel.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ResponsivePanel = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ResponsivePanel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

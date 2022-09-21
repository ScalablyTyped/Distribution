package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ExpansionPanelOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ExpansionPanel")
@js.native
open class ExpansionPanel protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ExpansionPanel {
  def this(element: Element) = this()
  def this(element: Element, options: ExpansionPanelOptions) = this()
}
object ExpansionPanel {
  
  @JSGlobal("kendo.ui.ExpansionPanel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ExpansionPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ExpansionPanel]
  
  /* static member */
  @JSGlobal("kendo.ui.ExpansionPanel.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ExpansionPanel = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ExpansionPanel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ToggleButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ToggleButton")
@js.native
open class ToggleButton protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ToggleButton {
  def this(element: Element) = this()
  def this(element: Element, options: ToggleButtonOptions) = this()
}
object ToggleButton {
  
  @JSGlobal("kendo.ui.ToggleButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ToggleButton = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ToggleButton]
  
  /* static member */
  @JSGlobal("kendo.ui.ToggleButton.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ToggleButton = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ToggleButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

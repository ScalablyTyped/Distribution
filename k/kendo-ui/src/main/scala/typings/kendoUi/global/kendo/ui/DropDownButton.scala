package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DropDownButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DropDownButton")
@js.native
open class DropDownButton protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DropDownButton {
  def this(element: Element) = this()
  def this(element: Element, options: DropDownButtonOptions) = this()
}
object DropDownButton {
  
  @JSGlobal("kendo.ui.DropDownButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.DropDownButton = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.DropDownButton]
  
  /* static member */
  @JSGlobal("kendo.ui.DropDownButton.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.DropDownButton = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.DropDownButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

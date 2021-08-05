package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ButtonGroupOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ButtonGroup")
@js.native
class ButtonGroup protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ButtonGroup {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonGroupOptions) = this()
}
object ButtonGroup {
  
  @JSGlobal("kendo.ui.ButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ButtonGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ButtonGroup]
  
  /* static member */
  @JSGlobal("kendo.ui.ButtonGroup.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ButtonGroup = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ButtonGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

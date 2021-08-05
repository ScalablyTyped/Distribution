package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.ButtonGroupOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.ButtonGroup")
@js.native
class ButtonGroup protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.ButtonGroup {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonGroupOptions) = this()
}
object ButtonGroup {
  
  @JSGlobal("kendo.mobile.ui.ButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.ButtonGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.ButtonGroup]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.ButtonGroup.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.ButtonGroup = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.ButtonGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

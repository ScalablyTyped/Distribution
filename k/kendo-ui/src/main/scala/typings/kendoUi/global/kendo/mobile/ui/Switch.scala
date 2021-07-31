package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.SwitchOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Switch")
@js.native
class Switch protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.Switch {
  def this(element: Element) = this()
  def this(element: Element, options: SwitchOptions) = this()
}
object Switch {
  
  @JSGlobal("kendo.mobile.ui.Switch")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.Switch = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.Switch]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Switch.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.Switch = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.Switch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

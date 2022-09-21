package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SwitchOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Switch")
@js.native
open class Switch protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Switch {
  def this(element: Element) = this()
  def this(element: Element, options: SwitchOptions) = this()
}
object Switch {
  
  @JSGlobal("kendo.ui.Switch")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Switch = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Switch]
  
  /* static member */
  @JSGlobal("kendo.ui.Switch.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Switch = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Switch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

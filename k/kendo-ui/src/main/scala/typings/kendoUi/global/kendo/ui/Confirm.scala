package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ConfirmOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Confirm")
@js.native
class Confirm protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Confirm {
  def this(element: Element) = this()
  def this(element: Element, options: ConfirmOptions) = this()
}
object Confirm {
  
  @JSGlobal("kendo.ui.Confirm")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Confirm = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Confirm]
  
  /* static member */
  @JSGlobal("kendo.ui.Confirm.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Confirm = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Confirm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

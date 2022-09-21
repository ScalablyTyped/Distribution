package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.AlertOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Alert")
@js.native
open class Alert protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Alert {
  def this(element: Element) = this()
  def this(element: Element, options: AlertOptions) = this()
}
object Alert {
  
  @JSGlobal("kendo.ui.Alert")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Alert = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Alert]
  
  /* static member */
  @JSGlobal("kendo.ui.Alert.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Alert = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Alert): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FloatingActionButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.FloatingActionButton")
@js.native
open class FloatingActionButton protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.FloatingActionButton {
  def this(element: Element) = this()
  def this(element: Element, options: FloatingActionButtonOptions) = this()
}
object FloatingActionButton {
  
  @JSGlobal("kendo.ui.FloatingActionButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.FloatingActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.FloatingActionButton]
  
  /* static member */
  @JSGlobal("kendo.ui.FloatingActionButton.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.FloatingActionButton = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.FloatingActionButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

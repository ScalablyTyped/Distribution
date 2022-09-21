package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.RadioButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.RadioButton")
@js.native
open class RadioButton protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.RadioButton {
  def this(element: Element) = this()
  def this(element: Element, options: RadioButtonOptions) = this()
}
object RadioButton {
  
  @JSGlobal("kendo.ui.RadioButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.RadioButton = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.RadioButton]
  
  /* static member */
  @JSGlobal("kendo.ui.RadioButton.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.RadioButton = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.RadioButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

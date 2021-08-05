package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.NumericTextBoxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.NumericTextBox")
@js.native
class NumericTextBox protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.NumericTextBox {
  def this(element: Element) = this()
  def this(element: Element, options: NumericTextBoxOptions) = this()
}
object NumericTextBox {
  
  @JSGlobal("kendo.ui.NumericTextBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.NumericTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.NumericTextBox]
  
  /* static member */
  @JSGlobal("kendo.ui.NumericTextBox.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.NumericTextBox = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.NumericTextBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

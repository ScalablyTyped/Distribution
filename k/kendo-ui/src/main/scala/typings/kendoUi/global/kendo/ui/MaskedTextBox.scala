package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.MaskedTextBoxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.MaskedTextBox")
@js.native
class MaskedTextBox protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.MaskedTextBox {
  def this(element: Element) = this()
  def this(element: Element, options: MaskedTextBoxOptions) = this()
}
object MaskedTextBox {
  
  @JSGlobal("kendo.ui.MaskedTextBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.MaskedTextBox = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.MaskedTextBox]
  
  /* static member */
  @JSGlobal("kendo.ui.MaskedTextBox.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.MaskedTextBox = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.MaskedTextBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ComboBoxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ComboBox")
@js.native
class ComboBox protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ComboBox {
  def this(element: Element) = this()
  def this(element: Element, options: ComboBoxOptions) = this()
}
object ComboBox {
  
  @JSGlobal("kendo.ui.ComboBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ComboBox = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ComboBox]
  
  /* static member */
  @JSGlobal("kendo.ui.ComboBox.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ComboBox = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ComboBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

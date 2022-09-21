package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.CheckBoxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.CheckBox")
@js.native
open class CheckBox protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.CheckBox {
  def this(element: Element) = this()
  def this(element: Element, options: CheckBoxOptions) = this()
}
object CheckBox {
  
  @JSGlobal("kendo.ui.CheckBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.CheckBox = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.CheckBox]
  
  /* static member */
  @JSGlobal("kendo.ui.CheckBox.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.CheckBox = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.CheckBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

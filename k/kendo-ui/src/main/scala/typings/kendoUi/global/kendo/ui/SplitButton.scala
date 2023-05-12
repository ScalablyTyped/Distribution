package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SplitButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.SplitButton")
@js.native
open class SplitButton protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.SplitButton {
  def this(element: Element) = this()
  def this(element: Element, options: SplitButtonOptions) = this()
}
object SplitButton {
  
  @JSGlobal("kendo.ui.SplitButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.SplitButton = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.SplitButton]
  
  /* static member */
  @JSGlobal("kendo.ui.SplitButton.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.SplitButton = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.SplitButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

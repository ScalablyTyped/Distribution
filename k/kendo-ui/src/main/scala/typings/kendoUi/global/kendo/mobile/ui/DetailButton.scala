package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.DetailButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.DetailButton")
@js.native
open class DetailButton protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.DetailButton {
  def this(element: Element) = this()
  def this(element: Element, options: DetailButtonOptions) = this()
}
object DetailButton {
  
  @JSGlobal("kendo.mobile.ui.DetailButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.DetailButton = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.DetailButton]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.DetailButton.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.DetailButton = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.DetailButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

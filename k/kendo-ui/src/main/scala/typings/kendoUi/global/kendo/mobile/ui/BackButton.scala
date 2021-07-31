package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.BackButtonOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.BackButton")
@js.native
class BackButton protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.BackButton {
  def this(element: Element) = this()
  def this(element: Element, options: BackButtonOptions) = this()
}
object BackButton {
  
  @JSGlobal("kendo.mobile.ui.BackButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.BackButton = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.BackButton]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.BackButton.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.BackButton = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.mobile.ui.BackButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.ModalViewOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.ModalView")
@js.native
open class ModalView protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.ModalView {
  def this(element: Element) = this()
  def this(element: Element, options: ModalViewOptions) = this()
}
object ModalView {
  
  @JSGlobal("kendo.mobile.ui.ModalView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.ModalView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.ModalView]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.ModalView.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.ModalView = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.ModalView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

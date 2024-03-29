package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.ViewOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.View")
@js.native
open class View protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.View {
  def this(element: Element) = this()
  def this(element: Element, options: ViewOptions) = this()
}
object View {
  
  @JSGlobal("kendo.mobile.ui.View")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.View = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.View]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.View.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.View = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

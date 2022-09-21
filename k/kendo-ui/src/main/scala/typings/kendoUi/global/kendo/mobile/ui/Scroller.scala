package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.ScrollerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Scroller")
@js.native
open class Scroller protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.Scroller {
  def this(element: Element) = this()
  def this(element: Element, options: ScrollerOptions) = this()
}
object Scroller {
  
  @JSGlobal("kendo.mobile.ui.Scroller")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.Scroller = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.Scroller]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Scroller.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.Scroller = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.Scroller): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

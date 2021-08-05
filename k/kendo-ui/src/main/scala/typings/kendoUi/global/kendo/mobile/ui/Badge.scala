package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.BadgeOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Badge")
@js.native
class Badge protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.Badge {
  def this(element: Element) = this()
  def this(element: Element, options: BadgeOptions) = this()
}
object Badge {
  
  @JSGlobal("kendo.mobile.ui.Badge")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.Badge = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.Badge]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Badge.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.Badge = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.Badge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

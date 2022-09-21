package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.BadgeOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Badge")
@js.native
open class Badge protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Badge {
  def this(element: Element) = this()
  def this(element: Element, options: BadgeOptions) = this()
}
object Badge {
  
  @JSGlobal("kendo.ui.Badge")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Badge = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Badge]
  
  /* static member */
  @JSGlobal("kendo.ui.Badge.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Badge = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Badge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

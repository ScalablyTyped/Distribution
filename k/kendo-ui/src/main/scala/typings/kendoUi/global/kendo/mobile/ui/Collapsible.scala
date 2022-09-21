package typings.kendoUi.global.kendo.mobile.ui

import typings.kendoUi.kendo.mobile.ui.CollapsibleOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Collapsible")
@js.native
open class Collapsible protected ()
  extends StObject
     with typings.kendoUi.kendo.mobile.ui.Collapsible {
  def this(element: Element) = this()
  def this(element: Element, options: CollapsibleOptions) = this()
}
object Collapsible {
  
  @JSGlobal("kendo.mobile.ui.Collapsible")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.mobile.ui.Collapsible = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.mobile.ui.Collapsible]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Collapsible.fn")
  @js.native
  def fn: typings.kendoUi.kendo.mobile.ui.Collapsible = js.native
  inline def fn_=(x: typings.kendoUi.kendo.mobile.ui.Collapsible): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

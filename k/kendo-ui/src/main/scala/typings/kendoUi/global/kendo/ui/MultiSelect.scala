package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.MultiSelectOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.MultiSelect")
@js.native
open class MultiSelect protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.MultiSelect {
  def this(element: Element) = this()
  def this(element: Element, options: MultiSelectOptions) = this()
}
object MultiSelect {
  
  @JSGlobal("kendo.ui.MultiSelect")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.MultiSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.MultiSelect]
  
  /* static member */
  @JSGlobal("kendo.ui.MultiSelect.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.MultiSelect = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.MultiSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

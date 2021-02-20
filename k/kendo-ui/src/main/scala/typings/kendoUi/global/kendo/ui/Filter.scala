package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FilterOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Filter")
@js.native
class Filter protected ()
  extends typings.kendoUi.kendo.ui.Filter {
  def this(element: Element) = this()
  def this(element: Element, options: FilterOptions) = this()
}
object Filter {
  
  @JSGlobal("kendo.ui.Filter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Filter.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Filter = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Filter.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Filter = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

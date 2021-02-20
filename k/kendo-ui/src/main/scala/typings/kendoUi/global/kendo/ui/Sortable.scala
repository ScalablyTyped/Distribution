package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SortableOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Sortable")
@js.native
class Sortable protected ()
  extends typings.kendoUi.kendo.ui.Sortable {
  def this(element: Element) = this()
  def this(element: Element, options: SortableOptions) = this()
}
object Sortable {
  
  @JSGlobal("kendo.ui.Sortable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Sortable.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Sortable = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Sortable.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Sortable = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Sortable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

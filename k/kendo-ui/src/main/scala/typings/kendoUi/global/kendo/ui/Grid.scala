package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.GridOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Grid")
@js.native
class Grid protected ()
  extends typings.kendoUi.kendo.ui.Grid {
  def this(element: Element) = this()
  def this(element: Element, options: GridOptions) = this()
}
object Grid {
  
  @JSGlobal("kendo.ui.Grid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Grid.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Grid = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Grid.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Grid = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Grid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

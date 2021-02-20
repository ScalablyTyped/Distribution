package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.PagerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Pager")
@js.native
class Pager protected ()
  extends typings.kendoUi.kendo.ui.Pager {
  def this(element: Element) = this()
  def this(element: Element, options: PagerOptions) = this()
}
object Pager {
  
  @JSGlobal("kendo.ui.Pager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Pager.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Pager = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Pager.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Pager = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Pager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

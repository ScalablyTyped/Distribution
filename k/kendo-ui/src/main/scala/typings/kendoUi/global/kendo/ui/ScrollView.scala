package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ScrollViewOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ScrollView")
@js.native
class ScrollView protected ()
  extends typings.kendoUi.kendo.ui.ScrollView {
  def this(element: Element) = this()
  def this(element: Element, options: ScrollViewOptions) = this()
}
object ScrollView {
  
  @JSGlobal("kendo.ui.ScrollView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.ScrollView.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.ScrollView = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.ScrollView.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ScrollView = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.ScrollView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

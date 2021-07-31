package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ProgressBarOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ProgressBar")
@js.native
class ProgressBar protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ProgressBar {
  def this(element: Element) = this()
  def this(element: Element, options: ProgressBarOptions) = this()
}
object ProgressBar {
  
  @JSGlobal("kendo.ui.ProgressBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.ProgressBar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ProgressBar]
  
  /* static member */
  @JSGlobal("kendo.ui.ProgressBar.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ProgressBar = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.ProgressBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

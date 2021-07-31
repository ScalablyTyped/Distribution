package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.SplitterOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Splitter")
@js.native
class Splitter protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Splitter {
  def this(element: Element) = this()
  def this(element: Element, options: SplitterOptions) = this()
}
object Splitter {
  
  @JSGlobal("kendo.ui.Splitter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Splitter = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Splitter]
  
  /* static member */
  @JSGlobal("kendo.ui.Splitter.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Splitter = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Splitter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

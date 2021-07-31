package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.AutoCompleteOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.AutoComplete")
@js.native
class AutoComplete protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.AutoComplete {
  def this(element: Element) = this()
  def this(element: Element, options: AutoCompleteOptions) = this()
}
object AutoComplete {
  
  @JSGlobal("kendo.ui.AutoComplete")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.AutoComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.AutoComplete]
  
  /* static member */
  @JSGlobal("kendo.ui.AutoComplete.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.AutoComplete = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.AutoComplete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

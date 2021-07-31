package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DropDownListOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DropDownList")
@js.native
class DropDownList protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DropDownList {
  def this(element: Element) = this()
  def this(element: Element, options: DropDownListOptions) = this()
}
object DropDownList {
  
  @JSGlobal("kendo.ui.DropDownList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.DropDownList = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.DropDownList]
  
  /* static member */
  @JSGlobal("kendo.ui.DropDownList.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.DropDownList = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.DropDownList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

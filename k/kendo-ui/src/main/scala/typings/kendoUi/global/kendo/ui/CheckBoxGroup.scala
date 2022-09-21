package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.CheckBoxGroupOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.CheckBoxGroup")
@js.native
open class CheckBoxGroup protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.CheckBoxGroup {
  def this(element: Element) = this()
  def this(element: Element, options: CheckBoxGroupOptions) = this()
}
object CheckBoxGroup {
  
  @JSGlobal("kendo.ui.CheckBoxGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.CheckBoxGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.CheckBoxGroup]
  
  /* static member */
  @JSGlobal("kendo.ui.CheckBoxGroup.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.CheckBoxGroup = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.CheckBoxGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

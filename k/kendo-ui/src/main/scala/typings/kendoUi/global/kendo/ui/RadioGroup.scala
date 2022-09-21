package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.RadioGroupOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.RadioGroup")
@js.native
open class RadioGroup protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.RadioGroup {
  def this(element: Element) = this()
  def this(element: Element, options: RadioGroupOptions) = this()
}
object RadioGroup {
  
  @JSGlobal("kendo.ui.RadioGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.RadioGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.RadioGroup]
  
  /* static member */
  @JSGlobal("kendo.ui.RadioGroup.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.RadioGroup = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.RadioGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

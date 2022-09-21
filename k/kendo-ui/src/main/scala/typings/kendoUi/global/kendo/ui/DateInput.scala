package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DateInputOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DateInput")
@js.native
open class DateInput protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.DateInput {
  def this(element: Element) = this()
  def this(element: Element, options: DateInputOptions) = this()
}
object DateInput {
  
  @JSGlobal("kendo.ui.DateInput")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.DateInput = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.DateInput]
  
  /* static member */
  @JSGlobal("kendo.ui.DateInput.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.DateInput = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.DateInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

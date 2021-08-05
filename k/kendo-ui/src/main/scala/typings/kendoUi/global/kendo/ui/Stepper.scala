package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.StepperOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Stepper")
@js.native
class Stepper protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Stepper {
  def this(element: Element) = this()
  def this(element: Element, options: StepperOptions) = this()
}
object Stepper {
  
  @JSGlobal("kendo.ui.Stepper")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Stepper = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Stepper]
  
  /* static member */
  @JSGlobal("kendo.ui.Stepper.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Stepper = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Stepper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

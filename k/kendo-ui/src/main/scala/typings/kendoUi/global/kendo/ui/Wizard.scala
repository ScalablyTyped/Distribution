package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.WizardOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Wizard")
@js.native
class Wizard protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Wizard {
  def this(element: Element) = this()
  def this(element: Element, options: WizardOptions) = this()
}
object Wizard {
  
  @JSGlobal("kendo.ui.Wizard")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Wizard = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Wizard]
  
  /* static member */
  @JSGlobal("kendo.ui.Wizard.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Wizard = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Wizard): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

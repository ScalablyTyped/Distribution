package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.PivotContainerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.PivotContainer")
@js.native
open class PivotContainer protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.PivotContainer {
  def this(element: Element) = this()
  def this(element: Element, options: PivotContainerOptions) = this()
}
object PivotContainer {
  
  @JSGlobal("kendo.ui.PivotContainer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.PivotContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.PivotContainer]
  
  /* static member */
  @JSGlobal("kendo.ui.PivotContainer.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.PivotContainer = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.PivotContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

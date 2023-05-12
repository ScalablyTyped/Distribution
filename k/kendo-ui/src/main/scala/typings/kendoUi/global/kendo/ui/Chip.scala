package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ChipOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Chip")
@js.native
open class Chip protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Chip {
  def this(element: Element) = this()
  def this(element: Element, options: ChipOptions) = this()
}
object Chip {
  
  @JSGlobal("kendo.ui.Chip")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Chip = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Chip]
  
  /* static member */
  @JSGlobal("kendo.ui.Chip.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Chip = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Chip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

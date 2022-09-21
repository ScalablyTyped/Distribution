package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.PopoverOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Popover")
@js.native
open class Popover protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Popover {
  def this(element: Element) = this()
  def this(element: Element, options: PopoverOptions) = this()
}
object Popover {
  
  @JSGlobal("kendo.ui.Popover")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Popover = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Popover]
  
  /* static member */
  @JSGlobal("kendo.ui.Popover.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Popover = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Popover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

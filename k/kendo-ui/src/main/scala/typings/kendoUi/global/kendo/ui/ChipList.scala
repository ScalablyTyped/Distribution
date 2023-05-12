package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.ChipListOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ChipList")
@js.native
open class ChipList protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.ChipList {
  def this(element: Element) = this()
  def this(element: Element, options: ChipListOptions) = this()
}
object ChipList {
  
  @JSGlobal("kendo.ui.ChipList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.ChipList = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.ChipList]
  
  /* static member */
  @JSGlobal("kendo.ui.ChipList.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.ChipList = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.ChipList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

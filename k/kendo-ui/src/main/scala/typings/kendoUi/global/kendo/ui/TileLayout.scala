package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TileLayoutOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TileLayout")
@js.native
open class TileLayout protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.TileLayout {
  def this(element: Element) = this()
  def this(element: Element, options: TileLayoutOptions) = this()
}
object TileLayout {
  
  @JSGlobal("kendo.ui.TileLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.TileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.TileLayout]
  
  /* static member */
  @JSGlobal("kendo.ui.TileLayout.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TileLayout = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.TileLayout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

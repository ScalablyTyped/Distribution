package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.EditorOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Editor")
@js.native
open class Editor_ protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.Editor_ {
  def this(element: Element) = this()
  def this(element: Element, options: EditorOptions) = this()
}
object Editor_ {
  
  @JSGlobal("kendo.ui.Editor")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.Editor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.Editor_]
  
  /* static member */
  @JSGlobal("kendo.ui.Editor.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Editor_ = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.Editor_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

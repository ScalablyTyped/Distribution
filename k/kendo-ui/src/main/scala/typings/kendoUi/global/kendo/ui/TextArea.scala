package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TextAreaOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TextArea")
@js.native
open class TextArea protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.TextArea {
  def this(element: Element) = this()
  def this(element: Element, options: TextAreaOptions) = this()
}
object TextArea {
  
  @JSGlobal("kendo.ui.TextArea")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.TextArea = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.TextArea]
  
  /* static member */
  @JSGlobal("kendo.ui.TextArea.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TextArea = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.TextArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

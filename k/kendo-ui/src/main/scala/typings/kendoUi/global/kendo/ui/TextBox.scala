package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.TextBoxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TextBox")
@js.native
class TextBox protected ()
  extends typings.kendoUi.kendo.ui.TextBox {
  def this(element: Element) = this()
  def this(element: Element, options: TextBoxOptions) = this()
}
object TextBox {
  
  @JSGlobal("kendo.ui.TextBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.TextBox.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.TextBox = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.TextBox.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.TextBox = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.TextBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

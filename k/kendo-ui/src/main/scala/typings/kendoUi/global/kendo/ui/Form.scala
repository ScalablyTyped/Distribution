package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.FormOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Form")
@js.native
class Form protected ()
  extends typings.kendoUi.kendo.ui.Form {
  def this(element: Element) = this()
  def this(element: Element, options: FormOptions) = this()
}
object Form {
  
  @JSGlobal("kendo.ui.Form")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Form.extend")
  @js.native
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Form = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Form.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.Form = js.native
  @scala.inline
  def fn_=(x: typings.kendoUi.kendo.ui.Form): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}

package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.WindowOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Window")
@js.native
class Window protected ()
  extends typings.kendoUi.kendo.ui.Window {
  def this(element: Element) = this()
  def this(element: Element, options: WindowOptions) = this()
}
/* static members */
@JSGlobal("kendo.ui.Window")
@js.native
object Window extends js.Object {
  
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Window = js.native
  
  var fn: typings.kendoUi.kendo.ui.Window = js.native
}

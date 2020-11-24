package typings.kendoUi.global.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Widget")
@js.native
class Widget protected ()
  extends typings.kendoUi.kendo.ui.Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(selector: String) = this()
  def this(element: JQuery, options: js.Object) = this()
  def this(element: Element, options: js.Object) = this()
  def this(selector: String, options: js.Object) = this()
}
/* static members */
@JSGlobal("kendo.ui.Widget")
@js.native
object Widget extends js.Object {
  
  def extend(prototype: js.Object): typings.kendoUi.kendo.ui.Widget = js.native
  
  var fn: js.Any = js.native
}

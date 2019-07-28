package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.Observable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Widget")
@js.native
class Widget protected () extends Observable {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(selector: String) = this()
  def this(element: JQuery, options: js.Object) = this()
  def this(element: Element, options: js.Object) = this()
  def this(selector: String, options: js.Object) = this()
  var element: JQuery = js.native
  var events: js.Array[String] = js.native
  var options: js.Any = js.native
  def destroy(): Unit = js.native
  def init(element: JQuery): Unit = js.native
  def init(element: JQuery, options: js.Object): Unit = js.native
  def init(element: Element): Unit = js.native
  def init(element: Element, options: js.Object): Unit = js.native
  def init(selector: String): Unit = js.native
  def init(selector: String, options: js.Object): Unit = js.native
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  def setOptions(options: js.Object): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Widget")
@js.native
object Widget extends js.Object {
  var fn: js.Any = js.native
  def extend(prototype: js.Object): Widget = js.native
}


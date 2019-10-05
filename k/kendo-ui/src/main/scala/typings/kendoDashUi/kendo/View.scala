package typings.kendoDashUi.kendo

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.View")
@js.native
class View protected () extends Observable {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: ViewOptions) = this()
  def this(element: Element, options: ViewOptions) = this()
  var content: js.Any = js.native
  var element: JQuery = js.native
  var model: js.Object = js.native
  var tagName: String = js.native
  def destroy(): Unit = js.native
  def init(element: String): Unit = js.native
  def init(element: String, options: ViewOptions): Unit = js.native
  def init(element: Element): Unit = js.native
  def init(element: Element, options: ViewOptions): Unit = js.native
  def render(): JQuery = js.native
  def render(container: js.Any): JQuery = js.native
}


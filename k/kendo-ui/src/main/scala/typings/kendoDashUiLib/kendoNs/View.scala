package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.View")
@js.native
class View protected () extends Observable {
  def this(element: java.lang.String) = this()
  def this(element: stdLib.Element) = this()
  def this(element: java.lang.String, options: ViewOptions) = this()
  def this(element: stdLib.Element, options: ViewOptions) = this()
  var content: js.Any = js.native
  var element: kendoDashUiLib.JQuery = js.native
  var model: js.Object = js.native
  var tagName: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def init(element: java.lang.String): scala.Unit = js.native
  def init(element: java.lang.String, options: ViewOptions): scala.Unit = js.native
  def init(element: stdLib.Element): scala.Unit = js.native
  def init(element: stdLib.Element, options: ViewOptions): scala.Unit = js.native
  def render(): kendoDashUiLib.JQuery = js.native
  def render(container: js.Any): kendoDashUiLib.JQuery = js.native
}


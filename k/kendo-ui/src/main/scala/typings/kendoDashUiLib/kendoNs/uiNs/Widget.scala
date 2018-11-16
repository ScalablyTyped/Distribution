package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Widget")
@js.native
class Widget protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(element: kendoDashUiLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(selector: java.lang.String) = this()
  def this(element: kendoDashUiLib.JQuery, options: js.Object) = this()
  def this(element: stdLib.Element, options: js.Object) = this()
  def this(selector: java.lang.String, options: js.Object) = this()
  var element: kendoDashUiLib.JQuery = js.native
  var events: js.Array[java.lang.String] = js.native
  var options: js.Any = js.native
  def destroy(): scala.Unit = js.native
  def init(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def init(element: kendoDashUiLib.JQuery, options: js.Object): scala.Unit = js.native
  def init(element: stdLib.Element): scala.Unit = js.native
  def init(element: stdLib.Element, options: js.Object): scala.Unit = js.native
  def init(selector: java.lang.String): scala.Unit = js.native
  def init(selector: java.lang.String, options: js.Object): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def resize(force: scala.Boolean): scala.Unit = js.native
  def setOptions(options: js.Object): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Widget")
@js.native
object Widget extends js.Object {
  var fn: js.Any = js.native
  def extend(prototype: js.Object): kendoDashUiLib.kendoNs.uiNs.Widget = js.native
}


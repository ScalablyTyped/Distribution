package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Menu")
@js.native
class Menu protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: MenuOptions) = this()
  @JSName("options")
  var options_Menu: MenuOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def append(item: js.Any): Menu = js.native
  def append(item: js.Any, referenceItem: java.lang.String): Menu = js.native
  def append(item: js.Any, referenceItem: kendoDashUiLib.JQuery): Menu = js.native
  def close(element: java.lang.String): Menu = js.native
  def close(element: kendoDashUiLib.JQuery): Menu = js.native
  def close(element: stdLib.Element): Menu = js.native
  def enable(element: java.lang.String, enable: scala.Boolean): Menu = js.native
  def enable(element: kendoDashUiLib.JQuery, enable: scala.Boolean): Menu = js.native
  def enable(element: stdLib.Element, enable: scala.Boolean): Menu = js.native
  def insertAfter(item: js.Any, referenceItem: java.lang.String): Menu = js.native
  def insertAfter(item: js.Any, referenceItem: kendoDashUiLib.JQuery): Menu = js.native
  def insertAfter(item: js.Any, referenceItem: stdLib.Element): Menu = js.native
  def insertBefore(item: js.Any, referenceItem: java.lang.String): Menu = js.native
  def insertBefore(item: js.Any, referenceItem: kendoDashUiLib.JQuery): Menu = js.native
  def insertBefore(item: js.Any, referenceItem: stdLib.Element): Menu = js.native
  def open(element: java.lang.String): Menu = js.native
  def open(element: kendoDashUiLib.JQuery): Menu = js.native
  def open(element: stdLib.Element): Menu = js.native
  def remove(element: java.lang.String): Menu = js.native
  def remove(element: kendoDashUiLib.JQuery): Menu = js.native
  def remove(element: stdLib.Element): Menu = js.native
}

@JSGlobal("kendo.ui.Menu")
@js.native
object Menu extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Menu = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Menu = js.native
}


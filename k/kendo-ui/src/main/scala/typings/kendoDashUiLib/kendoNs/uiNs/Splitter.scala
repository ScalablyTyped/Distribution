package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Splitter")
@js.native
class Splitter protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: SplitterOptions) = this()
  @JSName("options")
  var options_Splitter: SplitterOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def ajaxRequest(pane: java.lang.String, url: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def ajaxRequest(pane: java.lang.String, url: java.lang.String, data: js.Any): scala.Unit = js.native
  def ajaxRequest(pane: kendoDashUiLib.JQuery, url: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def ajaxRequest(pane: kendoDashUiLib.JQuery, url: java.lang.String, data: js.Any): scala.Unit = js.native
  def ajaxRequest(pane: stdLib.Element, url: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def ajaxRequest(pane: stdLib.Element, url: java.lang.String, data: js.Any): scala.Unit = js.native
  def append(): kendoDashUiLib.JQuery = js.native
  def append(config: js.Any): kendoDashUiLib.JQuery = js.native
  def collapse(pane: java.lang.String): scala.Unit = js.native
  def collapse(pane: kendoDashUiLib.JQuery): scala.Unit = js.native
  def collapse(pane: stdLib.Element): scala.Unit = js.native
  def expand(pane: java.lang.String): scala.Unit = js.native
  def expand(pane: kendoDashUiLib.JQuery): scala.Unit = js.native
  def expand(pane: stdLib.Element): scala.Unit = js.native
  def insertAfter(config: js.Any, referencePane: java.lang.String): kendoDashUiLib.JQuery = js.native
  def insertAfter(config: js.Any, referencePane: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def insertAfter(config: js.Any, referencePane: stdLib.Element): kendoDashUiLib.JQuery = js.native
  def insertBefore(config: js.Any, referencePane: java.lang.String): kendoDashUiLib.JQuery = js.native
  def insertBefore(config: js.Any, referencePane: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def insertBefore(config: js.Any, referencePane: stdLib.Element): kendoDashUiLib.JQuery = js.native
  def max(pane: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def max(pane: kendoDashUiLib.JQuery, value: java.lang.String): scala.Unit = js.native
  def max(pane: stdLib.Element, value: java.lang.String): scala.Unit = js.native
  def min(pane: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def min(pane: kendoDashUiLib.JQuery, value: java.lang.String): scala.Unit = js.native
  def min(pane: stdLib.Element, value: java.lang.String): scala.Unit = js.native
  def remove(pane: java.lang.String): scala.Unit = js.native
  def remove(pane: kendoDashUiLib.JQuery): scala.Unit = js.native
  def remove(pane: stdLib.Element): scala.Unit = js.native
  def size(pane: java.lang.String): scala.Unit = js.native
  def size(pane: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def size(pane: kendoDashUiLib.JQuery): scala.Unit = js.native
  def size(pane: kendoDashUiLib.JQuery, value: java.lang.String): scala.Unit = js.native
  def size(pane: stdLib.Element): scala.Unit = js.native
  def size(pane: stdLib.Element, value: java.lang.String): scala.Unit = js.native
  @JSName("size")
  def size_Any(pane: java.lang.String): js.Any = js.native
  @JSName("size")
  def size_Any(pane: kendoDashUiLib.JQuery): js.Any = js.native
  @JSName("size")
  def size_Any(pane: stdLib.Element): js.Any = js.native
  def toggle(pane: java.lang.String): scala.Unit = js.native
  def toggle(pane: java.lang.String, expand: scala.Boolean): scala.Unit = js.native
  def toggle(pane: kendoDashUiLib.JQuery): scala.Unit = js.native
  def toggle(pane: kendoDashUiLib.JQuery, expand: scala.Boolean): scala.Unit = js.native
  def toggle(pane: stdLib.Element): scala.Unit = js.native
  def toggle(pane: stdLib.Element, expand: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Splitter")
@js.native
object Splitter extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Splitter = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Splitter = js.native
}


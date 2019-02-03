package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.AutoComplete")
@js.native
class AutoComplete protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: AutoCompleteOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var list: kendoDashUiLib.JQuery = js.native
  @JSName("options")
  var options_AutoComplete: AutoCompleteOptions = js.native
  var ul: kendoDashUiLib.JQuery = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def dataItem(index: kendoDashUiLib.JQuery): js.Any = js.native
  def dataItem(index: scala.Double): js.Any = js.native
  def dataItem(index: stdLib.Element): js.Any = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def items(): js.Any = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def search(word: java.lang.String): scala.Unit = js.native
  def select(item: java.lang.String): scala.Unit = js.native
  def select(item: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(item: stdLib.Element): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def suggest(value: java.lang.String): scala.Unit = js.native
  def value(): java.lang.String = js.native
  def value(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.AutoComplete")
@js.native
object AutoComplete extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.AutoComplete = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.AutoComplete = js.native
}


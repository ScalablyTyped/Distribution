package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.dataNs.DataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.AutoComplete")
@js.native
class AutoComplete protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: AutoCompleteOptions) = this()
  var dataSource: DataSource = js.native
  var list: JQuery = js.native
  @JSName("options")
  var options_AutoComplete: AutoCompleteOptions = js.native
  var ul: JQuery = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def dataItem(index: Double): js.Any = js.native
  def dataItem(index: JQuery): js.Any = js.native
  def dataItem(index: Element): js.Any = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def items(): js.Any = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def refresh(): Unit = js.native
  def search(word: String): Unit = js.native
  def select(item: String): Unit = js.native
  def select(item: JQuery): Unit = js.native
  def select(item: Element): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def suggest(value: String): Unit = js.native
  def value(): String = js.native
  def value(value: String): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.AutoComplete")
@js.native
object AutoComplete extends js.Object {
  var fn: AutoComplete = js.native
  def extend(proto: js.Object): AutoComplete = js.native
}


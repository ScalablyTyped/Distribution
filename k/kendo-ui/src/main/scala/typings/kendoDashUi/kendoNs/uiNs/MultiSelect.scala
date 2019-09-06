package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.dataNs.DataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.MultiSelect")
@js.native
class MultiSelect protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: MultiSelectOptions) = this()
  var dataSource: DataSource = js.native
  var input: JQuery = js.native
  var list: JQuery = js.native
  @JSName("options")
  var options_MultiSelect: MultiSelectOptions = js.native
  var popup: Popup = js.native
  var tagList: JQuery = js.native
  var ul: JQuery = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def dataItems(): js.Any = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def items(): js.Any = js.native
  def open(): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def refresh(): Unit = js.native
  def search(word: String): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(toggle: Boolean): Unit = js.native
  def value(): js.Any = js.native
  def value(value: String): Unit = js.native
  def value(value: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.MultiSelect")
@js.native
object MultiSelect extends js.Object {
  var fn: MultiSelect = js.native
  def extend(proto: js.Object): MultiSelect = js.native
}


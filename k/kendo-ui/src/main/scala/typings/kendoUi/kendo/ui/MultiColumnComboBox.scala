package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiColumnComboBox extends Widget {
  var dataSource: DataSource = js.native
  var input: JQuery = js.native
  var list: JQuery = js.native
  @JSName("options")
  var options_MultiColumnComboBox: MultiColumnComboBoxOptions = js.native
  var popup: Popup = js.native
  var ul: JQuery = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def dataItem(): js.Any = js.native
  def dataItem(index: Double): js.Any = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def items(): js.Any = js.native
  def open(): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def refresh(): Unit = js.native
  def search(word: String): Unit = js.native
  def select(): Double = js.native
  def select(li: js.Function): Unit = js.native
  def select(li: Double): Unit = js.native
  def select(li: JQuery): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def suggest(value: String): Unit = js.native
  def text(): String = js.native
  def text(text: String): Unit = js.native
  def toggle(toggle: Boolean): Unit = js.native
  def value(): String = js.native
  def value(value: String): Unit = js.native
}


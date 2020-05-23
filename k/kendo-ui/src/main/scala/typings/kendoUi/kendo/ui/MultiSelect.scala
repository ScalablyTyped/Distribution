package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelect extends Widget {
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


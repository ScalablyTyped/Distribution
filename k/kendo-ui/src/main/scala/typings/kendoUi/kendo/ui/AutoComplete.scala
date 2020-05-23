package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoComplete extends Widget {
  var dataSource: DataSource = js.native
  var list: JQuery = js.native
  @JSName("options")
  var options_AutoComplete: AutoCompleteOptions = js.native
  var popup: Popup = js.native
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


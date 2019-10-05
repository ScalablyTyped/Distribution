package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.DataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DropDownList")
@js.native
class DropDownList protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DropDownListOptions) = this()
  var dataSource: DataSource = js.native
  var filterInput: JQuery = js.native
  var list: JQuery = js.native
  @JSName("options")
  var options_DropDownList: DropDownListOptions = js.native
  var popup: Popup = js.native
  var span: JQuery = js.native
  var ul: JQuery = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def dataItem(): js.Any = js.native
  def dataItem(index: Double): js.Any = js.native
  def dataItem(index: JQuery): js.Any = js.native
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
  def text(): String = js.native
  def text(text: String): Unit = js.native
  def toggle(toggle: Boolean): Unit = js.native
  def value(): String = js.native
  def value(value: String): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DropDownList")
@js.native
object DropDownList extends js.Object {
  var fn: DropDownList = js.native
  def extend(proto: js.Object): DropDownList = js.native
}


package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.DataSource
import typings.kendoDashUi.kendo.data.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ListView")
@js.native
class ListView protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ListViewOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  var wrapper: JQuery = js.native
  def append(dataItems: js.Any): Unit = js.native
  def items(): JQuery = js.native
  def prepend(dataItems: js.Any): Unit = js.native
  def refresh(): Unit = js.native
  def remove(dataItems: js.Any): Unit = js.native
  def replace(dataItems: js.Any): Unit = js.native
  def setDataItem(item: JQuery, dataItem: Model): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.ListView")
@js.native
object ListView extends js.Object {
  var fn: ListView = js.native
  def extend(proto: js.Object): ListView = js.native
}


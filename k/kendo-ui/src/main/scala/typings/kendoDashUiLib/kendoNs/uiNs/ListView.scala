package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ListView")
@js.native
class ListView protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ListViewOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def add(): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def clearSelection(): scala.Unit = js.native
  def dataItem(row: java.lang.String): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItem(row: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItem(row: stdLib.Element): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItems(): kendoDashUiLib.kendoNs.dataNs.ObservableArray = js.native
  def edit(item: kendoDashUiLib.JQuery): scala.Unit = js.native
  def items(): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def remove(item: js.Any): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def select(): kendoDashUiLib.JQuery = js.native
  def select(items: js.Any): scala.Unit = js.native
  def select(items: kendoDashUiLib.JQuery): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ListView")
@js.native
object ListView extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ListView = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ListView = js.native
}


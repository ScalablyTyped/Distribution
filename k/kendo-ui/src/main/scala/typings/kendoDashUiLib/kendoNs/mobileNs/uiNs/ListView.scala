package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ListView")
@js.native
class ListView protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ListViewOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def append(dataItems: js.Any): scala.Unit = js.native
  def items(): kendoDashUiLib.JQuery = js.native
  def prepend(dataItems: js.Any): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def remove(dataItems: js.Any): scala.Unit = js.native
  def replace(dataItems: js.Any): scala.Unit = js.native
  def setDataItem(item: kendoDashUiLib.JQuery, dataItem: kendoDashUiLib.kendoNs.dataNs.Model): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
}

@JSGlobal("kendo.mobile.ui.ListView")
@js.native
object ListView extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.ListView = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.ListView = js.native
}


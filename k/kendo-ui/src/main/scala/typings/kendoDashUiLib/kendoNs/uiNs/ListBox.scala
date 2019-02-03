package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ListBox")
@js.native
class ListBox protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ListBoxOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_ListBox: ListBoxOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def clearSelection(): scala.Unit = js.native
  def dataItem(element: java.lang.String): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItem(element: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItem(element: stdLib.Element): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def dataItems(): kendoDashUiLib.kendoNs.dataNs.ObservableArray = js.native
  def enable(element: java.lang.String): scala.Unit = js.native
  def enable(element: java.lang.String, enable: scala.Boolean): scala.Unit = js.native
  def enable(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def enable(element: kendoDashUiLib.JQuery, enable: scala.Boolean): scala.Unit = js.native
  def enable(element: stdLib.Element): scala.Unit = js.native
  def enable(element: stdLib.Element, enable: scala.Boolean): scala.Unit = js.native
  def items(): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def remove(element: java.lang.String): scala.Unit = js.native
  def remove(element: js.Any): scala.Unit = js.native
  def remove(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def remove(element: stdLib.Element): scala.Unit = js.native
  def reorder(element: java.lang.String, index: scala.Double): scala.Unit = js.native
  def reorder(element: kendoDashUiLib.JQuery, index: scala.Double): scala.Unit = js.native
  def reorder(element: stdLib.Element, index: scala.Double): scala.Unit = js.native
  def select(): kendoDashUiLib.JQuery = js.native
  def select(items: js.Any): scala.Unit = js.native
  def select(items: kendoDashUiLib.JQuery): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ListBox")
@js.native
object ListBox extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ListBox = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ListBox = js.native
}


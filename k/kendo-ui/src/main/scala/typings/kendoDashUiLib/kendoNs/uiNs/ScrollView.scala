package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ScrollView")
@js.native
class ScrollView protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ScrollViewOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_ScrollView: ScrollViewOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def content(content: java.lang.String): scala.Unit = js.native
  def content(content: kendoDashUiLib.JQuery): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def scrollTo(page: scala.Double, instant: scala.Boolean): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ScrollView")
@js.native
object ScrollView extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ScrollView = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ScrollView = js.native
}


package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.DataSource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ScrollView")
@js.native
class ScrollView protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ScrollViewOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ScrollView: ScrollViewOptions = js.native
  var wrapper: JQuery = js.native
  def content(content: String): Unit = js.native
  def content(content: JQuery): Unit = js.native
  def next(): Unit = js.native
  def prev(): Unit = js.native
  def refresh(): Unit = js.native
  def scrollTo(page: Double, instant: Boolean): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def value(dataItem: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.ScrollView")
@js.native
object ScrollView extends js.Object {
  var fn: ScrollView = js.native
  def extend(proto: js.Object): ScrollView = js.native
}


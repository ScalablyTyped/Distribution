package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.ui.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.TreeMap")
@js.native
class TreeMap protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TreeMapOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_TreeMap: TreeMapOptions = js.native
  var wrapper: JQuery = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.TreeMap")
@js.native
object TreeMap extends js.Object {
  var fn: TreeMap = js.native
  def extend(proto: js.Object): TreeMap = js.native
}


package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.TreeMap")
@js.native
class TreeMap protected ()
  extends kendoDashUiLib.kendoNs.uiNs.Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: TreeMapOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_TreeMap: TreeMapOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
}

@JSGlobal("kendo.dataviz.ui.TreeMap")
@js.native
object TreeMap extends js.Object {
  var fn: kendoDashUiLib.kendoNs.datavizNs.uiNs.TreeMap = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.datavizNs.uiNs.TreeMap = js.native
}


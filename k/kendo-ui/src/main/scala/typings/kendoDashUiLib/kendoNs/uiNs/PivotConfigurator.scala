package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.PivotConfigurator")
@js.native
class PivotConfigurator protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: PivotConfiguratorOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_PivotConfigurator: PivotConfiguratorOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def refresh(): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.PivotDataSource): scala.Unit = js.native
}

@JSGlobal("kendo.ui.PivotConfigurator")
@js.native
object PivotConfigurator extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.PivotConfigurator = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.PivotConfigurator = js.native
}


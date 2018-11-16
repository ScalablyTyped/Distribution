package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartPane")
@js.native
class ChartPane ()
  extends kendoDashUiLib.kendoNs.Observable {
  var chartsVisual: kendoDashUiLib.kendoNs.drawingNs.Group = js.native
  var options: ChartPaneOptions = js.native
  var visual: kendoDashUiLib.kendoNs.drawingNs.Group = js.native
  def findAxisByName(name: java.lang.String): ChartAxis = js.native
  def series(): js.Any = js.native
}


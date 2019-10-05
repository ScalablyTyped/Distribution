package typings.kendoDashUi.kendo.dataviz

import typings.kendoDashUi.kendo.Observable
import typings.kendoDashUi.kendo.drawing.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartPane")
@js.native
class ChartPane () extends Observable {
  var chartsVisual: Group = js.native
  var options: ChartPaneOptions = js.native
  var visual: Group = js.native
  def findAxisByName(name: String): ChartAxis = js.native
  def series(): js.Any = js.native
}


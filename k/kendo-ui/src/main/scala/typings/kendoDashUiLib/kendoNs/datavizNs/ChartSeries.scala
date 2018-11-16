package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartSeries")
@js.native
class ChartSeries ()
  extends kendoDashUiLib.kendoNs.Observable {
  var options: ChartSeriesOptions = js.native
  def data(): js.Any = js.native
  def data(data: js.Any): scala.Unit = js.native
  def findPoint(callback: js.Function): ChartPoint = js.native
  def points(): js.Any = js.native
  def points(filter: js.Function): scala.Unit = js.native
  def toggleHighlight(show: scala.Boolean, filter: js.Any): scala.Unit = js.native
  def toggleHighlight(show: scala.Boolean, filter: js.Function): scala.Unit = js.native
  def toggleVisibility(show: scala.Boolean, filter: js.Function): scala.Unit = js.native
}


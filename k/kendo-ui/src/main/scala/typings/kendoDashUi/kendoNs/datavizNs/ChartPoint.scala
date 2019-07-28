package typings.kendoDashUi.kendoNs.datavizNs

import typings.kendoDashUi.kendoNs.Observable
import typings.kendoDashUi.kendoNs.drawingNs.Element
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartPoint")
@js.native
class ChartPoint () extends Observable {
  var category: String | Date | Double = js.native
  var dataItem: js.Any = js.native
  var options: ChartPointOptions = js.native
  var percentage: Double = js.native
  var runningTotal: Double = js.native
  var total: Double = js.native
  var value: Double = js.native
  var visual: Element = js.native
}


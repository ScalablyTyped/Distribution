package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridExcelExporter extends js.Object {
  /**
    * Exports the provided igGrid to Excel document.
    *
    * @param grid jQuery element of the igGrid.
    * @param userSettings Settings for exporting the grid.
    * @param userCallbacks Callbacks for the events.
    */
  def exportGrid(grid: js.Object, userSettings: js.Object, userCallbacks: js.Object): Unit
}

object GridExcelExporter {
  @scala.inline
  def apply(exportGrid: (js.Object, js.Object, js.Object) => Unit): GridExcelExporter = {
    val __obj = js.Dynamic.literal(exportGrid = js.Any.fromFunction3(exportGrid))
    __obj.asInstanceOf[GridExcelExporter]
  }
}


package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.GridExcelExporter")
@js.native
class GridExcelExporter protected () extends js.Object {
  def this(callbacks: igniteDashUiLib.GridExcelExporterCallbacks) = this()
  def this(settings: igniteDashUiLib.GridExcelExporterSettings) = this()
  /**
  	 * Exports the provided igGrid to Excel document.
  	 *
  	 * @param grid jQuery element of the igGrid.
  	 * @param userSettings Settings for exporting the grid.
  	 * @param userCallbacks Callbacks for the events.
  	 */
  def exportGrid(grid: js.Object, userSettings: js.Object, userCallbacks: js.Object): scala.Unit = js.native
}


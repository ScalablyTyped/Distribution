package typings
package atJupyterlabCsvviewerLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewer")
@js.native
class CSVViewer protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new CSV viewer.
    */
  def this(options: atJupyterlabCsvviewerLib.libWidgetMod.CSVViewerNs.IOptions) = this()
  var _context: js.Any = js.native
  var _delimiter: js.Any = js.native
  var _grid: js.Any = js.native
  var _monitor: js.Any = js.native
  var _revealed: js.Any = js.native
  /**
    * Create the model for the grid.
    */
  var _updateGrid: js.Any = js.native
  /**
    * The CSV widget's context.
    */
  val context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context = js.native
  /**
    * The delimiter for the file.
    */
  var delimiter: java.lang.String = js.native
  /**
    * The text renderer used by the data grid.
    */
  var renderer: atPhosphorDatagridLib.atPhosphorDatagridMod.TextRenderer = js.native
  /**
    * A promise that resolves when the csv viewer is ready to be revealed.
    */
  val revealed: js.Promise[scala.Unit] = js.native
  /**
    * The style used by the data grid.
    */
  var style: atPhosphorDatagridLib.libDatagridMod.DataGridNs.IStyle = js.native
}


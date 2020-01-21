package typings.jupyterlabCsvviewer.widgetMod

import typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.phosphorDatagrid.datagridMod.DataGrid.IStyle
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewer")
@js.native
class CSVViewer_ protected () extends Widget {
  /**
    * Construct a new CSV viewer.
    */
  def this(options: IOptions) = this()
  var _context: js.Any = js.native
  var _delimiter: js.Any = js.native
  var _grid: js.Any = js.native
  var _monitor: js.Any = js.native
  var _revealed: js.Any = js.native
  var _searchService: js.Any = js.native
  /**
    * Create the model for the grid.
    */
  var _updateGrid: js.Any = js.native
  /**
    * The CSV widget's context.
    */
  val context: Context = js.native
  /**
    * The delimiter for the file.
    */
  var delimiter: String = js.native
  /**
    * The config used to create text renderer.
    */
  var rendererConfig: TextRenderConfig = js.native
  /**
    * A promise that resolves when the csv viewer is ready to be revealed.
    */
  val revealed: js.Promise[Unit] = js.native
  /**
    * The search service
    */
  val searchService: GridSearchService = js.native
  /**
    * The style used by the data grid.
    */
  var style: IStyle = js.native
  /**
    * Go to line
    */
  def goToLine(lineNumber: Double): Unit = js.native
}


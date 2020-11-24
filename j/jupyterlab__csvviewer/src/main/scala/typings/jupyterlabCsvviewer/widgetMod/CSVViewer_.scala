package typings.jupyterlabCsvviewer.widgetMod

import typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.luminoDatagrid.datagridMod.DataGrid.Style
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewer")
@js.native
class CSVViewer_ protected () extends Widget {
  /**
    * Construct a new CSV viewer.
    */
  def this(options: IOptions) = this()
  
  var _baseRenderer: js.Any = js.native
  
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
    * Update the renderer for the grid.
    */
  var _updateRenderer: js.Any = js.native
  
  /**
    * The CSV widget's context.
    */
  def context: Context = js.native
  
  /**
    * The delimiter for the file.
    */
  def delimiter: String = js.native
  def delimiter_=(value: String): Unit = js.native
  
  /**
    * Go to line
    */
  def goToLine(lineNumber: Double): Unit = js.native
  
  /**
    * The config used to create text renderer.
    */
  def rendererConfig_=(rendererConfig: TextRenderConfig): Unit = js.native
  
  /**
    * A promise that resolves when the csv viewer is ready to be revealed.
    */
  def revealed: js.Promise[Unit] = js.native
  
  /**
    * The search service
    */
  def searchService: GridSearchService = js.native
  
  /**
    * The style used by the data grid.
    */
  def style: Style = js.native
  def style_=(value: Style): Unit = js.native
}

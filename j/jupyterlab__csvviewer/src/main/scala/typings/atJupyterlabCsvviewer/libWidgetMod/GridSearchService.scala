package typings.atJupyterlabCsvviewer.libWidgetMod

import typings.atPhosphorDatagrid.atPhosphorDatagridMod.DataGrid
import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer.ConfigFunc
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "GridSearchService")
@js.native
class GridSearchService protected () extends js.Object {
  def this(grid: DataGrid) = this()
  var _column: js.Any = js.native
  var _grid: js.Any = js.native
  var _looping: js.Any = js.native
  var _query: js.Any = js.native
  var _row: js.Any = js.native
  /**
    * Wrap indices if needed to just before the start or just after the end.
    */
  var _wrapRows: js.Any = js.native
  val query: RegExp = js.native
  /**
    * Returns a cellrenderer config function to render each cell background.
    * If cell match, background is matchBackgroundColor, if it's the current
    * match, background is currentMatchBackgroundColor.
    */
  def cellBackgroundColorRendererFunc(config: TextRenderConfig): ConfigFunc[String] = js.native
  /**
    * Clear the search.
    */
  def clear(): Unit = js.native
  /**
    * incrementally look for searchText.
    */
  def find(query: RegExp): Boolean = js.native
  def find(query: RegExp, reverse: Boolean): Boolean = js.native
}


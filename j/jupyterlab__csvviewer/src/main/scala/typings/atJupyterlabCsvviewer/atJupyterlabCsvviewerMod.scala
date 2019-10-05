package typings.atJupyterlabCsvviewer

import typings.atJupyterlabCsvviewer.libParseMod.IParser.IResults
import typings.atJupyterlabCsvviewer.libToolbarMod.CSVToolbar.IOptions
import typings.atPhosphorDatagrid.atPhosphorDatagridMod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer", JSImport.Namespace)
@js.native
object atJupyterlabCsvviewerMod extends js.Object {
  @js.native
  class CSVDelimiter protected ()
    extends typings.atJupyterlabCsvviewer.libToolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class CSVDocumentWidget protected ()
    extends typings.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidget {
    def this(options: typings.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @js.native
  class CSVViewer protected ()
    extends typings.atJupyterlabCsvviewer.libWidgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typings.atJupyterlabCsvviewer.libWidgetMod.CSVViewer.IOptions) = this()
  }
  
  @js.native
  class CSVViewerFactory ()
    extends typings.atJupyterlabCsvviewer.libWidgetMod.CSVViewerFactory
  
  @js.native
  class DSVModel protected ()
    extends typings.atJupyterlabCsvviewer.libModelMod.DSVModel {
    /**
      * Create a data model with static CSV data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typings.atJupyterlabCsvviewer.libModelMod.DSVModel.IOptions) = this()
  }
  
  @js.native
  class GridSearchService protected ()
    extends typings.atJupyterlabCsvviewer.libWidgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @js.native
  class TSVViewerFactory ()
    extends typings.atJupyterlabCsvviewer.libWidgetMod.TSVViewerFactory
  
  @js.native
  class TextRenderConfig ()
    extends typings.atJupyterlabCsvviewer.libWidgetMod.TextRenderConfig
  
  def parseDSV(options: typings.atJupyterlabCsvviewer.libParseMod.IParser.IOptions): IResults = js.native
  def parseDSVNoQuotes(options: typings.atJupyterlabCsvviewer.libParseMod.IParser.IOptions): IResults = js.native
}


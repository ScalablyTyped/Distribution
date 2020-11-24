package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.parseMod.IParser.IOptions
import typings.jupyterlabCsvviewer.parseMod.IParser.IResults
import typings.luminoDatagrid.mod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/csvviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parseDSV(options: IOptions): IResults = js.native
  
  def parseDSVNoQuotes(options: IOptions): IResults = js.native
  
  @js.native
  class CSVDelimiter protected ()
    extends typings.jupyterlabCsvviewer.toolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: typings.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions) = this()
  }
  
  @js.native
  class CSVDocumentWidget protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget {
    def this(options: typings.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @js.native
  class CSVViewer protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions) = this()
  }
  
  @js.native
  class CSVViewerFactory ()
    extends typings.jupyterlabCsvviewer.widgetMod.CSVViewerFactory
  
  @js.native
  class DSVModel protected ()
    extends typings.jupyterlabCsvviewer.modelMod.DSVModel {
    /**
      * Create a data model with static CSV data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typings.jupyterlabCsvviewer.modelMod.DSVModel.IOptions) = this()
  }
  
  @js.native
  class GridSearchService protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @js.native
  class TSVViewerFactory ()
    extends typings.jupyterlabCsvviewer.widgetMod.TSVViewerFactory
  
  @js.native
  class TextRenderConfig ()
    extends typings.jupyterlabCsvviewer.widgetMod.TextRenderConfig
}

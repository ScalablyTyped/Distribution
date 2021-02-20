package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.parseMod.IParser.IResults
import typings.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoDatagrid.mod.DataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/csvviewer", "CSVDelimiter")
  @js.native
  class CSVDelimiter protected ()
    extends typings.jupyterlabCsvviewer.toolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVDocumentWidget")
  @js.native
  class CSVDocumentWidget protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget {
    def this(options: typings.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVViewer")
  @js.native
  class CSVViewer protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVViewerFactory")
  @js.native
  class CSVViewerFactory protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.CSVViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typings.jupyterlabCsvviewer.widgetMod.CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "DSVModel")
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
  
  @JSImport("@jupyterlab/csvviewer", "GridSearchService")
  @js.native
  class GridSearchService protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "TSVViewerFactory")
  @js.native
  class TSVViewerFactory protected ()
    extends typings.jupyterlabCsvviewer.widgetMod.TSVViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typings.jupyterlabCsvviewer.widgetMod.CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "TextRenderConfig")
  @js.native
  class TextRenderConfig ()
    extends typings.jupyterlabCsvviewer.widgetMod.TextRenderConfig
  
  @JSImport("@jupyterlab/csvviewer", "parseDSV")
  @js.native
  def parseDSV(options: typings.jupyterlabCsvviewer.parseMod.IParser.IOptions): IResults = js.native
  
  @JSImport("@jupyterlab/csvviewer", "parseDSVNoQuotes")
  @js.native
  def parseDSVNoQuotes(options: typings.jupyterlabCsvviewer.parseMod.IParser.IOptions): IResults = js.native
}

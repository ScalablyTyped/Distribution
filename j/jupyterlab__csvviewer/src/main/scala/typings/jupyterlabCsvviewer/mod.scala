package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.libParseMod.IParser.IResults
import typings.jupyterlabCsvviewer.libToolbarMod.CSVToolbar.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.luminoDatagrid.mod.DataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/csvviewer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/csvviewer", "CSVDelimiter")
  @js.native
  open class CSVDelimiter protected ()
    extends typings.jupyterlabCsvviewer.libToolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVDocumentWidget")
  @js.native
  open class CSVDocumentWidget protected ()
    extends typings.jupyterlabCsvviewer.libWidgetMod.CSVDocumentWidget {
    def this(options: typings.jupyterlabCsvviewer.libWidgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVViewer")
  @js.native
  open class CSVViewer protected ()
    extends typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVViewerFactory")
  @js.native
  open class CSVViewerFactory protected ()
    extends typings.jupyterlabCsvviewer.libWidgetMod.CSVViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "DSVModel")
  @js.native
  open class DSVModel protected ()
    extends typings.jupyterlabCsvviewer.libModelMod.DSVModel {
    /**
      * Create a data model with static CSV data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typings.jupyterlabCsvviewer.libModelMod.DSVModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "GridSearchService")
  @js.native
  open class GridSearchService protected ()
    extends typings.jupyterlabCsvviewer.libWidgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "TSVViewerFactory")
  @js.native
  open class TSVViewerFactory protected ()
    extends typings.jupyterlabCsvviewer.libWidgetMod.TSVViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "TextRenderConfig")
  @js.native
  open class TextRenderConfig ()
    extends typings.jupyterlabCsvviewer.libWidgetMod.TextRenderConfig
  
  inline def parseDSV(options: typings.jupyterlabCsvviewer.libParseMod.IParser.IOptions): IResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDSV")(options.asInstanceOf[js.Any]).asInstanceOf[IResults]
  
  inline def parseDSVNoQuotes(options: typings.jupyterlabCsvviewer.libParseMod.IParser.IOptions): IResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDSVNoQuotes")(options.asInstanceOf[js.Any]).asInstanceOf[IResults]
}

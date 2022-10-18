package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.libWidgetMod.CSVDocumentWidget.IOptions
import typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptionsOptionalContent
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.luminoDatagrid.mod.DataGrid
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.ConfigFunc
import typings.luminoDatagrid.typesDatagridMod.DataGrid.Style
import typings.luminoDatagrid.typesTextrendererMod.TextRenderer.HorizontalAlignment
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "CSVDocumentWidget")
  @js.native
  open class CSVDocumentWidget protected () extends DocumentWidget[CSVViewer, IModel] {
    def this(options: IOptions) = this()
  }
  object CSVDocumentWidget {
    
    trait IOptions
      extends StObject
         with IOptionsOptionalContent[CSVViewer, IModel] {
      
      /**
        * Data delimiter character
        */
      var delimiter: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(context: IContext[IModel]): IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewer")
  @js.native
  open class CSVViewer protected () extends Widget {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer.IOptions) = this()
    
    /* private */ var _baseRenderer: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _delimiter: Any = js.native
    
    /* private */ var _grid: Any = js.native
    
    /* private */ var _monitor: Any = js.native
    
    /* private */ var _revealed: Any = js.native
    
    /* private */ var _searchService: Any = js.native
    
    /**
      * Create the model for the grid.
      */
    /* private */ var _updateGrid: Any = js.native
    
    /**
      * Update the renderer for the grid.
      */
    /* private */ var _updateRenderer: Any = js.native
    
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
  object CSVViewer {
    
    /**
      * Instantiation options for CSV widgets.
      */
    trait IOptions extends StObject {
      
      /**
        * The document context for the CSV being rendered by the widget.
        */
      var context: Context
    }
    object IOptions {
      
      inline def apply(context: Context): typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer.IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer.IOptions]
      }
      
      extension [Self <: typings.jupyterlabCsvviewer.libWidgetMod.CSVViewer.IOptions](x: Self) {
        
        inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewerFactory")
  @js.native
  open class CSVViewerFactory protected () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "GridSearchService")
  @js.native
  open class GridSearchService protected () extends StObject {
    def this(grid: DataGrid) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _column: Any = js.native
    
    /* private */ var _grid: Any = js.native
    
    /* private */ var _looping: Any = js.native
    
    /* private */ var _query: Any = js.native
    
    /* private */ var _row: Any = js.native
    
    /**
      * Wrap indices if needed to just before the start or just after the end.
      */
    /* private */ var _wrapRows: Any = js.native
    
    /**
      * Returns a cellrenderer config function to render each cell background.
      * If cell match, background is matchBackgroundColor, if it's the current
      * match, background is currentMatchBackgroundColor.
      */
    def cellBackgroundColorRendererFunc(config: TextRenderConfig): ConfigFunc[String] = js.native
    
    /**
      * A signal fired when the grid changes.
      */
    def changed: ISignal[GridSearchService, Unit] = js.native
    
    /**
      * Clear the search.
      */
    def clear(): Unit = js.native
    
    /**
      * incrementally look for searchText.
      */
    def find(query: js.RegExp): Boolean = js.native
    def find(query: js.RegExp, reverse: Boolean): Boolean = js.native
    
    def query: js.RegExp | Null = js.native
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "TSVViewerFactory")
  @js.native
  open class TSVViewerFactory protected () extends CSVViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "TextRenderConfig")
  @js.native
  open class TextRenderConfig () extends StObject {
    
    /**
      * background color for the current search match.
      */
    var currentMatchBackgroundColor: String = js.native
    
    /**
      * horizontalAlignment of the text
      */
    var horizontalAlignment: HorizontalAlignment = js.native
    
    /**
      * background color for a search match
      */
    var matchBackgroundColor: String = js.native
    
    /**
      * default text color
      */
    var textColor: String = js.native
  }
}

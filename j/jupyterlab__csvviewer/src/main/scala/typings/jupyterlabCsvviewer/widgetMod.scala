package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions
import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptionsOptionalContent
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoDatagrid.cellrendererMod.CellRenderer.ConfigFunc
import typings.luminoDatagrid.datagridMod.DataGrid.Style
import typings.luminoDatagrid.mod.DataGrid
import typings.luminoDatagrid.textrendererMod.TextRenderer.HorizontalAlignment
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "CSVDocumentWidget")
  @js.native
  class CSVDocumentWidget protected () extends DocumentWidget[CSVViewer, IModel] {
    def this(options: IOptions) = this()
  }
  object CSVDocumentWidget {
    
    @js.native
    trait IOptions extends IOptionsOptionalContent[CSVViewer, IModel] {
      
      var delimiter: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(context: IContext[IModel]): IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewer")
  @js.native
  class CSVViewer protected () extends Widget {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions) = this()
    
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
  object CSVViewer {
    
    /**
      * Instantiation options for CSV widgets.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The document context for the CSV being rendered by the widget.
        */
      var context: Context = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(context: Context): typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewerFactory")
  @js.native
  class CSVViewerFactory protected () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "GridSearchService")
  @js.native
  class GridSearchService protected () extends StObject {
    def this(grid: DataGrid) = this()
    
    var _changed: js.Any = js.native
    
    var _column: js.Any = js.native
    
    var _grid: js.Any = js.native
    
    var _looping: js.Any = js.native
    
    var _query: js.Any = js.native
    
    var _row: js.Any = js.native
    
    /**
      * Wrap indices if needed to just before the start or just after the end.
      */
    var _wrapRows: js.Any = js.native
    
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
    def find(query: RegExp): Boolean = js.native
    def find(query: RegExp, reverse: Boolean): Boolean = js.native
    
    def query: RegExp | Null = js.native
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "TSVViewerFactory")
  @js.native
  class TSVViewerFactory protected () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer/lib/widget", "TextRenderConfig")
  @js.native
  class TextRenderConfig () extends StObject {
    
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

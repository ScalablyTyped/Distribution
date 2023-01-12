package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTileManager
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets the duration of the animations in the tile manager.
    *
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the columns count in the container.
    *
    *
    * Valid values:
    * "null" The column count will be automatically calculated.
    * "number" The column count can be set as a number.
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the height of each column in the container.
    *
    *
    * Valid values:
    * "string" The column height can be set in pixels (px), percentage (%) or asterisk (*) which will distribute all the height between all the columns equally.
    * "number" The column height can be set as a number representing value in pixels.
    * "array" The column height can be set as an array, specifying height for each column. If more than one column has an asterisk value, the remaining height will be equally distributed between these columns.
    * "null" The column height will be calculated based on the container height and the other options.
    */
  var columnHeight: js.UndefOr[String | Double | js.Array[Any]] = js.undefined
  
  /**
    * Gets/Sets the width of each column in the container.
    *
    *
    * Valid values:
    * "string" The column width can be set in pixels (px), percentage (%) or asterisk (*) which will distribute all the width between all the columns equally.
    * "number" The column width can be set as a number representing value in pixels.
    * "array" The column width can be set as an array, specifying width for each column. If more than one column has an asterisk value, the remaining width will be equally distributed between these columns.
    * "null" The column width will be calculated based on the container width and the other options.
    */
  var columnWidth: js.UndefOr[String | Double | js.Array[Any]] = js.undefined
  
  /**
    * Fired before databinding is performed
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing databinding.
    *             Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) the tile manager is to be databound to.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  
  /**
    * Fired after databinding is complete
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing databinding.
    *             Use ui.dataView to get a reference to the data the tile manager is databound to.
    *             Use ui.success to get see if the databinding was performed correctly.
    *             Use ui.errorMessage to get the error message if the databinding failed.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  
  /**
    * Specifies any valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an [$.ig.DataSource](ig.datasource) itself.
    *
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
    *
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
    *
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the height of the container.
    *
    *
    * Valid values:
    * "string" The height width can be set in pixels (px) and percentage (%).
    * "number" The height width can be set as a number in pixels.
    * "null" The height width can be set as a number in pixels.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Gets/Sets the tiles configurations. Every tile is described by rowSpan, colSpan, rowIndex and colIndex.
    *
    *
    * Valid values:
    * "array" An array with colSpan, rowSpan, colIndex, rowIndex configurations for each tile.
    * "null" Default tile configurations of rowSpan: 1 and colSpan: 1 will be used.
    */
  var items: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets/Sets the horizontal spacing between tiles.
    *
    *                 number  The horizontal spacing between tiles can be set as a number.
    */
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the vertical spacing between tiles.
    *
    *                 number  The vertical spacing between tiles can be set as a number.
    */
  var marginTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the content of the tiles in maximized state.
    *
    *
    * Valid values:
    * "string" When initializing on html markup provide jQuery selector specifying which elements of the tile to be shown in maximized state. When initializing on data source provide igTemplate that will be rendered for the maximized state.
    * "null" The whole content of the tile will be visible in maximized state.
    */
  var maximizedState: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the index of which items configuration will be used for positioning and sizing of the maximized tile.
    *
    *
    * Valid values:
    * "number" The maximizedTileindex can be set as a number.
    * "null" Option is ignored.
    */
  var maximizedTileIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the content of the tiles in minimized state.
    *
    *
    * Valid values:
    * "string" When initializing on html markup provide jQuery selector specifying what content of the tile to be shown in minimized state. When initializing on data source provide igTemplate that will be rendered for the minimized state.
    * "null" The whole content of the tile will be visible in minimized state.
    */
  var minimizedState: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets JQuery selector that specifies which elements will not trigger maximizing when clicked on.
    *
    */
  var preventMaximizingSelector: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets whether the items will rearrange when the container is resized.
    *
    */
  var rearrangeItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Fired after rendering of the tile manager completes.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Fired before rendering of the tile manager begins.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    *             Use ui.tiles to get a reference to the tiles the tile manager is going to render. If using data source this referes to the data provided.
    *             Use ui.items to get a reference to the item configurations the tile manager has.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  
  /**
    * Specifies the HTTP request method.
    *
    */
  var requestType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the HTTP content type for the response object. See [Perform an asynchronous HTTP (Ajax) request](http://api.jquery.com/jQuery.ajax/).
    *
    */
  var responseContentType: js.UndefOr[String] = js.undefined
  
  /**
    * Property in the response which specifies where the data records array will be held (if the response is wrapped). See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey).
    *
    *
    * Valid values:
    * "string" Specifies the name of the property in which data records are held if the response is wrapped.
    * "null" Option is ignored.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
    *
    *
    * Valid values:
    * "string" Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    * "null" Option is ignored.
    */
  var responseDataType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets how many columns to be displayed in the right panel when the tiles are minimized.
    *
    *
    * Valid values:
    * "number" Set the number of right panel columns as a number. The minimum value is 1.
    * "null" Default of 1 column will be used.
    */
  var rightPanelCols: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the height of the minimized tiles in the right panel.
    *
    *
    * Valid values:
    * "number" Set the height of the minimized tiles as a number.
    * "null" Default value equal to the column height will be used.
    */
  var rightPanelTilesHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the width of the minimized tiles in the right panel.
    *
    *
    * Valid values:
    * "number" Set the width of the minimized tiles as a number.
    * "null" Default value equal to the column width will be used.
    */
  var rightPanelTilesWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the rows count in the container.
    *
    *
    * Valid values:
    * "number" The row count can be set as a number.
    * "null" The row count will be automatically calculated.
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets whether the right panel should show scrollbar when tiles are overflowing.
    *
    */
  var showRightPanelScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configure the container variable representation, which defines splitter functionality.
    *
    */
  var splitterOptions: js.UndefOr[IgTileManagerSplitterOptions] = js.undefined
  
  /**
    * Fired after a tile in the tile manager is maximized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager the maximized tile belongs to.
    *             Use ui.tile to get the jQuery element of the maximized tile
    */
  var tileMaximized: js.UndefOr[TileMaximizedEvent] = js.undefined
  
  /**
    * Fired before a tile in the tile manager is maximized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing the maximizing the tile belongs to.
    *             Use ui.tile to get the jQuery element of the tile being maximized
    *             Use ui.minimizingTile to get reference to the tile that is minimizing simultaneously or null if no tile is minimizing.
    */
  var tileMaximizing: js.UndefOr[TileMaximizingEvent] = js.undefined
  
  /**
    * Fired after a tile in the tile manager is minimized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager the minimized tile belongs to.
    *             Use ui.tile to get the jQuery element of the minimized tile
    */
  var tileMinimized: js.UndefOr[TileMinimizedEvent] = js.undefined
  
  /**
    * Fired before a tile in the tile manager is minimized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing the minimizing the tile belongs to.
    *             Use ui.tile to get the jQuery element of the tile being minimized
    *             Use ui.maximizingTile to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
    */
  var tileMinimizing: js.UndefOr[TileMinimizingEvent] = js.undefined
  
  /**
    * Event Fired after a tile has been rendered in the container
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    *             Use ui.tile to get a reference to the rendered tile
    */
  var tileRendered: js.UndefOr[TileRenderedEvent] = js.undefined
  
  /**
    * Event fired before a tile is rendered in the container
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    *             Use ui.tile to get a reference to the tile being rendered
    */
  var tileRendering: js.UndefOr[TileRenderingEvent] = js.undefined
  
  /**
    *
    *
    * Valid values:
    * "string" The container width can be set in pixels (px) and percentage (%).
    * "number" The container width can be set as a number in pixels.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgTileManager {
  
  inline def apply(): IgTileManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgTileManager] (val x: Self) extends AnyVal {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setColumnHeight(value: String | Double | js.Array[Any]): Self = StObject.set(x, "columnHeight", value.asInstanceOf[js.Any])
    
    inline def setColumnHeightUndefined: Self = StObject.set(x, "columnHeight", js.undefined)
    
    inline def setColumnHeightVarargs(value: Any*): Self = StObject.set(x, "columnHeight", js.Array(value*))
    
    inline def setColumnWidth(value: String | Double | js.Array[Any]): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setColumnWidthVarargs(value: Any*): Self = StObject.set(x, "columnWidth", js.Array(value*))
    
    inline def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction2(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setItems(value: js.Object): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMaximizedState(value: String): Self = StObject.set(x, "maximizedState", value.asInstanceOf[js.Any])
    
    inline def setMaximizedStateUndefined: Self = StObject.set(x, "maximizedState", js.undefined)
    
    inline def setMaximizedTileIndex(value: Double): Self = StObject.set(x, "maximizedTileIndex", value.asInstanceOf[js.Any])
    
    inline def setMaximizedTileIndexUndefined: Self = StObject.set(x, "maximizedTileIndex", js.undefined)
    
    inline def setMinimizedState(value: String): Self = StObject.set(x, "minimizedState", value.asInstanceOf[js.Any])
    
    inline def setMinimizedStateUndefined: Self = StObject.set(x, "minimizedState", js.undefined)
    
    inline def setPreventMaximizingSelector(value: String): Self = StObject.set(x, "preventMaximizingSelector", value.asInstanceOf[js.Any])
    
    inline def setPreventMaximizingSelectorUndefined: Self = StObject.set(x, "preventMaximizingSelector", js.undefined)
    
    inline def setRearrangeItems(value: Boolean): Self = StObject.set(x, "rearrangeItems", value.asInstanceOf[js.Any])
    
    inline def setRearrangeItemsUndefined: Self = StObject.set(x, "rearrangeItems", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    inline def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    inline def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    inline def setResponseDataType(value: String): Self = StObject.set(x, "responseDataType", value.asInstanceOf[js.Any])
    
    inline def setResponseDataTypeUndefined: Self = StObject.set(x, "responseDataType", js.undefined)
    
    inline def setRightPanelCols(value: Double): Self = StObject.set(x, "rightPanelCols", value.asInstanceOf[js.Any])
    
    inline def setRightPanelColsUndefined: Self = StObject.set(x, "rightPanelCols", js.undefined)
    
    inline def setRightPanelTilesHeight(value: Double): Self = StObject.set(x, "rightPanelTilesHeight", value.asInstanceOf[js.Any])
    
    inline def setRightPanelTilesHeightUndefined: Self = StObject.set(x, "rightPanelTilesHeight", js.undefined)
    
    inline def setRightPanelTilesWidth(value: Double): Self = StObject.set(x, "rightPanelTilesWidth", value.asInstanceOf[js.Any])
    
    inline def setRightPanelTilesWidthUndefined: Self = StObject.set(x, "rightPanelTilesWidth", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setShowRightPanelScroll(value: Boolean): Self = StObject.set(x, "showRightPanelScroll", value.asInstanceOf[js.Any])
    
    inline def setShowRightPanelScrollUndefined: Self = StObject.set(x, "showRightPanelScroll", js.undefined)
    
    inline def setSplitterOptions(value: IgTileManagerSplitterOptions): Self = StObject.set(x, "splitterOptions", value.asInstanceOf[js.Any])
    
    inline def setSplitterOptionsUndefined: Self = StObject.set(x, "splitterOptions", js.undefined)
    
    inline def setTileMaximized(value: (/* event */ Event, /* ui */ TileMaximizedEventUIParam) => Unit): Self = StObject.set(x, "tileMaximized", js.Any.fromFunction2(value))
    
    inline def setTileMaximizedUndefined: Self = StObject.set(x, "tileMaximized", js.undefined)
    
    inline def setTileMaximizing(value: (/* event */ Event, /* ui */ TileMaximizingEventUIParam) => Unit): Self = StObject.set(x, "tileMaximizing", js.Any.fromFunction2(value))
    
    inline def setTileMaximizingUndefined: Self = StObject.set(x, "tileMaximizing", js.undefined)
    
    inline def setTileMinimized(value: (/* event */ Event, /* ui */ TileMinimizedEventUIParam) => Unit): Self = StObject.set(x, "tileMinimized", js.Any.fromFunction2(value))
    
    inline def setTileMinimizedUndefined: Self = StObject.set(x, "tileMinimized", js.undefined)
    
    inline def setTileMinimizing(value: (/* event */ Event, /* ui */ TileMinimizingEventUIParam) => Unit): Self = StObject.set(x, "tileMinimizing", js.Any.fromFunction2(value))
    
    inline def setTileMinimizingUndefined: Self = StObject.set(x, "tileMinimizing", js.undefined)
    
    inline def setTileRendered(value: (/* event */ Event, /* ui */ TileRenderedEventUIParam) => Unit): Self = StObject.set(x, "tileRendered", js.Any.fromFunction2(value))
    
    inline def setTileRenderedUndefined: Self = StObject.set(x, "tileRendered", js.undefined)
    
    inline def setTileRendering(value: (/* event */ Event, /* ui */ TileRenderingEventUIParam) => Unit): Self = StObject.set(x, "tileRendering", js.Any.fromFunction2(value))
    
    inline def setTileRenderingUndefined: Self = StObject.set(x, "tileRendering", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

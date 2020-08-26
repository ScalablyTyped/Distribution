package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTileManager
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the duration of the animations in the tile manager.
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the columns count in the container.
    *
    *
    * Valid values:
    * "null" The column count will be automatically calculated.
    * "number" The column count can be set as a number.
    */
  var cols: js.UndefOr[Double] = js.native
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
  var columnHeight: js.UndefOr[String | Double | js.Array[_]] = js.native
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
  var columnWidth: js.UndefOr[String | Double | js.Array[_]] = js.native
  /**
    * Fired before databinding is performed
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing databinding.
    *             Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) the tile manager is to be databound to.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
    * Fired after databinding is complete
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing databinding.
    *             Use ui.dataView to get a reference to the data the tile manager is databound to.
    *             Use ui.success to get see if the databinding was performed correctly.
    *             Use ui.errorMessage to get the error message if the databinding failed.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
    * Specifies any valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an [$.ig.DataSource](ig.datasource) itself.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
    *
    */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
    * Specifies a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
    *
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the height of the container.
    *
    *
    * Valid values:
    * "string" The height width can be set in pixels (px) and percentage (%).
    * "number" The height width can be set as a number in pixels.
    * "null" The height width can be set as a number in pixels.
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Gets/Sets the tiles configurations. Every tile is described by rowSpan, colSpan, rowIndex and colIndex.
    *
    *
    * Valid values:
    * "array" An array with colSpan, rowSpan, colIndex, rowIndex configurations for each tile.
    * "null" Default tile configurations of rowSpan: 1 and colSpan: 1 will be used.
    */
  var items: js.UndefOr[js.Object] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets the horizontal spacing between tiles.
    *
    *                 number  The horizontal spacing between tiles can be set as a number.
    */
  var marginLeft: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the vertical spacing between tiles.
    *
    *                 number  The vertical spacing between tiles can be set as a number.
    */
  var marginTop: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the content of the tiles in maximized state.
    *
    *
    * Valid values:
    * "string" When initializing on html markup provide jQuery selector specifying which elements of the tile to be shown in maximized state. When initializing on data source provide igTemplate that will be rendered for the maximized state.
    * "null" The whole content of the tile will be visible in maximized state.
    */
  var maximizedState: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the index of which items configuration will be used for positioning and sizing of the maximized tile.
    *
    *
    * Valid values:
    * "number" The maximizedTileindex can be set as a number.
    * "null" Option is ignored.
    */
  var maximizedTileIndex: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the content of the tiles in minimized state.
    *
    *
    * Valid values:
    * "string" When initializing on html markup provide jQuery selector specifying what content of the tile to be shown in minimized state. When initializing on data source provide igTemplate that will be rendered for the minimized state.
    * "null" The whole content of the tile will be visible in minimized state.
    */
  var minimizedState: js.UndefOr[String] = js.native
  /**
    * Gets/Sets JQuery selector that specifies which elements will not trigger maximizing when clicked on.
    *
    */
  var preventMaximizingSelector: js.UndefOr[String] = js.native
  /**
    * Gets/Sets whether the items will rearrange when the container is resized.
    *
    */
  var rearrangeItems: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Fired after rendering of the tile manager completes.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
    * Fired before rendering of the tile manager begins.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    *             Use ui.tiles to get a reference to the tiles the tile manager is going to render. If using data source this referes to the data provided.
    *             Use ui.items to get a reference to the item configurations the tile manager has.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
    * Specifies the HTTP request method.
    *
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the HTTP content type for the response object. See [Perform an asynchronous HTTP (Ajax) request](http://api.jquery.com/jQuery.ajax/).
    *
    */
  var responseContentType: js.UndefOr[String] = js.native
  /**
    * Property in the response which specifies where the data records array will be held (if the response is wrapped). See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey).
    *
    *
    * Valid values:
    * "string" Specifies the name of the property in which data records are held if the response is wrapped.
    * "null" Option is ignored.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
    *
    *
    * Valid values:
    * "string" Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    * "null" Option is ignored.
    */
  var responseDataType: js.UndefOr[String] = js.native
  /**
    * Gets/Sets how many columns to be displayed in the right panel when the tiles are minimized.
    *
    *
    * Valid values:
    * "number" Set the number of right panel columns as a number. The minimum value is 1.
    * "null" Default of 1 column will be used.
    */
  var rightPanelCols: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the height of the minimized tiles in the right panel.
    *
    *
    * Valid values:
    * "number" Set the height of the minimized tiles as a number.
    * "null" Default value equal to the column height will be used.
    */
  var rightPanelTilesHeight: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the width of the minimized tiles in the right panel.
    *
    *
    * Valid values:
    * "number" Set the width of the minimized tiles as a number.
    * "null" Default value equal to the column width will be used.
    */
  var rightPanelTilesWidth: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the rows count in the container.
    *
    *
    * Valid values:
    * "number" The row count can be set as a number.
    * "null" The row count will be automatically calculated.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets whether the right panel should show scrollbar when tiles are overflowing.
    *
    */
  var showRightPanelScroll: js.UndefOr[Boolean] = js.native
  /**
    * Configure the container variable representation, which defines splitter functionality.
    *
    */
  var splitterOptions: js.UndefOr[IgTileManagerSplitterOptions] = js.native
  /**
    * Fired after a tile in the tile manager is maximized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager the maximized tile belongs to.
    *             Use ui.tile to get the jQuery element of the maximized tile
    */
  var tileMaximized: js.UndefOr[TileMaximizedEvent] = js.native
  /**
    * Fired before a tile in the tile manager is maximized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing the maximizing the tile belongs to.
    *             Use ui.tile to get the jQuery element of the tile being maximized
    *             Use ui.minimizingTile to get reference to the tile that is minimizing simultaneously or null if no tile is minimizing.
    */
  var tileMaximizing: js.UndefOr[TileMaximizingEvent] = js.native
  /**
    * Fired after a tile in the tile manager is minimized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager the minimized tile belongs to.
    *             Use ui.tile to get the jQuery element of the minimized tile
    */
  var tileMinimized: js.UndefOr[TileMinimizedEvent] = js.native
  /**
    * Fired before a tile in the tile manager is minimized.
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing the minimizing the tile belongs to.
    *             Use ui.tile to get the jQuery element of the tile being minimized
    *             Use ui.maximizingTile to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
    */
  var tileMinimizing: js.UndefOr[TileMinimizingEvent] = js.native
  /**
    * Event Fired after a tile has been rendered in the container
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    *             Use ui.tile to get a reference to the rendered tile
    */
  var tileRendered: js.UndefOr[TileRenderedEvent] = js.native
  /**
    * Event fired before a tile is rendered in the container
    *
    *             Function takes arguments evt and ui.
    *             Use ui.owner to get a reference to the tile manager performing rendering.
    *             Use ui.tile to get a reference to the tile being rendered
    */
  var tileRendering: js.UndefOr[TileRenderingEvent] = js.native
  /**
    *
    *
    * Valid values:
    * "string" The container width can be set in pixels (px) and percentage (%).
    * "number" The container width can be set as a number in pixels.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgTileManager {
  @scala.inline
  def apply(): IgTileManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManager]
  }
  @scala.inline
  implicit class IgTileManagerOps[Self <: IgTileManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setColumnHeightVarargs(value: js.Any*): Self = this.set("columnHeight", js.Array(value :_*))
    @scala.inline
    def setColumnHeight(value: String | Double | js.Array[_]): Self = this.set("columnHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeight: Self = this.set("columnHeight", js.undefined)
    @scala.inline
    def setColumnWidthVarargs(value: js.Any*): Self = this.set("columnWidth", js.Array(value :_*))
    @scala.inline
    def setColumnWidth(value: String | Double | js.Array[_]): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = this.set("dataBinding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = this.set("dataBound", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setItems(value: js.Object): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMaximizedState(value: String): Self = this.set("maximizedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizedState: Self = this.set("maximizedState", js.undefined)
    @scala.inline
    def setMaximizedTileIndex(value: Double): Self = this.set("maximizedTileIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizedTileIndex: Self = this.set("maximizedTileIndex", js.undefined)
    @scala.inline
    def setMinimizedState(value: String): Self = this.set("minimizedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizedState: Self = this.set("minimizedState", js.undefined)
    @scala.inline
    def setPreventMaximizingSelector(value: String): Self = this.set("preventMaximizingSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventMaximizingSelector: Self = this.set("preventMaximizingSelector", js.undefined)
    @scala.inline
    def setRearrangeItems(value: Boolean): Self = this.set("rearrangeItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRearrangeItems: Self = this.set("rearrangeItems", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = this.set("rendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendering: Self = this.set("rendering", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setResponseContentType(value: String): Self = this.set("responseContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseContentType: Self = this.set("responseContentType", js.undefined)
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    @scala.inline
    def setResponseDataType(value: String): Self = this.set("responseDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataType: Self = this.set("responseDataType", js.undefined)
    @scala.inline
    def setRightPanelCols(value: Double): Self = this.set("rightPanelCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightPanelCols: Self = this.set("rightPanelCols", js.undefined)
    @scala.inline
    def setRightPanelTilesHeight(value: Double): Self = this.set("rightPanelTilesHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightPanelTilesHeight: Self = this.set("rightPanelTilesHeight", js.undefined)
    @scala.inline
    def setRightPanelTilesWidth(value: Double): Self = this.set("rightPanelTilesWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightPanelTilesWidth: Self = this.set("rightPanelTilesWidth", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setShowRightPanelScroll(value: Boolean): Self = this.set("showRightPanelScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRightPanelScroll: Self = this.set("showRightPanelScroll", js.undefined)
    @scala.inline
    def setSplitterOptions(value: IgTileManagerSplitterOptions): Self = this.set("splitterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitterOptions: Self = this.set("splitterOptions", js.undefined)
    @scala.inline
    def setTileMaximized(value: (/* event */ Event, /* ui */ TileMaximizedEventUIParam) => Unit): Self = this.set("tileMaximized", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileMaximized: Self = this.set("tileMaximized", js.undefined)
    @scala.inline
    def setTileMaximizing(value: (/* event */ Event, /* ui */ TileMaximizingEventUIParam) => Unit): Self = this.set("tileMaximizing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileMaximizing: Self = this.set("tileMaximizing", js.undefined)
    @scala.inline
    def setTileMinimized(value: (/* event */ Event, /* ui */ TileMinimizedEventUIParam) => Unit): Self = this.set("tileMinimized", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileMinimized: Self = this.set("tileMinimized", js.undefined)
    @scala.inline
    def setTileMinimizing(value: (/* event */ Event, /* ui */ TileMinimizingEventUIParam) => Unit): Self = this.set("tileMinimizing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileMinimizing: Self = this.set("tileMinimizing", js.undefined)
    @scala.inline
    def setTileRendered(value: (/* event */ Event, /* ui */ TileRenderedEventUIParam) => Unit): Self = this.set("tileRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileRendered: Self = this.set("tileRendered", js.undefined)
    @scala.inline
    def setTileRendering(value: (/* event */ Event, /* ui */ TileRenderingEventUIParam) => Unit): Self = this.set("tileRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTileRendering: Self = this.set("tileRendering", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTileManager
  extends /**
	 * Option for igTileManager
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the duration of the animations in the tile manager.
  	 *
  	 */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the columns count in the container.
  	 *
  	 *
  	 * Valid values:
  	 * "null" The column count will be automatically calculated.
  	 * "number" The column count can be set as a number.
  	 */
  var cols: js.UndefOr[scala.Double] = js.undefined
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
  var columnHeight: js.UndefOr[java.lang.String | scala.Double | js.Array[_]] = js.undefined
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
  var columnWidth: js.UndefOr[java.lang.String | scala.Double | js.Array[_]] = js.undefined
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
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
  	 *
  	 */
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
  	 *
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the height of the container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The height width can be set in pixels (px) and percentage (%).
  	 * "number" The height width can be set as a number in pixels.
  	 * "null" The height width can be set as a number in pixels.
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
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
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the horizontal spacing between tiles.
  	 *
  	 *                 number  The horizontal spacing between tiles can be set as a number.
  	 */
  var marginLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the vertical spacing between tiles.
  	 *
  	 *                 number  The vertical spacing between tiles can be set as a number.
  	 */
  var marginTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the content of the tiles in maximized state.
  	 *
  	 *
  	 * Valid values:
  	 * "string" When initializing on html markup provide jQuery selector specifying which elements of the tile to be shown in maximized state. When initializing on data source provide igTemplate that will be rendered for the maximized state.
  	 * "null" The whole content of the tile will be visible in maximized state.
  	 */
  var maximizedState: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the index of which items configuration will be used for positioning and sizing of the maximized tile.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The maximizedTileindex can be set as a number.
  	 * "null" Option is ignored.
  	 */
  var maximizedTileIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the content of the tiles in minimized state.
  	 *
  	 *
  	 * Valid values:
  	 * "string" When initializing on html markup provide jQuery selector specifying what content of the tile to be shown in minimized state. When initializing on data source provide igTemplate that will be rendered for the minimized state.
  	 * "null" The whole content of the tile will be visible in minimized state.
  	 */
  var minimizedState: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets JQuery selector that specifies which elements will not trigger maximizing when clicked on.
  	 *
  	 */
  var preventMaximizingSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets whether the items will rearrange when the container is resized.
  	 *
  	 */
  var rearrangeItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the HTTP content type for the response object. See [Perform an asynchronous HTTP (Ajax) request](http://api.jquery.com/jQuery.ajax/).
  	 *
  	 */
  var responseContentType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Property in the response which specifies where the data records array will be held (if the response is wrapped). See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey).
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the name of the property in which data records are held if the response is wrapped.
  	 * "null" Option is ignored.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 * "null" Option is ignored.
  	 */
  var responseDataType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets how many columns to be displayed in the right panel when the tiles are minimized.
  	 *
  	 *
  	 * Valid values:
  	 * "number" Set the number of right panel columns as a number. The minimum value is 1.
  	 * "null" Default of 1 column will be used.
  	 */
  var rightPanelCols: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the height of the minimized tiles in the right panel.
  	 *
  	 *
  	 * Valid values:
  	 * "number" Set the height of the minimized tiles as a number.
  	 * "null" Default value equal to the column height will be used.
  	 */
  var rightPanelTilesHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the width of the minimized tiles in the right panel.
  	 *
  	 *
  	 * Valid values:
  	 * "number" Set the width of the minimized tiles as a number.
  	 * "null" Default value equal to the column width will be used.
  	 */
  var rightPanelTilesWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the rows count in the container.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The row count can be set as a number.
  	 * "null" The row count will be automatically calculated.
  	 */
  var rows: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets whether the right panel should show scrollbar when tiles are overflowing.
  	 *
  	 */
  var showRightPanelScroll: js.UndefOr[scala.Boolean] = js.undefined
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
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IgTileManager {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTileManager
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animationDuration: scala.Int | scala.Double = null,
    cols: scala.Int | scala.Double = null,
    columnHeight: java.lang.String | scala.Double | js.Array[_] = null,
    columnWidth: java.lang.String | scala.Double | js.Array[_] = null,
    dataBinding: DataBindingEvent = null,
    dataBound: DataBoundEvent = null,
    dataSource: js.Any = null,
    dataSourceType: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    items: js.Object = null,
    language: java.lang.String = null,
    locale: js.Any = null,
    marginLeft: scala.Int | scala.Double = null,
    marginTop: scala.Int | scala.Double = null,
    maximizedState: java.lang.String = null,
    maximizedTileIndex: scala.Int | scala.Double = null,
    minimizedState: java.lang.String = null,
    preventMaximizingSelector: java.lang.String = null,
    rearrangeItems: js.UndefOr[scala.Boolean] = js.undefined,
    regional: java.lang.String | js.Object = null,
    rendered: RenderedEvent = null,
    rendering: RenderingEvent = null,
    requestType: java.lang.String = null,
    responseContentType: java.lang.String = null,
    responseDataKey: java.lang.String = null,
    responseDataType: java.lang.String = null,
    rightPanelCols: scala.Int | scala.Double = null,
    rightPanelTilesHeight: scala.Int | scala.Double = null,
    rightPanelTilesWidth: scala.Int | scala.Double = null,
    rows: scala.Int | scala.Double = null,
    showRightPanelScroll: js.UndefOr[scala.Boolean] = js.undefined,
    splitterOptions: IgTileManagerSplitterOptions = null,
    tileMaximized: TileMaximizedEvent = null,
    tileMaximizing: TileMaximizingEvent = null,
    tileMinimized: TileMinimizedEvent = null,
    tileMinimizing: TileMinimizingEvent = null,
    tileRendered: TileRenderedEvent = null,
    tileRendering: TileRenderingEvent = null,
    width: java.lang.String | scala.Double = null
  ): IgTileManager = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (columnHeight != null) __obj.updateDynamic("columnHeight")(columnHeight.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (maximizedState != null) __obj.updateDynamic("maximizedState")(maximizedState)
    if (maximizedTileIndex != null) __obj.updateDynamic("maximizedTileIndex")(maximizedTileIndex.asInstanceOf[js.Any])
    if (minimizedState != null) __obj.updateDynamic("minimizedState")(minimizedState)
    if (preventMaximizingSelector != null) __obj.updateDynamic("preventMaximizingSelector")(preventMaximizingSelector)
    if (!js.isUndefined(rearrangeItems)) __obj.updateDynamic("rearrangeItems")(rearrangeItems)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType)
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType)
    if (rightPanelCols != null) __obj.updateDynamic("rightPanelCols")(rightPanelCols.asInstanceOf[js.Any])
    if (rightPanelTilesHeight != null) __obj.updateDynamic("rightPanelTilesHeight")(rightPanelTilesHeight.asInstanceOf[js.Any])
    if (rightPanelTilesWidth != null) __obj.updateDynamic("rightPanelTilesWidth")(rightPanelTilesWidth.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(showRightPanelScroll)) __obj.updateDynamic("showRightPanelScroll")(showRightPanelScroll)
    if (splitterOptions != null) __obj.updateDynamic("splitterOptions")(splitterOptions)
    if (tileMaximized != null) __obj.updateDynamic("tileMaximized")(tileMaximized)
    if (tileMaximizing != null) __obj.updateDynamic("tileMaximizing")(tileMaximizing)
    if (tileMinimized != null) __obj.updateDynamic("tileMinimized")(tileMinimized)
    if (tileMinimizing != null) __obj.updateDynamic("tileMinimizing")(tileMinimizing)
    if (tileRendered != null) __obj.updateDynamic("tileRendered")(tileRendered)
    if (tileRendering != null) __obj.updateDynamic("tileRendering")(tileRendering)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTileManager]
  }
}


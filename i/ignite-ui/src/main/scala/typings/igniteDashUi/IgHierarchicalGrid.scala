package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGrid
  extends /**
	 * Option for igHierarchicalGrid
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If this option is set to true, the height of the grid row will be calculated automatically based on the [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight) and the visible virtual records. If no [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight) is specified, it will be calculated automatically at runtime.
  	 *
  	 */
  var adjustVirtualHeights: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If set to true, the following behavior will take place:
  	 * If a new row is added, and then deleted, there will be no transaction added to the log.
  	 * If a new row is added, edited, then deleted, there will be no transaction added to the log.
  	 * If several edits are made to a row or an individual cell, this should result in a single transaction.
  	 * Note: This option takes effect only when [autoCommit](ui.ighierarchicalgrid#options:autoCommit) is set to false.
  	 *
  	 */
  var aggregateTransactions: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables/disables rendering of alternating row styles (odd and even rows receive different styling).
  	 *
  	 */
  var alternateRowStyles: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The row expanding/collapsing animation duration in ms.
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * If autoAdjustHeight is set to false, the [height](ui.ighierarchicalgrid#options:height) will be set only on the scrolling container, and all other UI elements such as paging footer / filter row / headers will add on top of that, so the total height of the grid will be more than this value - the height of the scroll container (content area) will not be dynamically calculated. Setting this option to false will usually result in a lot better initial rendering performance for large data sets ( > 1000 rows rendered at once, no [virtualization](ui.ighierarchicalgrid#options:virtualization) enabled), since no reflows will be made by browsers when accessing DOM properties such as offsetHeight.
  	 *
  	 */
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Automatically commits the transactions as rows/cells are being edited to the client data source. A [saveChanges](ui.ighierarchicalgrid#methods:saveChanges) call still needs to be performed in order to commit the transactions to a server-side data source.
  	 *
  	 */
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets gets ability to automatically format text in cells for numeric and date columns. The format patterns and rules for numbers and dates are defined in $.ig.regional.defaults object. [Here column formatting is explained in details](http://www.igniteui.com/help/iggrid-columns-and-layout#column-formatting)
  	 *
  	 *
  	 * Valid values:
  	 * "date" formats only Date columns
  	 * "number" formats only number columns
  	 * "dateandnumber" formats both Date and number columns
  	 * "true" formats Date and number columns
  	 * "false" auto formatting is disabled
  	 */
  var autoFormat: js.UndefOr[String | Boolean] = js.undefined
  /**
  	 * If no [columns](ui.ighierarchicalgrid#options:columns) collection is defined, and autoGenerateColumns is set to true, [columns](ui.ighierarchicalgrid#options:columns) will be inferred from the data source before the [dataRendering](ui.iggrid#events:dataRendering) event is fired. The inferred [columns](ui.ighierarchicalgrid#options:columns) collection will be available to the developer for modification at [dataRendering](ui.iggrid#events:dataRendering). If autoGenerateColumns is not explicitly set and [columns](ui.ighierarchicalgrid#options:columns) has at least one column defined then autoGenerateColumns is automatically set to false.
  	 * If autoGenerateColumns is true and there are columns defined auto-generated columns will render after the explicitly defined ones.
  	 * Since auto-generated columns don't have width defined consider setting [defaultColumnWidth](ui.ighierarchicalgrid#options:defaultColumnWidth) as well.
  	 *
  	 */
  var autoGenerateColumns: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If true, will autogenerate all layouts assuming default values for "childrenDataProperty"
  	 * When autoGenerateLayouts is enabled, it will automatically generate all columns recursively. (all columns on all levels)
  	 *
  	 */
  var autoGenerateLayouts: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If set to true and all columns' widths are specified and their combined width is less than the grid width then the last column width will be automatically adjusted to fill the remaining empty space of the grid.
  	 *
  	 */
  var autofitLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Used for [column virtualization](ui.ighierarchicalgrid#options:columnVirtualization) in [fixed mode](ui.ighierarchicalgrid#options:virtualizationMode). This is the average value in pixels for a column width.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The avarage column width can be set in pixels ("25px").
  	 * "number" The avarage column width can be set in pixels as a number (25).
  	 */
  var avgColumnWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Used for [row virtualization](ui.ighierarchicalgrid#options:rowVirtualization) in [fixed mode](ui.ighierarchicalgrid#options:virtualizationMode). This is the average value in pixels (default) that will be used to calculate how many rows to render as the end user scrolls. Also all rows' height will be automatically set to this value.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The avarage row height can be set in pixels ("25px").
  	 * "number" The avarage row height can be set in pixels as a number (25).
  	 */
  var avgRowHeight: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Caption text that will be shown above the grid header.
  	 *
  	 */
  var caption: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the caption has been rendered.
  	 */
  var captionRendered: js.UndefOr[CaptionRenderedEvent] = js.undefined
  /**
  	 * Event fired before the caption starts its rendering.
  	 * Return false in order to cancel caption rendering.
  	 */
  var captionRendering: js.UndefOr[CaptionRenderingEvent] = js.undefined
  /**
  	 * Event fired when a cell is clicked.
  	 */
  var cellClick: js.UndefOr[CellClickEvent] = js.undefined
  /**
  	 * Event fired when a cell is right clicked.
  	 */
  var cellRightClick: js.UndefOr[CellRightClickEvent] = js.undefined
  /**
  	 * Event fired after a child grid is created
  	 */
  var childGridCreated: js.UndefOr[ChildGridCreatedEvent] = js.undefined
  /**
  	 * Event fired before a child grid is going to be created, allows the developer to override the child grid creation
  	 */
  var childGridCreating: js.UndefOr[ChildGridCreatingEvent] = js.undefined
  /**
  	 * Event fired when child grid is rendered
  	 */
  var childGridRendered: js.UndefOr[ChildGridRenderedEvent] = js.undefined
  /**
  	 * Event which is fired when children have been populated (Load on demand)
  	 */
  var childrenPopulated: js.UndefOr[ChildrenPopulatedEvent] = js.undefined
  /**
  	 * Event which is fired when children are about to be populated (Load on demand)
  	 */
  var childrenPopulating: js.UndefOr[ChildrenPopulatingEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the default tooltip applied to an expand column cell, that is currently expanded. Use option [locale.collapseTooltip](ui.ighierarchicalgrid#options:locale.collapseTooltip).
  	 */
  var collapseTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * List of columnLayout objects that specify the structure of the child grids. All options that are applicable to a flat grid are also applicable here
  	 *
  	 */
  var columnLayouts: js.UndefOr[js.Array[IgHierarchicalGridColumnLayout]] = js.undefined
  /**
  	 * Enables virtualization for columns only. Column virtualization can work only in combination with fixed row virtalization. Setting columnVirtualization to true will automatically set [virtualization](ui.ighierarchicalgrid#options:virtualization) to true and [virtualizationMode](ui.ighierarchicalgrid#options:virtualizationMode) to "fixed".
  	 *
  	 */
  var columnVirtualization: js.UndefOr[Boolean] = js.undefined
  /**
  	 * An array of column objects. Checkout the [Columns and Layout](http://www.igniteui.com/help/iggrid-columns-and-layout#defining-columns) topic for details on configuring the columns array.
  	 *
  	 */
  var columns: js.UndefOr[js.Array[IgHierarchicalGridColumn]] = js.undefined
  /**
  	 * Event fired after the columns colection has been modified(e.g. a column is hidden)
  	 */
  var columnsCollectionModified: js.UndefOr[ColumnsCollectionModifiedEvent] = js.undefined
  /**
  	 * Fired when the grid is created and the initial structure is rendered (this doesn't necessarily imply the data will be there if the data source is remote)
  	 */
  var created: js.UndefOr[CreatedEvent] = js.undefined
  /**
  	 * Event fired before data binding takes place.
  	 *
  	 * Return false in order to cancel data binding.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  /**
  	 * Event fired after data binding is complete.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  /**
  	 * Event fired after all of the data records in the grid table body have been rendered.
  	 */
  var dataRendered: js.UndefOr[DataRenderedEvent] = js.undefined
  /**
  	 * Event fired before the TBODY holding the data records starts its rendering.
  	 * Return false in order to cancel data records rendering.
  	 */
  var dataRendering: js.UndefOr[DataRenderingEvent] = js.undefined
  /**
  	 * Can be any valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an $.ig.DataSource itself
  	 *
  	 *
  	 * Valid values:
  	 * "string" DataSource as a string. For example a Url.
  	 * "array" DataSource as an array.
  	 * "object" DataSource as an object. For example a JSON object
  	 */
  var dataSource: js.UndefOr[String | js.Array[_] | js.Object] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type).
  	 *
  	 */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a remote URL as a data source, from which data will be retrieved using the [$.ig.DataSource](ig.datasource).
  	 *
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the default property in the response where children will be located
  	 *
  	 */
  var defaultChildrenDataProperty: js.UndefOr[String] = js.undefined
  /**
  	 * Default column width that will be set for all columns, that don't have [column width](ui.ighierarchicalgrid#options:columns.width) defined.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The default column width can be set in pixels ("100px").
  	 * "number" The default column width can be set in pixels as a number (100).
  	 */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Fired when the grid is destroyed
  	 */
  var destroyed: js.UndefOr[DestroyedEvent] = js.undefined
  /**
  	 * Enables/disables rendering of hover styles when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
  	 *
  	 */
  var enableHoverStyles: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables/disables grid adjusting its dimensions when its [width](ui.ighierarchicalgrid#options:width) and/or [height](ui.ighierarchicalgrid#options:height) is set in percent (%) and grid parent DOM container is resized.
  	 *
  	 */
  var enableResizeContainerCheck: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Nables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
  	 *
  	 */
  var enableUTCDates: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies the expand column width
  	 *
  	 */
  var expandColWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Applies a linear animation - either expanding or collapsing depending on the parent row state
  	 *
  	 */
  var expandCollapseAnimations: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the default tooltip applied to an expand column cell, that is currently collapsed. Use option [locale.columnChooserCaptionText](ui.ighierarchicalgrid#options:locale.expandTooltip).
  	 */
  var expandTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Configures how the feature chooser icon should display on header cells - e.g. to display as gear icon or not.
  	 *
  	 *
  	 * Valid values:
  	 * "none" Always hide the feature chooser icon; The feature chooser is shown on tapping/clicking the column header.
  	 * "desktopOnly" Always show the icon on desktop but hide when touch device detected.
  	 * "always" Always show it in any environment. Chooser is shown when tapping the gear icon or column header.
  	 */
  var featureChooserIconDisplay: js.UndefOr[String] = js.undefined
  /**
  	 * List of grid feature definitions: sorting, paging, etc. Each feature goes with its separate options that are documented for the feature accordingly. [Here you can find detailed documentation for all igGrid features](http://www.igniteui.com/help/iggrid-features-landing-page)
  	 *
  	 */
  var features: js.UndefOr[js.Array[IgHierarchicalGridFeature]] = js.undefined
  /**
  	 * Footers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.ighierarchicalgrid#options:virtualization) is enabled, fixedFooters will always act as if it's true, no matter which value is set.
  	 *
  	 */
  var fixedFooters: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Headers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.ighierarchicalgrid#options:virtualization) is enabled, fixedHeaders will always act as if it's true, no matter which value is set.
  	 *
  	 */
  var fixedHeaders: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after the footer has been rendered.
  	 */
  var footerRendered: js.UndefOr[FooterRenderedEvent] = js.undefined
  /**
  	 * Event fired before the footer starts its rendering.
  	 *
  	 * Return false in order to cancel footer rendering.
  	 */
  var footerRendering: js.UndefOr[FooterRenderingEvent] = js.undefined
  /**
  	 * Event fired after every TH in the grid header has been rendered.
  	 */
  var headerCellRendered: js.UndefOr[HeaderCellRenderedEvent] = js.undefined
  /**
  	 * Event fired after the header has been rendered.
  	 */
  var headerRendered: js.UndefOr[HeaderRenderedEvent] = js.undefined
  /**
  	 * Event fired before the header starts its rendering.
  	 * Return false in order to cancel header rendering.
  	 */
  var headerRendering: js.UndefOr[HeaderRenderingEvent] = js.undefined
  /**
  	 * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row - (if any), etc. [Here you can find more info about setting igGrid height](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number
  	 * "null" will stretch vertically to fit data.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Only the first level will be data-bound initially. Also serves as "render" depth, meaning that depending on this prop, the grid will render the child grids up to the specified level.
  	 *
  	 */
  var initialDataBindDepth: js.UndefOr[Double] = js.undefined
  /**
  	 * No levels will be automatically expanded when the widget is instantiated for the first time
  	 *
  	 */
  var initialExpandDepth: js.UndefOr[Double] = js.undefined
  /**
  	 * When dataSource is a remote URL, defines whether to set the type of the remote data source to JSONP.
  	 *
  	 */
  var jsonpRequest: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * If this option is set to false, the data to which the grid is bound will be used "as is" with no additional transformations based on [columns](ui.ighierarchicalgrid#options:columns) defined. Otherwise only the subset of data properties used in the [columns](ui.ighierarchicalgrid#options:columns) defined will be extracted in a new object and used.
  	 *
  	 */
  var localSchemaTransform: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[IgHierarchicalGridLocale] = js.undefined
  /**
  	 * Specifies the limit on the number of levels to bind to
  	 *
  	 */
  var maxDataBindDepth: js.UndefOr[Double] = js.undefined
  /**
  	 * Merge unbound columns values inside data source when data source is remote. If true then the unbound columns are merged to the data source at runtime on the server. Note that data source is expanded with the new data and this could cause performance issues when the data is huge. If mergeUnboundColumns is false then the unbound data is sent and merged on the client. This option is used by the [igGrid MVC Helper](http://www.igniteui.com/help/iggrid-developing-asp-net-mvc-applications-with-iggrid).
  	 * Checkout [Populating Unbound Columns Remotely (igGrid)](http://www.igniteui.com/help/iggrid-unboundcolumns-populating-with-data-remotely) topic for more information.
  	 *
  	 */
  var mergeUnboundColumns: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If true, encodes all requests using OData conventions and the $expand syntax
  	 *
  	 */
  var odata: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies the delimiter for constructing paths , for hierarchical lookup of data
  	 *
  	 */
  var pathSeparator: js.UndefOr[String] = js.undefined
  /**
  	 * Key of the column containing unique identifiers for the data records.
  	 *
  	 */
  var primaryKey: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets sets ability to render checkboxes and use checkbox editor when dataType of a column is "bool". Checkboxes are not rendered for boolean values in columns with a [column template](ui.ighierarchicalgrid#options:columns.template).
  	 *
  	 */
  var renderCheckboxes: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after the whole grid widget has been rendered (including headers, footers, etc.).
  	 * This event is fired only when the grid is being initialized.
  	 * It will not be fired if the grid is rebound to its data
  	 * (for example, when calling the dataBind() API method
  	 * or when changing the page size (when paging is enabled)).
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Event fired before the grid starts rendering (all contents).
  	 * This event is fired only when the grid is being initialized.
  	 * It will not be fired if the grid is rebound to its data
  	 * (for example, when calling the dataBind() API method
  	 * or when changing the page size (when paging is enabled)).
  	 * Return false in order to cancel grid rendering.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  /**
  	 * Event fired if there is an error in the request, when the grid is doing a remote operation,
  	 * such as data binding, paging, sorting, etc.
  	 */
  var requestError: js.UndefOr[RequestErrorEvent] = js.undefined
  /**
  	 * Specifies the HTTP verb to be used to issue the requests to a remote data source.
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.undefined
  /**
  	 * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.undefined
  /**
  	 * See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey). This is the property in the responses where data records are held, if the response is wrapped.
  	 *
  	 */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
  	 * See [$.ig.DataSource responseTotalRecCountKey](ig.datasource#options:settings.responseTotalRecCountKey). Property in the response specifying the total number of records on the server.
  	 *
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  /**
  	 * If true, load on demand will be achieved using REST compliant resource access with appropriate url-s for
  	 * the ajax GET calls.
  	 *
  	 */
  var rest: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Settings related to REST compliant update routines.
  	 *
  	 */
  var restSettings: js.UndefOr[IgHierarchicalGridRestSettings] = js.undefined
  /**
  	 * Event which is fired when a hierarchical row has been collapsed
  	 */
  var rowCollapsed: js.UndefOr[RowCollapsedEvent] = js.undefined
  /**
  	 * Event which is fired when a hierarchical row is about to be collapsed
  	 */
  var rowCollapsing: js.UndefOr[RowCollapsingEvent] = js.undefined
  /**
  	 * Event which is fired after a hierarchical row has been expanded
  	 */
  var rowExpanded: js.UndefOr[RowExpandedEvent] = js.undefined
  /**
  	 * Event which is fired when a hierarchical row is about to be expanded
  	 */
  var rowExpanding: js.UndefOr[RowExpandingEvent] = js.undefined
  /**
  	 * Enables virtualization for rows only. [Here you can find more info about igGrid row virtualization](http://www.igniteui.com/help/iggrid-virtualization-overview)
  	 *
  	 */
  var rowVirtualization: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after data rows are rendered.
  	 */
  var rowsRendered: js.UndefOr[RowsRenderedEvent] = js.undefined
  /**
  	 * Event fired before actual data rows (TRs) are rendered.
  	 * Return false in order to cancel rows rendering.
  	 */
  var rowsRendering: js.UndefOr[RowsRenderingEvent] = js.undefined
  /**
  	 * Event fired after $.ig.DataSource schema has been generated, in case it needs to be modified.
  	 */
  var schemaGenerated: js.UndefOr[SchemaGeneratedEvent] = js.undefined
  /**
  	 * Settings related to content scrolling.
  	 *
  	 */
  var scrollSettings: js.UndefOr[IgHierarchicalGridScrollSettings] = js.undefined
  /**
  	 * If true, the transaction log will always be sent in the request for remote data, by the data source. Also this means that if there are values in the log, a POST will be performed instead of GET.
  	 *
  	 */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Controls the visibility of the grid footer.
  	 *
  	 */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Controls the visibility of the grid header.
  	 *
  	 */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Initial tabIndex attribute that will be set on all focusable elements.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * The templating engine that will be used to render the grid [column templates](ui.ighierarchicalgrid#options:columns.template). [Here you can find](http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/05/30/using-different-template-engines-with-ignite-ui-controls.aspx) how to use templating engines other than igTemplating and jsRender.
  	 *
  	 *
  	 * Valid values:
  	 * "infragistics" The grid will use the Infragistics Templating engine to render its [column templates](ui.ighierarchicalgrid#options:columns.template) and specific parts of the UI.
  	 * "jsRender" The grid will use jsRender to render its [column templates](ui.ighierarchicalgrid#options:columns.template) and specific parts of the UI.
  	 */
  var templatingEngine: js.UndefOr[String] = js.undefined
  /**
  	 * URL to which updating requests will be made.
  	 *
  	 */
  var updateUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Enables/disables column and row virtualization at the same time. Virtualization can greatly enhance rendering performance. If enabled, the number of actual rendered rows (DOM elements) will be constant and related to the visible viewport of the grid. As the end user scrolls, those DOM elements will be dynamically reused to render the new data. [Here you can find more info about the performance guidelines when using the igGrid](http://www.igniteui.com/help/iggrid-performance-guide)
  	 *
  	 */
  var virtualization: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines row virtualization mode.
  	 *
  	 *
  	 * Valid values:
  	 * "fixed" Renders only the visible rows and/or columns in the grid. On scrolling the same rows and/or columns are updated with new data from the data source. Only fixed virtualization can work with column virtualization at the same time. Fixed virtualization is not supported by some grid features: Resizing, Group By, Responsive.
  	 * "continuous" renders a pre-defined number of rows in the grid. On scrolling the continuous virtualization loads another portion of rows and disposes the current one.
  	 */
  var virtualizationMode: js.UndefOr[String] = js.undefined
  /**
  	 * Number of pixels to scroll the grid by, when virtualization is enabled, and mouse wheel scrolling is performed over the virtual grid area. If "null" the step will be equal to the [avgRowHeight](ui.ighierarchicalgrid#options:avgRowHeight).
  	 *
  	 */
  var virtualizationMouseWheelStep: js.UndefOr[Double] = js.undefined
  /**
  	 * Defines the grid width in pixels or percents. [Here you can find more info about setting igGrid width](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
  	 * "number" The widget width can be set in pixels as a number. Example values: 800, 700.
  	 * "null" will stretch to fit the sum of the columns widths.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgHierarchicalGrid {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igHierarchicalGrid
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    adjustVirtualHeights: js.UndefOr[Boolean] = js.undefined,
    aggregateTransactions: js.UndefOr[Boolean] = js.undefined,
    alternateRowStyles: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    autoFormat: String | Boolean = null,
    autoGenerateColumns: js.UndefOr[Boolean] = js.undefined,
    autoGenerateLayouts: js.UndefOr[Boolean] = js.undefined,
    autofitLastColumn: js.UndefOr[Boolean] = js.undefined,
    avgColumnWidth: String | Double = null,
    avgRowHeight: String | Double = null,
    caption: String = null,
    captionRendered: CaptionRenderedEvent = null,
    captionRendering: CaptionRenderingEvent = null,
    cellClick: CellClickEvent = null,
    cellRightClick: CellRightClickEvent = null,
    childGridCreated: ChildGridCreatedEvent = null,
    childGridCreating: ChildGridCreatingEvent = null,
    childGridRendered: ChildGridRenderedEvent = null,
    childrenPopulated: ChildrenPopulatedEvent = null,
    childrenPopulating: ChildrenPopulatingEvent = null,
    collapseTooltip: String = null,
    columnLayouts: js.Array[IgHierarchicalGridColumnLayout] = null,
    columnVirtualization: js.UndefOr[Boolean] = js.undefined,
    columns: js.Array[IgHierarchicalGridColumn] = null,
    columnsCollectionModified: ColumnsCollectionModifiedEvent = null,
    created: CreatedEvent = null,
    dataBinding: DataBindingEvent = null,
    dataBound: DataBoundEvent = null,
    dataRendered: DataRenderedEvent = null,
    dataRendering: DataRenderingEvent = null,
    dataSource: String | js.Array[_] | js.Object = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    defaultChildrenDataProperty: String = null,
    defaultColumnWidth: String | Double = null,
    destroyed: DestroyedEvent = null,
    enableHoverStyles: js.UndefOr[Boolean] = js.undefined,
    enableResizeContainerCheck: js.UndefOr[Boolean] = js.undefined,
    enableUTCDates: js.UndefOr[Boolean] = js.undefined,
    expandColWidth: Int | Double = null,
    expandCollapseAnimations: js.UndefOr[Boolean] = js.undefined,
    expandTooltip: String = null,
    featureChooserIconDisplay: String = null,
    features: js.Array[IgHierarchicalGridFeature] = null,
    fixedFooters: js.UndefOr[Boolean] = js.undefined,
    fixedHeaders: js.UndefOr[Boolean] = js.undefined,
    footerRendered: FooterRenderedEvent = null,
    footerRendering: FooterRenderingEvent = null,
    headerCellRendered: HeaderCellRenderedEvent = null,
    headerRendered: HeaderRenderedEvent = null,
    headerRendering: HeaderRenderingEvent = null,
    height: String | Double = null,
    initialDataBindDepth: Int | Double = null,
    initialExpandDepth: Int | Double = null,
    jsonpRequest: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    localSchemaTransform: js.UndefOr[Boolean] = js.undefined,
    locale: IgHierarchicalGridLocale = null,
    maxDataBindDepth: Int | Double = null,
    mergeUnboundColumns: js.UndefOr[Boolean] = js.undefined,
    odata: js.UndefOr[Boolean] = js.undefined,
    pathSeparator: String = null,
    primaryKey: String = null,
    regional: String | js.Object = null,
    renderCheckboxes: js.UndefOr[Boolean] = js.undefined,
    rendered: RenderedEvent = null,
    rendering: RenderingEvent = null,
    requestError: RequestErrorEvent = null,
    requestType: String = null,
    responseContentType: String = null,
    responseDataKey: String = null,
    responseTotalRecCountKey: String = null,
    rest: js.UndefOr[Boolean] = js.undefined,
    restSettings: IgHierarchicalGridRestSettings = null,
    rowCollapsed: RowCollapsedEvent = null,
    rowCollapsing: RowCollapsingEvent = null,
    rowExpanded: RowExpandedEvent = null,
    rowExpanding: RowExpandingEvent = null,
    rowVirtualization: js.UndefOr[Boolean] = js.undefined,
    rowsRendered: RowsRenderedEvent = null,
    rowsRendering: RowsRenderingEvent = null,
    schemaGenerated: SchemaGeneratedEvent = null,
    scrollSettings: IgHierarchicalGridScrollSettings = null,
    serializeTransactionLog: js.UndefOr[Boolean] = js.undefined,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    templatingEngine: String = null,
    updateUrl: String = null,
    virtualization: js.UndefOr[Boolean] = js.undefined,
    virtualizationMode: String = null,
    virtualizationMouseWheelStep: Int | Double = null,
    width: String | Double = null
  ): IgHierarchicalGrid = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(adjustVirtualHeights)) __obj.updateDynamic("adjustVirtualHeights")(adjustVirtualHeights)
    if (!js.isUndefined(aggregateTransactions)) __obj.updateDynamic("aggregateTransactions")(aggregateTransactions)
    if (!js.isUndefined(alternateRowStyles)) __obj.updateDynamic("alternateRowStyles")(alternateRowStyles)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight)
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (autoFormat != null) __obj.updateDynamic("autoFormat")(autoFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGenerateColumns)) __obj.updateDynamic("autoGenerateColumns")(autoGenerateColumns)
    if (!js.isUndefined(autoGenerateLayouts)) __obj.updateDynamic("autoGenerateLayouts")(autoGenerateLayouts)
    if (!js.isUndefined(autofitLastColumn)) __obj.updateDynamic("autofitLastColumn")(autofitLastColumn)
    if (avgColumnWidth != null) __obj.updateDynamic("avgColumnWidth")(avgColumnWidth.asInstanceOf[js.Any])
    if (avgRowHeight != null) __obj.updateDynamic("avgRowHeight")(avgRowHeight.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (captionRendered != null) __obj.updateDynamic("captionRendered")(captionRendered)
    if (captionRendering != null) __obj.updateDynamic("captionRendering")(captionRendering)
    if (cellClick != null) __obj.updateDynamic("cellClick")(cellClick)
    if (cellRightClick != null) __obj.updateDynamic("cellRightClick")(cellRightClick)
    if (childGridCreated != null) __obj.updateDynamic("childGridCreated")(childGridCreated)
    if (childGridCreating != null) __obj.updateDynamic("childGridCreating")(childGridCreating)
    if (childGridRendered != null) __obj.updateDynamic("childGridRendered")(childGridRendered)
    if (childrenPopulated != null) __obj.updateDynamic("childrenPopulated")(childrenPopulated)
    if (childrenPopulating != null) __obj.updateDynamic("childrenPopulating")(childrenPopulating)
    if (collapseTooltip != null) __obj.updateDynamic("collapseTooltip")(collapseTooltip)
    if (columnLayouts != null) __obj.updateDynamic("columnLayouts")(columnLayouts)
    if (!js.isUndefined(columnVirtualization)) __obj.updateDynamic("columnVirtualization")(columnVirtualization)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (columnsCollectionModified != null) __obj.updateDynamic("columnsCollectionModified")(columnsCollectionModified)
    if (created != null) __obj.updateDynamic("created")(created)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataRendered != null) __obj.updateDynamic("dataRendered")(dataRendered)
    if (dataRendering != null) __obj.updateDynamic("dataRendering")(dataRendering)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (defaultChildrenDataProperty != null) __obj.updateDynamic("defaultChildrenDataProperty")(defaultChildrenDataProperty)
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (destroyed != null) __obj.updateDynamic("destroyed")(destroyed)
    if (!js.isUndefined(enableHoverStyles)) __obj.updateDynamic("enableHoverStyles")(enableHoverStyles)
    if (!js.isUndefined(enableResizeContainerCheck)) __obj.updateDynamic("enableResizeContainerCheck")(enableResizeContainerCheck)
    if (!js.isUndefined(enableUTCDates)) __obj.updateDynamic("enableUTCDates")(enableUTCDates)
    if (expandColWidth != null) __obj.updateDynamic("expandColWidth")(expandColWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(expandCollapseAnimations)) __obj.updateDynamic("expandCollapseAnimations")(expandCollapseAnimations)
    if (expandTooltip != null) __obj.updateDynamic("expandTooltip")(expandTooltip)
    if (featureChooserIconDisplay != null) __obj.updateDynamic("featureChooserIconDisplay")(featureChooserIconDisplay)
    if (features != null) __obj.updateDynamic("features")(features)
    if (!js.isUndefined(fixedFooters)) __obj.updateDynamic("fixedFooters")(fixedFooters)
    if (!js.isUndefined(fixedHeaders)) __obj.updateDynamic("fixedHeaders")(fixedHeaders)
    if (footerRendered != null) __obj.updateDynamic("footerRendered")(footerRendered)
    if (footerRendering != null) __obj.updateDynamic("footerRendering")(footerRendering)
    if (headerCellRendered != null) __obj.updateDynamic("headerCellRendered")(headerCellRendered)
    if (headerRendered != null) __obj.updateDynamic("headerRendered")(headerRendered)
    if (headerRendering != null) __obj.updateDynamic("headerRendering")(headerRendering)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialDataBindDepth != null) __obj.updateDynamic("initialDataBindDepth")(initialDataBindDepth.asInstanceOf[js.Any])
    if (initialExpandDepth != null) __obj.updateDynamic("initialExpandDepth")(initialExpandDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonpRequest)) __obj.updateDynamic("jsonpRequest")(jsonpRequest)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(localSchemaTransform)) __obj.updateDynamic("localSchemaTransform")(localSchemaTransform)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDataBindDepth != null) __obj.updateDynamic("maxDataBindDepth")(maxDataBindDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeUnboundColumns)) __obj.updateDynamic("mergeUnboundColumns")(mergeUnboundColumns)
    if (!js.isUndefined(odata)) __obj.updateDynamic("odata")(odata)
    if (pathSeparator != null) __obj.updateDynamic("pathSeparator")(pathSeparator)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(renderCheckboxes)) __obj.updateDynamic("renderCheckboxes")(renderCheckboxes)
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (requestError != null) __obj.updateDynamic("requestError")(requestError)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType)
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey)
    if (!js.isUndefined(rest)) __obj.updateDynamic("rest")(rest)
    if (restSettings != null) __obj.updateDynamic("restSettings")(restSettings)
    if (rowCollapsed != null) __obj.updateDynamic("rowCollapsed")(rowCollapsed)
    if (rowCollapsing != null) __obj.updateDynamic("rowCollapsing")(rowCollapsing)
    if (rowExpanded != null) __obj.updateDynamic("rowExpanded")(rowExpanded)
    if (rowExpanding != null) __obj.updateDynamic("rowExpanding")(rowExpanding)
    if (!js.isUndefined(rowVirtualization)) __obj.updateDynamic("rowVirtualization")(rowVirtualization)
    if (rowsRendered != null) __obj.updateDynamic("rowsRendered")(rowsRendered)
    if (rowsRendering != null) __obj.updateDynamic("rowsRendering")(rowsRendering)
    if (schemaGenerated != null) __obj.updateDynamic("schemaGenerated")(schemaGenerated)
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings)
    if (!js.isUndefined(serializeTransactionLog)) __obj.updateDynamic("serializeTransactionLog")(serializeTransactionLog)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (templatingEngine != null) __obj.updateDynamic("templatingEngine")(templatingEngine)
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    if (!js.isUndefined(virtualization)) __obj.updateDynamic("virtualization")(virtualization)
    if (virtualizationMode != null) __obj.updateDynamic("virtualizationMode")(virtualizationMode)
    if (virtualizationMouseWheelStep != null) __obj.updateDynamic("virtualizationMouseWheelStep")(virtualizationMouseWheelStep.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGrid]
  }
}


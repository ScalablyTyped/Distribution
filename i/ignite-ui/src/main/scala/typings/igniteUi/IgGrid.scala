package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGrid
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * If this option is set to true, the height of the grid row will be calculated automatically based on the [avgRowHeight](ui.iggrid#options:avgRowHeight) and the visible virtual records. If no [avgRowHeight](ui.iggrid#options:avgRowHeight) is specified, it will be calculated automatically at runtime.
    *
    */
  var adjustVirtualHeights: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the following behavior will take place:
    * If a new row is added, and then deleted, there will be no transaction added to the log.
    * If a new row is added, edited, then deleted, there will be no transaction added to the log.
    * If several edits are made to a row or an individual cell, this should result in a single transaction.
    * Note: This option takes effect only when [autoCommit](ui.iggrid#options:autoCommit) is set to false.
    *
    */
  var aggregateTransactions: js.UndefOr[Boolean] = js.native
  /**
    * Enables/disables rendering of alternating row styles (odd and even rows receive different styling).
    *
    */
  var alternateRowStyles: js.UndefOr[Boolean] = js.native
  /**
    * If autoAdjustHeight is set to false, the [height](ui.iggrid#options:height) will be set only on the scrolling container, and all other UI elements such as paging footer / filter row / headers will add on top of that, so the total height of the grid will be more than this value - the height of the scroll container (content area) will not be dynamically calculated. Setting this option to false will usually result in a lot better initial rendering performance for large data sets ( > 1000 rows rendered at once, no [virtualization](ui.iggrid#options:virtualization) enabled), since no reflows will be made by browsers when accessing DOM properties such as offsetHeight.
    *
    */
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  /**
    * Automatically commits the transactions as rows/cells are being edited to the client data source. A [saveChanges](ui.iggrid#methods:saveChanges) call still needs to be performed in order to commit the transactions to a server-side data source.
    *
    */
  var autoCommit: js.UndefOr[Boolean] = js.native
  /**
    * Sets gets ability to automatically format text in cells for numeric, date and time columns. The format patterns and rules for numbers and dates are defined in $.ig.regional.defaults object. [Here column formatting is explained in details](http://www.igniteui.com/help/iggrid-columns-and-layout#column-formatting)
    *
    *
    * Valid values:
    * "date" formats only Date columns
    * "time" formats only Time columns
    * "number" formats only number columns
    * "dateandnumber" formats both Date and number columns
    * "true" formats Date and number columns
    * "false" auto formatting is disabled
    */
  var autoFormat: js.UndefOr[String | Boolean] = js.native
  /**
    * If no [columns](ui.iggrid#options:columns) collection is defined, and autoGenerateColumns is set to true, [columns](ui.iggrid#options:columns) will be inferred from the data source before the [dataRendering](ui.iggrid#events:dataRendering) event is fired. The inferred [columns](ui.iggrid#options:columns) collection will be available to the developer for modification at [dataRendering](ui.iggrid#events:dataRendering). If autoGenerateColumns is not explicitly set and [columns](ui.iggrid#options:columns) has at least one column defined then autoGenerateColumns is automatically set to false.
    * If autoGenerateColumns is true and there are columns defined auto-generated columns will render after the explicitly defined ones.
    * Since auto-generated columns don't have width defined consider setting [defaultColumnWidth](ui.iggrid#options:defaultColumnWidth) as well.
    *
    */
  var autoGenerateColumns: js.UndefOr[Boolean] = js.native
  /**
    * If set to true and all columns' widths are specified and their combined width is less than the grid width then the last column width will be automatically adjusted to fill the remaining empty space of the grid.
    *
    */
  var autofitLastColumn: js.UndefOr[Boolean] = js.native
  /**
    * Used for [column virtualization](ui.iggrid#options:columnVirtualization) in [fixed mode](ui.iggrid#options:virtualizationMode). This is the average value in pixels for a column width.
    *
    *
    * Valid values:
    * "string" The avarage column width can be set in pixels ("25px").
    * "number" The avarage column width can be set in pixels as a number (25).
    */
  var avgColumnWidth: js.UndefOr[String | Double] = js.native
  /**
    * Used for [row virtualization](ui.iggrid#options:rowVirtualization) in [fixed mode](ui.iggrid#options:virtualizationMode). This is the average value in pixels (default) that will be used to calculate how many rows to render as the end user scrolls. Also all rows' height will be automatically set to this value.
    *
    *
    * Valid values:
    * "string" The avarage row height can be set in pixels ("25px").
    * "number" The avarage row height can be set in pixels as a number (25).
    */
  var avgRowHeight: js.UndefOr[String | Double] = js.native
  /**
    * Caption text that will be shown above the grid header.
    *
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * Event fired after the caption has been rendered.
    */
  var captionRendered: js.UndefOr[CaptionRenderedEvent] = js.native
  /**
    * Event fired before the caption starts its rendering.
    * Return false in order to cancel caption rendering.
    */
  var captionRendering: js.UndefOr[CaptionRenderingEvent] = js.native
  /**
    * Event fired when a cell is clicked.
    */
  var cellClick: js.UndefOr[CellClickEvent] = js.native
  /**
    * Event fired when a cell is right clicked.
    */
  var cellRightClick: js.UndefOr[CellRightClickEvent] = js.native
  /**
    * Enables virtualization for columns only. Column virtualization can work only in combination with fixed row virtalization. Setting columnVirtualization to true will automatically set [virtualization](ui.iggrid#options:virtualization) to true and [virtualizationMode](ui.iggrid#options:virtualizationMode) to "fixed".
    *
    */
  var columnVirtualization: js.UndefOr[Boolean] = js.native
  /**
    * An array of column objects. Checkout the [Columns and Layout](http://www.igniteui.com/help/iggrid-columns-and-layout#defining-columns) topic for details on configuring the columns array.
    *
    */
  var columns: js.UndefOr[js.Array[IgGridColumn]] = js.native
  /**
    * Event fired after the columns colection has been modified(e.g. a column is hidden)
    */
  var columnsCollectionModified: js.UndefOr[ColumnsCollectionModifiedEvent] = js.native
  /**
    * Fired when the grid is created and the initial structure is rendered (this doesn't necessarily imply the data will be there if the data source is remote)
    */
  var created: js.UndefOr[CreatedEvent] = js.native
  /**
    * Event fired before data binding takes place.
    *
    * Return false in order to cancel data binding.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
    * Event fired after data binding is complete.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
    * Event fired after all of the data records in the grid table body have been rendered.
    */
  var dataRendered: js.UndefOr[DataRenderedEvent] = js.native
  /**
    * Event fired before the TBODY holding the data records starts its rendering.
    * Return false in order to cancel data records rendering.
    */
  var dataRendering: js.UndefOr[DataRenderingEvent] = js.native
  /**
    * Can be any valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an $.ig.DataSource itself
    *
    *
    * Valid values:
    * "array" dataSource as an array
    * "object" ddataSource as an object
    * "string" dataSource as a string
    */
  var dataSource: js.UndefOr[js.Array[_] | js.Object | String] = js.native
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type).
    *
    */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
    * Specifies a remote URL as a data source, from which data will be retrieved using the [$.ig.DataSource](ig.datasource).
    *
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
    * Default column width that will be set for all columns, that don't have [column width](ui.iggrid#options:columns.width) defined. Can also be set as '*', in which case the width auto-size based on the content of the column cells (including the header text).
    *
    *
    * Valid values:
    * "string" The default column width can be set in pixels ("100px") or as '*' in order to auto-size based on the cells and header content.
    * "number" The default column width can be set in pixels as a number (100).
    */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.native
  /**
    * Fired when the grid is destroyed
    */
  var destroyed: js.UndefOr[DestroyedEvent] = js.native
  /**
    * Enables/disables rendering of hover styles when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
    *
    */
  var enableHoverStyles: js.UndefOr[Boolean] = js.native
  /**
    * Enables/disables grid adjusting its dimensions when its [width](ui.iggrid#options:width) and/or [height](ui.iggrid#options:height) is set in percent (%) and grid parent DOM container is resized.
    *
    */
  var enableResizeContainerCheck: js.UndefOr[Boolean] = js.native
  /**
    * Enables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
    *
    */
  var enableUTCDates: js.UndefOr[Boolean] = js.native
  /**
    * Configures how the feature chooser icon should display on header cells - e.g. to display as gear icon or not.
    *
    *
    * Valid values:
    * "none" Always hide the feature chooser icon; The feature chooser is shown on tapping/clicking the column header.
    * "desktopOnly" Always show the icon on desktop but hide when touch device detected.
    * "always" Always show it in any environment. Chooser is shown when tapping the gear icon or column header.
    */
  var featureChooserIconDisplay: js.UndefOr[String] = js.native
  /**
    * List of grid feature definitions: sorting, paging, etc. Each feature goes with its separate options that are documented for the feature accordingly. [Here you can find detailed documentation for all igGrid features](http://www.igniteui.com/help/iggrid-features-landing-page)
    *
    */
  var features: js.UndefOr[js.Array[IgGridFeature]] = js.native
  /**
    * Footers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.iggrid#options:virtualization) is enabled, fixedFooters will always act as if it's true, no matter which value is set.
    *
    */
  var fixedFooters: js.UndefOr[Boolean] = js.native
  /**
    * Headers will be fixed if this option is set to true, and only the grid data will be scrollable. If [virtualization](ui.iggrid#options:virtualization) is enabled, fixedHeaders will always act as if it's true, no matter which value is set.
    *
    */
  var fixedHeaders: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after the footer has been rendered.
    */
  var footerRendered: js.UndefOr[FooterRenderedEvent] = js.native
  /**
    * Event fired before the footer starts its rendering.
    *
    * Return false in order to cancel footer rendering.
    */
  var footerRendering: js.UndefOr[FooterRenderingEvent] = js.native
  /**
    * Event fired after every TH in the grid header has been rendered.
    */
  var headerCellRendered: js.UndefOr[HeaderCellRenderedEvent] = js.native
  /**
    * Event fired after the header has been rendered.
    */
  var headerRendered: js.UndefOr[HeaderRenderedEvent] = js.native
  /**
    * Event fired before the header starts its rendering.
    * Return false in order to cancel header rendering.
    */
  var headerRendering: js.UndefOr[HeaderRenderingEvent] = js.native
  /**
    * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row - (if any), etc. [Here you can find more info about setting igGrid height](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number
    * "null" will stretch vertically to fit data.
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * When dataSource is a remote URL, defines whether to set the type of the remote data source to JSONP.
    *
    */
  var jsonpRequest: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * If this option is set to false, the data to which the grid is bound will be used "as is" with no additional transformations based on [columns](ui.iggrid#options:columns) defined. Otherwise only the subset of data properties used in the [columns](ui.iggrid#options:columns) defined will be extracted in a new object and used.
    *
    */
  var localSchemaTransform: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Merge unbound columns values inside data source when data source is remote. If true then the unbound columns are merged to the data source at runtime on the server. Note that data source is expanded with the new data and this could cause performance issues when the data is huge. If mergeUnboundColumns is false then the unbound data is sent and merged on the client. This option is used by the [igGrid MVC Helper](http://www.igniteui.com/help/iggrid-developing-asp-net-mvc-applications-with-iggrid).
    * Checkout [Populating Unbound Columns Remotely (igGrid)](http://www.igniteui.com/help/iggrid-unboundcolumns-populating-with-data-remotely) topic for more information.
    *
    */
  var mergeUnboundColumns: js.UndefOr[Boolean] = js.native
  /**
    * Key of the column containing unique identifiers for the data records.
    *
    */
  var primaryKey: js.UndefOr[String] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Gets sets ability to render checkboxes and use checkbox editor when dataType of a column is "bool". Checkboxes are not rendered for boolean values in columns with a [column template](ui.iggrid#options:columns.template).
    *
    */
  var renderCheckboxes: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after the whole grid widget has been rendered (including headers, footers, etc.).
    * This event is fired only when the grid is being initialized.
    * It will not be fired if the grid is rebound to its data
    * (for example, when calling the dataBind() API method
    * or when changing the page size (when paging is enabled)).
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
    * Event fired before the grid starts rendering (all contents).
    * This event is fired only when the grid is being initialized.
    * It will not be fired if the grid is rebound to its data
    * (for example, when calling the dataBind() API method
    * or when changing the page size (when paging is enabled)).
    * Return false in order to cancel grid rendering.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
    * Event fired if there is an error in the request, when the grid is doing a remote operation,
    * such as data binding, paging, sorting, etc.
    */
  var requestError: js.UndefOr[RequestErrorEvent] = js.native
  /**
    * Specifies the HTTP verb to be used to issue the requests to a remote data source.
    *
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
    *
    */
  var responseContentType: js.UndefOr[String] = js.native
  /**
    * See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey). This is the property in the responses where data records are held, if the response is wrapped.
    *
    */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
    * This option has been deprecated. See [$.ig.DataSource responseTotalRecCountKey](ig.datasource#options:settings.responseTotalRecCountKey). Property in the response specifying the total number of records on the server.
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
    * Settings related to REST compliant update routines.
    *
    */
  var restSettings: js.UndefOr[IgGridRestSettings] = js.native
  /**
    * Enables virtualization for rows only. [Here you can find more info about igGrid row virtualization](http://www.igniteui.com/help/iggrid-virtualization-overview)
    *
    */
  var rowVirtualization: js.UndefOr[Boolean] = js.native
  /**
    * Event fired after data rows are rendered.
    */
  var rowsRendered: js.UndefOr[RowsRenderedEvent] = js.native
  /**
    * Event fired before actual data rows (TRs) are rendered.
    * Return false in order to cancel rows rendering.
    */
  var rowsRendering: js.UndefOr[RowsRenderingEvent] = js.native
  /**
    * Event fired after $.ig.DataSource schema has been generated, in case it needs to be modified.
    */
  var schemaGenerated: js.UndefOr[SchemaGeneratedEvent] = js.native
  /**
    * Settings related to content scrolling.
    *
    */
  var scrollSettings: js.UndefOr[IgGridScrollSettings] = js.native
  /**
    * If true, the transaction log will always be sent in the request for remote data, by the data source. Also this means that if there are values in the log, a POST will be performed instead of GET.
    *
    */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.native
  /**
    * Controls the visibility of the grid footer.
    *
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
    * Controls the visibility of the grid header.
    *
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
    * Initial tabIndex attribute that will be set on all focusable elements.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * The templating engine that will be used to render the grid [column templates](ui.iggrid#options:columns.template). [Here you can find](http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/05/30/using-different-template-engines-with-ignite-ui-controls.aspx) how to use templating engines other than igTemplating and jsRender.
    *
    *
    * Valid values:
    * "infragistics" The grid will use the Infragistics Templating engine to render its [column templates](ui.iggrid#options:columns.template) and specific parts of the UI.
    * "jsRender" The grid will use jsRender to render its [column templates](ui.iggrid#options:columns.template) and specific parts of the UI.
    */
  var templatingEngine: js.UndefOr[String] = js.native
  /**
    * URL to which updating requests will be made.
    *
    */
  var updateUrl: js.UndefOr[String] = js.native
  /**
    * Enables/disables column and row virtualization at the same time. Virtualization can greatly enhance rendering performance. If enabled, the number of actual rendered rows (DOM elements) will be constant and related to the visible viewport of the grid. As the end user scrolls, those DOM elements will be dynamically reused to render the new data. [Here you can find more info about the performance guidelines when using the igGrid](http://www.igniteui.com/help/iggrid-performance-guide)
    *
    */
  var virtualization: js.UndefOr[Boolean] = js.native
  /**
    * Determines row virtualization mode.
    *
    *
    * Valid values:
    * "fixed" Renders only the visible rows and/or columns in the grid. On scrolling the same rows and/or columns are updated with new data from the data source. Only fixed virtualization can work with column virtualization at the same time. Fixed virtualization is not supported by some grid features: Resizing, Group By, Responsive.
    * "continuous" renders a pre-defined number of rows in the grid. On scrolling the continuous virtualization loads another portion of rows and disposes the current one.
    */
  var virtualizationMode: js.UndefOr[String] = js.native
  /**
    * Number of pixels to scroll the grid by, when virtualization is enabled, and mouse wheel scrolling is performed over the virtual grid area. If "null" the step will be equal to the [avgRowHeight](ui.iggrid#options:avgRowHeight).
    *
    */
  var virtualizationMouseWheelStep: js.UndefOr[Double] = js.native
  /**
    * Defines the grid width in pixels or percents. [Here you can find more info about setting igGrid width](http://www.igniteui.com/help/iggrid-columns-and-layout#width-height).
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
    * "number" The widget width can be set in pixels as a number. Example values: 800, 700.
    * "null" will stretch to fit the sum of the columns widths.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgGrid {
  @scala.inline
  def apply(): IgGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGrid]
  }
  @scala.inline
  implicit class IgGridOps[Self <: IgGrid] (val x: Self) extends AnyVal {
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
    def setAdjustVirtualHeights(value: Boolean): Self = this.set("adjustVirtualHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustVirtualHeights: Self = this.set("adjustVirtualHeights", js.undefined)
    @scala.inline
    def setAggregateTransactions(value: Boolean): Self = this.set("aggregateTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateTransactions: Self = this.set("aggregateTransactions", js.undefined)
    @scala.inline
    def setAlternateRowStyles(value: Boolean): Self = this.set("alternateRowStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateRowStyles: Self = this.set("alternateRowStyles", js.undefined)
    @scala.inline
    def setAutoAdjustHeight(value: Boolean): Self = this.set("autoAdjustHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAdjustHeight: Self = this.set("autoAdjustHeight", js.undefined)
    @scala.inline
    def setAutoCommit(value: Boolean): Self = this.set("autoCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCommit: Self = this.set("autoCommit", js.undefined)
    @scala.inline
    def setAutoFormat(value: String | Boolean): Self = this.set("autoFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFormat: Self = this.set("autoFormat", js.undefined)
    @scala.inline
    def setAutoGenerateColumns(value: Boolean): Self = this.set("autoGenerateColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGenerateColumns: Self = this.set("autoGenerateColumns", js.undefined)
    @scala.inline
    def setAutofitLastColumn(value: Boolean): Self = this.set("autofitLastColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofitLastColumn: Self = this.set("autofitLastColumn", js.undefined)
    @scala.inline
    def setAvgColumnWidth(value: String | Double): Self = this.set("avgColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvgColumnWidth: Self = this.set("avgColumnWidth", js.undefined)
    @scala.inline
    def setAvgRowHeight(value: String | Double): Self = this.set("avgRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvgRowHeight: Self = this.set("avgRowHeight", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setCaptionRendered(value: (/* event */ Event, /* ui */ CaptionRenderedEventUIParam) => Unit): Self = this.set("captionRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCaptionRendered: Self = this.set("captionRendered", js.undefined)
    @scala.inline
    def setCaptionRendering(value: (/* event */ Event, /* ui */ CaptionRenderingEventUIParam) => Unit): Self = this.set("captionRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCaptionRendering: Self = this.set("captionRendering", js.undefined)
    @scala.inline
    def setCellClick(value: (/* event */ Event, /* ui */ CellClickEventUIParam) => Unit): Self = this.set("cellClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    @scala.inline
    def setCellRightClick(value: (/* event */ Event, /* ui */ CellRightClickEventUIParam) => Unit): Self = this.set("cellRightClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellRightClick: Self = this.set("cellRightClick", js.undefined)
    @scala.inline
    def setColumnVirtualization(value: Boolean): Self = this.set("columnVirtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnVirtualization: Self = this.set("columnVirtualization", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: IgGridColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[IgGridColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumnsCollectionModified(value: (/* event */ Event, /* ui */ ColumnsCollectionModifiedEventUIParam) => Unit): Self = this.set("columnsCollectionModified", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnsCollectionModified: Self = this.set("columnsCollectionModified", js.undefined)
    @scala.inline
    def setCreated(value: (/* event */ Event, /* ui */ CreatedEventUIParam) => Unit): Self = this.set("created", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = this.set("dataBinding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = this.set("dataBound", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataRendered(value: (/* event */ Event, /* ui */ DataRenderedEventUIParam) => Unit): Self = this.set("dataRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataRendered: Self = this.set("dataRendered", js.undefined)
    @scala.inline
    def setDataRendering(value: (/* event */ Event, /* ui */ DataRenderingEventUIParam) => Unit): Self = this.set("dataRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataRendering: Self = this.set("dataRendering", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | js.Object | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
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
    def setDefaultColumnWidth(value: String | Double): Self = this.set("defaultColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColumnWidth: Self = this.set("defaultColumnWidth", js.undefined)
    @scala.inline
    def setDestroyed(value: (/* event */ Event, /* ui */ DestroyedEventUIParam) => Unit): Self = this.set("destroyed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDestroyed: Self = this.set("destroyed", js.undefined)
    @scala.inline
    def setEnableHoverStyles(value: Boolean): Self = this.set("enableHoverStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHoverStyles: Self = this.set("enableHoverStyles", js.undefined)
    @scala.inline
    def setEnableResizeContainerCheck(value: Boolean): Self = this.set("enableResizeContainerCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResizeContainerCheck: Self = this.set("enableResizeContainerCheck", js.undefined)
    @scala.inline
    def setEnableUTCDates(value: Boolean): Self = this.set("enableUTCDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUTCDates: Self = this.set("enableUTCDates", js.undefined)
    @scala.inline
    def setFeatureChooserIconDisplay(value: String): Self = this.set("featureChooserIconDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserIconDisplay: Self = this.set("featureChooserIconDisplay", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: IgGridFeature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[IgGridFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setFixedFooters(value: Boolean): Self = this.set("fixedFooters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedFooters: Self = this.set("fixedFooters", js.undefined)
    @scala.inline
    def setFixedHeaders(value: Boolean): Self = this.set("fixedHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedHeaders: Self = this.set("fixedHeaders", js.undefined)
    @scala.inline
    def setFooterRendered(value: (/* event */ Event, /* ui */ FooterRenderedEventUIParam) => Unit): Self = this.set("footerRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFooterRendered: Self = this.set("footerRendered", js.undefined)
    @scala.inline
    def setFooterRendering(value: (/* event */ Event, /* ui */ FooterRenderingEventUIParam) => Unit): Self = this.set("footerRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFooterRendering: Self = this.set("footerRendering", js.undefined)
    @scala.inline
    def setHeaderCellRendered(value: (/* event */ Event, /* ui */ HeaderCellRenderedEventUIParam) => Unit): Self = this.set("headerCellRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHeaderCellRendered: Self = this.set("headerCellRendered", js.undefined)
    @scala.inline
    def setHeaderRendered(value: (/* event */ Event, /* ui */ HeaderRenderedEventUIParam) => Unit): Self = this.set("headerRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHeaderRendered: Self = this.set("headerRendered", js.undefined)
    @scala.inline
    def setHeaderRendering(value: (/* event */ Event, /* ui */ HeaderRenderingEventUIParam) => Unit): Self = this.set("headerRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHeaderRendering: Self = this.set("headerRendering", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setJsonpRequest(value: Boolean): Self = this.set("jsonpRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonpRequest: Self = this.set("jsonpRequest", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocalSchemaTransform(value: Boolean): Self = this.set("localSchemaTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSchemaTransform: Self = this.set("localSchemaTransform", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMergeUnboundColumns(value: Boolean): Self = this.set("mergeUnboundColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeUnboundColumns: Self = this.set("mergeUnboundColumns", js.undefined)
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRenderCheckboxes(value: Boolean): Self = this.set("renderCheckboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderCheckboxes: Self = this.set("renderCheckboxes", js.undefined)
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = this.set("rendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendering: Self = this.set("rendering", js.undefined)
    @scala.inline
    def setRequestError(value: (/* event */ Event, /* ui */ RequestErrorEventUIParam) => Unit): Self = this.set("requestError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRequestError: Self = this.set("requestError", js.undefined)
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
    def setResponseTotalRecCountKey(value: String): Self = this.set("responseTotalRecCountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTotalRecCountKey: Self = this.set("responseTotalRecCountKey", js.undefined)
    @scala.inline
    def setRestSettings(value: IgGridRestSettings): Self = this.set("restSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSettings: Self = this.set("restSettings", js.undefined)
    @scala.inline
    def setRowVirtualization(value: Boolean): Self = this.set("rowVirtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowVirtualization: Self = this.set("rowVirtualization", js.undefined)
    @scala.inline
    def setRowsRendered(value: (/* event */ Event, /* ui */ RowsRenderedEventUIParam) => Unit): Self = this.set("rowsRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowsRendered: Self = this.set("rowsRendered", js.undefined)
    @scala.inline
    def setRowsRendering(value: (/* event */ Event, /* ui */ RowsRenderingEventUIParam) => Unit): Self = this.set("rowsRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowsRendering: Self = this.set("rowsRendering", js.undefined)
    @scala.inline
    def setSchemaGenerated(value: (/* event */ Event, /* ui */ SchemaGeneratedEventUIParam) => Unit): Self = this.set("schemaGenerated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSchemaGenerated: Self = this.set("schemaGenerated", js.undefined)
    @scala.inline
    def setScrollSettings(value: IgGridScrollSettings): Self = this.set("scrollSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSettings: Self = this.set("scrollSettings", js.undefined)
    @scala.inline
    def setSerializeTransactionLog(value: Boolean): Self = this.set("serializeTransactionLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializeTransactionLog: Self = this.set("serializeTransactionLog", js.undefined)
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTemplatingEngine(value: String): Self = this.set("templatingEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplatingEngine: Self = this.set("templatingEngine", js.undefined)
    @scala.inline
    def setUpdateUrl(value: String): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
    @scala.inline
    def setVirtualization(value: Boolean): Self = this.set("virtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualization: Self = this.set("virtualization", js.undefined)
    @scala.inline
    def setVirtualizationMode(value: String): Self = this.set("virtualizationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationMode: Self = this.set("virtualizationMode", js.undefined)
    @scala.inline
    def setVirtualizationMouseWheelStep(value: Double): Self = this.set("virtualizationMouseWheelStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationMouseWheelStep: Self = this.set("virtualizationMouseWheelStep", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


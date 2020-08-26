package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridFiltering
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Defines whether to render editors in advanced [mode](ui.iggridfiltering#options:mode). If false, no editors will be rendered in the advanced [mode](ui.iggridfiltering#options:mode).
    *
    */
  var advancedModeEditorsVisible: js.UndefOr[Boolean] = js.native
  /**
    * Location of the advanced filtering button when [advancedModeEditorsVisible](ui.iggridfiltering#options:advancedModeEditorsVisible) is false (i.e. when the button is rendered in the header).
    *
    *
    * Valid values:
    * "left"
    * "right"
    */
  var advancedModeHeaderButtonLocation: js.UndefOr[String] = js.native
  /**
    * Enables or disables the filtering case sensitivity. Works only for local filtering. If true, it case sensitive filtering is performed. If false, filtering is case insensitive.
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * A list of column settings that specifies custom filtering options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridFilteringColumnSetting]] = js.native
  /**
    * Event fired after the filtering has been executed and results are rendered.
    */
  var dataFiltered: js.UndefOr[DataFilteredEvent] = js.native
  /**
    * Event fired before a filtering operation is executed (remote request or local).
    * Return false in order to cancel filtering operation.
    */
  var dataFiltering: js.UndefOr[DataFilteringEvent] = js.native
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
    * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don"t match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don"t match filtering conditions
    *
    */
  var displayMode: js.UndefOr[js.Any] = js.native
  /**
    * Event fired after a filter column dropdown is completely closed.
    */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.native
  /**
    * Event fired before the filter dropdown starts closing.
    * Return false in order to cancel dropdown closing.
    */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.native
  /**
    * Event fired after the filter dropdown is opened for a specific column.
    */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.native
  /**
    * Event fired before the filter dropdown is opened for a specific column.
    * Return false in order to cancel dropdown opening.
    */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter is shown and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserText](ui.iggridfiltering#options:locale.featureChooserText).
    */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter [mode](ui.iggridfiltering#options:mode) is advanced. Use option [locale.featureChooserTextAdvancedFilter](ui.iggridfiltering#options:locale.featureChooserTextAdvancedFilter).
    */
  var featureChooserTextAdvancedFilter: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Feature chooser text when filter is hidden and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserTextHide](ui.iggridfiltering#options:locale.featureChooserTextHide).
    */
  var featureChooserTextHide: js.UndefOr[String] = js.native
  /**
    * The filtering button for filter dropdowns can be rendered either on the left of the filter editor, or on the right.
    *
    *
    * Valid values:
    * "left" The button is rendered on the left.
    * "right" The button is rendered on the right.
    */
  var filterButtonLocation: js.UndefOr[String] = js.native
  /**
    * Time in milliseconds for which widget will wait between keystrokes before sending filtering requests.
    *
    */
  var filterDelay: js.UndefOr[Double] = js.native
  /**
    * Add button width - in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The dialog Add button width in pixels (100px).
    * "number" The dialog Add button width in pixels as a number (100).
    */
  var filterDialogAddButtonWidth: js.UndefOr[String | Double] = js.native
  /**
    * Custom template for options in dropdown in add condition area in the filter dialog. The default template is "<option value='${value}'>${text}</option>"
    * and it is used when [filterDialogAddConditionTemplate](ui.iggridfiltering#options:filterDialogAddConditionTemplate) is applied
    *
    */
  var filterDialogAddConditionDropDownTemplate: js.UndefOr[String] = js.native
  /**
    * Custom template for add condition area in the filter dialog. The default template is "<div><span>${label1}</span><div><input></input></div><span>${label2}</span></div>".
    *
    */
  var filterDialogAddConditionTemplate: js.UndefOr[String] = js.native
  /**
    * Event fired after the advanced filter dialog has been closed.
    */
  var filterDialogClosed: js.UndefOr[FilterDialogClosedEvent] = js.native
  /**
    * Event fired before the advanced filter dialog is closed.
    * Return false in order to cancel filtering dialog closing.
    */
  var filterDialogClosing: js.UndefOr[FilterDialogClosingEvent] = js.native
  /**
    * Width of the column chooser dropdowns in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The column chooser dropdowns width in pixels (80px).
    * "number" The column chooser dropdowns width in pixels  as a number (80).
    */
  var filterDialogColumnDropDownDefaultWidth: js.UndefOr[String | Double] = js.native
  /**
    * Controls containment behavior.
    *
    * owner  The filter dialog will be draggable only within the grid area.
    * window  The filter dialog will be draggable within the whole window area.
    */
  var filterDialogContainment: js.UndefOr[String] = js.native
  /**
    * Event fired after the contents of the advanced filter dialog are rendered.
    */
  var filterDialogContentsRendered: js.UndefOr[FilterDialogContentsRenderedEvent] = js.native
  /**
    * Event fired before the contents of the advanced filter dialog are rendered.
    * Return false in order to cancel filtering dialog rendering.
    */
  var filterDialogContentsRendering: js.UndefOr[FilterDialogContentsRenderingEvent] = js.native
  /**
    * Width of the filtering expression input boxes in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The filtering expression input boxes width in pixels (80px).
    * "number" The filtering expression input boxes width in pixels as a number (80).
    */
  var filterDialogExprInputDefaultWidth: js.UndefOr[String | Double] = js.native
  /**
    * Event fired after a filter row is added to the advanced filter dialog.
    */
  var filterDialogFilterAdded: js.UndefOr[FilterDialogFilterAddedEvent] = js.native
  /**
    * Event fired before a filter row is added to the advanced filter dialog.
    * Return false in order to cancel filter adding to the advanced filtering dialog.
    */
  var filterDialogFilterAdding: js.UndefOr[FilterDialogFilterAddingEvent] = js.native
  /**
    * Custom template for options in condition list in filter dialog. The default template is "<option value='${condition}'>${text}</option>"
    * and it is used for custimizing DOM elemenent with attribute "data-af-cond".
    *
    */
  var filterDialogFilterConditionTemplate: js.UndefOr[String] = js.native
  /**
    * Width of the filtering condition dropdowns in the advanced filter dialog.
    *
    *
    * Valid values:
    * "string" The filtering condition dropdowns width in pixels (80px).
    * "number" The filtering condition dropdowns width in pixels as a number (80).
    */
  var filterDialogFilterDropDownDefaultWidth: js.UndefOr[String | Double] = js.native
  /**
    * Custom template for filter dialog.
    * Each DOM element which is used for selecting filter conditions/columns/filter expressions has "data-*" attribute.
    * E.g.: DOM element used for selecting column has attribute "data-af-col", for selecting filter condition - "data-af-cond", for filter expression- "data-af-expr".
    * NOTE: The template is supported only with <tr />.
    * The default template is "<tr data-af-row><td><input data-af-col/></td><td><input data-af-cond/></td><td><input data-af-expr /> </td><td><span data-af-rmv></span></td></tr>".
    *
    */
  var filterDialogFilterTemplate: js.UndefOr[String] = js.native
  /**
    * Event fired when the OK button in the advanced filter dialog is pressed.
    */
  var filterDialogFiltering: js.UndefOr[FilterDialogFilteringEvent] = js.native
  /**
    * default filter dialog height (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
    *
    *
    * Valid values:
    * "string" The dialog window height in pixels (350px).
    * "number" The dialog window height in pixels as a number (350).
    */
  var filterDialogHeight: js.UndefOr[String | Double] = js.native
  /**
    * Maximum number of filter rows in the advanced filtering dialog. If this number is exceeded, an error message will be rendered.
    *
    */
  var filterDialogMaxFilterCount: js.UndefOr[Double] = js.native
  /**
    * Event fired every time the advanced filter dialog changes its position.
    */
  var filterDialogMoving: js.UndefOr[FilterDialogMovingEvent] = js.native
  /**
    * Width of the Ok and Cancel buttons in the advanced filtering dialogs.
    *
    *
    * Valid values:
    * "string" The advanced filter dialog Ok and Cancel buttons width in pixels (120px).
    * "number" The advanced filter dialog Ok and Cancel buttons width in pixels as a number (120).
    */
  var filterDialogOkCancelButtonWidth: js.UndefOr[String | Double] = js.native
  /**
    * Event fired after the advanced filter dialog is already opened.
    */
  var filterDialogOpened: js.UndefOr[FilterDialogOpenedEvent] = js.native
  /**
    * Event fired before the advanced filtering dialog is opened.
    * Return false in order to cancel filter dialog opening.
    */
  var filterDialogOpening: js.UndefOr[FilterDialogOpeningEvent] = js.native
  /**
    * Default filter dialog width (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
    *
    *
    * Valid values:
    * "string" The dialog window width in pixels (500px).
    * "number" The dialog window width in pixels as a number (500).
    */
  var filterDialogWidth: js.UndefOr[String | Double] = js.native
  /**
    * Animation duration in milliseconds for the [filterDropDownAnimations](ui.iggridfiltering#options:filterDropDownAnimations).
    *
    */
  var filterDropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Type of animations for the column filter dropdowns.
    *
    *
    * Valid values:
    * "linear" The column filtering drop downs are shown with a linear animation.
    * "none" No animation is used when showing the filtering drop downs.
    */
  var filterDropDownAnimations: js.UndefOr[String] = js.native
  /**
    * Height of the column filter dropdowns.
    *
    * string  The height of the column filter dropdowns in pixels (0px).
    * number  The height of the column filter dropdowns in pixels as a number (0).
    */
  var filterDropDownHeight: js.UndefOr[js.Any] = js.native
  /**
    * Enable/disable filter icons visibility.
    *
    *
    * Valid values:
    * "true" All predefined filters in the filter dropdowns will have icons rendered in front of the text.
    * "false" No icons will be rendered.
    */
  var filterDropDownItemIcons: js.UndefOr[Boolean] = js.native
  /**
    * Width of the column filter dropdowns.
    *
    *
    * Valid values:
    * "string" The width in pixels (0px)
    * "number" The width in pixels as a number (0)
    */
  var filterDropDownWidth: js.UndefOr[String | Double] = js.native
  /**
    * URL key name that specifies how the filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
    *
    */
  var filterExprUrlKey: js.UndefOr[String] = js.native
  /**
    * Enable/disable footer visibility with summary info about the filter.
    * When false, the filter summary row (in the footer) will only be visible when paging is enabled (or some other feature that renders a footer).
    * When true, the filter summary row will only be visible when a filter is applied i.e. it's not visible by default.
    *
    */
  var filterSummaryAlwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Template that is used when filtering is applied and paging is enabled and user goes to another page. It takes precedence over the pagerRecordsLabelTemplate(option from igTreeGridPaging). If it is set to null then it is taken option from igTreeGridPaging.
    * Supported options:
    * ${currentPageMatches} (filtering)
    * ${totalMatches} (filtering)
    * ${startRecord} (paging)
    * ${endRecord} (paging)
    * ${recordCount} (paging)
    * Use option [locale.collapseTooltipText](ui.igtreegrid#options:locale.collapseTooltipText).
    */
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Summary template that will appear in the bottom left corner of the footer. Has the format '${matches} matching records'. Use option [locale.filterSummaryTemplate](ui.iggridfiltering#options:locale.filterSummaryTemplate).
    */
  var filterSummaryTemplate: js.UndefOr[String] = js.native
  /**
    * Specifies from which data bound level to be applied filtering - 0 is the first level
    *
    */
  var fromLevel: js.UndefOr[Double] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * A list of configurable and localized labels that are used for the predefined filtering conditions in the filter dropdowns. Use option [locale](ui.iggridfiltering#options:locale).
    */
  var labels: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgTreeGridFilteringLocale] = js.native
  /**
    * Specifies the name of a boolean property in the dataRecord object that indicates whether the dataRow matches the filtering conditions.
    * When filtering a boolean flag  with the specified name is added on each data record object with a value of true if it matches the condition or false if it doesn"t.
    * This is used mainly for internal purposes.
    *
    */
  var matchFiltering: js.UndefOr[String] = js.native
  /**
    * Default is 'simple' for non-virtualized grids, and 'advanced' when [virtualization](ui.iggrid#options:virtualization) is enabled.
    *
    *
    * Valid values:
    * "simple" Renders just a filter row.
    * "advanced" Allows to configure multiple filters from a dialog - Excel style.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * List of configurable and localized null texts that will be used for the filter editors. Use option [locale](ui.iggridfiltering#options:locale).
    */
  var nullTexts: js.UndefOr[String] = js.native
  /**
    * Enables/disables filtering persistence between states.
    *
    */
  var persist: js.UndefOr[Boolean] = js.native
  /**
    * The property in the response that will hold the total number of records in the data source
    *
    */
  var recordCountKey: js.UndefOr[String] = js.native
  /**
    * Render in [Feature Chooser](http://www.igniteui.com/help/iggrid-feature-chooser)
    *
    */
  var renderFC: js.UndefOr[Boolean] = js.native
  /**
    * Enable/disable filter button visibility. If false, no filter dropdown buttons will be rendered and a predefined list of filters will not be rendered for the columns.
    *
    */
  var renderFilterButton: js.UndefOr[Boolean] = js.native
  /**
    * Enable/disable empty condition visibility in the filter. If true, shows empty and not empty filtering conditions in the dropdowns.
    *
    */
  var showEmptyConditions: js.UndefOr[Boolean] = js.native
  /**
    * Enable/disable visibility of null and not null filtering conditions in the dropdowns. If true, shows null and not null filtering conditions in the dropdowns.
    *
    */
  var showNullConditions: js.UndefOr[Boolean] = js.native
  /**
    * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
    *
    */
  var toLevel: js.UndefOr[Double] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Custom tooltip template for the filter button, when a filter is applied. Use option [locale.tooltipTemplate](ui.iggridfiltering#options:locale.tooltipTemplate).
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
    * Type of filtering. Delegates all filtering functionality to the [$.ig.DataSource](ig.datasource).
    *
    *
    * Valid values:
    * "remote" Filtering is performed by a remote end-point.
    * "local" Filtering is performed locally by the [$.ig.DataSource](ig.datasource).
    */
  var `type`: js.UndefOr[String] = js.native
}

object IgTreeGridFiltering {
  @scala.inline
  def apply(): IgTreeGridFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridFiltering]
  }
  @scala.inline
  implicit class IgTreeGridFilteringOps[Self <: IgTreeGridFiltering] (val x: Self) extends AnyVal {
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
    def setAdvancedModeEditorsVisible(value: Boolean): Self = this.set("advancedModeEditorsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedModeEditorsVisible: Self = this.set("advancedModeEditorsVisible", js.undefined)
    @scala.inline
    def setAdvancedModeHeaderButtonLocation(value: String): Self = this.set("advancedModeHeaderButtonLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedModeHeaderButtonLocation: Self = this.set("advancedModeHeaderButtonLocation", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridFilteringColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridFilteringColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setDataFiltered(value: (/* event */ Event, /* ui */ DataFilteredEventUIParam) => Unit): Self = this.set("dataFiltered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataFiltered: Self = this.set("dataFiltered", js.undefined)
    @scala.inline
    def setDataFiltering(value: (/* event */ Event, /* ui */ DataFilteringEventUIParam) => Unit): Self = this.set("dataFiltering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataFiltering: Self = this.set("dataFiltering", js.undefined)
    @scala.inline
    def setDialogWidget(value: String): Self = this.set("dialogWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogWidget: Self = this.set("dialogWidget", js.undefined)
    @scala.inline
    def setDisplayMode(value: js.Any): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = this.set("dropDownClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownClosed: Self = this.set("dropDownClosed", js.undefined)
    @scala.inline
    def setDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = this.set("dropDownClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownClosing: Self = this.set("dropDownClosing", js.undefined)
    @scala.inline
    def setDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = this.set("dropDownOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownOpened: Self = this.set("dropDownOpened", js.undefined)
    @scala.inline
    def setDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = this.set("dropDownOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownOpening: Self = this.set("dropDownOpening", js.undefined)
    @scala.inline
    def setFeatureChooserText(value: String): Self = this.set("featureChooserText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserText: Self = this.set("featureChooserText", js.undefined)
    @scala.inline
    def setFeatureChooserTextAdvancedFilter(value: String): Self = this.set("featureChooserTextAdvancedFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextAdvancedFilter: Self = this.set("featureChooserTextAdvancedFilter", js.undefined)
    @scala.inline
    def setFeatureChooserTextHide(value: String): Self = this.set("featureChooserTextHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextHide: Self = this.set("featureChooserTextHide", js.undefined)
    @scala.inline
    def setFilterButtonLocation(value: String): Self = this.set("filterButtonLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterButtonLocation: Self = this.set("filterButtonLocation", js.undefined)
    @scala.inline
    def setFilterDelay(value: Double): Self = this.set("filterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDelay: Self = this.set("filterDelay", js.undefined)
    @scala.inline
    def setFilterDialogAddButtonWidth(value: String | Double): Self = this.set("filterDialogAddButtonWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogAddButtonWidth: Self = this.set("filterDialogAddButtonWidth", js.undefined)
    @scala.inline
    def setFilterDialogAddConditionDropDownTemplate(value: String): Self = this.set("filterDialogAddConditionDropDownTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogAddConditionDropDownTemplate: Self = this.set("filterDialogAddConditionDropDownTemplate", js.undefined)
    @scala.inline
    def setFilterDialogAddConditionTemplate(value: String): Self = this.set("filterDialogAddConditionTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogAddConditionTemplate: Self = this.set("filterDialogAddConditionTemplate", js.undefined)
    @scala.inline
    def setFilterDialogClosed(value: (/* event */ Event, /* ui */ FilterDialogClosedEventUIParam) => Unit): Self = this.set("filterDialogClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogClosed: Self = this.set("filterDialogClosed", js.undefined)
    @scala.inline
    def setFilterDialogClosing(value: (/* event */ Event, /* ui */ FilterDialogClosingEventUIParam) => Unit): Self = this.set("filterDialogClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogClosing: Self = this.set("filterDialogClosing", js.undefined)
    @scala.inline
    def setFilterDialogColumnDropDownDefaultWidth(value: String | Double): Self = this.set("filterDialogColumnDropDownDefaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogColumnDropDownDefaultWidth: Self = this.set("filterDialogColumnDropDownDefaultWidth", js.undefined)
    @scala.inline
    def setFilterDialogContainment(value: String): Self = this.set("filterDialogContainment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogContainment: Self = this.set("filterDialogContainment", js.undefined)
    @scala.inline
    def setFilterDialogContentsRendered(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderedEventUIParam) => Unit): Self = this.set("filterDialogContentsRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogContentsRendered: Self = this.set("filterDialogContentsRendered", js.undefined)
    @scala.inline
    def setFilterDialogContentsRendering(value: (/* event */ Event, /* ui */ FilterDialogContentsRenderingEventUIParam) => Unit): Self = this.set("filterDialogContentsRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogContentsRendering: Self = this.set("filterDialogContentsRendering", js.undefined)
    @scala.inline
    def setFilterDialogExprInputDefaultWidth(value: String | Double): Self = this.set("filterDialogExprInputDefaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogExprInputDefaultWidth: Self = this.set("filterDialogExprInputDefaultWidth", js.undefined)
    @scala.inline
    def setFilterDialogFilterAdded(value: (/* event */ Event, /* ui */ FilterDialogFilterAddedEventUIParam) => Unit): Self = this.set("filterDialogFilterAdded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogFilterAdded: Self = this.set("filterDialogFilterAdded", js.undefined)
    @scala.inline
    def setFilterDialogFilterAdding(value: (/* event */ Event, /* ui */ FilterDialogFilterAddingEventUIParam) => Unit): Self = this.set("filterDialogFilterAdding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogFilterAdding: Self = this.set("filterDialogFilterAdding", js.undefined)
    @scala.inline
    def setFilterDialogFilterConditionTemplate(value: String): Self = this.set("filterDialogFilterConditionTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogFilterConditionTemplate: Self = this.set("filterDialogFilterConditionTemplate", js.undefined)
    @scala.inline
    def setFilterDialogFilterDropDownDefaultWidth(value: String | Double): Self = this.set("filterDialogFilterDropDownDefaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogFilterDropDownDefaultWidth: Self = this.set("filterDialogFilterDropDownDefaultWidth", js.undefined)
    @scala.inline
    def setFilterDialogFilterTemplate(value: String): Self = this.set("filterDialogFilterTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogFilterTemplate: Self = this.set("filterDialogFilterTemplate", js.undefined)
    @scala.inline
    def setFilterDialogFiltering(value: (/* event */ Event, /* ui */ FilterDialogFilteringEventUIParam) => Unit): Self = this.set("filterDialogFiltering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogFiltering: Self = this.set("filterDialogFiltering", js.undefined)
    @scala.inline
    def setFilterDialogHeight(value: String | Double): Self = this.set("filterDialogHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogHeight: Self = this.set("filterDialogHeight", js.undefined)
    @scala.inline
    def setFilterDialogMaxFilterCount(value: Double): Self = this.set("filterDialogMaxFilterCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogMaxFilterCount: Self = this.set("filterDialogMaxFilterCount", js.undefined)
    @scala.inline
    def setFilterDialogMoving(value: (/* event */ Event, /* ui */ FilterDialogMovingEventUIParam) => Unit): Self = this.set("filterDialogMoving", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogMoving: Self = this.set("filterDialogMoving", js.undefined)
    @scala.inline
    def setFilterDialogOkCancelButtonWidth(value: String | Double): Self = this.set("filterDialogOkCancelButtonWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogOkCancelButtonWidth: Self = this.set("filterDialogOkCancelButtonWidth", js.undefined)
    @scala.inline
    def setFilterDialogOpened(value: (/* event */ Event, /* ui */ FilterDialogOpenedEventUIParam) => Unit): Self = this.set("filterDialogOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogOpened: Self = this.set("filterDialogOpened", js.undefined)
    @scala.inline
    def setFilterDialogOpening(value: (/* event */ Event, /* ui */ FilterDialogOpeningEventUIParam) => Unit): Self = this.set("filterDialogOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterDialogOpening: Self = this.set("filterDialogOpening", js.undefined)
    @scala.inline
    def setFilterDialogWidth(value: String | Double): Self = this.set("filterDialogWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDialogWidth: Self = this.set("filterDialogWidth", js.undefined)
    @scala.inline
    def setFilterDropDownAnimationDuration(value: Double): Self = this.set("filterDropDownAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropDownAnimationDuration: Self = this.set("filterDropDownAnimationDuration", js.undefined)
    @scala.inline
    def setFilterDropDownAnimations(value: String): Self = this.set("filterDropDownAnimations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropDownAnimations: Self = this.set("filterDropDownAnimations", js.undefined)
    @scala.inline
    def setFilterDropDownHeight(value: js.Any): Self = this.set("filterDropDownHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropDownHeight: Self = this.set("filterDropDownHeight", js.undefined)
    @scala.inline
    def setFilterDropDownItemIcons(value: Boolean): Self = this.set("filterDropDownItemIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropDownItemIcons: Self = this.set("filterDropDownItemIcons", js.undefined)
    @scala.inline
    def setFilterDropDownWidth(value: String | Double): Self = this.set("filterDropDownWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropDownWidth: Self = this.set("filterDropDownWidth", js.undefined)
    @scala.inline
    def setFilterExprUrlKey(value: String): Self = this.set("filterExprUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterExprUrlKey: Self = this.set("filterExprUrlKey", js.undefined)
    @scala.inline
    def setFilterSummaryAlwaysVisible(value: Boolean): Self = this.set("filterSummaryAlwaysVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSummaryAlwaysVisible: Self = this.set("filterSummaryAlwaysVisible", js.undefined)
    @scala.inline
    def setFilterSummaryInPagerTemplate(value: String): Self = this.set("filterSummaryInPagerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSummaryInPagerTemplate: Self = this.set("filterSummaryInPagerTemplate", js.undefined)
    @scala.inline
    def setFilterSummaryTemplate(value: String): Self = this.set("filterSummaryTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSummaryTemplate: Self = this.set("filterSummaryTemplate", js.undefined)
    @scala.inline
    def setFromLevel(value: Double): Self = this.set("fromLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromLevel: Self = this.set("fromLevel", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLocale(value: IgTreeGridFilteringLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMatchFiltering(value: String): Self = this.set("matchFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchFiltering: Self = this.set("matchFiltering", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNullTexts(value: String): Self = this.set("nullTexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullTexts: Self = this.set("nullTexts", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setRecordCountKey(value: String): Self = this.set("recordCountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordCountKey: Self = this.set("recordCountKey", js.undefined)
    @scala.inline
    def setRenderFC(value: Boolean): Self = this.set("renderFC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderFC: Self = this.set("renderFC", js.undefined)
    @scala.inline
    def setRenderFilterButton(value: Boolean): Self = this.set("renderFilterButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderFilterButton: Self = this.set("renderFilterButton", js.undefined)
    @scala.inline
    def setShowEmptyConditions(value: Boolean): Self = this.set("showEmptyConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEmptyConditions: Self = this.set("showEmptyConditions", js.undefined)
    @scala.inline
    def setShowNullConditions(value: Boolean): Self = this.set("showNullConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNullConditions: Self = this.set("showNullConditions", js.undefined)
    @scala.inline
    def setToLevel(value: Double): Self = this.set("toLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToLevel: Self = this.set("toLevel", js.undefined)
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


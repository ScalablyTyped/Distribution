package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridFiltering
  extends /**
	 * Option for igTreeGridFiltering
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Defines whether to render editors in advanced [mode](ui.iggridfiltering#options:mode). If false, no editors will be rendered in the advanced [mode](ui.iggridfiltering#options:mode).
  	 *
  	 */
  var advancedModeEditorsVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Location of the advanced filtering button when [advancedModeEditorsVisible](ui.iggridfiltering#options:advancedModeEditorsVisible) is false (i.e. when the button is rendered in the header).
  	 *
  	 *
  	 * Valid values:
  	 * "left"
  	 * "right"
  	 */
  var advancedModeHeaderButtonLocation: js.UndefOr[String] = js.undefined
  /**
  	 * Enables or disables the filtering case sensitivity. Works only for local filtering. If true, it case sensitive filtering is performed. If false, filtering is case insensitive.
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A list of column settings that specifies custom filtering options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridFilteringColumnSetting]] = js.undefined
  /**
  	 * Event fired after the filtering has been executed and results are rendered.
  	 */
  var dataFiltered: js.UndefOr[DataFilteredEvent] = js.undefined
  /**
  	 * Event fired before a filtering operation is executed (remote request or local).
  	 * Return false in order to cancel filtering operation.
  	 */
  var dataFiltering: js.UndefOr[DataFilteringEvent] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.undefined
  /**
  	 * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don"t match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don"t match filtering conditions
  	 *
  	 */
  var displayMode: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event fired after a filter column dropdown is completely closed.
  	 */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.undefined
  /**
  	 * Event fired before the filter dropdown starts closing.
  	 * Return false in order to cancel dropdown closing.
  	 */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.undefined
  /**
  	 * Event fired after the filter dropdown is opened for a specific column.
  	 */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.undefined
  /**
  	 * Event fired before the filter dropdown is opened for a specific column.
  	 * Return false in order to cancel dropdown opening.
  	 */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Feature chooser text when filter is shown and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserText](ui.iggridfiltering#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Feature chooser text when filter [mode](ui.iggridfiltering#options:mode) is advanced. Use option [locale.featureChooserTextAdvancedFilter](ui.iggridfiltering#options:locale.featureChooserTextAdvancedFilter).
  	 */
  var featureChooserTextAdvancedFilter: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Feature chooser text when filter is hidden and filter [mode](ui.iggridfiltering#options:mode) is simple. Use option [locale.featureChooserTextHide](ui.iggridfiltering#options:locale.featureChooserTextHide).
  	 */
  var featureChooserTextHide: js.UndefOr[String] = js.undefined
  /**
  	 * The filtering button for filter dropdowns can be rendered either on the left of the filter editor, or on the right.
  	 *
  	 *
  	 * Valid values:
  	 * "left" The button is rendered on the left.
  	 * "right" The button is rendered on the right.
  	 */
  var filterButtonLocation: js.UndefOr[String] = js.undefined
  /**
  	 * Time in milliseconds for which widget will wait between keystrokes before sending filtering requests.
  	 *
  	 */
  var filterDelay: js.UndefOr[Double] = js.undefined
  /**
  	 * Add button width - in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog Add button width in pixels (100px).
  	 * "number" The dialog Add button width in pixels as a number (100).
  	 */
  var filterDialogAddButtonWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Custom template for options in dropdown in add condition area in the filter dialog. The default template is "<option value='${value}'>${text}</option>"
  	 * and it is used when [filterDialogAddConditionTemplate](ui.iggridfiltering#options:filterDialogAddConditionTemplate) is applied
  	 *
  	 */
  var filterDialogAddConditionDropDownTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Custom template for add condition area in the filter dialog. The default template is "<div><span>${label1}</span><div><input></input></div><span>${label2}</span></div>".
  	 *
  	 */
  var filterDialogAddConditionTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the advanced filter dialog has been closed.
  	 */
  var filterDialogClosed: js.UndefOr[FilterDialogClosedEvent] = js.undefined
  /**
  	 * Event fired before the advanced filter dialog is closed.
  	 * Return false in order to cancel filtering dialog closing.
  	 */
  var filterDialogClosing: js.UndefOr[FilterDialogClosingEvent] = js.undefined
  /**
  	 * Width of the column chooser dropdowns in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The column chooser dropdowns width in pixels (80px).
  	 * "number" The column chooser dropdowns width in pixels  as a number (80).
  	 */
  var filterDialogColumnDropDownDefaultWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Controls containment behavior.
  	 *
  	 * owner  The filter dialog will be draggable only within the grid area.
  	 * window  The filter dialog will be draggable within the whole window area.
  	 */
  var filterDialogContainment: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the contents of the advanced filter dialog are rendered.
  	 */
  var filterDialogContentsRendered: js.UndefOr[FilterDialogContentsRenderedEvent] = js.undefined
  /**
  	 * Event fired before the contents of the advanced filter dialog are rendered.
  	 * Return false in order to cancel filtering dialog rendering.
  	 */
  var filterDialogContentsRendering: js.UndefOr[FilterDialogContentsRenderingEvent] = js.undefined
  /**
  	 * Width of the filtering expression input boxes in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The filtering expression input boxes width in pixels (80px).
  	 * "number" The filtering expression input boxes width in pixels as a number (80).
  	 */
  var filterDialogExprInputDefaultWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Event fired after a filter row is added to the advanced filter dialog.
  	 */
  var filterDialogFilterAdded: js.UndefOr[FilterDialogFilterAddedEvent] = js.undefined
  /**
  	 * Event fired before a filter row is added to the advanced filter dialog.
  	 * Return false in order to cancel filter adding to the advanced filtering dialog.
  	 */
  var filterDialogFilterAdding: js.UndefOr[FilterDialogFilterAddingEvent] = js.undefined
  /**
  	 * Custom template for options in condition list in filter dialog. The default template is "<option value='${condition}'>${text}</option>"
  	 * and it is used for custimizing DOM elemenent with attribute "data-af-cond".
  	 *
  	 */
  var filterDialogFilterConditionTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Width of the filtering condition dropdowns in the advanced filter dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The filtering condition dropdowns width in pixels (80px).
  	 * "number" The filtering condition dropdowns width in pixels as a number (80).
  	 */
  var filterDialogFilterDropDownDefaultWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Custom template for filter dialog.
  	 * Each DOM element which is used for selecting filter conditions/columns/filter expressions has "data-*" attribute.
  	 * E.g.: DOM element used for selecting column has attribute "data-af-col", for selecting filter condition - "data-af-cond", for filter expression- "data-af-expr".
  	 * NOTE: The template is supported only with <tr />.
  	 * The default template is "<tr data-af-row><td><input data-af-col/></td><td><input data-af-cond/></td><td><input data-af-expr /> </td><td><span data-af-rmv></span></td></tr>".
  	 *
  	 */
  var filterDialogFilterTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired when the OK button in the advanced filter dialog is pressed.
  	 */
  var filterDialogFiltering: js.UndefOr[FilterDialogFilteringEvent] = js.undefined
  /**
  	 * default filter dialog height (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window height in pixels (350px).
  	 * "number" The dialog window height in pixels as a number (350).
  	 */
  var filterDialogHeight: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Maximum number of filter rows in the advanced filtering dialog. If this number is exceeded, an error message will be rendered.
  	 *
  	 */
  var filterDialogMaxFilterCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Event fired every time the advanced filter dialog changes its position.
  	 */
  var filterDialogMoving: js.UndefOr[FilterDialogMovingEvent] = js.undefined
  /**
  	 * Width of the Ok and Cancel buttons in the advanced filtering dialogs.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The advanced filter dialog Ok and Cancel buttons width in pixels (120px).
  	 * "number" The advanced filter dialog Ok and Cancel buttons width in pixels as a number (120).
  	 */
  var filterDialogOkCancelButtonWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Event fired after the advanced filter dialog is already opened.
  	 */
  var filterDialogOpened: js.UndefOr[FilterDialogOpenedEvent] = js.undefined
  /**
  	 * Event fired before the advanced filtering dialog is opened.
  	 * Return false in order to cancel filter dialog opening.
  	 */
  var filterDialogOpening: js.UndefOr[FilterDialogOpeningEvent] = js.undefined
  /**
  	 * Default filter dialog width (used for Advanced filtering [mode](ui.iggridfiltering#options:mode)).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window width in pixels (500px).
  	 * "number" The dialog window width in pixels as a number (500).
  	 */
  var filterDialogWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Animation duration in milliseconds for the [filterDropDownAnimations](ui.iggridfiltering#options:filterDropDownAnimations).
  	 *
  	 */
  var filterDropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Type of animations for the column filter dropdowns.
  	 *
  	 *
  	 * Valid values:
  	 * "linear" The column filtering drop downs are shown with a linear animation.
  	 * "none" No animation is used when showing the filtering drop downs.
  	 */
  var filterDropDownAnimations: js.UndefOr[String] = js.undefined
  /**
  	 * Height of the column filter dropdowns.
  	 *
  	 * string  The height of the column filter dropdowns in pixels (0px).
  	 * number  The height of the column filter dropdowns in pixels as a number (0).
  	 */
  var filterDropDownHeight: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Enable/disable filter icons visibility.
  	 *
  	 *
  	 * Valid values:
  	 * "true" All predefined filters in the filter dropdowns will have icons rendered in front of the text.
  	 * "false" No icons will be rendered.
  	 */
  var filterDropDownItemIcons: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Width of the column filter dropdowns.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width in pixels (0px)
  	 * "number" The width in pixels as a number (0)
  	 */
  var filterDropDownWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * URL key name that specifies how the filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
  	 *
  	 */
  var filterExprUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * Enable/disable footer visibility with summary info about the filter.
  	 * When false, the filter summary row (in the footer) will only be visible when paging is enabled (or some other feature that renders a footer).
  	 * When true, the filter summary row will only be visible when a filter is applied i.e. it's not visible by default.
  	 *
  	 */
  var filterSummaryAlwaysVisible: js.UndefOr[Boolean] = js.undefined
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
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Summary template that will appear in the bottom left corner of the footer. Has the format '${matches} matching records'. Use option [locale.filterSummaryTemplate](ui.iggridfiltering#options:locale.filterSummaryTemplate).
  	 */
  var filterSummaryTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies from which data bound level to be applied filtering - 0 is the first level
  	 *
  	 */
  var fromLevel: js.UndefOr[Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * A list of configurable and localized labels that are used for the predefined filtering conditions in the filter dropdowns. Use option [locale](ui.iggridfiltering#options:locale).
  	 */
  var labels: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgTreeGridFilteringLocale] = js.undefined
  /**
  	 * Specifies the name of a boolean property in the dataRecord object that indicates whether the dataRow matches the filtering conditions.
  	 * When filtering a boolean flag  with the specified name is added on each data record object with a value of true if it matches the condition or false if it doesn"t.
  	 * This is used mainly for internal purposes.
  	 *
  	 */
  var matchFiltering: js.UndefOr[String] = js.undefined
  /**
  	 * Default is 'simple' for non-virtualized grids, and 'advanced' when [virtualization](ui.iggrid#options:virtualization) is enabled.
  	 *
  	 *
  	 * Valid values:
  	 * "simple" Renders just a filter row.
  	 * "advanced" Allows to configure multiple filters from a dialog - Excel style.
  	 */
  var mode: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * List of configurable and localized null texts that will be used for the filter editors. Use option [locale](ui.iggridfiltering#options:locale).
  	 */
  var nullTexts: js.UndefOr[String] = js.undefined
  /**
  	 * Enables/disables filtering persistence between states.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The property in the response that will hold the total number of records in the data source
  	 *
  	 */
  var recordCountKey: js.UndefOr[String] = js.undefined
  /**
  	 * Render in [Feature Chooser](http://www.igniteui.com/help/iggrid-feature-chooser)
  	 *
  	 */
  var renderFC: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable/disable filter button visibility. If false, no filter dropdown buttons will be rendered and a predefined list of filters will not be rendered for the columns.
  	 *
  	 */
  var renderFilterButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable/disable empty condition visibility in the filter. If true, shows empty and not empty filtering conditions in the dropdowns.
  	 *
  	 */
  var showEmptyConditions: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable/disable visibility of null and not null filtering conditions in the dropdowns. If true, shows null and not null filtering conditions in the dropdowns.
  	 *
  	 */
  var showNullConditions: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
  	 *
  	 */
  var toLevel: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom tooltip template for the filter button, when a filter is applied. Use option [locale.tooltipTemplate](ui.iggridfiltering#options:locale.tooltipTemplate).
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Type of filtering. Delegates all filtering functionality to the [$.ig.DataSource](ig.datasource).
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Filtering is performed by a remote end-point.
  	 * "local" Filtering is performed locally by the [$.ig.DataSource](ig.datasource).
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object IgTreeGridFiltering {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridFiltering
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    advancedModeEditorsVisible: js.UndefOr[Boolean] = js.undefined,
    advancedModeHeaderButtonLocation: String = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    columnSettings: js.Array[IgGridFilteringColumnSetting] = null,
    dataFiltered: (/* event */ Event, /* ui */ DataFilteredEventUIParam) => Unit = null,
    dataFiltering: (/* event */ Event, /* ui */ DataFilteringEventUIParam) => Unit = null,
    dialogWidget: String = null,
    displayMode: js.Any = null,
    dropDownClosed: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit = null,
    dropDownClosing: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit = null,
    dropDownOpened: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit = null,
    dropDownOpening: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit = null,
    featureChooserText: String = null,
    featureChooserTextAdvancedFilter: String = null,
    featureChooserTextHide: String = null,
    filterButtonLocation: String = null,
    filterDelay: Int | Double = null,
    filterDialogAddButtonWidth: String | Double = null,
    filterDialogAddConditionDropDownTemplate: String = null,
    filterDialogAddConditionTemplate: String = null,
    filterDialogClosed: (/* event */ Event, /* ui */ FilterDialogClosedEventUIParam) => Unit = null,
    filterDialogClosing: (/* event */ Event, /* ui */ FilterDialogClosingEventUIParam) => Unit = null,
    filterDialogColumnDropDownDefaultWidth: String | Double = null,
    filterDialogContainment: String = null,
    filterDialogContentsRendered: (/* event */ Event, /* ui */ FilterDialogContentsRenderedEventUIParam) => Unit = null,
    filterDialogContentsRendering: (/* event */ Event, /* ui */ FilterDialogContentsRenderingEventUIParam) => Unit = null,
    filterDialogExprInputDefaultWidth: String | Double = null,
    filterDialogFilterAdded: (/* event */ Event, /* ui */ FilterDialogFilterAddedEventUIParam) => Unit = null,
    filterDialogFilterAdding: (/* event */ Event, /* ui */ FilterDialogFilterAddingEventUIParam) => Unit = null,
    filterDialogFilterConditionTemplate: String = null,
    filterDialogFilterDropDownDefaultWidth: String | Double = null,
    filterDialogFilterTemplate: String = null,
    filterDialogFiltering: (/* event */ Event, /* ui */ FilterDialogFilteringEventUIParam) => Unit = null,
    filterDialogHeight: String | Double = null,
    filterDialogMaxFilterCount: Int | Double = null,
    filterDialogMoving: (/* event */ Event, /* ui */ FilterDialogMovingEventUIParam) => Unit = null,
    filterDialogOkCancelButtonWidth: String | Double = null,
    filterDialogOpened: (/* event */ Event, /* ui */ FilterDialogOpenedEventUIParam) => Unit = null,
    filterDialogOpening: (/* event */ Event, /* ui */ FilterDialogOpeningEventUIParam) => Unit = null,
    filterDialogWidth: String | Double = null,
    filterDropDownAnimationDuration: Int | Double = null,
    filterDropDownAnimations: String = null,
    filterDropDownHeight: js.Any = null,
    filterDropDownItemIcons: js.UndefOr[Boolean] = js.undefined,
    filterDropDownWidth: String | Double = null,
    filterExprUrlKey: String = null,
    filterSummaryAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    filterSummaryInPagerTemplate: String = null,
    filterSummaryTemplate: String = null,
    fromLevel: Int | Double = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    labels: String = null,
    locale: IgTreeGridFilteringLocale = null,
    matchFiltering: String = null,
    mode: String = null,
    nullTexts: String = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    recordCountKey: String = null,
    renderFC: js.UndefOr[Boolean] = js.undefined,
    renderFilterButton: js.UndefOr[Boolean] = js.undefined,
    showEmptyConditions: js.UndefOr[Boolean] = js.undefined,
    showNullConditions: js.UndefOr[Boolean] = js.undefined,
    toLevel: Int | Double = null,
    tooltipTemplate: String = null,
    `type`: String = null
  ): IgTreeGridFiltering = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(advancedModeEditorsVisible)) __obj.updateDynamic("advancedModeEditorsVisible")(advancedModeEditorsVisible.asInstanceOf[js.Any])
    if (advancedModeHeaderButtonLocation != null) __obj.updateDynamic("advancedModeHeaderButtonLocation")(advancedModeHeaderButtonLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2(dataFiltered))
    if (dataFiltering != null) __obj.updateDynamic("dataFiltering")(js.Any.fromFunction2(dataFiltering))
    if (dialogWidget != null) __obj.updateDynamic("dialogWidget")(dialogWidget.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (dropDownClosed != null) __obj.updateDynamic("dropDownClosed")(js.Any.fromFunction2(dropDownClosed))
    if (dropDownClosing != null) __obj.updateDynamic("dropDownClosing")(js.Any.fromFunction2(dropDownClosing))
    if (dropDownOpened != null) __obj.updateDynamic("dropDownOpened")(js.Any.fromFunction2(dropDownOpened))
    if (dropDownOpening != null) __obj.updateDynamic("dropDownOpening")(js.Any.fromFunction2(dropDownOpening))
    if (featureChooserText != null) __obj.updateDynamic("featureChooserText")(featureChooserText.asInstanceOf[js.Any])
    if (featureChooserTextAdvancedFilter != null) __obj.updateDynamic("featureChooserTextAdvancedFilter")(featureChooserTextAdvancedFilter.asInstanceOf[js.Any])
    if (featureChooserTextHide != null) __obj.updateDynamic("featureChooserTextHide")(featureChooserTextHide.asInstanceOf[js.Any])
    if (filterButtonLocation != null) __obj.updateDynamic("filterButtonLocation")(filterButtonLocation.asInstanceOf[js.Any])
    if (filterDelay != null) __obj.updateDynamic("filterDelay")(filterDelay.asInstanceOf[js.Any])
    if (filterDialogAddButtonWidth != null) __obj.updateDynamic("filterDialogAddButtonWidth")(filterDialogAddButtonWidth.asInstanceOf[js.Any])
    if (filterDialogAddConditionDropDownTemplate != null) __obj.updateDynamic("filterDialogAddConditionDropDownTemplate")(filterDialogAddConditionDropDownTemplate.asInstanceOf[js.Any])
    if (filterDialogAddConditionTemplate != null) __obj.updateDynamic("filterDialogAddConditionTemplate")(filterDialogAddConditionTemplate.asInstanceOf[js.Any])
    if (filterDialogClosed != null) __obj.updateDynamic("filterDialogClosed")(js.Any.fromFunction2(filterDialogClosed))
    if (filterDialogClosing != null) __obj.updateDynamic("filterDialogClosing")(js.Any.fromFunction2(filterDialogClosing))
    if (filterDialogColumnDropDownDefaultWidth != null) __obj.updateDynamic("filterDialogColumnDropDownDefaultWidth")(filterDialogColumnDropDownDefaultWidth.asInstanceOf[js.Any])
    if (filterDialogContainment != null) __obj.updateDynamic("filterDialogContainment")(filterDialogContainment.asInstanceOf[js.Any])
    if (filterDialogContentsRendered != null) __obj.updateDynamic("filterDialogContentsRendered")(js.Any.fromFunction2(filterDialogContentsRendered))
    if (filterDialogContentsRendering != null) __obj.updateDynamic("filterDialogContentsRendering")(js.Any.fromFunction2(filterDialogContentsRendering))
    if (filterDialogExprInputDefaultWidth != null) __obj.updateDynamic("filterDialogExprInputDefaultWidth")(filterDialogExprInputDefaultWidth.asInstanceOf[js.Any])
    if (filterDialogFilterAdded != null) __obj.updateDynamic("filterDialogFilterAdded")(js.Any.fromFunction2(filterDialogFilterAdded))
    if (filterDialogFilterAdding != null) __obj.updateDynamic("filterDialogFilterAdding")(js.Any.fromFunction2(filterDialogFilterAdding))
    if (filterDialogFilterConditionTemplate != null) __obj.updateDynamic("filterDialogFilterConditionTemplate")(filterDialogFilterConditionTemplate.asInstanceOf[js.Any])
    if (filterDialogFilterDropDownDefaultWidth != null) __obj.updateDynamic("filterDialogFilterDropDownDefaultWidth")(filterDialogFilterDropDownDefaultWidth.asInstanceOf[js.Any])
    if (filterDialogFilterTemplate != null) __obj.updateDynamic("filterDialogFilterTemplate")(filterDialogFilterTemplate.asInstanceOf[js.Any])
    if (filterDialogFiltering != null) __obj.updateDynamic("filterDialogFiltering")(js.Any.fromFunction2(filterDialogFiltering))
    if (filterDialogHeight != null) __obj.updateDynamic("filterDialogHeight")(filterDialogHeight.asInstanceOf[js.Any])
    if (filterDialogMaxFilterCount != null) __obj.updateDynamic("filterDialogMaxFilterCount")(filterDialogMaxFilterCount.asInstanceOf[js.Any])
    if (filterDialogMoving != null) __obj.updateDynamic("filterDialogMoving")(js.Any.fromFunction2(filterDialogMoving))
    if (filterDialogOkCancelButtonWidth != null) __obj.updateDynamic("filterDialogOkCancelButtonWidth")(filterDialogOkCancelButtonWidth.asInstanceOf[js.Any])
    if (filterDialogOpened != null) __obj.updateDynamic("filterDialogOpened")(js.Any.fromFunction2(filterDialogOpened))
    if (filterDialogOpening != null) __obj.updateDynamic("filterDialogOpening")(js.Any.fromFunction2(filterDialogOpening))
    if (filterDialogWidth != null) __obj.updateDynamic("filterDialogWidth")(filterDialogWidth.asInstanceOf[js.Any])
    if (filterDropDownAnimationDuration != null) __obj.updateDynamic("filterDropDownAnimationDuration")(filterDropDownAnimationDuration.asInstanceOf[js.Any])
    if (filterDropDownAnimations != null) __obj.updateDynamic("filterDropDownAnimations")(filterDropDownAnimations.asInstanceOf[js.Any])
    if (filterDropDownHeight != null) __obj.updateDynamic("filterDropDownHeight")(filterDropDownHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropDownItemIcons)) __obj.updateDynamic("filterDropDownItemIcons")(filterDropDownItemIcons.asInstanceOf[js.Any])
    if (filterDropDownWidth != null) __obj.updateDynamic("filterDropDownWidth")(filterDropDownWidth.asInstanceOf[js.Any])
    if (filterExprUrlKey != null) __obj.updateDynamic("filterExprUrlKey")(filterExprUrlKey.asInstanceOf[js.Any])
    if (!js.isUndefined(filterSummaryAlwaysVisible)) __obj.updateDynamic("filterSummaryAlwaysVisible")(filterSummaryAlwaysVisible.asInstanceOf[js.Any])
    if (filterSummaryInPagerTemplate != null) __obj.updateDynamic("filterSummaryInPagerTemplate")(filterSummaryInPagerTemplate.asInstanceOf[js.Any])
    if (filterSummaryTemplate != null) __obj.updateDynamic("filterSummaryTemplate")(filterSummaryTemplate.asInstanceOf[js.Any])
    if (fromLevel != null) __obj.updateDynamic("fromLevel")(fromLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (matchFiltering != null) __obj.updateDynamic("matchFiltering")(matchFiltering.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nullTexts != null) __obj.updateDynamic("nullTexts")(nullTexts.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (recordCountKey != null) __obj.updateDynamic("recordCountKey")(recordCountKey.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFC)) __obj.updateDynamic("renderFC")(renderFC.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFilterButton)) __obj.updateDynamic("renderFilterButton")(renderFilterButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmptyConditions)) __obj.updateDynamic("showEmptyConditions")(showEmptyConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(showNullConditions)) __obj.updateDynamic("showNullConditions")(showNullConditions.asInstanceOf[js.Any])
    if (toLevel != null) __obj.updateDynamic("toLevel")(toLevel.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridFiltering]
  }
}


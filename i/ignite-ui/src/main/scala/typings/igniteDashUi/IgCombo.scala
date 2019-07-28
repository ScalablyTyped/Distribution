package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgCombo
  extends /**
	 * Option for igCombo
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If set to true:
  	 * 1. Allows custom value input only with single selection.
  	 * 2. Custom values will be auto completed to the closest value if [autoComplete](ui.igcombo#options:autoComplete) is enabled.
  	 *
  	 */
  var allowCustomValue: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets hide drop-down list animation duration in milliseconds.
  	 *
  	 */
  var animationHideDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets show drop-down list animation duration in milliseconds.
  	 *
  	 */
  var animationShowDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets ability to autocomplete field from first matching item in list.
  	 * Note: When autoComplete option is enabled, then "startsWith" is used for [filteringCondition](ui.igcombo#options:filteringCondition).
  	 *
  	 */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the first matching item should be auto selected when typing in input. When [multiSelection](ui.igcombo#options:multiSelection) is enabled this option will instead put the active item on the matching element.
  	 *
  	 */
  var autoSelectFirstMatch: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If set to true, filtering and auto selection will be case-sensitive.
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets title for html element which represent clear button.
  	 * Use option [locale.clearButtonTitle](ui.igcombo#options:locale.clearButtonTitle).
  	 */
  var clearButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets ability to close drop-down list when control loses focus.
  	 *
  	 */
  var closeDropDownOnBlur: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets sets ability to close drop-down list when single item in the list is selected with mouse click or enter press. The default value when [multiSelection](ui.igcombo#options:multiSelection) is enabled will be false. This option will not close the drop down when [multiSelection](ui.igcombo#options:multiSelection) is enabled and additive selection is performed.
  	 *
  	 */
  var closeDropDownOnSelect: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event which is raised before data binding is performed.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to igCombo performing the databinding.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is to be databound to.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  /**
  	 * Event which is raised after data binding is complete.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo performing the data binding.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 * Use ui.success to see if the databinding was performed correctly.
  	 * Use ui.errorMessage to get the error message if the databinding failed.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  /**
  	 * Gets/Sets a valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an [$.ig.DataSource](ig.datasource) itself.
  	 * Note: if it is set to string and [dataSourceType](ui.igcombo#options:dataSourceType) option is not set, then [$.ig.JSONDataSource](ig.jsondatasource) is used.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Sets data source type (such as "json", "xml", etc). Please refer to the documentation of [$.ig.DataSource](ig.datasource) and its [type](ig.datasource#options:settings.type) property.
  	 *
  	 */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
  	 * Sets URL which is used for sending JSON on request for remote filtering (MVC for example). That option is required when [load on demand](ui.igcombo#options:loadOnDemandSettings) is
  	 * [enabled](ui.igcombo#options:loadOnDemandSettings.enabled) and its [type](ui.igcombo#options:filteringType) is remote.
  	 *
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the delay duration before processing the changes in the input. Useful to boost performance by lowering the count of selection, filtering, auto complete and highlighting operations executed on each input change.
  	 *
  	 */
  var delayInputChangeProcessing: js.UndefOr[Double] = js.undefined
  /**
  	 * If set to true, the container of the drop-down list is appended to the body.
  	 * If set to false, it is appended to the parent element of the combo.
  	 *
  	 */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets title for html element which represent the drop-down button.
  	 * Use option [locale.dropDownButtonTitle](ui.igcombo#options:locale.dropDownButtonTitle).
  	 */
  var dropDownButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised after drop-down list was closed.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use evt.originalEvent to obtain reference to event of browser.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.undefined
  /**
  	 * Event which is raised before drop-down list is closed.
  	 *
  	 * Return false in order to cancel hide action.
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.undefined
  /**
  	 * Gets/Sets ability to show the drop-down list when the combo is in focus. This option has effect only if the combo is in editable [mode](ui.igcombo#options:mode).
  	 *
  	 */
  var dropDownOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event which is raised after drop-down list was opened.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.undefined
  /**
  	 * Event which is raised before drop-down list is opened.
  	 *
  	 * Return false in order to cancel drop-down action.
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
  	 */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.undefined
  /**
  	 * Gets/Sets drop-down list orientation when open button is clicked.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" if there is enough space, it positions the drop-down list below the combo input, otherwise - above the combo input
  	 * "bottom" below the combo input
  	 * "top" above the combo input
  	 */
  var dropDownOrientation: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the width of drop-down list in pixels.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The default drop-down list width can be set in pixels (px).
  	 * "number" The default drop-down list width can be set as a number.
  	 */
  var dropDownWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Specifies whether the clear button should be rendered.
  	 * When the [mode](ui.igcombo#options:mode) is single selection, readonly or readonlylist this option will default to false. It can still be enabled when it is specifically set to true.
  	 *
  	 */
  var enableClearButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets URL key name that specifies how the remote filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
  	 *
  	 */
  var filterExprUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised after filtering.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use evt.originalEvent to obtain reference to event of browser. That can be null.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.elements to obtain a jquery reference to the rendered filtered elements.
  	 */
  var filtered: js.UndefOr[FilteredEvent] = js.undefined
  /**
  	 * Event which is raised before data filtering.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.expression to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
  	 * Each expression-item contains following members: fieldName ([textKey](ui.igcombo#options:textKey)), cond ([filteringCondition](ui.igcombo#options:filteringCondition)), expr (value/string to filter).
  	 */
  var filtering: js.UndefOr[FilteringEvent] = js.undefined
  /**
  	 * Gets/Sets condition used for filtering.Note: When [autoComplete](ui.igcombo#options:autoComplete) is enabled, the filtering condition is always "startsWith".
  	 *
  	 *
  	 * Valid values:
  	 * "contains"
  	 * "doesNotContain"
  	 * "startsWith"
  	 * "endsWith"
  	 * "greaterThan"
  	 * "lessThan"
  	 * "greaterThanOrEqualTo"
  	 * "lessThanOrEqualTo"
  	 * "equals"
  	 * "doesNotEqual"
  	 */
  var filteringCondition: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets filtering logic.
  	 *
  	 *
  	 * Valid values:
  	 * "OR"
  	 * "AND"
  	 */
  var filteringLogic: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets type of filtering.Note: option is set to "remote", then the "css.waitFiltering" is applied to combo and its drop-down list.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" filtering is performed by server
  	 * "local" filtering is performed by $.ig.DataSource
  	 * "none" filtering is disabled
  	 */
  var filteringType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets template used to render a footer in the drop-down list.
  	 * Notes:
  	 * 1. The template is rendered inside of DIV html element.
  	 * 2. The following variables can be used:
  	 * - {0}: Number of records in igCombo (view of dataSource)
  	 * - {1}: Number of records in dataSource
  	 * - {2}: Number of (filtered) records on server
  	 * - {3}: Number of all records on server
  	 *
  	 */
  var footerTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the format string that is used to format the text display values in the combo.
  	 * Valid options are:
  	 * "auto" (default) - uses automatic formatting for Date and number objects.
  	 * "none", "", or null - will disable formatting
  	 *
  	 * Custom values can be something like "currency", "percent", "dateLong", "time", "MMM-dd-yyyy H:mm tt", etc.
  	 *
  	 * Custom format strings should match the data type in "textKey" column.
  	 *
  	 */
  var format: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets object specifying grouping feature options. The option has key and dir properties.
  	 *
  	 */
  var grouping: js.UndefOr[IgComboGrouping] = js.undefined
  /**
  	 * Gets/Sets template used to render a header in the drop-down list. The template is rendered inside of a DIV html element.
  	 *
  	 */
  var headerTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets height of combo. The numeric and string values (valid html units for size) are supported. It includes %, px, em and other units.
  	 *
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Gets/Sets condition used for highlighting of matching parts in items of drop-down list.
  	 *
  	 *
  	 * Valid values:
  	 * "multi" multiple matches in a single item are rendered
  	 * "contains" match at any position in item is rendered
  	 * "startsWith" only match which starts from the beginning of text is rendered
  	 * "full" only fully matched items are rendered
  	 * "null" matches are not rendered
  	 */
  var highlightMatchesMode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets list of items to be selected when the combo is initialized. It should contain array of objects with index or value property, then on initialization the matching items will be selected. If initialSelectedItems are not set, the combo is with single selection and it is in a dropdown, readonly or readonlylist [mode](ui.igcombo#options:mode), the first item will be automatically selected.
  	 * Note: Only items loaded on initialization can be selected. When using [load on demand](ui.igCombo#options:loadOnDemandSettings), selecting an item which is not loaded yet will fail.
  	 *
  	 */
  var initialSelectedItems: js.UndefOr[js.Array[IgComboInitialSelectedItem]] = js.undefined
  /**
  	 * Gets/Sets the name of a hidden INPUT element, which is used when submitting data. Its value will be set to the values of the selected items valueKeys separated by ',' character on any change in igCombo. If the combo element has 'name' attribute and this option is not set, the 'name' attribute will be used for the input name.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets a template used to render an item in list. The igCombo utilizes igTemplating for generating node content templates.
  	 * More info on the templating engine can be found here: http://www.igniteui.com/help/infragistics-templating-engine.
  	 *
  	 */
  var itemTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised after rendering of the combo items completes.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to the combo performing rendering.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 */
  var itemsRendered: js.UndefOr[ItemsRenderedEvent] = js.undefined
  /**
  	 * Event which is raised before rendering of the combo items is performed.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to the combo performing rendering.
  	 * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
  	 */
  var itemsRendering: js.UndefOr[ItemsRenderingEvent] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets container of variables which define load on demand functionality.
  	 * Notes:
  	 * That option has effect only when data is loaded remotely using [dataSourceUrl](ui.igcombo#options:dataSourceUrl).
  	 * Selection is supported only for already loaded items.
  	 *
  	 */
  var loadOnDemandSettings: js.UndefOr[IgComboLoadOnDemandSettings] = js.undefined
  var locale: js.UndefOr[IgComboLocale] = js.undefined
  /**
  	 * Sets gets functionality mode.
  	 *
  	 *
  	 * Valid values:
  	 * "editable" Allows to modify value by edit field and drop-down list.
  	 * "dropdown" Allows to modify value by drop-down list only.
  	 * "readonlylist" Allows to open list, but does not allow any changes in field or selection in drop-down list. If selection is not set, then first item in [dataSource](ui.igcombo#options:dataSource) is automatically selected.
  	 * "readonly" Does not allow to open list or change value in field. If selection is not set, then first item in [dataSource](ui.igcombo#options:dataSource) is automatically selected.
  	 */
  var mode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets object specifying multi selection feature options. Note showCheckboxes and itemSeparator has effect only if multi selection is enabled.
  	 *
  	 */
  var multiSelection: js.UndefOr[IgComboMultiSelection] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
  	 * Use option [locale.noMatchFoundText](ui.igcombo#options:locale.noMatchFoundText).
  	 */
  var noMatchFoundText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Gets/Sets value that is displayed when input field is empty.
  	 * Use option [locale.placeHolder](ui.igcombo#options:locale.placeHolder).
  	 */
  var placeHolder: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets ability to prevent submitting form on enter key press.
  	 *
  	 */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Event which is raised after rendering of the combo completes.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to get a reference to the combo performing rendering.
  	 * Use ui.element to get a reference to the main/top combo element.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Specifies the HTTP verb to be used to issue the request.
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.undefined
  /**
  	 * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType.
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.undefined
  /**
  	 * See [$.ig.DataSource](ig.datasource) This is basically the property in the response where data records are held, if the response is wrapped.
  	 *
  	 */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
  	 * Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType.
  	 *
  	 *
  	 * Valid values:
  	 * "json"
  	 * "xml"
  	 * "html"
  	 * "script"
  	 * "jsonp"
  	 * "text"
  	 */
  var responseDataType: js.UndefOr[String] = js.undefined
  /**
  	 * See [$.ig.DataSource](ig.datasource) property in the response specifying the total number of records on the server.
  	 *
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets ability to select items by space button press.
  	 *
  	 */
  var selectItemBySpaceKey: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event which is raised after selection change.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.items to obtain reference to array of new selected items. That can be null.
  	 * Use ui.oldItems to obtain reference to array of old selected items. That can be null.
  	 */
  var selectionChanged: js.UndefOr[IgComboSelectionChangedEvent] = js.undefined
  /**
  	 * Event which is raised before selection change.
  	 *
  	 * Return false in order to cancel change.
  	 * Function takes arguments evt and ui.
  	 * Use ui.owner to obtain reference to igCombo.
  	 * Use ui.currentItems to obtain reference to array of the selected items before the new selection has happened. That can be null.
  	 * Use ui.items to obtain reference to array of all items that will be selected after the selection finish. That can be null.
  	 */
  var selectionChanging: js.UndefOr[SelectionChangingEvent] = js.undefined
  /**
  	 * Gets/Sets whether the onscreen keyboard should be shown when the dropdown button is clicked (touch devices only).
  	 * Note: The keyboard will still show when the combo input is focused in editable mode.
  	 *
  	 */
  var suppressKeyboard: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets tabIndex for the field of the combo.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets name of column which contains the displayed text. If it is missing, then [valueKey](ui.igcombo#options:valueKey) option will be used.
  	 *
  	 */
  var textKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets object which contains options supported by [igValidator](ui.igvalidator).
  	 * Notes: in order for validator to work, application should ensure that [igValidator](ui.igvalidator) is loaded (ig.ui.validator.js/css files).
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets name of column which contains the "value". If it is missing, then the name of first column will be used.
  	 *
  	 */
  var valueKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets ability to use virtual rendering for drop-down list. Enable to boost performance when combo has lots of records.
  	 * If that option is enabled, then only visible items are created and the top edge of the first visible item in list is aligned to the top edge of list.
  	 *
  	 */
  var virtualization: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets how many items should be shown at once.
  	 *    Notes:
  	 *    This option is used for [virtualization](ui.igcombo#options:virtualization) in order to render initial list items.
  	 *
  	 */
  var visibleItemsCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets the width of combo. The numeric and string values (valid html units for size) are supported. It includes %, px, em and other units.
  	 *
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgCombo {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igCombo
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowCustomValue: js.UndefOr[Boolean] = js.undefined,
    animationHideDuration: Int | Double = null,
    animationShowDuration: Int | Double = null,
    autoComplete: js.UndefOr[Boolean] = js.undefined,
    autoSelectFirstMatch: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearButtonTitle: String = null,
    closeDropDownOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeDropDownOnSelect: js.UndefOr[Boolean] = js.undefined,
    dataBinding: DataBindingEvent = null,
    dataBound: DataBoundEvent = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    delayInputChangeProcessing: Int | Double = null,
    dropDownAttachedToBody: js.UndefOr[Boolean] = js.undefined,
    dropDownButtonTitle: String = null,
    dropDownClosed: DropDownClosedEvent = null,
    dropDownClosing: DropDownClosingEvent = null,
    dropDownOnFocus: js.UndefOr[Boolean] = js.undefined,
    dropDownOpened: DropDownOpenedEvent = null,
    dropDownOpening: DropDownOpeningEvent = null,
    dropDownOrientation: String = null,
    dropDownWidth: String | Double = null,
    enableClearButton: js.UndefOr[Boolean] = js.undefined,
    filterExprUrlKey: String = null,
    filtered: FilteredEvent = null,
    filtering: FilteringEvent = null,
    filteringCondition: String = null,
    filteringLogic: String = null,
    filteringType: String = null,
    footerTemplate: String = null,
    format: String = null,
    grouping: IgComboGrouping = null,
    headerTemplate: String = null,
    height: String | Double = null,
    highlightMatchesMode: String = null,
    initialSelectedItems: js.Array[IgComboInitialSelectedItem] = null,
    inputName: String = null,
    itemTemplate: String = null,
    itemsRendered: ItemsRenderedEvent = null,
    itemsRendering: ItemsRenderingEvent = null,
    language: String = null,
    loadOnDemandSettings: IgComboLoadOnDemandSettings = null,
    locale: IgComboLocale = null,
    mode: String = null,
    multiSelection: IgComboMultiSelection = null,
    noMatchFoundText: String = null,
    placeHolder: String = null,
    preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    rendered: RenderedEvent = null,
    requestType: String = null,
    responseContentType: String = null,
    responseDataKey: String = null,
    responseDataType: String = null,
    responseTotalRecCountKey: String = null,
    selectItemBySpaceKey: js.UndefOr[Boolean] = js.undefined,
    selectionChanged: IgComboSelectionChangedEvent = null,
    selectionChanging: SelectionChangingEvent = null,
    suppressKeyboard: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    textKey: String = null,
    validatorOptions: js.Any = null,
    valueKey: String = null,
    virtualization: js.UndefOr[Boolean] = js.undefined,
    visibleItemsCount: Int | Double = null,
    width: String | Double = null
  ): IgCombo = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowCustomValue)) __obj.updateDynamic("allowCustomValue")(allowCustomValue)
    if (animationHideDuration != null) __obj.updateDynamic("animationHideDuration")(animationHideDuration.asInstanceOf[js.Any])
    if (animationShowDuration != null) __obj.updateDynamic("animationShowDuration")(animationShowDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoSelectFirstMatch)) __obj.updateDynamic("autoSelectFirstMatch")(autoSelectFirstMatch)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (clearButtonTitle != null) __obj.updateDynamic("clearButtonTitle")(clearButtonTitle)
    if (!js.isUndefined(closeDropDownOnBlur)) __obj.updateDynamic("closeDropDownOnBlur")(closeDropDownOnBlur)
    if (!js.isUndefined(closeDropDownOnSelect)) __obj.updateDynamic("closeDropDownOnSelect")(closeDropDownOnSelect)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (delayInputChangeProcessing != null) __obj.updateDynamic("delayInputChangeProcessing")(delayInputChangeProcessing.asInstanceOf[js.Any])
    if (!js.isUndefined(dropDownAttachedToBody)) __obj.updateDynamic("dropDownAttachedToBody")(dropDownAttachedToBody)
    if (dropDownButtonTitle != null) __obj.updateDynamic("dropDownButtonTitle")(dropDownButtonTitle)
    if (dropDownClosed != null) __obj.updateDynamic("dropDownClosed")(dropDownClosed)
    if (dropDownClosing != null) __obj.updateDynamic("dropDownClosing")(dropDownClosing)
    if (!js.isUndefined(dropDownOnFocus)) __obj.updateDynamic("dropDownOnFocus")(dropDownOnFocus)
    if (dropDownOpened != null) __obj.updateDynamic("dropDownOpened")(dropDownOpened)
    if (dropDownOpening != null) __obj.updateDynamic("dropDownOpening")(dropDownOpening)
    if (dropDownOrientation != null) __obj.updateDynamic("dropDownOrientation")(dropDownOrientation)
    if (dropDownWidth != null) __obj.updateDynamic("dropDownWidth")(dropDownWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableClearButton)) __obj.updateDynamic("enableClearButton")(enableClearButton)
    if (filterExprUrlKey != null) __obj.updateDynamic("filterExprUrlKey")(filterExprUrlKey)
    if (filtered != null) __obj.updateDynamic("filtered")(filtered)
    if (filtering != null) __obj.updateDynamic("filtering")(filtering)
    if (filteringCondition != null) __obj.updateDynamic("filteringCondition")(filteringCondition)
    if (filteringLogic != null) __obj.updateDynamic("filteringLogic")(filteringLogic)
    if (filteringType != null) __obj.updateDynamic("filteringType")(filteringType)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate)
    if (format != null) __obj.updateDynamic("format")(format)
    if (grouping != null) __obj.updateDynamic("grouping")(grouping)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightMatchesMode != null) __obj.updateDynamic("highlightMatchesMode")(highlightMatchesMode)
    if (initialSelectedItems != null) __obj.updateDynamic("initialSelectedItems")(initialSelectedItems)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate)
    if (itemsRendered != null) __obj.updateDynamic("itemsRendered")(itemsRendered)
    if (itemsRendering != null) __obj.updateDynamic("itemsRendering")(itemsRendering)
    if (language != null) __obj.updateDynamic("language")(language)
    if (loadOnDemandSettings != null) __obj.updateDynamic("loadOnDemandSettings")(loadOnDemandSettings)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (multiSelection != null) __obj.updateDynamic("multiSelection")(multiSelection)
    if (noMatchFoundText != null) __obj.updateDynamic("noMatchFoundText")(noMatchFoundText)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType)
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType)
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey)
    if (!js.isUndefined(selectItemBySpaceKey)) __obj.updateDynamic("selectItemBySpaceKey")(selectItemBySpaceKey)
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(selectionChanged)
    if (selectionChanging != null) __obj.updateDynamic("selectionChanging")(selectionChanging)
    if (!js.isUndefined(suppressKeyboard)) __obj.updateDynamic("suppressKeyboard")(suppressKeyboard)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textKey != null) __obj.updateDynamic("textKey")(textKey)
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (!js.isUndefined(virtualization)) __obj.updateDynamic("virtualization")(virtualization)
    if (visibleItemsCount != null) __obj.updateDynamic("visibleItemsCount")(visibleItemsCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgCombo]
  }
}


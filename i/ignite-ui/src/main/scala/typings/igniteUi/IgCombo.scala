package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgCombo
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  
  inline def apply(): IgCombo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgCombo]
  }
  
  extension [Self <: IgCombo](x: Self) {
    
    inline def setAllowCustomValue(value: Boolean): Self = StObject.set(x, "allowCustomValue", value.asInstanceOf[js.Any])
    
    inline def setAllowCustomValueUndefined: Self = StObject.set(x, "allowCustomValue", js.undefined)
    
    inline def setAnimationHideDuration(value: Double): Self = StObject.set(x, "animationHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationHideDurationUndefined: Self = StObject.set(x, "animationHideDuration", js.undefined)
    
    inline def setAnimationShowDuration(value: Double): Self = StObject.set(x, "animationShowDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationShowDurationUndefined: Self = StObject.set(x, "animationShowDuration", js.undefined)
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoSelectFirstMatch(value: Boolean): Self = StObject.set(x, "autoSelectFirstMatch", value.asInstanceOf[js.Any])
    
    inline def setAutoSelectFirstMatchUndefined: Self = StObject.set(x, "autoSelectFirstMatch", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setClearButtonTitle(value: String): Self = StObject.set(x, "clearButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setClearButtonTitleUndefined: Self = StObject.set(x, "clearButtonTitle", js.undefined)
    
    inline def setCloseDropDownOnBlur(value: Boolean): Self = StObject.set(x, "closeDropDownOnBlur", value.asInstanceOf[js.Any])
    
    inline def setCloseDropDownOnBlurUndefined: Self = StObject.set(x, "closeDropDownOnBlur", js.undefined)
    
    inline def setCloseDropDownOnSelect(value: Boolean): Self = StObject.set(x, "closeDropDownOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCloseDropDownOnSelectUndefined: Self = StObject.set(x, "closeDropDownOnSelect", js.undefined)
    
    inline def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction2(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    inline def setDelayInputChangeProcessing(value: Double): Self = StObject.set(x, "delayInputChangeProcessing", value.asInstanceOf[js.Any])
    
    inline def setDelayInputChangeProcessingUndefined: Self = StObject.set(x, "delayInputChangeProcessing", js.undefined)
    
    inline def setDropDownAttachedToBody(value: Boolean): Self = StObject.set(x, "dropDownAttachedToBody", value.asInstanceOf[js.Any])
    
    inline def setDropDownAttachedToBodyUndefined: Self = StObject.set(x, "dropDownAttachedToBody", js.undefined)
    
    inline def setDropDownButtonTitle(value: String): Self = StObject.set(x, "dropDownButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setDropDownButtonTitleUndefined: Self = StObject.set(x, "dropDownButtonTitle", js.undefined)
    
    inline def setDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = StObject.set(x, "dropDownClosed", js.Any.fromFunction2(value))
    
    inline def setDropDownClosedUndefined: Self = StObject.set(x, "dropDownClosed", js.undefined)
    
    inline def setDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = StObject.set(x, "dropDownClosing", js.Any.fromFunction2(value))
    
    inline def setDropDownClosingUndefined: Self = StObject.set(x, "dropDownClosing", js.undefined)
    
    inline def setDropDownOnFocus(value: Boolean): Self = StObject.set(x, "dropDownOnFocus", value.asInstanceOf[js.Any])
    
    inline def setDropDownOnFocusUndefined: Self = StObject.set(x, "dropDownOnFocus", js.undefined)
    
    inline def setDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = StObject.set(x, "dropDownOpened", js.Any.fromFunction2(value))
    
    inline def setDropDownOpenedUndefined: Self = StObject.set(x, "dropDownOpened", js.undefined)
    
    inline def setDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = StObject.set(x, "dropDownOpening", js.Any.fromFunction2(value))
    
    inline def setDropDownOpeningUndefined: Self = StObject.set(x, "dropDownOpening", js.undefined)
    
    inline def setDropDownOrientation(value: String): Self = StObject.set(x, "dropDownOrientation", value.asInstanceOf[js.Any])
    
    inline def setDropDownOrientationUndefined: Self = StObject.set(x, "dropDownOrientation", js.undefined)
    
    inline def setDropDownWidth(value: String | Double): Self = StObject.set(x, "dropDownWidth", value.asInstanceOf[js.Any])
    
    inline def setDropDownWidthUndefined: Self = StObject.set(x, "dropDownWidth", js.undefined)
    
    inline def setEnableClearButton(value: Boolean): Self = StObject.set(x, "enableClearButton", value.asInstanceOf[js.Any])
    
    inline def setEnableClearButtonUndefined: Self = StObject.set(x, "enableClearButton", js.undefined)
    
    inline def setFilterExprUrlKey(value: String): Self = StObject.set(x, "filterExprUrlKey", value.asInstanceOf[js.Any])
    
    inline def setFilterExprUrlKeyUndefined: Self = StObject.set(x, "filterExprUrlKey", js.undefined)
    
    inline def setFiltered(value: (/* event */ Event, /* ui */ FilteredEventUIParam) => Unit): Self = StObject.set(x, "filtered", js.Any.fromFunction2(value))
    
    inline def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    inline def setFiltering(value: (/* event */ Event, /* ui */ FilteringEventUIParam) => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction2(value))
    
    inline def setFilteringCondition(value: String): Self = StObject.set(x, "filteringCondition", value.asInstanceOf[js.Any])
    
    inline def setFilteringConditionUndefined: Self = StObject.set(x, "filteringCondition", js.undefined)
    
    inline def setFilteringLogic(value: String): Self = StObject.set(x, "filteringLogic", value.asInstanceOf[js.Any])
    
    inline def setFilteringLogicUndefined: Self = StObject.set(x, "filteringLogic", js.undefined)
    
    inline def setFilteringType(value: String): Self = StObject.set(x, "filteringType", value.asInstanceOf[js.Any])
    
    inline def setFilteringTypeUndefined: Self = StObject.set(x, "filteringType", js.undefined)
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGrouping(value: IgComboGrouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHighlightMatchesMode(value: String): Self = StObject.set(x, "highlightMatchesMode", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchesModeUndefined: Self = StObject.set(x, "highlightMatchesMode", js.undefined)
    
    inline def setInitialSelectedItems(value: js.Array[IgComboInitialSelectedItem]): Self = StObject.set(x, "initialSelectedItems", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedItemsUndefined: Self = StObject.set(x, "initialSelectedItems", js.undefined)
    
    inline def setInitialSelectedItemsVarargs(value: IgComboInitialSelectedItem*): Self = StObject.set(x, "initialSelectedItems", js.Array(value :_*))
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setItemTemplate(value: String): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    inline def setItemsRendered(value: (/* event */ Event, /* ui */ ItemsRenderedEventUIParam) => Unit): Self = StObject.set(x, "itemsRendered", js.Any.fromFunction2(value))
    
    inline def setItemsRenderedUndefined: Self = StObject.set(x, "itemsRendered", js.undefined)
    
    inline def setItemsRendering(value: (/* event */ Event, /* ui */ ItemsRenderingEventUIParam) => Unit): Self = StObject.set(x, "itemsRendering", js.Any.fromFunction2(value))
    
    inline def setItemsRenderingUndefined: Self = StObject.set(x, "itemsRendering", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLoadOnDemandSettings(value: IgComboLoadOnDemandSettings): Self = StObject.set(x, "loadOnDemandSettings", value.asInstanceOf[js.Any])
    
    inline def setLoadOnDemandSettingsUndefined: Self = StObject.set(x, "loadOnDemandSettings", js.undefined)
    
    inline def setLocale(value: IgComboLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiSelection(value: IgComboMultiSelection): Self = StObject.set(x, "multiSelection", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectionUndefined: Self = StObject.set(x, "multiSelection", js.undefined)
    
    inline def setNoMatchFoundText(value: String): Self = StObject.set(x, "noMatchFoundText", value.asInstanceOf[js.Any])
    
    inline def setNoMatchFoundTextUndefined: Self = StObject.set(x, "noMatchFoundText", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    inline def setPreventSubmitOnEnter(value: Boolean): Self = StObject.set(x, "preventSubmitOnEnter", value.asInstanceOf[js.Any])
    
    inline def setPreventSubmitOnEnterUndefined: Self = StObject.set(x, "preventSubmitOnEnter", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    inline def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    inline def setResponseDataType(value: String): Self = StObject.set(x, "responseDataType", value.asInstanceOf[js.Any])
    
    inline def setResponseDataTypeUndefined: Self = StObject.set(x, "responseDataType", js.undefined)
    
    inline def setResponseTotalRecCountKey(value: String): Self = StObject.set(x, "responseTotalRecCountKey", value.asInstanceOf[js.Any])
    
    inline def setResponseTotalRecCountKeyUndefined: Self = StObject.set(x, "responseTotalRecCountKey", js.undefined)
    
    inline def setSelectItemBySpaceKey(value: Boolean): Self = StObject.set(x, "selectItemBySpaceKey", value.asInstanceOf[js.Any])
    
    inline def setSelectItemBySpaceKeyUndefined: Self = StObject.set(x, "selectItemBySpaceKey", js.undefined)
    
    inline def setSelectionChanged(value: (/* event */ Event, /* ui */ IgComboSelectionChangedEventUIParam) => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction2(value))
    
    inline def setSelectionChangedUndefined: Self = StObject.set(x, "selectionChanged", js.undefined)
    
    inline def setSelectionChanging(value: (/* event */ Event, /* ui */ SelectionChangingEventUIParam) => Unit): Self = StObject.set(x, "selectionChanging", js.Any.fromFunction2(value))
    
    inline def setSelectionChangingUndefined: Self = StObject.set(x, "selectionChanging", js.undefined)
    
    inline def setSuppressKeyboard(value: Boolean): Self = StObject.set(x, "suppressKeyboard", value.asInstanceOf[js.Any])
    
    inline def setSuppressKeyboardUndefined: Self = StObject.set(x, "suppressKeyboard", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTextKey(value: String): Self = StObject.set(x, "textKey", value.asInstanceOf[js.Any])
    
    inline def setTextKeyUndefined: Self = StObject.set(x, "textKey", js.undefined)
    
    inline def setValidatorOptions(value: js.Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    inline def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    
    inline def setVirtualization(value: Boolean): Self = StObject.set(x, "virtualization", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationUndefined: Self = StObject.set(x, "virtualization", js.undefined)
    
    inline def setVisibleItemsCount(value: Double): Self = StObject.set(x, "visibleItemsCount", value.asInstanceOf[js.Any])
    
    inline def setVisibleItemsCountUndefined: Self = StObject.set(x, "visibleItemsCount", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgCombo
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * If set to true:
    * 1. Allows custom value input only with single selection.
    * 2. Custom values will be auto completed to the closest value if [autoComplete](ui.igcombo#options:autoComplete) is enabled.
    *
    */
  var allowCustomValue: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets hide drop-down list animation duration in milliseconds.
    *
    */
  var animationHideDuration: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets show drop-down list animation duration in milliseconds.
    *
    */
  var animationShowDuration: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets ability to autocomplete field from first matching item in list.
    * Note: When autoComplete option is enabled, then "startsWith" is used for [filteringCondition](ui.igcombo#options:filteringCondition).
    *
    */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the first matching item should be auto selected when typing in input. When [multiSelection](ui.igcombo#options:multiSelection) is enabled this option will instead put the active item on the matching element.
    *
    */
  var autoSelectFirstMatch: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, filtering and auto selection will be case-sensitive.
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets title for html element which represent clear button.
    * Use option [locale.clearButtonTitle](ui.igcombo#options:locale.clearButtonTitle).
    */
  var clearButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets ability to close drop-down list when control loses focus.
    *
    */
  var closeDropDownOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * Gets sets ability to close drop-down list when single item in the list is selected with mouse click or enter press. The default value when [multiSelection](ui.igcombo#options:multiSelection) is enabled will be false. This option will not close the drop down when [multiSelection](ui.igcombo#options:multiSelection) is enabled and additive selection is performed.
    *
    */
  var closeDropDownOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * Event which is raised before data binding is performed.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to get a reference to igCombo performing the databinding.
    * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is to be databound to.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
    * Event which is raised after data binding is complete.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to obtain reference to igCombo performing the data binding.
    * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
    * Use ui.success to see if the databinding was performed correctly.
    * Use ui.errorMessage to get the error message if the databinding failed.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
    * Gets/Sets a valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an [$.ig.DataSource](ig.datasource) itself.
    * Note: if it is set to string and [dataSourceType](ui.igcombo#options:dataSourceType) option is not set, then [$.ig.JSONDataSource](ig.jsondatasource) is used.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Sets data source type (such as "json", "xml", etc). Please refer to the documentation of [$.ig.DataSource](ig.datasource) and its [type](ig.datasource#options:settings.type) property.
    *
    */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
    * Sets URL which is used for sending JSON on request for remote filtering (MVC for example). That option is required when [load on demand](ui.igcombo#options:loadOnDemandSettings) is
    * [enabled](ui.igcombo#options:loadOnDemandSettings.enabled) and its [type](ui.igcombo#options:filteringType) is remote.
    *
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
    * Specifies the delay duration before processing the changes in the input. Useful to boost performance by lowering the count of selection, filtering, auto complete and highlighting operations executed on each input change.
    *
    */
  var delayInputChangeProcessing: js.UndefOr[Double] = js.native
  /**
    * If set to true, the container of the drop-down list is appended to the body.
    * If set to false, it is appended to the parent element of the combo.
    *
    */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets title for html element which represent the drop-down button.
    * Use option [locale.dropDownButtonTitle](ui.igcombo#options:locale.dropDownButtonTitle).
    */
  var dropDownButtonTitle: js.UndefOr[String] = js.native
  /**
    * Event which is raised after drop-down list was closed.
    *
    * Function takes arguments evt and ui.
    * Use evt.originalEvent to obtain reference to event of browser.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
    */
  var dropDownClosed: js.UndefOr[DropDownClosedEvent] = js.native
  /**
    * Event which is raised before drop-down list is closed.
    *
    * Return false in order to cancel hide action.
    * Function takes arguments evt and ui.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
    */
  var dropDownClosing: js.UndefOr[DropDownClosingEvent] = js.native
  /**
    * Gets/Sets ability to show the drop-down list when the combo is in focus. This option has effect only if the combo is in editable [mode](ui.igcombo#options:mode).
    *
    */
  var dropDownOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Event which is raised after drop-down list was opened.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
    */
  var dropDownOpened: js.UndefOr[DropDownOpenedEvent] = js.native
  /**
    * Event which is raised before drop-down list is opened.
    *
    * Return false in order to cancel drop-down action.
    * Function takes arguments evt and ui.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.list to obtain reference to jquery DOM element which represents drop down list container.
    */
  var dropDownOpening: js.UndefOr[DropDownOpeningEvent] = js.native
  /**
    * Gets/Sets drop-down list orientation when open button is clicked.
    *
    *
    * Valid values:
    * "auto" if there is enough space, it positions the drop-down list below the combo input, otherwise - above the combo input
    * "bottom" below the combo input
    * "top" above the combo input
    */
  var dropDownOrientation: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the width of drop-down list in pixels.
    *
    *
    * Valid values:
    * "string" The default drop-down list width can be set in pixels (px).
    * "number" The default drop-down list width can be set as a number.
    */
  var dropDownWidth: js.UndefOr[String | Double] = js.native
  /**
    * Specifies whether the clear button should be rendered.
    * When the [mode](ui.igcombo#options:mode) is single selection, readonly or readonlylist this option will default to false. It can still be enabled when it is specifically set to true.
    *
    */
  var enableClearButton: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets URL key name that specifies how the remote filtering expressions will be encoded for remote requests, e.g. &filter('col') = startsWith. Default is OData.
    *
    */
  var filterExprUrlKey: js.UndefOr[String] = js.native
  /**
    * Event which is raised after filtering.
    *
    * Function takes arguments evt and ui.
    * Use evt.originalEvent to obtain reference to event of browser. That can be null.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.elements to obtain a jquery reference to the rendered filtered elements.
    */
  var filtered: js.UndefOr[FilteredEvent] = js.native
  /**
    * Event which is raised before data filtering.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.expression to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
    * Each expression-item contains following members: fieldName ([textKey](ui.igcombo#options:textKey)), cond ([filteringCondition](ui.igcombo#options:filteringCondition)), expr (value/string to filter).
    */
  var filtering: js.UndefOr[FilteringEvent] = js.native
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
  var filteringCondition: js.UndefOr[String] = js.native
  /**
    * Gets/Sets filtering logic.
    *
    *
    * Valid values:
    * "OR"
    * "AND"
    */
  var filteringLogic: js.UndefOr[String] = js.native
  /**
    * Gets/Sets type of filtering.Note: option is set to "remote", then the "css.waitFiltering" is applied to combo and its drop-down list.
    *
    *
    * Valid values:
    * "remote" filtering is performed by server
    * "local" filtering is performed by $.ig.DataSource
    * "none" filtering is disabled
    */
  var filteringType: js.UndefOr[String] = js.native
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
  var footerTemplate: js.UndefOr[String] = js.native
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
  var format: js.UndefOr[String] = js.native
  /**
    * Gets/Sets object specifying grouping feature options. The option has key and dir properties.
    *
    */
  var grouping: js.UndefOr[IgComboGrouping] = js.native
  /**
    * Gets/Sets template used to render a header in the drop-down list. The template is rendered inside of a DIV html element.
    *
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /**
    * Gets/Sets height of combo. The numeric and string values (valid html units for size) are supported. It includes %, px, em and other units.
    *
    */
  var height: js.UndefOr[String | Double] = js.native
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
  var highlightMatchesMode: js.UndefOr[String] = js.native
  /**
    * Gets/Sets list of items to be selected when the combo is initialized. It should contain array of objects with index or value property, then on initialization the matching items will be selected. If initialSelectedItems are not set, the combo is with single selection and it is in a dropdown, readonly or readonlylist [mode](ui.igcombo#options:mode), the first item will be automatically selected.
    * Note: Only items loaded on initialization can be selected. When using [load on demand](ui.igCombo#options:loadOnDemandSettings), selecting an item which is not loaded yet will fail.
    *
    */
  var initialSelectedItems: js.UndefOr[js.Array[IgComboInitialSelectedItem]] = js.native
  /**
    * Gets/Sets the name of a hidden INPUT element, which is used when submitting data. Its value will be set to the values of the selected items valueKeys separated by ',' character on any change in igCombo. If the combo element has 'name' attribute and this option is not set, the 'name' attribute will be used for the input name.
    *
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * Gets/Sets a template used to render an item in list. The igCombo utilizes igTemplating for generating node content templates.
    * More info on the templating engine can be found here: http://www.igniteui.com/help/infragistics-templating-engine.
    *
    */
  var itemTemplate: js.UndefOr[String] = js.native
  /**
    * Event which is raised after rendering of the combo items completes.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to get a reference to the combo performing rendering.
    * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
    */
  var itemsRendered: js.UndefOr[ItemsRenderedEvent] = js.native
  /**
    * Event which is raised before rendering of the combo items is performed.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to get a reference to the combo performing rendering.
    * Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
    */
  var itemsRendering: js.UndefOr[ItemsRenderingEvent] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Gets/Sets container of variables which define load on demand functionality.
    * Notes:
    * That option has effect only when data is loaded remotely using [dataSourceUrl](ui.igcombo#options:dataSourceUrl).
    * Selection is supported only for already loaded items.
    *
    */
  var loadOnDemandSettings: js.UndefOr[IgComboLoadOnDemandSettings] = js.native
  var locale: js.UndefOr[IgComboLocale] = js.native
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
  var mode: js.UndefOr[String] = js.native
  /**
    * Gets/Sets object specifying multi selection feature options. Note showCheckboxes and itemSeparator has effect only if multi selection is enabled.
    *
    */
  var multiSelection: js.UndefOr[IgComboMultiSelection] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
    * Use option [locale.noMatchFoundText](ui.igcombo#options:locale.noMatchFoundText).
    */
  var noMatchFoundText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Gets/Sets value that is displayed when input field is empty.
    * Use option [locale.placeHolder](ui.igcombo#options:locale.placeHolder).
    */
  var placeHolder: js.UndefOr[String] = js.native
  /**
    * Gets/Sets ability to prevent submitting form on enter key press.
    *
    */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Event which is raised after rendering of the combo completes.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to get a reference to the combo performing rendering.
    * Use ui.element to get a reference to the main/top combo element.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
    * Specifies the HTTP verb to be used to issue the request.
    *
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType.
    *
    */
  var responseContentType: js.UndefOr[String] = js.native
  /**
    * See [$.ig.DataSource](ig.datasource) This is basically the property in the response where data records are held, if the response is wrapped.
    *
    */
  var responseDataKey: js.UndefOr[String] = js.native
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
  var responseDataType: js.UndefOr[String] = js.native
  /**
    * See [$.ig.DataSource](ig.datasource) property in the response specifying the total number of records on the server.
    *
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
    * Gets/Sets ability to select items by space button press.
    *
    */
  var selectItemBySpaceKey: js.UndefOr[Boolean] = js.native
  /**
    * Event which is raised after selection change.
    *
    * Function takes arguments evt and ui.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.items to obtain reference to array of new selected items. That can be null.
    * Use ui.oldItems to obtain reference to array of old selected items. That can be null.
    */
  var selectionChanged: js.UndefOr[IgComboSelectionChangedEvent] = js.native
  /**
    * Event which is raised before selection change.
    *
    * Return false in order to cancel change.
    * Function takes arguments evt and ui.
    * Use ui.owner to obtain reference to igCombo.
    * Use ui.currentItems to obtain reference to array of the selected items before the new selection has happened. That can be null.
    * Use ui.items to obtain reference to array of all items that will be selected after the selection finish. That can be null.
    */
  var selectionChanging: js.UndefOr[SelectionChangingEvent] = js.native
  /**
    * Gets/Sets whether the onscreen keyboard should be shown when the dropdown button is clicked (touch devices only).
    * Note: The keyboard will still show when the combo input is focused in editable mode.
    *
    */
  var suppressKeyboard: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets tabIndex for the field of the combo.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets name of column which contains the displayed text. If it is missing, then [valueKey](ui.igcombo#options:valueKey) option will be used.
    *
    */
  var textKey: js.UndefOr[String] = js.native
  /**
    * Gets/Sets object which contains options supported by [igValidator](ui.igvalidator).
    * Notes: in order for validator to work, application should ensure that [igValidator](ui.igvalidator) is loaded (ig.ui.validator.js/css files).
    *
    */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets name of column which contains the "value". If it is missing, then the name of first column will be used.
    *
    */
  var valueKey: js.UndefOr[String] = js.native
  /**
    * Gets/Sets ability to use virtual rendering for drop-down list. Enable to boost performance when combo has lots of records.
    * If that option is enabled, then only visible items are created and the top edge of the first visible item in list is aligned to the top edge of list.
    *
    */
  var virtualization: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets how many items should be shown at once.
    *    Notes:
    *    This option is used for [virtualization](ui.igcombo#options:virtualization) in order to render initial list items.
    *
    */
  var visibleItemsCount: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the width of combo. The numeric and string values (valid html units for size) are supported. It includes %, px, em and other units.
    *
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgCombo {
  @scala.inline
  def apply(): IgCombo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgCombo]
  }
  @scala.inline
  implicit class IgComboOps[Self <: IgCombo] (val x: Self) extends AnyVal {
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
    def setAllowCustomValue(value: Boolean): Self = this.set("allowCustomValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCustomValue: Self = this.set("allowCustomValue", js.undefined)
    @scala.inline
    def setAnimationHideDuration(value: Double): Self = this.set("animationHideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationHideDuration: Self = this.set("animationHideDuration", js.undefined)
    @scala.inline
    def setAnimationShowDuration(value: Double): Self = this.set("animationShowDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationShowDuration: Self = this.set("animationShowDuration", js.undefined)
    @scala.inline
    def setAutoComplete(value: Boolean): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoSelectFirstMatch(value: Boolean): Self = this.set("autoSelectFirstMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSelectFirstMatch: Self = this.set("autoSelectFirstMatch", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setClearButtonTitle(value: String): Self = this.set("clearButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButtonTitle: Self = this.set("clearButtonTitle", js.undefined)
    @scala.inline
    def setCloseDropDownOnBlur(value: Boolean): Self = this.set("closeDropDownOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDropDownOnBlur: Self = this.set("closeDropDownOnBlur", js.undefined)
    @scala.inline
    def setCloseDropDownOnSelect(value: Boolean): Self = this.set("closeDropDownOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDropDownOnSelect: Self = this.set("closeDropDownOnSelect", js.undefined)
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
    def setDelayInputChangeProcessing(value: Double): Self = this.set("delayInputChangeProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayInputChangeProcessing: Self = this.set("delayInputChangeProcessing", js.undefined)
    @scala.inline
    def setDropDownAttachedToBody(value: Boolean): Self = this.set("dropDownAttachedToBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownAttachedToBody: Self = this.set("dropDownAttachedToBody", js.undefined)
    @scala.inline
    def setDropDownButtonTitle(value: String): Self = this.set("dropDownButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownButtonTitle: Self = this.set("dropDownButtonTitle", js.undefined)
    @scala.inline
    def setDropDownClosed(value: (/* event */ Event, /* ui */ DropDownClosedEventUIParam) => Unit): Self = this.set("dropDownClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownClosed: Self = this.set("dropDownClosed", js.undefined)
    @scala.inline
    def setDropDownClosing(value: (/* event */ Event, /* ui */ DropDownClosingEventUIParam) => Unit): Self = this.set("dropDownClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownClosing: Self = this.set("dropDownClosing", js.undefined)
    @scala.inline
    def setDropDownOnFocus(value: Boolean): Self = this.set("dropDownOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOnFocus: Self = this.set("dropDownOnFocus", js.undefined)
    @scala.inline
    def setDropDownOpened(value: (/* event */ Event, /* ui */ DropDownOpenedEventUIParam) => Unit): Self = this.set("dropDownOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownOpened: Self = this.set("dropDownOpened", js.undefined)
    @scala.inline
    def setDropDownOpening(value: (/* event */ Event, /* ui */ DropDownOpeningEventUIParam) => Unit): Self = this.set("dropDownOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownOpening: Self = this.set("dropDownOpening", js.undefined)
    @scala.inline
    def setDropDownOrientation(value: String): Self = this.set("dropDownOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOrientation: Self = this.set("dropDownOrientation", js.undefined)
    @scala.inline
    def setDropDownWidth(value: String | Double): Self = this.set("dropDownWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownWidth: Self = this.set("dropDownWidth", js.undefined)
    @scala.inline
    def setEnableClearButton(value: Boolean): Self = this.set("enableClearButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableClearButton: Self = this.set("enableClearButton", js.undefined)
    @scala.inline
    def setFilterExprUrlKey(value: String): Self = this.set("filterExprUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterExprUrlKey: Self = this.set("filterExprUrlKey", js.undefined)
    @scala.inline
    def setFiltered(value: (/* event */ Event, /* ui */ FilteredEventUIParam) => Unit): Self = this.set("filtered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    @scala.inline
    def setFiltering(value: (/* event */ Event, /* ui */ FilteringEventUIParam) => Unit): Self = this.set("filtering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    @scala.inline
    def setFilteringCondition(value: String): Self = this.set("filteringCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteringCondition: Self = this.set("filteringCondition", js.undefined)
    @scala.inline
    def setFilteringLogic(value: String): Self = this.set("filteringLogic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteringLogic: Self = this.set("filteringLogic", js.undefined)
    @scala.inline
    def setFilteringType(value: String): Self = this.set("filteringType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteringType: Self = this.set("filteringType", js.undefined)
    @scala.inline
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGrouping(value: IgComboGrouping): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHighlightMatchesMode(value: String): Self = this.set("highlightMatchesMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightMatchesMode: Self = this.set("highlightMatchesMode", js.undefined)
    @scala.inline
    def setInitialSelectedItemsVarargs(value: IgComboInitialSelectedItem*): Self = this.set("initialSelectedItems", js.Array(value :_*))
    @scala.inline
    def setInitialSelectedItems(value: js.Array[IgComboInitialSelectedItem]): Self = this.set("initialSelectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSelectedItems: Self = this.set("initialSelectedItems", js.undefined)
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    @scala.inline
    def setItemTemplate(value: String): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setItemsRendered(value: (/* event */ Event, /* ui */ ItemsRenderedEventUIParam) => Unit): Self = this.set("itemsRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemsRendered: Self = this.set("itemsRendered", js.undefined)
    @scala.inline
    def setItemsRendering(value: (/* event */ Event, /* ui */ ItemsRenderingEventUIParam) => Unit): Self = this.set("itemsRendering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemsRendering: Self = this.set("itemsRendering", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLoadOnDemandSettings(value: IgComboLoadOnDemandSettings): Self = this.set("loadOnDemandSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnDemandSettings: Self = this.set("loadOnDemandSettings", js.undefined)
    @scala.inline
    def setLocale(value: IgComboLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMultiSelection(value: IgComboMultiSelection): Self = this.set("multiSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelection: Self = this.set("multiSelection", js.undefined)
    @scala.inline
    def setNoMatchFoundText(value: String): Self = this.set("noMatchFoundText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMatchFoundText: Self = this.set("noMatchFoundText", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setPreventSubmitOnEnter(value: Boolean): Self = this.set("preventSubmitOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventSubmitOnEnter: Self = this.set("preventSubmitOnEnter", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
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
    def setResponseTotalRecCountKey(value: String): Self = this.set("responseTotalRecCountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTotalRecCountKey: Self = this.set("responseTotalRecCountKey", js.undefined)
    @scala.inline
    def setSelectItemBySpaceKey(value: Boolean): Self = this.set("selectItemBySpaceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectItemBySpaceKey: Self = this.set("selectItemBySpaceKey", js.undefined)
    @scala.inline
    def setSelectionChanged(value: (/* event */ Event, /* ui */ IgComboSelectionChangedEventUIParam) => Unit): Self = this.set("selectionChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectionChanged: Self = this.set("selectionChanged", js.undefined)
    @scala.inline
    def setSelectionChanging(value: (/* event */ Event, /* ui */ SelectionChangingEventUIParam) => Unit): Self = this.set("selectionChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectionChanging: Self = this.set("selectionChanging", js.undefined)
    @scala.inline
    def setSuppressKeyboard(value: Boolean): Self = this.set("suppressKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressKeyboard: Self = this.set("suppressKeyboard", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTextKey(value: String): Self = this.set("textKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextKey: Self = this.set("textKey", js.undefined)
    @scala.inline
    def setValidatorOptions(value: js.Any): Self = this.set("validatorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidatorOptions: Self = this.set("validatorOptions", js.undefined)
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
    @scala.inline
    def setVirtualization(value: Boolean): Self = this.set("virtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualization: Self = this.set("virtualization", js.undefined)
    @scala.inline
    def setVisibleItemsCount(value: Double): Self = this.set("visibleItemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleItemsCount: Self = this.set("visibleItemsCount", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


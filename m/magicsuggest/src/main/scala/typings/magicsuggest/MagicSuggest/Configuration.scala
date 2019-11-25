package typings.magicsuggest.MagicSuggest

import typings.jquery.JQueryAjaxSettings
import typings.magicsuggest.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * Additional config object passed to each $.ajax call
    */
  var ajaxConfig: js.UndefOr[JQueryAjaxSettings] = js.undefined
  /**
    * Restricts or allows the user to add the same entry more than once
    * Defaults to false.
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.undefined
  /* ********  CONFIGURATION PROPERTIES ************/
  /**
    * Restricts or allows the user to validate typed entries.
    * Defaults to true.
    */
  var allowFreeEntries: js.UndefOr[Boolean] = js.undefined
  /**
    * If a single suggestion comes out, it is preselected.
    */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * A function triggered just before the ajax request is sent, similar to jQuery
    */
  var beforeSend: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A custom CSS class to apply to the field's underlying element.
    */
  var cls: js.UndefOr[String] = js.undefined
  /**
    * JSON Data source used to populate the combo box. 3 options are available here:
    * No Data Source (default)
    *    When left null, the combo box will not suggest anything. It can still enable the user to enter
    *    multiple entries if allowFreeEntries is * set to true (default).
    * Static Source
    *    You can pass an array of JSON objects, an array of strings or even a single CSV string as the
    *    data source.For ex. data: [* {id:0,name:"Paris"}, {id: 1, name: "New York"}]
    *    You can also pass any json object with the results property containing the json array.
    * Url
    *     You can pass the url from which the component will fetch its JSON data.Data will be fetched
    *     using a POST ajax request that will * include the entered text as 'query' parameter. The results
    *     fetched from the server can be:
    *     - an array of JSON objects (ex: [{id:...,name:...},{...}])
    *     - a string containing an array of JSON objects ready to be parsed (ex: "[{id:...,name:...},{...}]")
    *     - a JSON object whose data will be contained in the results property
    *      (ex: {results: [{id:...,name:...},{...}]
    * Function
    *     You can pass a function which returns an array of JSON objects  (ex: [{id:...,name:...},{...}])
    *     The function can return the JSON data or it can use the first argument as function to handle the data.
    *     Only one (callback function or return value) is needed for the function to succeed.
    *     See the following example:
    *     function (response) { var myjson = [{name: 'test', id: 1}]; response(myjson); return myjson; }
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Additional parameters to the ajax call
    */
  var dataUrlParams: js.UndefOr[js.Object] = js.undefined
  /**
    * Start the component in a disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of JSON object property that defines the disabled behaviour
    */
  var disabledField: js.UndefOr[String] = js.undefined
  /**
    * Name of JSON object property displayed in the combo list
    */
  var displayField: js.UndefOr[String] = js.undefined
  /**
    * Set to false if you only want mouse interaction. In that case the combo will
    * automatically expand on focus.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically expands combo on focus.
    */
  var expandOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Set starting state for combo.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /**
    * JSON property by which the list should be grouped
    */
  var groupBy: js.UndefOr[String] = js.undefined
  /**
    * Set to true to hide the trigger on the right
    */
  var hideTrigger: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to highlight search input within displayed suggestions
    */
  var highlight: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom ID for this component
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A class that is added to the info message appearing on the top-right part of the component
    */
  var infoMsgCls: js.UndefOr[String] = js.undefined
  /**
    * Additional parameters passed out to the INPUT tag. Enables usage of AngularJS's custom tags for ex.
    */
  var inputCfg: js.UndefOr[js.Any] = js.undefined
  /**
    * The class that is applied to show that the field is invalid
    */
  var invalidCls: js.UndefOr[String] = js.undefined
  /**
    * Set to true to filter data results according to case. Useless if the data is fetched remotely
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /**
    * Once expanded, the combo's height will take as much room as the # of available results.
    *    In case there are too many results displayed, this will fix the drop down height.
    */
  var maxDropHeight: js.UndefOr[Double] = js.undefined
  /**
    * Defines how long the user free entry can be. Set to null for no limit.
    */
  var maxEntryLength: js.UndefOr[Double] = js.undefined
  /**
    * A function that defines the helper text when the max entry length has been surpassed.
    */
  var maxEntryRenderer: js.UndefOr[js.Function1[/* v */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * The maximum number of items the user can select if multiple selection is allowed.
    *    Set to null to remove the limit.
    */
  var maxSelection: js.UndefOr[Double] = js.undefined
  /**
    * A function that defines the helper text when the max selection amount has been reached. The function has a single
    *    parameter which is the number of selected elements.
    */
  var maxSelectionRenderer: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.undefined
  /**
    * The maximum number of results displayed in the combo drop down at once.
    */
  var maxSuggestions: js.UndefOr[Double] = js.undefined
  /**
    * The method used by the ajax request.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The minimum number of characters the user must type before the combo expands and offers suggestions.
    */
  var minChars: js.UndefOr[Double] = js.undefined
  /**
    * A function that defines the helper text when not enough letters are set. The function has a single
    *    parameter which is the difference between the required amount of letters and the current one.
    */
  var minCharsRenderer: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.undefined
  /**
    * Whether or not sorting / filtering should be done remotely or locally.
    * Use either 'local' or 'remote'
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * The name used as a form element.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The text displayed when there are no suggestions.
    */
  var noSuggestionText: js.UndefOr[String] = js.undefined
  /**
    * The default placeholder text when nothing has been entered
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Allow customization of query parameter
    */
  var queryParam: js.UndefOr[String] = js.undefined
  /**
    * A function used to define how the items will be presented in the combo
    */
  var renderer: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.undefined
  /**
    * Whether or not this field should be required
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to render selection as a delimited string
    */
  var resultAsString: js.UndefOr[Boolean] = js.undefined
  /**
    * Text delimiter to use in a delimited string.
    */
  var resultAsStringDelimiter: js.UndefOr[String] = js.undefined
  /**
    * Name of JSON object property that represents the list of suggested objects
    */
  var resultsField: js.UndefOr[String] = js.undefined
  /**
    * Auto select the first matching item with multiple items shown
    */
  var selectFirst: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom CSS class to add to a selected item
    */
  var selectionCls: js.UndefOr[String] = js.undefined
  /**
    * An optional element replacement in which the selection is rendered
    */
  var selectionContainer: js.UndefOr[JQuery] = js.undefined
  /**
    * Where the selected items will be displayed. Only 'right', 'bottom' and 'inner' are valid values
    */
  var selectionPosition: js.UndefOr[String] = js.undefined
  /**
    * A function used to define how the items will be presented in the tag list
    */
  var selectionRenderer: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.undefined
  /**
    * Set to true to stack the selectioned items when positioned on the bottom
    *    Requires the selectionPosition to be set to 'bottom'
    */
  var selectionStacked: js.UndefOr[Boolean] = js.undefined
  /**
    * Direction used for sorting. Only 'asc' and 'desc' are valid values
    */
  var sortDir: js.UndefOr[String] = js.undefined
  /**
    * name of JSON object property for local result sorting.
    *    Leave null if you do not wish the results to be ordered or if they are already ordered remotely.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
  /**
    * If set to boolean; suggestions will have to start by user input (and not simply contain it as a substring)
    */
  var strictSuggest: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom style added to the component container.
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    * If set to boolean; the combo will expand / collapse when clicked upon
    */
  var toggleOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Amount (in ms) between keyboard registers.
    */
  var typeDelay: js.UndefOr[Double] = js.undefined
  /**
    * If set to boolean; using comma will validate the user's choice
    */
  var useCommaKey: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to boolean; tab won't blur the component but will be registered as the ENTER key
    */
  var useTabKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether or not the results will be displayed with a zebra table style
    */
  var useZebraStyle: js.UndefOr[Boolean] = js.undefined
  /**
    * initial value for the field
    */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
    * name of JSON object property that represents its underlying value
    */
  var valueField: js.UndefOr[String] = js.undefined
  /**
    * regular expression to validate the values against
    */
  var vregex: js.UndefOr[js.Any] = js.undefined
  /**
    * type to validate against
    */
  var vtype: js.UndefOr[js.Any] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    ajaxConfig: JQueryAjaxSettings = null,
    allowDuplicates: js.UndefOr[Boolean] = js.undefined,
    allowFreeEntries: js.UndefOr[Boolean] = js.undefined,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    beforeSend: () => Unit = null,
    cls: String = null,
    data: js.Any = null,
    dataUrlParams: js.Object = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledField: String = null,
    displayField: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    expandOnFocus: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    groupBy: String = null,
    hideTrigger: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    infoMsgCls: String = null,
    inputCfg: js.Any = null,
    invalidCls: String = null,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    maxDropHeight: Int | Double = null,
    maxEntryLength: Int | Double = null,
    maxEntryRenderer: /* v */ js.UndefOr[Double] => Unit = null,
    maxSelection: Int | Double = null,
    maxSelectionRenderer: /* v */ Double => Unit = null,
    maxSuggestions: Int | Double = null,
    method: String = null,
    minChars: Int | Double = null,
    minCharsRenderer: /* v */ Double => Unit = null,
    mode: String = null,
    name: String = null,
    noSuggestionText: String = null,
    placeholder: String = null,
    queryParam: String = null,
    renderer: /* item */ js.Any => Unit = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resultAsString: js.UndefOr[Boolean] = js.undefined,
    resultAsStringDelimiter: String = null,
    resultsField: String = null,
    selectFirst: js.UndefOr[Boolean] = js.undefined,
    selectionCls: String = null,
    selectionContainer: JQuery = null,
    selectionPosition: String = null,
    selectionRenderer: /* item */ js.Any => Unit = null,
    selectionStacked: js.UndefOr[Boolean] = js.undefined,
    sortDir: String = null,
    sortOrder: String = null,
    strictSuggest: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    toggleOnClick: js.UndefOr[Boolean] = js.undefined,
    typeDelay: Int | Double = null,
    useCommaKey: js.UndefOr[Boolean] = js.undefined,
    useTabKey: js.UndefOr[Boolean] = js.undefined,
    useZebraStyle: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null,
    valueField: String = null,
    vregex: js.Any = null,
    vtype: js.Any = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (ajaxConfig != null) __obj.updateDynamic("ajaxConfig")(ajaxConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDuplicates)) __obj.updateDynamic("allowDuplicates")(allowDuplicates.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFreeEntries)) __obj.updateDynamic("allowFreeEntries")(allowFreeEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction0(beforeSend))
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataUrlParams != null) __obj.updateDynamic("dataUrlParams")(dataUrlParams.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledField != null) __obj.updateDynamic("disabledField")(disabledField.asInstanceOf[js.Any])
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnFocus)) __obj.updateDynamic("expandOnFocus")(expandOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTrigger)) __obj.updateDynamic("hideTrigger")(hideTrigger.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (infoMsgCls != null) __obj.updateDynamic("infoMsgCls")(infoMsgCls.asInstanceOf[js.Any])
    if (inputCfg != null) __obj.updateDynamic("inputCfg")(inputCfg.asInstanceOf[js.Any])
    if (invalidCls != null) __obj.updateDynamic("invalidCls")(invalidCls.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.asInstanceOf[js.Any])
    if (maxDropHeight != null) __obj.updateDynamic("maxDropHeight")(maxDropHeight.asInstanceOf[js.Any])
    if (maxEntryLength != null) __obj.updateDynamic("maxEntryLength")(maxEntryLength.asInstanceOf[js.Any])
    if (maxEntryRenderer != null) __obj.updateDynamic("maxEntryRenderer")(js.Any.fromFunction1(maxEntryRenderer))
    if (maxSelection != null) __obj.updateDynamic("maxSelection")(maxSelection.asInstanceOf[js.Any])
    if (maxSelectionRenderer != null) __obj.updateDynamic("maxSelectionRenderer")(js.Any.fromFunction1(maxSelectionRenderer))
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (minCharsRenderer != null) __obj.updateDynamic("minCharsRenderer")(js.Any.fromFunction1(minCharsRenderer))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noSuggestionText != null) __obj.updateDynamic("noSuggestionText")(noSuggestionText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (queryParam != null) __obj.updateDynamic("queryParam")(queryParam.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(resultAsString)) __obj.updateDynamic("resultAsString")(resultAsString.asInstanceOf[js.Any])
    if (resultAsStringDelimiter != null) __obj.updateDynamic("resultAsStringDelimiter")(resultAsStringDelimiter.asInstanceOf[js.Any])
    if (resultsField != null) __obj.updateDynamic("resultsField")(resultsField.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirst)) __obj.updateDynamic("selectFirst")(selectFirst.asInstanceOf[js.Any])
    if (selectionCls != null) __obj.updateDynamic("selectionCls")(selectionCls.asInstanceOf[js.Any])
    if (selectionContainer != null) __obj.updateDynamic("selectionContainer")(selectionContainer.asInstanceOf[js.Any])
    if (selectionPosition != null) __obj.updateDynamic("selectionPosition")(selectionPosition.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (!js.isUndefined(selectionStacked)) __obj.updateDynamic("selectionStacked")(selectionStacked.asInstanceOf[js.Any])
    if (sortDir != null) __obj.updateDynamic("sortDir")(sortDir.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSuggest)) __obj.updateDynamic("strictSuggest")(strictSuggest.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick.asInstanceOf[js.Any])
    if (typeDelay != null) __obj.updateDynamic("typeDelay")(typeDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(useCommaKey)) __obj.updateDynamic("useCommaKey")(useCommaKey.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabKey)) __obj.updateDynamic("useTabKey")(useTabKey.asInstanceOf[js.Any])
    if (!js.isUndefined(useZebraStyle)) __obj.updateDynamic("useZebraStyle")(useZebraStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (vregex != null) __obj.updateDynamic("vregex")(vregex.asInstanceOf[js.Any])
    if (vtype != null) __obj.updateDynamic("vtype")(vtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}


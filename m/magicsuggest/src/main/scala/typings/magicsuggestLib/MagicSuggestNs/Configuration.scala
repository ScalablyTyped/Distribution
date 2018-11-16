package typings
package magicsuggestLib.MagicSuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Configuration extends js.Object {
  /**
           * Additional config object passed to each $.ajax call
           */
  var ajaxConfig: js.UndefOr[jqueryLib.JQueryAjaxSettings] = js.undefined
  /**
           * Restricts or allows the user to add the same entry more than once
           * Defaults to false.
           */
  var allowDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  /* ********  CONFIGURATION PROPERTIES ************/
  /**
           * Restricts or allows the user to validate typed entries.
           * Defaults to true.
           */
  var allowFreeEntries: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If a single suggestion comes out, it is preselected.
           */
  var autoSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A function triggered just before the ajax request is sent, similar to jQuery
           */
  var beforeSend: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * A custom CSS class to apply to the field's underlying element.
           */
  var cls: js.UndefOr[java.lang.String] = js.undefined
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
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Name of JSON object property that defines the disabled behaviour
           */
  var disabledField: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of JSON object property displayed in the combo list
           */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set to false if you only want mouse interaction. In that case the combo will
           * automatically expand on focus.
           */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Automatically expands combo on focus.
           */
  var expandOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set starting state for combo.
           */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * JSON property by which the list should be grouped
           */
  var groupBy: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set to true to hide the trigger on the right
           */
  var hideTrigger: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set to true to highlight search input within displayed suggestions
           */
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A custom ID for this component
           */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A class that is added to the info message appearing on the top-right part of the component
           */
  var infoMsgCls: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Additional parameters passed out to the INPUT tag. Enables usage of AngularJS's custom tags for ex.
           */
  var inputCfg: js.UndefOr[js.Any] = js.undefined
  /**
           * The class that is applied to show that the field is invalid
           */
  var invalidCls: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set to true to filter data results according to case. Useless if the data is fetched remotely
           */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Once expanded, the combo's height will take as much room as the # of available results.
           *    In case there are too many results displayed, this will fix the drop down height.
           */
  var maxDropHeight: js.UndefOr[scala.Double] = js.undefined
  /**
           * Defines how long the user free entry can be. Set to null for no limit.
           */
  var maxEntryLength: js.UndefOr[scala.Double] = js.undefined
  /**
           * A function that defines the helper text when the max entry length has been surpassed.
           */
  var maxEntryRenderer: js.UndefOr[js.Function1[/* v */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /**
           * The maximum number of items the user can select if multiple selection is allowed.
           *    Set to null to remove the limit.
           */
  var maxSelection: js.UndefOr[scala.Double] = js.undefined
  /**
           * A function that defines the helper text when the max selection amount has been reached. The function has a single
           *    parameter which is the number of selected elements.
           */
  var maxSelectionRenderer: js.UndefOr[js.Function1[/* v */ scala.Double, scala.Unit]] = js.undefined
  /**
           * The maximum number of results displayed in the combo drop down at once.
           */
  var maxSuggestions: js.UndefOr[scala.Double] = js.undefined
  /**
           * The method used by the ajax request.
           */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The minimum number of characters the user must type before the combo expands and offers suggestions.
           */
  var minChars: js.UndefOr[scala.Double] = js.undefined
  /**
           * A function that defines the helper text when not enough letters are set. The function has a single
           *    parameter which is the difference between the required amount of letters and the current one.
           */
  var minCharsRenderer: js.UndefOr[js.Function1[/* v */ scala.Double, scala.Unit]] = js.undefined
  /**
           * Whether or not sorting / filtering should be done remotely or locally.
           * Use either 'local' or 'remote'
           */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The name used as a form element.
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The text displayed when there are no suggestions.
           */
  var noSuggestionText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The default placeholder text when nothing has been entered
           */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Allow customization of query parameter
           */
  var queryParam: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A function used to define how the items will be presented in the combo
           */
  var renderer: js.UndefOr[js.Function1[/* item */ js.Any, scala.Unit]] = js.undefined
  /**
           * Whether or not this field should be required
           */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set to true to render selection as a delimited string
           */
  var resultAsString: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Text delimiter to use in a delimited string.
           */
  var resultAsStringDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of JSON object property that represents the list of suggested objects
           */
  var resultsField: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Auto select the first matching item with multiple items shown
           */
  var selectFirst: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A custom CSS class to add to a selected item
           */
  var selectionCls: js.UndefOr[java.lang.String] = js.undefined
  /**
           * An optional element replacement in which the selection is rendered
           */
  var selectionContainer: js.UndefOr[magicsuggestLib.JQuery] = js.undefined
  /**
           * Where the selected items will be displayed. Only 'right', 'bottom' and 'inner' are valid values
           */
  var selectionPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A function used to define how the items will be presented in the tag list
           */
  var selectionRenderer: js.UndefOr[js.Function1[/* item */ js.Any, scala.Unit]] = js.undefined
  /**
           * Set to true to stack the selectioned items when positioned on the bottom
           *    Requires the selectionPosition to be set to 'bottom'
           */
  var selectionStacked: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Direction used for sorting. Only 'asc' and 'desc' are valid values
           */
  var sortDir: js.UndefOr[java.lang.String] = js.undefined
  /**
           * name of JSON object property for local result sorting.
           *    Leave null if you do not wish the results to be ordered or if they are already ordered remotely.
           */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If set to boolean; suggestions will have to start by user input (and not simply contain it as a substring)
           */
  var strictSuggest: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Custom style added to the component container.
           */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If set to boolean; the combo will expand / collapse when clicked upon
           */
  var toggleOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Amount (in ms) between keyboard registers.
           */
  var typeDelay: js.UndefOr[scala.Double] = js.undefined
  /**
           * If set to boolean; using comma will validate the user's choice
           */
  var useCommaKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If set to boolean; tab won't blur the component but will be registered as the ENTER key
           */
  var useTabKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Determines whether or not the results will be displayed with a zebra table style
           */
  var useZebraStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * initial value for the field
           */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
           * name of JSON object property that represents its underlying value
           */
  var valueField: js.UndefOr[java.lang.String] = js.undefined
  /**
           * regular expression to validate the values against
           */
  var vregex: js.UndefOr[js.Any] = js.undefined
  /**
           * type to validate against
           */
  var vtype: js.UndefOr[js.Any] = js.undefined
}


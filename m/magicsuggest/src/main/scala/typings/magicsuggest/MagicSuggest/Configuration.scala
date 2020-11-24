package typings.magicsuggest.MagicSuggest

import typings.jquery.JQueryAjaxSettings
import typings.magicsuggest.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  /**
    * Additional config object passed to each $.ajax call
    */
  var ajaxConfig: js.UndefOr[JQueryAjaxSettings] = js.native
  
  /**
    * Restricts or allows the user to add the same entry more than once
    * Defaults to false.
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.native
  
  /* ********  CONFIGURATION PROPERTIES ************/
  /**
    * Restricts or allows the user to validate typed entries.
    * Defaults to true.
    */
  var allowFreeEntries: js.UndefOr[Boolean] = js.native
  
  /**
    * If a single suggestion comes out, it is preselected.
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * A function triggered just before the ajax request is sent, similar to jQuery
    */
  var beforeSend: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A custom CSS class to apply to the field's underlying element.
    */
  var cls: js.UndefOr[String] = js.native
  
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
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Additional parameters to the ajax call
    */
  var dataUrlParams: js.UndefOr[js.Object] = js.native
  
  /**
    * Start the component in a disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of JSON object property that defines the disabled behaviour
    */
  var disabledField: js.UndefOr[String] = js.native
  
  /**
    * Name of JSON object property displayed in the combo list
    */
  var displayField: js.UndefOr[String] = js.native
  
  /**
    * Set to false if you only want mouse interaction. In that case the combo will
    * automatically expand on focus.
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically expands combo on focus.
    */
  var expandOnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Set starting state for combo.
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * JSON property by which the list should be grouped
    */
  var groupBy: js.UndefOr[String] = js.native
  
  /**
    * Set to true to hide the trigger on the right
    */
  var hideTrigger: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to highlight search input within displayed suggestions
    */
  var highlight: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom ID for this component
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A class that is added to the info message appearing on the top-right part of the component
    */
  var infoMsgCls: js.UndefOr[String] = js.native
  
  /**
    * Additional parameters passed out to the INPUT tag. Enables usage of AngularJS's custom tags for ex.
    */
  var inputCfg: js.UndefOr[js.Any] = js.native
  
  /**
    * The class that is applied to show that the field is invalid
    */
  var invalidCls: js.UndefOr[String] = js.native
  
  /**
    * Set to true to filter data results according to case. Useless if the data is fetched remotely
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /**
    * Once expanded, the combo's height will take as much room as the # of available results.
    *    In case there are too many results displayed, this will fix the drop down height.
    */
  var maxDropHeight: js.UndefOr[Double] = js.native
  
  /**
    * Defines how long the user free entry can be. Set to null for no limit.
    */
  var maxEntryLength: js.UndefOr[Double] = js.native
  
  /**
    * A function that defines the helper text when the max entry length has been surpassed.
    */
  var maxEntryRenderer: js.UndefOr[js.Function1[/* v */ js.UndefOr[Double], Unit]] = js.native
  
  /**
    * The maximum number of items the user can select if multiple selection is allowed.
    *    Set to null to remove the limit.
    */
  var maxSelection: js.UndefOr[Double] = js.native
  
  /**
    * A function that defines the helper text when the max selection amount has been reached. The function has a single
    *    parameter which is the number of selected elements.
    */
  var maxSelectionRenderer: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.native
  
  /**
    * The maximum number of results displayed in the combo drop down at once.
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  
  /**
    * The method used by the ajax request.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The minimum number of characters the user must type before the combo expands and offers suggestions.
    */
  var minChars: js.UndefOr[Double] = js.native
  
  /**
    * A function that defines the helper text when not enough letters are set. The function has a single
    *    parameter which is the difference between the required amount of letters and the current one.
    */
  var minCharsRenderer: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.native
  
  /**
    * Whether or not sorting / filtering should be done remotely or locally.
    * Use either 'local' or 'remote'
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * The name used as a form element.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The text displayed when there are no suggestions.
    */
  var noSuggestionText: js.UndefOr[String] = js.native
  
  /**
    * The default placeholder text when nothing has been entered
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Allow customization of query parameter
    */
  var queryParam: js.UndefOr[String] = js.native
  
  /**
    * A function used to define how the items will be presented in the combo
    */
  var renderer: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.native
  
  /**
    * Whether or not this field should be required
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to render selection as a delimited string
    */
  var resultAsString: js.UndefOr[Boolean] = js.native
  
  /**
    * Text delimiter to use in a delimited string.
    */
  var resultAsStringDelimiter: js.UndefOr[String] = js.native
  
  /**
    * Name of JSON object property that represents the list of suggested objects
    */
  var resultsField: js.UndefOr[String] = js.native
  
  /**
    * Auto select the first matching item with multiple items shown
    */
  var selectFirst: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom CSS class to add to a selected item
    */
  var selectionCls: js.UndefOr[String] = js.native
  
  /**
    * An optional element replacement in which the selection is rendered
    */
  var selectionContainer: js.UndefOr[JQuery] = js.native
  
  /**
    * Where the selected items will be displayed. Only 'right', 'bottom' and 'inner' are valid values
    */
  var selectionPosition: js.UndefOr[String] = js.native
  
  /**
    * A function used to define how the items will be presented in the tag list
    */
  var selectionRenderer: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.native
  
  /**
    * Set to true to stack the selectioned items when positioned on the bottom
    *    Requires the selectionPosition to be set to 'bottom'
    */
  var selectionStacked: js.UndefOr[Boolean] = js.native
  
  /**
    * Direction used for sorting. Only 'asc' and 'desc' are valid values
    */
  var sortDir: js.UndefOr[String] = js.native
  
  /**
    * name of JSON object property for local result sorting.
    *    Leave null if you do not wish the results to be ordered or if they are already ordered remotely.
    */
  var sortOrder: js.UndefOr[String] = js.native
  
  /**
    * If set to boolean; suggestions will have to start by user input (and not simply contain it as a substring)
    */
  var strictSuggest: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom style added to the component container.
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    * If set to boolean; the combo will expand / collapse when clicked upon
    */
  var toggleOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Amount (in ms) between keyboard registers.
    */
  var typeDelay: js.UndefOr[Double] = js.native
  
  /**
    * If set to boolean; using comma will validate the user's choice
    */
  var useCommaKey: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to boolean; tab won't blur the component but will be registered as the ENTER key
    */
  var useTabKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether or not the results will be displayed with a zebra table style
    */
  var useZebraStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * initial value for the field
    */
  var value: js.UndefOr[js.Any] = js.native
  
  /**
    * name of JSON object property that represents its underlying value
    */
  var valueField: js.UndefOr[String] = js.native
  
  /**
    * regular expression to validate the values against
    */
  var vregex: js.UndefOr[js.Any] = js.native
  
  /**
    * type to validate against
    */
  var vtype: js.UndefOr[js.Any] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setAjaxConfig(value: JQueryAjaxSettings): Self = this.set("ajaxConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxConfig: Self = this.set("ajaxConfig", js.undefined)
    
    @scala.inline
    def setAllowDuplicates(value: Boolean): Self = this.set("allowDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDuplicates: Self = this.set("allowDuplicates", js.undefined)
    
    @scala.inline
    def setAllowFreeEntries(value: Boolean): Self = this.set("allowFreeEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFreeEntries: Self = this.set("allowFreeEntries", js.undefined)
    
    @scala.inline
    def setAutoSelect(value: Boolean): Self = this.set("autoSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSelect: Self = this.set("autoSelect", js.undefined)
    
    @scala.inline
    def setBeforeSend(value: () => Unit): Self = this.set("beforeSend", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataUrlParams(value: js.Object): Self = this.set("dataUrlParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataUrlParams: Self = this.set("dataUrlParams", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledField(value: String): Self = this.set("disabledField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledField: Self = this.set("disabledField", js.undefined)
    
    @scala.inline
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setExpandOnFocus(value: Boolean): Self = this.set("expandOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnFocus: Self = this.set("expandOnFocus", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setGroupBy(value: String): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setHideTrigger(value: Boolean): Self = this.set("hideTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTrigger: Self = this.set("hideTrigger", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInfoMsgCls(value: String): Self = this.set("infoMsgCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoMsgCls: Self = this.set("infoMsgCls", js.undefined)
    
    @scala.inline
    def setInputCfg(value: js.Any): Self = this.set("inputCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputCfg: Self = this.set("inputCfg", js.undefined)
    
    @scala.inline
    def setInvalidCls(value: String): Self = this.set("invalidCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidCls: Self = this.set("invalidCls", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    
    @scala.inline
    def setMaxDropHeight(value: Double): Self = this.set("maxDropHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDropHeight: Self = this.set("maxDropHeight", js.undefined)
    
    @scala.inline
    def setMaxEntryLength(value: Double): Self = this.set("maxEntryLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEntryLength: Self = this.set("maxEntryLength", js.undefined)
    
    @scala.inline
    def setMaxEntryRenderer(value: /* v */ js.UndefOr[Double] => Unit): Self = this.set("maxEntryRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMaxEntryRenderer: Self = this.set("maxEntryRenderer", js.undefined)
    
    @scala.inline
    def setMaxSelection(value: Double): Self = this.set("maxSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSelection: Self = this.set("maxSelection", js.undefined)
    
    @scala.inline
    def setMaxSelectionRenderer(value: /* v */ Double => Unit): Self = this.set("maxSelectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMaxSelectionRenderer: Self = this.set("maxSelectionRenderer", js.undefined)
    
    @scala.inline
    def setMaxSuggestions(value: Double): Self = this.set("maxSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSuggestions: Self = this.set("maxSuggestions", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMinChars(value: Double): Self = this.set("minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChars: Self = this.set("minChars", js.undefined)
    
    @scala.inline
    def setMinCharsRenderer(value: /* v */ Double => Unit): Self = this.set("minCharsRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMinCharsRenderer: Self = this.set("minCharsRenderer", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoSuggestionText(value: String): Self = this.set("noSuggestionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSuggestionText: Self = this.set("noSuggestionText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setQueryParam(value: String): Self = this.set("queryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParam: Self = this.set("queryParam", js.undefined)
    
    @scala.inline
    def setRenderer(value: /* item */ js.Any => Unit): Self = this.set("renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResultAsString(value: Boolean): Self = this.set("resultAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultAsString: Self = this.set("resultAsString", js.undefined)
    
    @scala.inline
    def setResultAsStringDelimiter(value: String): Self = this.set("resultAsStringDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultAsStringDelimiter: Self = this.set("resultAsStringDelimiter", js.undefined)
    
    @scala.inline
    def setResultsField(value: String): Self = this.set("resultsField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultsField: Self = this.set("resultsField", js.undefined)
    
    @scala.inline
    def setSelectFirst(value: Boolean): Self = this.set("selectFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectFirst: Self = this.set("selectFirst", js.undefined)
    
    @scala.inline
    def setSelectionCls(value: String): Self = this.set("selectionCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionCls: Self = this.set("selectionCls", js.undefined)
    
    @scala.inline
    def setSelectionContainer(value: JQuery): Self = this.set("selectionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionContainer: Self = this.set("selectionContainer", js.undefined)
    
    @scala.inline
    def setSelectionPosition(value: String): Self = this.set("selectionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionPosition: Self = this.set("selectionPosition", js.undefined)
    
    @scala.inline
    def setSelectionRenderer(value: /* item */ js.Any => Unit): Self = this.set("selectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectionRenderer: Self = this.set("selectionRenderer", js.undefined)
    
    @scala.inline
    def setSelectionStacked(value: Boolean): Self = this.set("selectionStacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStacked: Self = this.set("selectionStacked", js.undefined)
    
    @scala.inline
    def setSortDir(value: String): Self = this.set("sortDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDir: Self = this.set("sortDir", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setStrictSuggest(value: Boolean): Self = this.set("strictSuggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictSuggest: Self = this.set("strictSuggest", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setToggleOnClick(value: Boolean): Self = this.set("toggleOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleOnClick: Self = this.set("toggleOnClick", js.undefined)
    
    @scala.inline
    def setTypeDelay(value: Double): Self = this.set("typeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeDelay: Self = this.set("typeDelay", js.undefined)
    
    @scala.inline
    def setUseCommaKey(value: Boolean): Self = this.set("useCommaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCommaKey: Self = this.set("useCommaKey", js.undefined)
    
    @scala.inline
    def setUseTabKey(value: Boolean): Self = this.set("useTabKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTabKey: Self = this.set("useTabKey", js.undefined)
    
    @scala.inline
    def setUseZebraStyle(value: Boolean): Self = this.set("useZebraStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseZebraStyle: Self = this.set("useZebraStyle", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
    
    @scala.inline
    def setVregex(value: js.Any): Self = this.set("vregex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVregex: Self = this.set("vregex", js.undefined)
    
    @scala.inline
    def setVtype(value: js.Any): Self = this.set("vtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVtype: Self = this.set("vtype", js.undefined)
  }
}

package typings.magicsuggest

import typings.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MagicSuggest {
  
  trait Configuration extends StObject {
    
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
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxConfig(value: JQueryAjaxSettings): Self = StObject.set(x, "ajaxConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxConfigUndefined: Self = StObject.set(x, "ajaxConfig", js.undefined)
      
      @scala.inline
      def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
      
      @scala.inline
      def setAllowFreeEntries(value: Boolean): Self = StObject.set(x, "allowFreeEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFreeEntriesUndefined: Self = StObject.set(x, "allowFreeEntries", js.undefined)
      
      @scala.inline
      def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      @scala.inline
      def setBeforeSend(value: () => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      @scala.inline
      def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataUrlParams(value: js.Object): Self = StObject.set(x, "dataUrlParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUrlParamsUndefined: Self = StObject.set(x, "dataUrlParams", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledField(value: String): Self = StObject.set(x, "disabledField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledFieldUndefined: Self = StObject.set(x, "disabledField", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setExpandOnFocus(value: Boolean): Self = StObject.set(x, "expandOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnFocusUndefined: Self = StObject.set(x, "expandOnFocus", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setHideTrigger(value: Boolean): Self = StObject.set(x, "hideTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTriggerUndefined: Self = StObject.set(x, "hideTrigger", js.undefined)
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInfoMsgCls(value: String): Self = StObject.set(x, "infoMsgCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoMsgClsUndefined: Self = StObject.set(x, "infoMsgCls", js.undefined)
      
      @scala.inline
      def setInputCfg(value: js.Any): Self = StObject.set(x, "inputCfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputCfgUndefined: Self = StObject.set(x, "inputCfg", js.undefined)
      
      @scala.inline
      def setInvalidCls(value: String): Self = StObject.set(x, "invalidCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidClsUndefined: Self = StObject.set(x, "invalidCls", js.undefined)
      
      @scala.inline
      def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
      
      @scala.inline
      def setMaxDropHeight(value: Double): Self = StObject.set(x, "maxDropHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDropHeightUndefined: Self = StObject.set(x, "maxDropHeight", js.undefined)
      
      @scala.inline
      def setMaxEntryLength(value: Double): Self = StObject.set(x, "maxEntryLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEntryLengthUndefined: Self = StObject.set(x, "maxEntryLength", js.undefined)
      
      @scala.inline
      def setMaxEntryRenderer(value: /* v */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "maxEntryRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxEntryRendererUndefined: Self = StObject.set(x, "maxEntryRenderer", js.undefined)
      
      @scala.inline
      def setMaxSelection(value: Double): Self = StObject.set(x, "maxSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSelectionRenderer(value: /* v */ Double => Unit): Self = StObject.set(x, "maxSelectionRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxSelectionRendererUndefined: Self = StObject.set(x, "maxSelectionRenderer", js.undefined)
      
      @scala.inline
      def setMaxSelectionUndefined: Self = StObject.set(x, "maxSelection", js.undefined)
      
      @scala.inline
      def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSuggestionsUndefined: Self = StObject.set(x, "maxSuggestions", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCharsRenderer(value: /* v */ Double => Unit): Self = StObject.set(x, "minCharsRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinCharsRendererUndefined: Self = StObject.set(x, "minCharsRenderer", js.undefined)
      
      @scala.inline
      def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoSuggestionText(value: String): Self = StObject.set(x, "noSuggestionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSuggestionTextUndefined: Self = StObject.set(x, "noSuggestionText", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setQueryParam(value: String): Self = StObject.set(x, "queryParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamUndefined: Self = StObject.set(x, "queryParam", js.undefined)
      
      @scala.inline
      def setRenderer(value: /* item */ js.Any => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResultAsString(value: Boolean): Self = StObject.set(x, "resultAsString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultAsStringDelimiter(value: String): Self = StObject.set(x, "resultAsStringDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultAsStringDelimiterUndefined: Self = StObject.set(x, "resultAsStringDelimiter", js.undefined)
      
      @scala.inline
      def setResultAsStringUndefined: Self = StObject.set(x, "resultAsString", js.undefined)
      
      @scala.inline
      def setResultsField(value: String): Self = StObject.set(x, "resultsField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsFieldUndefined: Self = StObject.set(x, "resultsField", js.undefined)
      
      @scala.inline
      def setSelectFirst(value: Boolean): Self = StObject.set(x, "selectFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectFirstUndefined: Self = StObject.set(x, "selectFirst", js.undefined)
      
      @scala.inline
      def setSelectionCls(value: String): Self = StObject.set(x, "selectionCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionClsUndefined: Self = StObject.set(x, "selectionCls", js.undefined)
      
      @scala.inline
      def setSelectionContainer(value: JQuery): Self = StObject.set(x, "selectionContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionContainerUndefined: Self = StObject.set(x, "selectionContainer", js.undefined)
      
      @scala.inline
      def setSelectionPosition(value: String): Self = StObject.set(x, "selectionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionPositionUndefined: Self = StObject.set(x, "selectionPosition", js.undefined)
      
      @scala.inline
      def setSelectionRenderer(value: /* item */ js.Any => Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
      
      @scala.inline
      def setSelectionStacked(value: Boolean): Self = StObject.set(x, "selectionStacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStackedUndefined: Self = StObject.set(x, "selectionStacked", js.undefined)
      
      @scala.inline
      def setSortDir(value: String): Self = StObject.set(x, "sortDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDirUndefined: Self = StObject.set(x, "sortDir", js.undefined)
      
      @scala.inline
      def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setStrictSuggest(value: Boolean): Self = StObject.set(x, "strictSuggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSuggestUndefined: Self = StObject.set(x, "strictSuggest", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setToggleOnClick(value: Boolean): Self = StObject.set(x, "toggleOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleOnClickUndefined: Self = StObject.set(x, "toggleOnClick", js.undefined)
      
      @scala.inline
      def setTypeDelay(value: Double): Self = StObject.set(x, "typeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeDelayUndefined: Self = StObject.set(x, "typeDelay", js.undefined)
      
      @scala.inline
      def setUseCommaKey(value: Boolean): Self = StObject.set(x, "useCommaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCommaKeyUndefined: Self = StObject.set(x, "useCommaKey", js.undefined)
      
      @scala.inline
      def setUseTabKey(value: Boolean): Self = StObject.set(x, "useTabKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTabKeyUndefined: Self = StObject.set(x, "useTabKey", js.undefined)
      
      @scala.inline
      def setUseZebraStyle(value: Boolean): Self = StObject.set(x, "useZebraStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseZebraStyleUndefined: Self = StObject.set(x, "useZebraStyle", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVregex(value: js.Any): Self = StObject.set(x, "vregex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVregexUndefined: Self = StObject.set(x, "vregex", js.undefined)
      
      @scala.inline
      def setVtype(value: js.Any): Self = StObject.set(x, "vtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVtypeUndefined: Self = StObject.set(x, "vtype", js.undefined)
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    /**
      * Add one or multiple json items to the current selection
      * @param items - json object or array of json objects
      * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
      */
    def addToSelection(objs: js.Array[js.Any]): Unit = js.native
    def addToSelection(objs: js.Array[js.Any], isSilent: Boolean): Unit = js.native
    
    /**
      * Clears the current selection
      * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
      */
    def clear(): Unit = js.native
    def clear(isSilent: Boolean): Unit = js.native
    
    /**
      * Collapse the drop down part of the combo
      */
    def collapse(): Unit = js.native
    
    /**
      * Set the component in a disabled state.
      */
    def disable(): Unit = js.native
    
    /**
      * Empties out the combo user text
      */
    def empty(): Unit = js.native
    
    /**
      * Set the component in a enable state.
      */
    def enable(): Unit = js.native
    
    /**
      * Get current data
      */
    def getData(): js.Any = js.native
    
    /**
      * Gets the data params for current ajax request
      */
    def getDataUrlParams(): js.Object = js.native
    
    /**
      * Gets the name given to the form input
      */
    def getName(): String = js.native
    
    /**
      * Retrieve the current text entered by the user
      */
    def getRawValue(): String = js.native
    
    /**
      * Retrieve an array of selected json objects
      * @return {Array}
      */
    def getSelection(): js.Array[js.Any] = js.native
    
    /**
      * Retrieve an array of selected values
      */
    def getValue(): js.Array[js.Any] = js.native
    
    /**
      * Retrieve component enabled status
      * @return {boolean}
      */
    def isDisabled(): Boolean = js.native
    
    /**
      * Checks whether the field is valid or not
      * @return {boolean}
      */
    def isValid(): Boolean = js.native
    
    /**
      * Remove one or multiples json items from the current selection
      * @param items - json object or array of json objects
      * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
      */
    def removeFromSelection(items: js.Any, isSilent: Boolean): Unit = js.native
    
    /**
      * Set up some combo data after it has been rendered
      * @param data
      */
    def setData(data: js.Any): Unit = js.native
    
    /**
      * Sets data params for subsequent ajax requests
      * @param params
      */
    def setDataUrlParams(params: js.Any): Unit = js.native
    
    /**
      * Sets the name for the input field so it can be fetched in the form
      * @param name
      */
    def setName(name: String): Unit = js.native
    
    /**
      * Sets the current selection with the JSON items provided
      * @param items
      * @param isSilent - (optional)
      */
    def setSelection(items: js.Array[js.Any]): Unit = js.native
    def setSelection(items: js.Array[js.Any], isSilet: Boolean): Unit = js.native
    
    /**
      * Sets a value for the combo box. Value must be an array of values with data type matching valueField one.
      * @param data
      */
    def setValue(values: js.Array[js.Any]): Unit = js.native
  }
}

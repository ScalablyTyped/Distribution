package typings.jqueryTypeahead.RunningCoder.Typeahead

import typings.jqueryTypeahead.JQuery
import typings.jqueryTypeahead.jqueryTypeaheadBooleans.`false`
import typings.jqueryTypeahead.jqueryTypeaheadBooleans.`true`
import typings.jqueryTypeahead.jqueryTypeaheadStrings.any
import typings.jqueryTypeahead.jqueryTypeaheadStrings.asc
import typings.jqueryTypeahead.jqueryTypeaheadStrings.desc
import typings.jqueryTypeahead.jqueryTypeaheadStrings.localStorage
import typings.jqueryTypeahead.jqueryTypeaheadStrings.sessionStorage
import typings.jqueryTypeahead.jqueryTypeaheadStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If enabled, the query and search results will ignore accents (`ãàáäâẽèéëêìíïîõòóöôùúüûñç`) and display every matches regardless of the punctuation.  Ex: `é = e`, `À = a`, etc.
    * It is possible to set a custom accent object, by simply setting `from` and `to` keys
    * * Using this option on large data sets (10,000+ items) might impact your search performances.
    *
    * @default false
    */
  var accent: js.UndefOr[Boolean | FromToPair] = js.native
  
  /**
    * If set to `true`, html will be added to add a backdrop under the search input and results.
    * It is possible to override the css options by passing an object to this option.
    */
  var backdrop: js.UndefOr[Boolean | CssObject] = js.native
  
  /**
    * If set to `true`, as soon as the Typeahead input is focused, the `backdrop` option will be displayed regardless.
    */
  var backdropOnFocus: js.UndefOr[`true`] = js.native
  
  /** Blur Typeahead when Tab key is pressed, if false Tab will go though search results */
  var blurOnTab: js.UndefOr[Boolean] = js.native
  
  /**
    * * If set to `true` or `localStorage`, the source data will be stored in `localStorage`.
    * * If set to `sessionStorage`, the source data will be stored in `sessionStorage`.
    */
  var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.native
  
  /**
    * The callbacks are used to customize and add functionality to your Typeahead instance. You will find plenty of examples in the Demo section.
    * There are 3 ways to define the callbacks:
    * * Function `(recommended)`: Anonymous function calling a local function with parameters.
    * * String: Function name (can be namespaced) located on the window scope without any parameters.
    * * Array: First element is the function name accessible from the window scope, second element is an array containing the parameters.
    */
  var callback: js.UndefOr[Callback] = js.native
  
  /**
    * This option provides a small `"x"` on the right side of the input to clear the text,
    * similar to some browser's default behavior with `input[type="search"]`.
    */
  var cancelButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Enabling this option will compress the data inside Localstorage.
    * * Setting `compression: true` requires `cache: true` option to be enabled.
    */
  var compression: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, search text matching is reserved to `display` keys. A searched text can't match multiple keys.
    *
    * If the option is enabled with `true` or `array` of display keys, every item will reveive an additional key called `compiled`.
    * This key will then be searched first (using soften matching mechanism) for any matching results, then the `display` keys will
    * be searched (using a `"string perfect"` matching mechanism).
    *
    * If the option is set to true, the `template` option will be compiled into the `"compiled"` item key.
    *
    * It is also possible to set an Array of display keys instead of the complete template. Try it on
    * [Hockey_v1](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
    */
  var correlativeTemplate: js.UndefOr[Boolean | js.Array[_]] = js.native
  
  /** Display debug information (RECOMMENDED for dev environment) */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * If `dynamic: true`, the delay (in milliseconds) will add a timer to prevent from sending a request on every key typed.
    * Instead the request(s) will be sent once the delay expires.
    *
    * @default 300
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * The key that will be searched for typeahead matching results inside source objects.
    * It is possible to search through multiple keys by simply adding them inside the configuration array.
    */
  var display: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If a string a specified, a dropdown filter will be created between the search input and the search submit button using the `source.group` as indexes.
    * The string value will appear at the end of the dropdown and will filter through all the sources.
    *
    * If an array of objects is set, the dropdownFilter will be built based on it. It is then possible to create filters based on item matching key:value. -
    * [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
    */
  var dropdownFilter: js.UndefOr[Boolean | string | js.Array[DropdownFilterItem]] = js.native
  
  /**
    * By default, the typeahead will only load once the source data.
    * Although you can change this behavior and request the data to be re-loaded on every "input" event (similar to
    * keypress). - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-user_v1)
    * * Note that you can modify the Ajax request to send the query with `{{query}}` modifier.
    *
    * @default false
    */
  var dynamic: js.UndefOr[Boolean] = js.native
  
  /**
    * If filters objects are defined, the Typeahead source data will be filtered based on the `"selected"` / `"checked"` checkboxes,
    * radios and selects based on `"OR"` and `"AND"` filtering similar to database queries.
    * * `selector` is the jquery selector to reach the unique input type `"checkbox"`, `"radio"` or select tag
    * * `key` the object key that will be filtered, you can use "dot" notation to reach deep object properties,
    * but in that case extra processing will be performed. Ex `object.key.is.deep`
    * * `|` key prefix means "OR" filtering, the object key CAN match the value
    * * `&` key prefix means "AND" filtering, the object key HAS to match the value
    *
    * Ex `dynamicFilter: [{ selector: "#assassin", key: "|tags.Assassin" }],`
    */
  var dynamicFilter: js.UndefOr[`false` | js.Array[DynamicFilterItem]] = js.native
  
  /**
    * In case there are no results to be displayed, a row will be displayed containing this template.
    * It is possible to display the query using `{{query}}` string.
    */
  var emptyTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery])] = js.native
  
  /**
    * If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied.
    */
  var filter: js.UndefOr[
    Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
  ] = js.native
  
  /**
    * If enabled, the source data will be generated (doing Ajax request and preparing to data to be searched)
    * on page load instead of waiting for the input to be focused.
    * * This option does not work well with `dynamic: true` unless some other configuration is adjusted.
    */
  var generateOnLoad: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to `true`, the results will grouped by the group name specified inside `source`.
    *
    * If set to `string`, the results will be grouped by the corresponding object key.
    * Ex: group: `"conference"` will group the hockey teams by `"Western"` and `"Eastern"` conferences in [hockey_v1 demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
    *
    * If an Object is set: `key`: Grouping key. `template`: Grouping template in the result list (custom header text), can be string or function.
    *
    * @default false
    */
  var group: js.UndefOr[Boolean | String | GroupSetting] = js.native
  
  /**
    * By default, the groups will be output in the same order as they are defined in `source`.
    * Set `"asc"` or `"desc"` to have the group name sorted ascending or descending
    * Set an `Array` to specify the group order to appear in the search result
    */
  var groupOrder: js.UndefOr[
    asc | desc | js.Array[String] | (js.Function5[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultCount */ js.UndefOr[Double], 
      /* resultCountPerGroup */ js.UndefOr[Double], 
      js.Array[_]
    ])
  ] = js.native
  
  /** Set a custom template for the groups */
  var groupTemplate: js.UndefOr[Null] = js.native
  
  /**
    * The search result(s) will receive the <strong> HTML tag around the matched query.
    *
    * If set to `true`, only the display keys will be highlighted
    *
    * If set to `"any"`, any string within the template will be highlighted
    *
    * @default true
    */
  var highlight: js.UndefOr[any | Boolean] = js.native
  
  /**
    * A suggestion text will appear if there is an item inside the result list that starts by the user query.
    * Also pressing the right arrow at the end of the search input text will autocomplete the query with the suggested hint and call `callback.onClickBefore` with the selected item.
    *
    * @default false
    */
  var hint: js.UndefOr[Boolean | CssObject] = js.native
  
  /**
    * If a string is defined, every result item will receive the string as href attribute replacing any `{{itemKey}}` by the `item's value`.
    * It is possible to apply an extra operation of `"slugify"` on the value `{{url|slugify}}`. - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-beer_v1)
    */
  var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.native
  
  /**
    * The jQuery input selector is only required if the Typeahead was initialized without a jQuery object.
    * In that case, if no input is found, the Typeahead is dropped.
    */
  var input: js.UndefOr[String] = js.native
  
  /** Display a loading animation when typeahead is doing request / searching for results */
  var loadingAnimation: js.UndefOr[`true`] = js.native
  
  /** If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied. */
  var matcher: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
  ] = js.native
  
  /**
    * The maximum number of search results that will appear inside the list. Set 0 to display ALL search results.
    * It is possible to combine `maxItem` with `maxItemPerGroup` to get different results.
    *
    * @default 8
    */
  var maxItem: js.UndefOr[`false` | Double] = js.native
  
  /** Set a maximum results per group if `group: true` configuration is enabled */
  var maxItemPerGroup: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of characters typed inside the input to perform a search.
    *
    * @default false
    */
  var maxLength: js.UndefOr[`false` | Double] = js.native
  
  /**
    * The number of characters typed inside the search input before searching for results.
    * It is possible to set this option to 0 and combine it with `searchOnFocus: true` to display a set of results by default.
    *
    * @default 2
    */
  var minLength: js.UndefOr[Double] = js.native
  
  /** `multiselect` configuration */
  var multiselect: js.UndefOr[MultiSelectSettings] = js.native
  
  /**
    * If enabled, an item will HAVE TO be selected in order to submit the form.
    * Use this option if you want to restrict searching to your data set only.
    */
  var mustSelectItem: js.UndefOr[Boolean] = js.native
  
  /**
    * `false` The position of the matched query can be anywhere inside the result string
    *
    * `true` The query can only be match if the result string starts by the query characters.
    *
    * @default false
    */
  var offset: js.UndefOr[Boolean] = js.native
  
  /**
    * Takes the default order in which the data was given.
    * If `"asc"` or `"desc"` is set, they results will re-order based on display key.
    */
  var order: js.UndefOr[asc | desc] = js.native
  
  /**
    * If a jQuery string selector or jQuery object is specified, the typeahead results will appear in that container instead of the default one.
    * If the option is set to `false`, the HTML result list will not be built.
    * Use this option for filtering "already on page" HTML list elements with show / hide.
    */
  var resultContainer: js.UndefOr[string | `false` | JQuery] = js.native
  
  /**
    * If enabled, the typeahead will display results (if any) on input focus. You can combine this option with the input
    * attribute `"autofocus"` to display results when the page is loaded.
    */
  var searchOnFocus: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[Selector] = js.native
  
  /**
    * The source option corresponds to the data set(s) that Typeahead will look through to find matches for the user query string.
    * Inside the source, you can have multiple lists of data (groups)
    * It is possible to send an async request inside the data function using `$.Deferred`
    * `source.group` configuration:
    */
  var source: js.UndefOr[Source | js.Array[Source] | SourceTable] = js.native
  
  /**
    * The template is a HTML string containing keys that will replaced by match results object keys.
    * You MUST use `{{variable}}` delimiters for your string to be replaced.
    *
    * You can also reach multi-level deep object properties using regular `"."` format, `{{variable.secordlevel.thirdlevel}}`
    *
    * If you need to print the item values inside HTML data attributes, it is possible to use `{{variable|raw}}`.
    * That optional modifier will make sure to get the unmodified value.
    */
  var template: js.UndefOr[
    String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
  ] = js.native
  
  /**
    * When an item is selected / clicked, by default the `"Matched key"` will go inside the input.
    * By defining a `templateValue`, the text that will result in the input can be customized.
    */
  var templateValue: js.UndefOr[String] = js.native
  
  /** This is a `cache` configuration, it sets the storage time to live in milliseconds. */
  var ttl: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAccent(value: Boolean | FromToPair): Self = this.set("accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccent: Self = this.set("accent", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean | CssObject): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setBackdropOnFocus(value: `true`): Self = this.set("backdropOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropOnFocus: Self = this.set("backdropOnFocus", js.undefined)
    
    @scala.inline
    def setBlurOnTab(value: Boolean): Self = this.set("blurOnTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurOnTab: Self = this.set("blurOnTab", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean | localStorage | sessionStorage): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCallback(value: Callback): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCancelButton(value: Boolean): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    
    @scala.inline
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCorrelativeTemplateVarargs(value: js.Any*): Self = this.set("correlativeTemplate", js.Array(value :_*))
    
    @scala.inline
    def setCorrelativeTemplate(value: Boolean | js.Array[_]): Self = this.set("correlativeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelativeTemplate: Self = this.set("correlativeTemplate", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDisplayVarargs(value: String*): Self = this.set("display", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: js.Array[String]): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDropdownFilterVarargs(value: DropdownFilterItem*): Self = this.set("dropdownFilter", js.Array(value :_*))
    
    @scala.inline
    def setDropdownFilter(value: Boolean | string | js.Array[DropdownFilterItem]): Self = this.set("dropdownFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownFilter: Self = this.set("dropdownFilter", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    
    @scala.inline
    def setDynamicFilterVarargs(value: DynamicFilterItem*): Self = this.set("dynamicFilter", js.Array(value :_*))
    
    @scala.inline
    def setDynamicFilter(value: `false` | js.Array[DynamicFilterItem]): Self = this.set("dynamicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicFilter: Self = this.set("dynamicFilter", js.undefined)
    
    @scala.inline
    def setEmptyTemplateFunction1(value: /* query */ js.UndefOr[String] => String | JQuery): Self = this.set("emptyTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmptyTemplate(value: String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery])): Self = this.set("emptyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyTemplate: Self = this.set("emptyTemplate", js.undefined)
    
    @scala.inline
    def setFilterFunction2(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilter(
      value: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
    ): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGenerateOnLoad(value: Boolean): Self = this.set("generateOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateOnLoad: Self = this.set("generateOnLoad", js.undefined)
    
    @scala.inline
    def setGroup(value: Boolean | String | GroupSetting): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupOrderFunction5(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultCount */ js.UndefOr[Double], /* resultCountPerGroup */ js.UndefOr[Double]) => js.Array[_]
    ): Self = this.set("groupOrder", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGroupOrderVarargs(value: String*): Self = this.set("groupOrder", js.Array(value :_*))
    
    @scala.inline
    def setGroupOrder(
      value: asc | desc | js.Array[String] | (js.Function5[
          /* node */ js.UndefOr[JQuery], 
          /* query */ js.UndefOr[String], 
          /* result */ js.UndefOr[js.Any], 
          /* resultCount */ js.UndefOr[Double], 
          /* resultCountPerGroup */ js.UndefOr[Double], 
          js.Array[_]
        ])
    ): Self = this.set("groupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupOrder: Self = this.set("groupOrder", js.undefined)
    
    @scala.inline
    def setHighlight(value: any | Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHint(value: Boolean | CssObject): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setHrefFunction1(value: /* item */ js.UndefOr[js.Any] => String): Self = this.set("href", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHref(value: String | (js.Function1[/* item */ js.UndefOr[js.Any], String])): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLoadingAnimation(value: `true`): Self = this.set("loadingAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingAnimation: Self = this.set("loadingAnimation", js.undefined)
    
    @scala.inline
    def setMatcher(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = this.set("matcher", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    
    @scala.inline
    def setMaxItem(value: `false` | Double): Self = this.set("maxItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItem: Self = this.set("maxItem", js.undefined)
    
    @scala.inline
    def setMaxItemPerGroup(value: Double): Self = this.set("maxItemPerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItemPerGroup: Self = this.set("maxItemPerGroup", js.undefined)
    
    @scala.inline
    def setMaxLength(value: `false` | Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMultiselect(value: MultiSelectSettings): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    
    @scala.inline
    def setMustSelectItem(value: Boolean): Self = this.set("mustSelectItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustSelectItem: Self = this.set("mustSelectItem", js.undefined)
    
    @scala.inline
    def setOffset(value: Boolean): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrder(value: asc | desc): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setResultContainer(value: string | `false` | JQuery): Self = this.set("resultContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultContainer: Self = this.set("resultContainer", js.undefined)
    
    @scala.inline
    def setSearchOnFocus(value: Boolean): Self = this.set("searchOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchOnFocus: Self = this.set("searchOnFocus", js.undefined)
    
    @scala.inline
    def setSelector(value: Selector): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: Source*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: Source | js.Array[Source] | SourceTable): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(value: (/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => String): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplate(
      value: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateValue(value: String): Self = this.set("templateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateValue: Self = this.set("templateValue", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}

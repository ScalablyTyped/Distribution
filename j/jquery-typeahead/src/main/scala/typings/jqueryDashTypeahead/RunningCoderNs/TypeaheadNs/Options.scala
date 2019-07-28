package typings.jqueryDashTypeahead.RunningCoderNs.TypeaheadNs

import typings.jqueryDashTypeahead.JQuery
import typings.jqueryDashTypeahead.jqueryDashTypeaheadNumbers.`false`
import typings.jqueryDashTypeahead.jqueryDashTypeaheadNumbers.`true`
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.any
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.asc
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.desc
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.localStorage
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.sessionStorage
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If enabled, the query and search results will ignore accents (`ãàáäâẽèéëêìíïîõòóöôùúüûñç`) and display every matches regardless of the punctuation.  Ex: `é = e`, `À = a`, etc.
    * It is possible to set a custom accent object, by simply setting `from` and `to` keys
    * * Using this option on large data sets (10,000+ items) might impact your search performances.
    *
    * @default false
    */
  var accent: js.UndefOr[Boolean | FromToPair] = js.undefined
  /**
    * If set to `true`, html will be added to add a backdrop under the search input and results.
    * It is possible to override the css options by passing an object to this option.
    */
  var backdrop: js.UndefOr[Boolean | CssObject] = js.undefined
  /**
    * If set to `true`, as soon as the Typeahead input is focused, the `backdrop` option will be displayed regardless.
    */
  var backdropOnFocus: js.UndefOr[`true`] = js.undefined
  /** Blur Typeahead when Tab key is pressed, if false Tab will go though search results */
  var blurOnTab: js.UndefOr[Boolean] = js.undefined
  /**
    * * If set to `true` or `localStorage`, the source data will be stored in `localStorage`.
    * * If set to `sessionStorage`, the source data will be stored in `sessionStorage`.
    */
  var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.undefined
  /**
    * The callbacks are used to customize and add functionality to your Typeahead instance. You will find plenty of examples in the Demo section.
    * There are 3 ways to define the callbacks:
    * * Function `(recommended)`: Anonymous function calling a local function with parameters.
    * * String: Function name (can be namespaced) located on the window scope without any parameters.
    * * Array: First element is the function name accessible from the window scope, second element is an array containing the parameters.
    */
  var callback: js.UndefOr[Callback] = js.undefined
  /**
    * This option provides a small `"x"` on the right side of the input to clear the text,
    * similar to some browser's default behavior with `input[type="search"]`.
    */
  var cancelButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Enabling this option will compress the data inside Localstorage.
    * * Setting `compression: true` requires `cache: true` option to be enabled.
    */
  var compression: js.UndefOr[Boolean] = js.undefined
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
  var correlativeTemplate: js.UndefOr[Boolean | js.Array[_]] = js.undefined
  /** Display debug information (RECOMMENDED for dev environment) */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * If `dynamic: true`, the delay (in milliseconds) will add a timer to prevent from sending a request on every key typed.
    * Instead the request(s) will be sent once the delay expires.
    *
    * @default 300
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * The key that will be searched for typeahead matching results inside source objects.
    * It is possible to search through multiple keys by simply adding them inside the configuration array.
    */
  var display: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If a string a specified, a dropdown filter will be created between the search input and the search submit button using the `source.group` as indexes.
    * The string value will appear at the end of the dropdown and will filter through all the sources.
    *
    * If an array of objects is set, the dropdownFilter will be built based on it. It is then possible to create filters based on item matching key:value. -
    * [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-hockey_v1)
    */
  var dropdownFilter: js.UndefOr[Boolean | string | js.Array[DropdownFilterItem]] = js.undefined
  /**
    * By default, the typeahead will only load once the source data.
    * Although you can change this behavior and request the data to be re-loaded on every "input" event (similar to
    * keypress). - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-user_v1)
    * * Note that you can modify the Ajax request to send the query with `{{query}}` modifier.
    *
    * @default false
    */
  var dynamic: js.UndefOr[Boolean] = js.undefined
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
  var dynamicFilter: js.UndefOr[`false` | js.Array[DynamicFilterItem]] = js.undefined
  /**
    * In case there are no results to be displayed, a row will be displayed containing this template.
    * It is possible to display the query using `{{query}}` string.
    */
  var emptyTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery])] = js.undefined
  /**
    * If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied.
    */
  var filter: js.UndefOr[
    Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
  ] = js.undefined
  /**
    * If enabled, the source data will be generated (doing Ajax request and preparing to data to be searched)
    * on page load instead of waiting for the input to be focused.
    * * This option does not work well with `dynamic: true` unless some other configuration is adjusted.
    */
  var generateOnLoad: js.UndefOr[Boolean] = js.undefined
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
  var group: js.UndefOr[Boolean | String | GroupSetting] = js.undefined
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
  ] = js.undefined
  /** Set a custom template for the groups */
  var groupTemplate: js.UndefOr[Null] = js.undefined
  /**
    * The search result(s) will receive the <strong> HTML tag around the matched query.
    *
    * If set to `true`, only the display keys will be highlighted
    *
    * If set to `"any"`, any string within the template will be highlighted
    *
    * @default true
    */
  var highlight: js.UndefOr[any | Boolean] = js.undefined
  /**
    * A suggestion text will appear if there is an item inside the result list that starts by the user query.
    * Also pressing the right arrow at the end of the search input text will autocomplete the query with the suggested hint and call `callback.onClickBefore` with the selected item.
    *
    * @default false
    */
  var hint: js.UndefOr[Boolean | CssObject] = js.undefined
  /**
    * If a string is defined, every result item will receive the string as href attribute replacing any `{{itemKey}}` by the `item's value`.
    * It is possible to apply an extra operation of `"slugify"` on the value `{{url|slugify}}`. - [Demo](http://www.runningcoder.org/jquerytypeahead/demo/#form-beer_v1)
    */
  var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.undefined
  /**
    * The jQuery input selector is only required if the Typeahead was initialized without a jQuery object.
    * In that case, if no input is found, the Typeahead is dropped.
    */
  var input: js.UndefOr[String] = js.undefined
  /** Display a loading animation when typeahead is doing request / searching for results */
  var loadingAnimation: js.UndefOr[`true`] = js.undefined
  /** If set to function, every element will be filtered using this custom rule AFTER the regular Typeahead filters have been applied. */
  var matcher: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
  ] = js.undefined
  /**
    * The maximum number of search results that will appear inside the list. Set 0 to display ALL search results.
    * It is possible to combine `maxItem` with `maxItemPerGroup` to get different results.
    *
    * @default 8
    */
  var maxItem: js.UndefOr[`false` | Double] = js.undefined
  /** Set a maximum results per group if `group: true` configuration is enabled */
  var maxItemPerGroup: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of characters typed inside the input to perform a search.
    *
    * @default false
    */
  var maxLength: js.UndefOr[`false` | Double] = js.undefined
  /**
    * The number of characters typed inside the search input before searching for results.
    * It is possible to set this option to 0 and combine it with `searchOnFocus: true` to display a set of results by default.
    *
    * @default 2
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /** `multiselect` configuration */
  var multiselect: js.UndefOr[MultiSelectSettings] = js.undefined
  /**
    * If enabled, an item will HAVE TO be selected in order to submit the form.
    * Use this option if you want to restrict searching to your data set only.
    */
  var mustSelectItem: js.UndefOr[Boolean] = js.undefined
  /**
    * `false` The position of the matched query can be anywhere inside the result string
    *
    * `true` The query can only be match if the result string starts by the query characters.
    *
    * @default false
    */
  var offset: js.UndefOr[Boolean] = js.undefined
  /**
    * Takes the default order in which the data was given.
    * If `"asc"` or `"desc"` is set, they results will re-order based on display key.
    */
  var order: js.UndefOr[asc | desc] = js.undefined
  /**
    * If a jQuery string selector or jQuery object is specified, the typeahead results will appear in that container instead of the default one.
    * If the option is set to `false`, the HTML result list will not be built.
    * Use this option for filtering "already on page" HTML list elements with show / hide.
    */
  var resultContainer: js.UndefOr[string | `false` | JQuery] = js.undefined
  /**
    * If enabled, the typeahead will display results (if any) on input focus. You can combine this option with the input
    * attribute `"autofocus"` to display results when the page is loaded.
    */
  var searchOnFocus: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[Selector] = js.undefined
  /**
    * The source option corresponds to the data set(s) that Typeahead will look through to find matches for the user query string.
    * Inside the source, you can have multiple lists of data (groups)
    * It is possible to send an async request inside the data function using `$.Deferred`
    * `source.group` configuration:
    */
  var source: js.UndefOr[Source | js.Array[Source] | SourceTable] = js.undefined
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
  ] = js.undefined
  /**
    * When an item is selected / clicked, by default the `"Matched key"` will go inside the input.
    * By defining a `templateValue`, the text that will result in the input can be customized.
    */
  var templateValue: js.UndefOr[String] = js.undefined
  /** This is a `cache` configuration, it sets the storage time to live in milliseconds. */
  var ttl: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accent: Boolean | FromToPair = null,
    backdrop: Boolean | CssObject = null,
    backdropOnFocus: `true` = null,
    blurOnTab: js.UndefOr[Boolean] = js.undefined,
    cache: Boolean | localStorage | sessionStorage = null,
    callback: Callback = null,
    cancelButton: js.UndefOr[Boolean] = js.undefined,
    compression: js.UndefOr[Boolean] = js.undefined,
    correlativeTemplate: Boolean | js.Array[_] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    display: js.Array[String] = null,
    dropdownFilter: Boolean | string | js.Array[DropdownFilterItem] = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    dynamicFilter: `false` | js.Array[DynamicFilterItem] = null,
    emptyTemplate: String | (js.Function1[/* query */ js.UndefOr[String], String | JQuery]) = null,
    filter: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]) = null,
    generateOnLoad: js.UndefOr[Boolean] = js.undefined,
    group: Boolean | String | GroupSetting = null,
    groupOrder: asc | desc | js.Array[String] | (js.Function5[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultCount */ js.UndefOr[Double], 
      /* resultCountPerGroup */ js.UndefOr[Double], 
      js.Array[_]
    ]) = null,
    groupTemplate: Null = null,
    highlight: any | Boolean = null,
    hint: Boolean | CssObject = null,
    href: String | (js.Function1[/* item */ js.UndefOr[js.Any], String]) = null,
    input: String = null,
    loadingAnimation: `true` = null,
    matcher: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean = null,
    maxItem: `false` | Double = null,
    maxItemPerGroup: Int | Double = null,
    maxLength: `false` | Double = null,
    minLength: Int | Double = null,
    multiselect: MultiSelectSettings = null,
    mustSelectItem: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Boolean] = js.undefined,
    order: asc | desc = null,
    resultContainer: string | `false` | JQuery = null,
    searchOnFocus: js.UndefOr[Boolean] = js.undefined,
    selector: Selector = null,
    source: Source | js.Array[Source] | SourceTable = null,
    template: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String]) = null,
    templateValue: String = null,
    ttl: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropOnFocus != null) __obj.updateDynamic("backdropOnFocus")(backdropOnFocus)
    if (!js.isUndefined(blurOnTab)) __obj.updateDynamic("blurOnTab")(blurOnTab)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(cancelButton)) __obj.updateDynamic("cancelButton")(cancelButton)
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    if (correlativeTemplate != null) __obj.updateDynamic("correlativeTemplate")(correlativeTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display)
    if (dropdownFilter != null) __obj.updateDynamic("dropdownFilter")(dropdownFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (dynamicFilter != null) __obj.updateDynamic("dynamicFilter")(dynamicFilter.asInstanceOf[js.Any])
    if (emptyTemplate != null) __obj.updateDynamic("emptyTemplate")(emptyTemplate.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnLoad)) __obj.updateDynamic("generateOnLoad")(generateOnLoad)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupOrder != null) __obj.updateDynamic("groupOrder")(groupOrder.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input)
    if (loadingAnimation != null) __obj.updateDynamic("loadingAnimation")(loadingAnimation)
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    if (maxItem != null) __obj.updateDynamic("maxItem")(maxItem.asInstanceOf[js.Any])
    if (maxItemPerGroup != null) __obj.updateDynamic("maxItemPerGroup")(maxItemPerGroup.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (multiselect != null) __obj.updateDynamic("multiselect")(multiselect)
    if (!js.isUndefined(mustSelectItem)) __obj.updateDynamic("mustSelectItem")(mustSelectItem)
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (resultContainer != null) __obj.updateDynamic("resultContainer")(resultContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(searchOnFocus)) __obj.updateDynamic("searchOnFocus")(searchOnFocus)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateValue != null) __obj.updateDynamic("templateValue")(templateValue)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


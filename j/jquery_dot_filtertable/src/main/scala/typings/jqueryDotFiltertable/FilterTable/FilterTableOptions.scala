package typings.jqueryDotFiltertable.FilterTable

import typings.jqueryDotFiltertable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTableOptions extends js.Object {
  /**
    * Makes the filter input field autofocused (not recommended for accessibility reasons)
    * Default: 'false'
    */
  var autofocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback function after a filter is performed.
    * Default: 'null'
    * @param term filter term (string)
    * @param table table being filtered (JQuery object)
    * @returns {void} 
    */
  var callback: js.UndefOr[js.Function2[/* term */ String, /* table */ JQuery, Unit]] = js.undefined
  /**
    * Class applied to the main filter input container
    * Default: 'filter-table'
    */
  var containerClass: js.UndefOr[String] = js.undefined
  /**
    * Tag name of the main filter input container
    * Default: 'p'
    */
  var containerTag: js.UndefOr[String] = js.undefined
  /**
    * Controls whether the table's tfoot(s) will be hidden when the table is filtered
    * Default: 'false'
    */
  var hideTFootOnFilter: js.UndefOr[Boolean] = js.undefined
  /**
    * Class applied to cells containing the filter term
    * Default: 'alt'
    */
  var highlightClass: js.UndefOr[String] = js.undefined
  /**
    * Ignore these columns (0-indexed) when filtering
    * Default: '[]'
    */
  var ignoreColumns: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Name attribute of the filter input field
    * Default: 'filter-table'
    */
  var inputName: js.UndefOr[String] = js.undefined
  /**
    * Use this selector to find the filter input instead of creating a new one (only works if selector returns a single element)
    * Default: 'null'
    */
  var inputSelector: js.UndefOr[String] = js.undefined
  /**
    * Tag name of the filter input itself
    * Default: 'search'
    */
  var inputType: js.UndefOr[String] = js.undefined
  /**
    * Text to precede the filter input
    * Default: 'Filter:'
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Filter only when at least this number of characters are in the filter input field
    * Default: '1'
    */
  var minChars: js.UndefOr[Double] = js.undefined
  /**
    * Only show the filter on tables with this number of rows or more
    * Default: '8'
    */
  var minRows: js.UndefOr[Double] = js.undefined
  /**
    * HTML5 placeholder text for the filter input
    * Default: 'search this table'
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Trap the return key in the filter input field to prevent form submission
    * Default: 'true'
    */
  var preventReturnKey: js.UndefOr[Boolean] = js.undefined
  /**
    * List of clickable phrases to quick fill the search
    * Default: '[]'
    */
  var quickList: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Class of each quick list item
    * Default: 'quick'
    */
  var quickListClass: js.UndefOr[String] = js.undefined
  /**
    * Label for the clear filtering quick list item (or none if blank)
    * Default: ''
    */
  var quickListClear: js.UndefOr[String] = js.undefined
  /**
    * Tag name surrounding quick list items (e.g., ul)
    * Default: ''
    */
  var quickListGroupTag: js.UndefOr[String] = js.undefined
  /**
    * Tag name of each quick list item (e.g., a or li)
    * Default: 'a'
    */
  var quickListTag: js.UndefOr[String] = js.undefined
   // "a" | "li"
  /**
    * Class applied to visible rows
    * Default: 'visible'
    */
  var visibleClass: js.UndefOr[String] = js.undefined
}

object FilterTableOptions {
  @scala.inline
  def apply(
    autofocus: js.UndefOr[Boolean] = js.undefined,
    callback: (/* term */ String, /* table */ JQuery) => Unit = null,
    containerClass: String = null,
    containerTag: String = null,
    hideTFootOnFilter: js.UndefOr[Boolean] = js.undefined,
    highlightClass: String = null,
    ignoreColumns: js.Array[Double] = null,
    inputName: String = null,
    inputSelector: String = null,
    inputType: String = null,
    label: String = null,
    minChars: Int | Double = null,
    minRows: Int | Double = null,
    placeholder: String = null,
    preventReturnKey: js.UndefOr[Boolean] = js.undefined,
    quickList: js.Array[String] = null,
    quickListClass: String = null,
    quickListClear: String = null,
    quickListGroupTag: String = null,
    quickListTag: String = null,
    visibleClass: String = null
  ): FilterTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerTag != null) __obj.updateDynamic("containerTag")(containerTag.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTFootOnFilter)) __obj.updateDynamic("hideTFootOnFilter")(hideTFootOnFilter.asInstanceOf[js.Any])
    if (highlightClass != null) __obj.updateDynamic("highlightClass")(highlightClass.asInstanceOf[js.Any])
    if (ignoreColumns != null) __obj.updateDynamic("ignoreColumns")(ignoreColumns.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (inputSelector != null) __obj.updateDynamic("inputSelector")(inputSelector.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(preventReturnKey)) __obj.updateDynamic("preventReturnKey")(preventReturnKey.asInstanceOf[js.Any])
    if (quickList != null) __obj.updateDynamic("quickList")(quickList.asInstanceOf[js.Any])
    if (quickListClass != null) __obj.updateDynamic("quickListClass")(quickListClass.asInstanceOf[js.Any])
    if (quickListClear != null) __obj.updateDynamic("quickListClear")(quickListClear.asInstanceOf[js.Any])
    if (quickListGroupTag != null) __obj.updateDynamic("quickListGroupTag")(quickListGroupTag.asInstanceOf[js.Any])
    if (quickListTag != null) __obj.updateDynamic("quickListTag")(quickListTag.asInstanceOf[js.Any])
    if (visibleClass != null) __obj.updateDynamic("visibleClass")(visibleClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterTableOptions]
  }
}


package typings
package jqueryDotFiltertableLib.FilterTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTableOptions extends js.Object {
  /**
    * Makes the filter input field autofocused (not recommended for accessibility reasons)
    * Default: 'false'
    */
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback function after a filter is performed.
    * Default: 'null'
    * @param term filter term (string)
    * @param table table being filtered (JQuery object)
    * @returns {void} 
    */
  var callback: js.UndefOr[
    js.Function2[/* term */ java.lang.String, /* table */ jqueryDotFiltertableLib.JQuery, scala.Unit]
  ] = js.undefined
  /**
    * Class applied to the main filter input container
    * Default: 'filter-table'
    */
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tag name of the main filter input container
    * Default: 'p'
    */
  var containerTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls whether the table's tfoot(s) will be hidden when the table is filtered
    * Default: 'false'
    */
  var hideTFootOnFilter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class applied to cells containing the filter term
    * Default: 'alt'
    */
  var highlightClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ignore these columns (0-indexed) when filtering
    * Default: '[]'
    */
  var ignoreColumns: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Name attribute of the filter input field
    * Default: 'filter-table'
    */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this selector to find the filter input instead of creating a new one (only works if selector returns a single element)
    * Default: 'null'
    */
  var inputSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tag name of the filter input itself
    * Default: 'search'
    */
  var inputType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to precede the filter input
    * Default: 'Filter:'
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter only when at least this number of characters are in the filter input field
    * Default: '1'
    */
  var minChars: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only show the filter on tables with this number of rows or more
    * Default: '8'
    */
  var minRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * HTML5 placeholder text for the filter input
    * Default: 'search this table'
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Trap the return key in the filter input field to prevent form submission
    * Default: 'true'
    */
  var preventReturnKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of clickable phrases to quick fill the search
    * Default: '[]'
    */
  var quickList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Class of each quick list item
    * Default: 'quick'
    */
  var quickListClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the clear filtering quick list item (or none if blank)
    * Default: ''
    */
  var quickListClear: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tag name surrounding quick list items (e.g., ul)
    * Default: ''
    */
  var quickListGroupTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tag name of each quick list item (e.g., a or li)
    * Default: 'a'
    */
  var quickListTag: js.UndefOr[java.lang.String] = js.undefined
   // "a" | "li"
  /**
    * Class applied to visible rows
    * Default: 'visible'
    */
  var visibleClass: js.UndefOr[java.lang.String] = js.undefined
}

object FilterTableOptions {
  @scala.inline
  def apply(
    autofocus: js.UndefOr[scala.Boolean] = js.undefined,
    callback: (/* term */ java.lang.String, /* table */ jqueryDotFiltertableLib.JQuery) => scala.Unit = null,
    containerClass: java.lang.String = null,
    containerTag: java.lang.String = null,
    hideTFootOnFilter: js.UndefOr[scala.Boolean] = js.undefined,
    highlightClass: java.lang.String = null,
    ignoreColumns: js.Array[scala.Double] = null,
    inputName: java.lang.String = null,
    inputSelector: java.lang.String = null,
    inputType: java.lang.String = null,
    label: java.lang.String = null,
    minChars: scala.Int | scala.Double = null,
    minRows: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    preventReturnKey: js.UndefOr[scala.Boolean] = js.undefined,
    quickList: js.Array[java.lang.String] = null,
    quickListClass: java.lang.String = null,
    quickListClear: java.lang.String = null,
    quickListGroupTag: java.lang.String = null,
    quickListTag: java.lang.String = null,
    visibleClass: java.lang.String = null
  ): FilterTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (containerTag != null) __obj.updateDynamic("containerTag")(containerTag)
    if (!js.isUndefined(hideTFootOnFilter)) __obj.updateDynamic("hideTFootOnFilter")(hideTFootOnFilter)
    if (highlightClass != null) __obj.updateDynamic("highlightClass")(highlightClass)
    if (ignoreColumns != null) __obj.updateDynamic("ignoreColumns")(ignoreColumns)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (inputSelector != null) __obj.updateDynamic("inputSelector")(inputSelector)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (label != null) __obj.updateDynamic("label")(label)
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(preventReturnKey)) __obj.updateDynamic("preventReturnKey")(preventReturnKey)
    if (quickList != null) __obj.updateDynamic("quickList")(quickList)
    if (quickListClass != null) __obj.updateDynamic("quickListClass")(quickListClass)
    if (quickListClear != null) __obj.updateDynamic("quickListClear")(quickListClear)
    if (quickListGroupTag != null) __obj.updateDynamic("quickListGroupTag")(quickListGroupTag)
    if (quickListTag != null) __obj.updateDynamic("quickListTag")(quickListTag)
    if (visibleClass != null) __obj.updateDynamic("visibleClass")(visibleClass)
    __obj.asInstanceOf[FilterTableOptions]
  }
}


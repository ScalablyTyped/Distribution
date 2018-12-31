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


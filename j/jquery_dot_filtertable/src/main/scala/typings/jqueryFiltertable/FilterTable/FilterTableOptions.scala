package typings.jqueryFiltertable.FilterTable

import typings.jqueryFiltertable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterTableOptions extends js.Object {
  
  /**
    * Makes the filter input field autofocused (not recommended for accessibility reasons)
    * Default: 'false'
    */
  var autofocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback function after a filter is performed.
    * Default: 'null'
    * @param term filter term (string)
    * @param table table being filtered (JQuery object)
    * @returns {void} 
    */
  var callback: js.UndefOr[js.Function2[/* term */ String, /* table */ JQuery, Unit]] = js.native
  
  /**
    * Class applied to the main filter input container
    * Default: 'filter-table'
    */
  var containerClass: js.UndefOr[String] = js.native
  
  /**
    * Tag name of the main filter input container
    * Default: 'p'
    */
  var containerTag: js.UndefOr[String] = js.native
  
  /**
    * Controls whether the table's tfoot(s) will be hidden when the table is filtered
    * Default: 'false'
    */
  var hideTFootOnFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Class applied to cells containing the filter term
    * Default: 'alt'
    */
  var highlightClass: js.UndefOr[String] = js.native
  
  /**
    * Ignore these columns (0-indexed) when filtering
    * Default: '[]'
    */
  var ignoreColumns: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Name attribute of the filter input field
    * Default: 'filter-table'
    */
  var inputName: js.UndefOr[String] = js.native
  
  /**
    * Use this selector to find the filter input instead of creating a new one (only works if selector returns a single element)
    * Default: 'null'
    */
  var inputSelector: js.UndefOr[String] = js.native
  
  /**
    * Tag name of the filter input itself
    * Default: 'search'
    */
  var inputType: js.UndefOr[String] = js.native
  
  /**
    * Text to precede the filter input
    * Default: 'Filter:'
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Filter only when at least this number of characters are in the filter input field
    * Default: '1'
    */
  var minChars: js.UndefOr[Double] = js.native
  
  /**
    * Only show the filter on tables with this number of rows or more
    * Default: '8'
    */
  var minRows: js.UndefOr[Double] = js.native
  
  /**
    * HTML5 placeholder text for the filter input
    * Default: 'search this table'
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Trap the return key in the filter input field to prevent form submission
    * Default: 'true'
    */
  var preventReturnKey: js.UndefOr[Boolean] = js.native
  
  /**
    * List of clickable phrases to quick fill the search
    * Default: '[]'
    */
  var quickList: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Class of each quick list item
    * Default: 'quick'
    */
  var quickListClass: js.UndefOr[String] = js.native
  
  /**
    * Label for the clear filtering quick list item (or none if blank)
    * Default: ''
    */
  var quickListClear: js.UndefOr[String] = js.native
  
  /**
    * Tag name surrounding quick list items (e.g., ul)
    * Default: ''
    */
  var quickListGroupTag: js.UndefOr[String] = js.native
  
  /**
    * Tag name of each quick list item (e.g., a or li)
    * Default: 'a'
    */
  var quickListTag: js.UndefOr[String] = js.native
  
   // "a" | "li"
  /**
    * Class applied to visible rows
    * Default: 'visible'
    */
  var visibleClass: js.UndefOr[String] = js.native
}
object FilterTableOptions {
  
  @scala.inline
  def apply(): FilterTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterTableOptions]
  }
  
  @scala.inline
  implicit class FilterTableOptionsOps[Self <: FilterTableOptions] (val x: Self) extends AnyVal {
    
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
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* term */ String, /* table */ JQuery) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    
    @scala.inline
    def setContainerTag(value: String): Self = this.set("containerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerTag: Self = this.set("containerTag", js.undefined)
    
    @scala.inline
    def setHideTFootOnFilter(value: Boolean): Self = this.set("hideTFootOnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTFootOnFilter: Self = this.set("hideTFootOnFilter", js.undefined)
    
    @scala.inline
    def setHighlightClass(value: String): Self = this.set("highlightClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightClass: Self = this.set("highlightClass", js.undefined)
    
    @scala.inline
    def setIgnoreColumnsVarargs(value: Double*): Self = this.set("ignoreColumns", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreColumns(value: js.Array[Double]): Self = this.set("ignoreColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreColumns: Self = this.set("ignoreColumns", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    
    @scala.inline
    def setInputSelector(value: String): Self = this.set("inputSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSelector: Self = this.set("inputSelector", js.undefined)
    
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMinChars(value: Double): Self = this.set("minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChars: Self = this.set("minChars", js.undefined)
    
    @scala.inline
    def setMinRows(value: Double): Self = this.set("minRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRows: Self = this.set("minRows", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPreventReturnKey(value: Boolean): Self = this.set("preventReturnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventReturnKey: Self = this.set("preventReturnKey", js.undefined)
    
    @scala.inline
    def setQuickListVarargs(value: String*): Self = this.set("quickList", js.Array(value :_*))
    
    @scala.inline
    def setQuickList(value: js.Array[String]): Self = this.set("quickList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickList: Self = this.set("quickList", js.undefined)
    
    @scala.inline
    def setQuickListClass(value: String): Self = this.set("quickListClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickListClass: Self = this.set("quickListClass", js.undefined)
    
    @scala.inline
    def setQuickListClear(value: String): Self = this.set("quickListClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickListClear: Self = this.set("quickListClear", js.undefined)
    
    @scala.inline
    def setQuickListGroupTag(value: String): Self = this.set("quickListGroupTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickListGroupTag: Self = this.set("quickListGroupTag", js.undefined)
    
    @scala.inline
    def setQuickListTag(value: String): Self = this.set("quickListTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickListTag: Self = this.set("quickListTag", js.undefined)
    
    @scala.inline
    def setVisibleClass(value: String): Self = this.set("visibleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleClass: Self = this.set("visibleClass", js.undefined)
  }
}

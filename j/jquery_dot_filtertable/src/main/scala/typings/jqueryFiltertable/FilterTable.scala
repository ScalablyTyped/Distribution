package typings.jqueryFiltertable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterTable {
  
  trait FilterTableOptions extends StObject {
    
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
    
    inline def apply(): FilterTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterTableOptions]
    }
    
    extension [Self <: FilterTableOptions](x: Self) {
      
      inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setCallback(value: (/* term */ String, /* table */ JQuery) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      inline def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      inline def setContainerTag(value: String): Self = StObject.set(x, "containerTag", value.asInstanceOf[js.Any])
      
      inline def setContainerTagUndefined: Self = StObject.set(x, "containerTag", js.undefined)
      
      inline def setHideTFootOnFilter(value: Boolean): Self = StObject.set(x, "hideTFootOnFilter", value.asInstanceOf[js.Any])
      
      inline def setHideTFootOnFilterUndefined: Self = StObject.set(x, "hideTFootOnFilter", js.undefined)
      
      inline def setHighlightClass(value: String): Self = StObject.set(x, "highlightClass", value.asInstanceOf[js.Any])
      
      inline def setHighlightClassUndefined: Self = StObject.set(x, "highlightClass", js.undefined)
      
      inline def setIgnoreColumns(value: js.Array[Double]): Self = StObject.set(x, "ignoreColumns", value.asInstanceOf[js.Any])
      
      inline def setIgnoreColumnsUndefined: Self = StObject.set(x, "ignoreColumns", js.undefined)
      
      inline def setIgnoreColumnsVarargs(value: Double*): Self = StObject.set(x, "ignoreColumns", js.Array(value*))
      
      inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
      
      inline def setInputSelector(value: String): Self = StObject.set(x, "inputSelector", value.asInstanceOf[js.Any])
      
      inline def setInputSelectorUndefined: Self = StObject.set(x, "inputSelector", js.undefined)
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMinChars(value: Double): Self = StObject.set(x, "minChars", value.asInstanceOf[js.Any])
      
      inline def setMinCharsUndefined: Self = StObject.set(x, "minChars", js.undefined)
      
      inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPreventReturnKey(value: Boolean): Self = StObject.set(x, "preventReturnKey", value.asInstanceOf[js.Any])
      
      inline def setPreventReturnKeyUndefined: Self = StObject.set(x, "preventReturnKey", js.undefined)
      
      inline def setQuickList(value: js.Array[String]): Self = StObject.set(x, "quickList", value.asInstanceOf[js.Any])
      
      inline def setQuickListClass(value: String): Self = StObject.set(x, "quickListClass", value.asInstanceOf[js.Any])
      
      inline def setQuickListClassUndefined: Self = StObject.set(x, "quickListClass", js.undefined)
      
      inline def setQuickListClear(value: String): Self = StObject.set(x, "quickListClear", value.asInstanceOf[js.Any])
      
      inline def setQuickListClearUndefined: Self = StObject.set(x, "quickListClear", js.undefined)
      
      inline def setQuickListGroupTag(value: String): Self = StObject.set(x, "quickListGroupTag", value.asInstanceOf[js.Any])
      
      inline def setQuickListGroupTagUndefined: Self = StObject.set(x, "quickListGroupTag", js.undefined)
      
      inline def setQuickListTag(value: String): Self = StObject.set(x, "quickListTag", value.asInstanceOf[js.Any])
      
      inline def setQuickListTagUndefined: Self = StObject.set(x, "quickListTag", js.undefined)
      
      inline def setQuickListUndefined: Self = StObject.set(x, "quickList", js.undefined)
      
      inline def setQuickListVarargs(value: String*): Self = StObject.set(x, "quickList", js.Array(value*))
      
      inline def setVisibleClass(value: String): Self = StObject.set(x, "visibleClass", value.asInstanceOf[js.Any])
      
      inline def setVisibleClassUndefined: Self = StObject.set(x, "visibleClass", js.undefined)
    }
  }
  
  @js.native
  trait FilterTableStatic extends StObject {
    
    /**
      * init with default options
      * @returns {JQuery}
      */
    def apply(): JQuery = js.native
    /**
      * init with custom options
      * @param options
      * @returns {JQuery}
      */
    def apply(options: FilterTableOptions): JQuery = js.native
  }
}

package typings.jupyterlabDocumentsearch.interfacesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisplayState extends js.Object {
  
  /**
    * Should the search be case sensitive?
    */
  var caseSensitive: Boolean = js.native
  
  /**
    * The index of the currently selected match
    */
  var currentIndex: Double | Null = js.native
  
  /**
    * An error message (used for bad regex syntax)
    */
  var errorMessage: String = js.native
  
  /**
    * What should we include when we search?
    */
  var filters: IFiltersType = js.native
  
  /**
    * Is the filters view open?
    */
  var filtersOpen: Boolean = js.native
  
  /**
    * Should the focus forced into the input on the next render?
    */
  var forceFocus: Boolean = js.native
  
  /**
    * The query constructed from the text and the case/regex flags
    */
  var query: RegExp | Null = js.native
  
  /**
    * Whether or not the replace entry row is visible
    */
  var replaceEntryShown: Boolean = js.native
  
  /**
    * Whether or not the replace input is currently focused
    */
  var replaceInputFocused: Boolean = js.native
  
  /**
    * The text in the replace entry
    */
  var replaceText: String = js.native
  
  /**
    * Whether or not the search input is currently focused
    */
  var searchInputFocused: Boolean = js.native
  
  /**
    * The text in the search entry
    */
  var searchText: String = js.native
  
  /**
    * The total number of matches found in the document
    */
  var totalMatches: Double = js.native
  
  /**
    * Should the search string be treated as a RegExp?
    */
  var useRegex: Boolean = js.native
}
object IDisplayState {
  
  @scala.inline
  def apply(
    caseSensitive: Boolean,
    errorMessage: String,
    filters: IFiltersType,
    filtersOpen: Boolean,
    forceFocus: Boolean,
    replaceEntryShown: Boolean,
    replaceInputFocused: Boolean,
    replaceText: String,
    searchInputFocused: Boolean,
    searchText: String,
    totalMatches: Double,
    useRegex: Boolean
  ): IDisplayState = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], filtersOpen = filtersOpen.asInstanceOf[js.Any], forceFocus = forceFocus.asInstanceOf[js.Any], replaceEntryShown = replaceEntryShown.asInstanceOf[js.Any], replaceInputFocused = replaceInputFocused.asInstanceOf[js.Any], replaceText = replaceText.asInstanceOf[js.Any], searchInputFocused = searchInputFocused.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], totalMatches = totalMatches.asInstanceOf[js.Any], useRegex = useRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayState]
  }
  
  @scala.inline
  implicit class IDisplayStateOps[Self <: IDisplayState] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: IFiltersType): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersOpen(value: Boolean): Self = this.set("filtersOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFocus(value: Boolean): Self = this.set("forceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceEntryShown(value: Boolean): Self = this.set("replaceEntryShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceInputFocused(value: Boolean): Self = this.set("replaceInputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceText(value: String): Self = this.set("replaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchInputFocused(value: Boolean): Self = this.set("searchInputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalMatches(value: Double): Self = this.set("totalMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRegex(value: Boolean): Self = this.set("useRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndexNull: Self = this.set("currentIndex", null)
    
    @scala.inline
    def setQuery(value: RegExp): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
  }
}

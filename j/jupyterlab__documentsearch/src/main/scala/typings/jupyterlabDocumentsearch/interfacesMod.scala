package typings.jupyterlabDocumentsearch

import org.scalablytyped.runtime.Instantiable0
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  trait IDisplayState extends StObject {
    
    /**
      * Should the search be case sensitive?
      */
    var caseSensitive: Boolean
    
    /**
      * The index of the currently selected match
      */
    var currentIndex: Double | Null
    
    /**
      * An error message (used for bad regex syntax)
      */
    var errorMessage: String
    
    /**
      * What should we include when we search?
      */
    var filters: IFiltersType
    
    /**
      * Is the filters view open?
      */
    var filtersOpen: Boolean
    
    /**
      * Should the focus forced into the input on the next render?
      */
    var forceFocus: Boolean
    
    /**
      * The query constructed from the text and the case/regex flags
      */
    var query: RegExp | Null
    
    /**
      * Whether or not the replace entry row is visible
      */
    var replaceEntryShown: Boolean
    
    /**
      * Whether or not the replace input is currently focused
      */
    var replaceInputFocused: Boolean
    
    /**
      * The text in the replace entry
      */
    var replaceText: String
    
    /**
      * Whether or not the search input is currently focused
      */
    var searchInputFocused: Boolean
    
    /**
      * The text in the search entry
      */
    var searchText: String
    
    /**
      * The total number of matches found in the document
      */
    var totalMatches: Double
    
    /**
      * Should the search string be treated as a RegExp?
      */
    var useRegex: Boolean
  }
  object IDisplayState {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], filtersOpen = filtersOpen.asInstanceOf[js.Any], forceFocus = forceFocus.asInstanceOf[js.Any], replaceEntryShown = replaceEntryShown.asInstanceOf[js.Any], replaceInputFocused = replaceInputFocused.asInstanceOf[js.Any], replaceText = replaceText.asInstanceOf[js.Any], searchInputFocused = searchInputFocused.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], totalMatches = totalMatches.asInstanceOf[js.Any], useRegex = useRegex.asInstanceOf[js.Any], currentIndex = null, query = null)
      __obj.asInstanceOf[IDisplayState]
    }
    
    extension [Self <: IDisplayState](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndexNull: Self = StObject.set(x, "currentIndex", null)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: IFiltersType): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersOpen(value: Boolean): Self = StObject.set(x, "filtersOpen", value.asInstanceOf[js.Any])
      
      inline def setForceFocus(value: Boolean): Self = StObject.set(x, "forceFocus", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: RegExp): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setReplaceEntryShown(value: Boolean): Self = StObject.set(x, "replaceEntryShown", value.asInstanceOf[js.Any])
      
      inline def setReplaceInputFocused(value: Boolean): Self = StObject.set(x, "replaceInputFocused", value.asInstanceOf[js.Any])
      
      inline def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
      
      inline def setSearchInputFocused(value: Boolean): Self = StObject.set(x, "searchInputFocused", value.asInstanceOf[js.Any])
      
      inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
      
      inline def setTotalMatches(value: Double): Self = StObject.set(x, "totalMatches", value.asInstanceOf[js.Any])
      
      inline def setUseRegex(value: Boolean): Self = StObject.set(x, "useRegex", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFiltersType extends StObject {
    
    var output: Boolean
  }
  object IFiltersType {
    
    inline def apply(output: Boolean): IFiltersType = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFiltersType]
    }
    
    extension [Self <: IFiltersType](x: Self) {
      
      inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISearchMatch extends StObject {
    
    /**
      * Column location of match
      */
    var column: Double
    
    /**
      * Fragment containing match
      */
    val fragment: String
    
    /**
      * Index among the other matches
      */
    var index: Double
    
    /**
      * Line number of match
      */
    var line: Double
    
    /**
      * Text of the exact match itself
      */
    val text: String
  }
  object ISearchMatch {
    
    inline def apply(column: Double, fragment: String, index: Double, line: Double, text: String): ISearchMatch = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchMatch]
    }
    
    extension [Self <: ISearchMatch](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISearchProvider[T /* <: Widget */] extends StObject {
    
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    val changed: ISignal[ISearchProvider[T], Unit]
    
    /**
      * The current index of the selected match.
      */
    val currentMatchIndex: Double | Null
    
    /**
      * Clears state of a search provider to prepare for startQuery to be called
      * in order to start a new query or refresh an existing one.
      *
      * @returns A promise that resolves when the search provider is ready to
      * begin a new search.
      */
    def endQuery(): js.Promise[Unit]
    
    /**
      * Resets UI state as it was before the search process began.  Cleans up and
      * disposes of all internal state.
      *
      * @returns A promise that resolves when all state has been cleaned up.
      */
    def endSearch(): js.Promise[Unit]
    
    /**
      * Get an initial query value if applicable so that it can be entered
      * into the search box as an initial query
      *
      * @param searchTarget The widget to be searched
      *
      * @returns Initial value used to populate the search box.
      */
    def getInitialQuery(searchTarget: T): js.Any
    
    /**
      * Set to true if the widget under search has outputs to search.
      * Defaults to false.
      */
    val hasOutputs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Move the current match indicator to the next match.
      *
      * @returns A promise that resolves once the action has completed.
      */
    def highlightNext(): js.Promise[js.UndefOr[ISearchMatch]]
    
    /**
      * Move the current match indicator to the previous match.
      *
      * @returns A promise that resolves once the action has completed.
      */
    def highlightPrevious(): js.Promise[js.UndefOr[ISearchMatch]]
    
    /**
      * Set to true if the widget under search is read-only, false
      * if it is editable.  Will be used to determine whether to show
      * the replace option.
      */
    val isReadOnly: Boolean
    
    /**
      * The same list of matches provided by the startQuery promise resoluton
      */
    val matches: js.Array[ISearchMatch]
    
    /**
      * Replace all matches in the notebook with the provided text
      *
      * @returns A promise that resolves with a boolean indicating whether a replace occurred.
      */
    def replaceAllMatches(newText: String): js.Promise[Boolean]
    
    /**
      * Replace the currently selected match with the provided text
      *
      * @returns A promise that resolves with a boolean indicating whether a replace occurred.
      */
    def replaceCurrentMatch(newText: String): js.Promise[Boolean]
    
    /**
      * Initialize the search using the provided options.  Should update the UI
      * to highlight all matches and "select" whatever the first match should be.
      *
      * @param query A RegExp to be use to perform the search
      * @param searchTarget The widget to be searched
      * @param filters Filter parameters to pass to provider
      *
      * @returns A promise that resolves with a list of all matches
      */
    def startQuery(query: RegExp, searchTarget: T, filters: IFiltersType): js.Promise[js.Array[ISearchMatch]]
  }
  object ISearchProvider {
    
    inline def apply[T /* <: Widget */](
      changed: ISignal[ISearchProvider[T], Unit],
      endQuery: () => js.Promise[Unit],
      endSearch: () => js.Promise[Unit],
      getInitialQuery: T => js.Any,
      highlightNext: () => js.Promise[js.UndefOr[ISearchMatch]],
      highlightPrevious: () => js.Promise[js.UndefOr[ISearchMatch]],
      isReadOnly: Boolean,
      matches: js.Array[ISearchMatch],
      replaceAllMatches: String => js.Promise[Boolean],
      replaceCurrentMatch: String => js.Promise[Boolean],
      startQuery: (RegExp, T, IFiltersType) => js.Promise[js.Array[ISearchMatch]]
    ): ISearchProvider[T] = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], endQuery = js.Any.fromFunction0(endQuery), endSearch = js.Any.fromFunction0(endSearch), getInitialQuery = js.Any.fromFunction1(getInitialQuery), highlightNext = js.Any.fromFunction0(highlightNext), highlightPrevious = js.Any.fromFunction0(highlightPrevious), isReadOnly = isReadOnly.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], replaceAllMatches = js.Any.fromFunction1(replaceAllMatches), replaceCurrentMatch = js.Any.fromFunction1(replaceCurrentMatch), startQuery = js.Any.fromFunction3(startQuery), currentMatchIndex = null)
      __obj.asInstanceOf[ISearchProvider[T]]
    }
    
    extension [Self <: ISearchProvider[?], T /* <: Widget */](x: Self & ISearchProvider[T]) {
      
      inline def setChanged(value: ISignal[ISearchProvider[T], Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setCurrentMatchIndex(value: Double): Self = StObject.set(x, "currentMatchIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentMatchIndexNull: Self = StObject.set(x, "currentMatchIndex", null)
      
      inline def setEndQuery(value: () => js.Promise[Unit]): Self = StObject.set(x, "endQuery", js.Any.fromFunction0(value))
      
      inline def setEndSearch(value: () => js.Promise[Unit]): Self = StObject.set(x, "endSearch", js.Any.fromFunction0(value))
      
      inline def setGetInitialQuery(value: T => js.Any): Self = StObject.set(x, "getInitialQuery", js.Any.fromFunction1(value))
      
      inline def setHasOutputs(value: Boolean): Self = StObject.set(x, "hasOutputs", value.asInstanceOf[js.Any])
      
      inline def setHasOutputsUndefined: Self = StObject.set(x, "hasOutputs", js.undefined)
      
      inline def setHighlightNext(value: () => js.Promise[js.UndefOr[ISearchMatch]]): Self = StObject.set(x, "highlightNext", js.Any.fromFunction0(value))
      
      inline def setHighlightPrevious(value: () => js.Promise[js.UndefOr[ISearchMatch]]): Self = StObject.set(x, "highlightPrevious", js.Any.fromFunction0(value))
      
      inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[ISearchMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: ISearchMatch*): Self = StObject.set(x, "matches", js.Array(value :_*))
      
      inline def setReplaceAllMatches(value: String => js.Promise[Boolean]): Self = StObject.set(x, "replaceAllMatches", js.Any.fromFunction1(value))
      
      inline def setReplaceCurrentMatch(value: String => js.Promise[Boolean]): Self = StObject.set(x, "replaceCurrentMatch", js.Any.fromFunction1(value))
      
      inline def setStartQuery(value: (RegExp, T, IFiltersType) => js.Promise[js.Array[ISearchMatch]]): Self = StObject.set(x, "startQuery", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ISearchProviderConstructor[T /* <: Widget */]
    extends StObject
       with Instantiable0[ISearchProvider[T]] {
    
    /**
      * Report whether or not this provider has the ability to search on the
      * given object. The function is a type guard, meaning that it returns
      * a boolean, but has a type predicate (`x is T`) for its return signature.
      */
    def canSearchOn(domain: Widget): /* is T */ Boolean = js.native
  }
}

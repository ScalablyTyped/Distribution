package typings.jupyterlabDocumentsearch.interfacesMod

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchProvider[T /* <: Widget */] extends js.Object {
  
  /**
    * Signal indicating that something in the search has changed, so the UI should update
    */
  val changed: ISignal[ISearchProvider[T], Unit] = js.native
  
  /**
    * The current index of the selected match.
    */
  val currentMatchIndex: Double | Null = js.native
  
  /**
    * Clears state of a search provider to prepare for startQuery to be called
    * in order to start a new query or refresh an existing one.
    *
    * @returns A promise that resolves when the search provider is ready to
    * begin a new search.
    */
  def endQuery(): js.Promise[Unit] = js.native
  
  /**
    * Resets UI state as it was before the search process began.  Cleans up and
    * disposes of all internal state.
    *
    * @returns A promise that resolves when all state has been cleaned up.
    */
  def endSearch(): js.Promise[Unit] = js.native
  
  /**
    * Get an initial query value if applicable so that it can be entered
    * into the search box as an initial query
    *
    * @param searchTarget The widget to be searched
    *
    * @returns Initial value used to populate the search box.
    */
  def getInitialQuery(searchTarget: T): js.Any = js.native
  
  /**
    * Set to true if the widget under search has outputs to search.
    * Defaults to false.
    */
  val hasOutputs: js.UndefOr[Boolean] = js.native
  
  /**
    * Move the current match indicator to the next match.
    *
    * @returns A promise that resolves once the action has completed.
    */
  def highlightNext(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
  
  /**
    * Move the current match indicator to the previous match.
    *
    * @returns A promise that resolves once the action has completed.
    */
  def highlightPrevious(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
  
  /**
    * Set to true if the widget under search is read-only, false
    * if it is editable.  Will be used to determine whether to show
    * the replace option.
    */
  val isReadOnly: Boolean = js.native
  
  /**
    * The same list of matches provided by the startQuery promise resoluton
    */
  val matches: js.Array[ISearchMatch] = js.native
  
  /**
    * Replace all matches in the notebook with the provided text
    *
    * @returns A promise that resolves with a boolean indicating whether a replace occurred.
    */
  def replaceAllMatches(newText: String): js.Promise[Boolean] = js.native
  
  /**
    * Replace the currently selected match with the provided text
    *
    * @returns A promise that resolves with a boolean indicating whether a replace occurred.
    */
  def replaceCurrentMatch(newText: String): js.Promise[Boolean] = js.native
  
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
  def startQuery(query: RegExp, searchTarget: T, filters: IFiltersType): js.Promise[js.Array[ISearchMatch]] = js.native
}
object ISearchProvider {
  
  @scala.inline
  def apply[T /* <: Widget */](
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
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], endQuery = js.Any.fromFunction0(endQuery), endSearch = js.Any.fromFunction0(endSearch), getInitialQuery = js.Any.fromFunction1(getInitialQuery), highlightNext = js.Any.fromFunction0(highlightNext), highlightPrevious = js.Any.fromFunction0(highlightPrevious), isReadOnly = isReadOnly.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], replaceAllMatches = js.Any.fromFunction1(replaceAllMatches), replaceCurrentMatch = js.Any.fromFunction1(replaceCurrentMatch), startQuery = js.Any.fromFunction3(startQuery))
    __obj.asInstanceOf[ISearchProvider[T]]
  }
  
  @scala.inline
  implicit class ISearchProviderOps[Self <: ISearchProvider[_], T /* <: Widget */] (val x: Self with ISearchProvider[T]) extends AnyVal {
    
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
    def setChanged(value: ISignal[ISearchProvider[T], Unit]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndQuery(value: () => js.Promise[Unit]): Self = this.set("endQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndSearch(value: () => js.Promise[Unit]): Self = this.set("endSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInitialQuery(value: T => js.Any): Self = this.set("getInitialQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlightNext(value: () => js.Promise[js.UndefOr[ISearchMatch]]): Self = this.set("highlightNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHighlightPrevious(value: () => js.Promise[js.UndefOr[ISearchMatch]]): Self = this.set("highlightPrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: ISearchMatch*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[ISearchMatch]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllMatches(value: String => js.Promise[Boolean]): Self = this.set("replaceAllMatches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceCurrentMatch(value: String => js.Promise[Boolean]): Self = this.set("replaceCurrentMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartQuery(value: (RegExp, T, IFiltersType) => js.Promise[js.Array[ISearchMatch]]): Self = this.set("startQuery", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCurrentMatchIndex(value: Double): Self = this.set("currentMatchIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMatchIndexNull: Self = this.set("currentMatchIndex", null)
    
    @scala.inline
    def setHasOutputs(value: Boolean): Self = this.set("hasOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasOutputs: Self = this.set("hasOutputs", js.undefined)
  }
}

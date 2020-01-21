package typings.jupyterlabDocumentsearch.interfacesMod

import typings.phosphorSignaling.mod.ISignal
import typings.phosphorWidgets.mod.Widget
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchProvider[T /* <: Widget */] extends js.Object {
  /**
    * Signal indicating that something in the search has changed, so the UI should update
    */
  val changed: ISignal[ISearchProvider[T], Unit]
  /**
    * The current index of the selected match.
    */
  val currentMatchIndex: Double | Null
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
    *
    * @returns A promise that resolves with a list of all matches
    */
  def startQuery(query: RegExp, searchTarget: T): js.Promise[js.Array[ISearchMatch]]
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
    startQuery: (RegExp, T) => js.Promise[js.Array[ISearchMatch]],
    currentMatchIndex: Int | Double = null
  ): ISearchProvider[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], endQuery = js.Any.fromFunction0(endQuery), endSearch = js.Any.fromFunction0(endSearch), getInitialQuery = js.Any.fromFunction1(getInitialQuery), highlightNext = js.Any.fromFunction0(highlightNext), highlightPrevious = js.Any.fromFunction0(highlightPrevious), isReadOnly = isReadOnly.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], replaceAllMatches = js.Any.fromFunction1(replaceAllMatches), replaceCurrentMatch = js.Any.fromFunction1(replaceCurrentMatch), startQuery = js.Any.fromFunction2(startQuery))
    if (currentMatchIndex != null) __obj.updateDynamic("currentMatchIndex")(currentMatchIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchProvider[T]]
  }
}


package typings.atJupyterlabDocumentsearch

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typings.atJupyterlabCodemirror.atJupyterlabCodemirrorMod.CodeMirrorEditor
import typings.atJupyterlabDocumentsearch.atJupyterlabDocumentsearchNumbers.`false`
import typings.atJupyterlabDocumentsearch.libInterfacesMod.ISearchMatch
import typings.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProvider
import typings.atJupyterlabDocumentsearch.libProvidersCodemirrorsearchproviderMod.CMMainAreaWidget
import typings.atJupyterlabFileeditor.atJupyterlabFileeditorMod.FileEditor
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.codemirror.codemirrorMod.Position
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider", JSImport.Namespace)
@js.native
object libProvidersCodemirrorsearchproviderMod extends js.Object {
  @js.native
  class CodeMirrorSearchProvider () extends ISearchProvider[CMMainAreaWidget] {
    var _changed: js.Any = js.native
    var _cm: js.Any = js.native
    var _currentMatch: js.Any = js.native
    var _currentMatchIsSelected: js.Any = js.native
    var _findNext: js.Any = js.native
    var _getSearchOverlay: js.Any = js.native
    var _matchState: js.Any = js.native
    var _onDocChanged: js.Any = js.native
    var _overlay: js.Any = js.native
    var _parseMatchesFromState: js.Any = js.native
    var _query: js.Any = js.native
    var _refreshOverlay: js.Any = js.native
    /**
      * Do a full search on the entire document.
      *
      * This manually constructs the initial match state across the whole
      * document. This must be done manually because the codemirror overlay
      * is lazy-loaded, so it will only tokenize lines that are in or near
      * the viewport.  This is sufficient for efficiently maintaining the
      * state when changes are made to the document, as changes occur in or
      * near the viewport, but to scan the whole document, a manual search
      * across the entire content is required.
      *
      * @param query The search term
      */
    var _setInitialMatches: js.Any = js.native
    var _startQuery: js.Any = js.native
    var _toEditorPos: js.Any = js.native
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    /* CompleteClass */
    override val changed: ISignal[ISearchProvider[CMMainAreaWidget], Unit] = js.native
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    @JSName("changed")
    val changed_CodeMirrorSearchProvider: ISignal[this.type, Unit] = js.native
    val currentMatch: ISearchMatch | Null = js.native
    /**
      * The current index of the selected match.
      */
    /* CompleteClass */
    override val currentMatchIndex: Double | Null = js.native
    /**
      * The current index of the selected match.
      */
    @JSName("currentMatchIndex")
    val currentMatchIndex_CodeMirrorSearchProvider: Double = js.native
    /**
      * Set to true if the widget under search is read-only, false
      * if it is editable.  Will be used to determine whether to show
      * the replace option.
      */
    /* CompleteClass */
    override val isReadOnly: Boolean = js.native
    /**
      * Set to true if the widget under search is read-only, false
      * if it is editable.  Will be used to determine whether to show
      * the replace option.
      */
    @JSName("isReadOnly")
    val isReadOnly_CodeMirrorSearchProvider: `false` = js.native
    /**
      * Set whether or not the CodemirrorSearchProvider will wrap to the beginning
      * or end of the document on invocations of highlightNext or highlightPrevious, respectively
      */
    var isSubProvider: Boolean = js.native
    /**
      * The same list of matches provided by the startQuery promise resoluton
      */
    /* CompleteClass */
    override val matches: js.Array[ISearchMatch] = js.native
    def clearSelection(): Unit = js.native
    /**
      * Clears state of a search provider to prepare for startQuery to be called
      * in order to start a new query or refresh an existing one.
      *
      * @returns A promise that resolves when the search provider is ready to
      * begin a new search.
      */
    /* CompleteClass */
    override def endQuery(): js.Promise[Unit] = js.native
    def endQuery(removeOverlay: Boolean): js.Promise[Unit] = js.native
    /**
      * Resets UI state as it was before the search process began.  Cleans up and
      * disposes of all internal state.
      *
      * @returns A promise that resolves when all state has been cleaned up.
      */
    /* CompleteClass */
    override def endSearch(): js.Promise[Unit] = js.native
    /**
      * Get an initial query value if applicable so that it can be entered
      * into the search box as an initial query
      *
      * @param searchTarget The widget to be searched
      *
      * @returns Initial value used to populate the search box.
      */
    /* CompleteClass */
    override def getInitialQuery(searchTarget: CMMainAreaWidget): js.Any = js.native
    /**
      * Move the current match indicator to the next match.
      *
      * @returns A promise that resolves once the action has completed.
      */
    /* CompleteClass */
    override def highlightNext(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
    /**
      * Move the current match indicator to the previous match.
      *
      * @returns A promise that resolves once the action has completed.
      */
    /* CompleteClass */
    override def highlightPrevious(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
    def refreshOverlay(): Unit = js.native
    /**
      * Replace all matches in the notebook with the provided text
      *
      * @returns A promise that resolves with a boolean indicating whether a replace occurred.
      */
    /* CompleteClass */
    override def replaceAllMatches(newText: String): js.Promise[Boolean] = js.native
    /**
      * Replace the currently selected match with the provided text
      *
      * @returns A promise that resolves with a boolean indicating whether a replace occurred.
      */
    /* CompleteClass */
    override def replaceCurrentMatch(newText: String): js.Promise[Boolean] = js.native
    /**
      * Initialize the search using the provided options.  Should update the UI
      * to highlight all matches and "select" whatever the first match should be.
      *
      * @param query A RegExp to be use to perform the search
      * @param searchTarget The widget to be searched
      *
      * @returns A promise that resolves with a list of all matches
      */
    /* CompleteClass */
    override def startQuery(query: RegExp, searchTarget: CMMainAreaWidget): js.Promise[js.Array[ISearchMatch]] = js.native
    /**
      * Initialize the search using the provided options.  Should update the UI
      * to highlight all matches and "select" whatever the first match should be.
      *
      * @param query A RegExp to be use to perform the search
      * @param searchTarget The widget to be searched
      *
      * @returns A promise that resolves with a list of all matches
      */
    def startQuery(query: RegExp, searchTarget: Widget): js.Promise[js.Array[ISearchMatch]] = js.native
    /**
      * Initialize the search using a CodeMirrorEditor object.
      */
    def startQueryCodeMirror(query: RegExp, searchTarget: CodeMirrorEditor): js.Promise[js.Array[ISearchMatch]] = js.native
  }
  
  @js.native
  class SearchState () extends js.Object {
    var lastQuery: String = js.native
    var posFrom: Position = js.native
    var posTo: Position = js.native
    var query: RegExp = js.native
  }
  
  /* static members */
  @js.native
  object CodeMirrorSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = js.native
  }
  
  type CMMainAreaWidget = MainAreaWidget[FileEditor] with Anon_Content
}


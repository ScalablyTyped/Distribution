package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.anon.APPLET
import typings.jupyterlabDocumentsearch.interfacesMod.IFiltersType
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchMatch
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericsearchproviderMod {
  
  @JSImport("@jupyterlab/documentsearch/lib/providers/genericsearchprovider", "GenericSearchProvider")
  @js.native
  class GenericSearchProvider ()
    extends StObject
       with ISearchProvider[Widget] {
    
    /* private */ var _changed: js.Any = js.native
    
    /* private */ var _currentMatch: js.Any = js.native
    
    /* private */ var _highlightNext: js.Any = js.native
    
    /* private */ var _matches: js.Any = js.native
    
    /* private */ var _mutationObserver: js.Any = js.native
    
    /* private */ var _onWidgetChanged: js.Any = js.native
    
    /* private */ var _query: js.Any = js.native
    
    /* private */ var _widget: js.Any = js.native
    
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    /* CompleteClass */
    override val changed: ISignal[ISearchProvider[Widget], Unit] = js.native
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    @JSName("changed")
    def changed_MGenericSearchProvider: ISignal[this.type, Unit] = js.native
    
    def clearSelection(): Unit = js.native
    
    def currentMatch: ISearchMatch | Null = js.native
    
    /**
      * The current index of the selected match.
      */
    /* CompleteClass */
    override val currentMatchIndex: Double | Null = js.native
    /**
      * The current index of the selected match.
      */
    @JSName("currentMatchIndex")
    def currentMatchIndex_MGenericSearchProvider: Double | Null = js.native
    
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
    override def getInitialQuery(searchTarget: Widget): js.Any = js.native
    
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
    
    /**
      * Set to true if the widget under search is read-only, false
      * if it is editable.  Will be used to determine whether to show
      * the replace option.
      */
    /* CompleteClass */
    override val isReadOnly: Boolean = js.native
    
    /**
      * Set whether or not this will wrap to the beginning
      * or end of the document on invocations of highlightNext or highlightPrevious, respectively
      */
    var isSubProvider: Boolean = js.native
    
    /**
      * The same list of matches provided by the startQuery promise resoluton
      */
    /* CompleteClass */
    override val matches: js.Array[ISearchMatch] = js.native
    /**
      * The same list of matches provided by the startQuery promise resolution
      */
    @JSName("matches")
    def matches_MGenericSearchProvider: js.Array[ISearchMatch] = js.native
    
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
      * @param [filters={}] Filter parameters to pass to provider
      *
      * @returns A promise that resolves with a list of all matches
      */
    def startQuery(query: RegExp, searchTarget: Widget): js.Promise[js.Array[ISearchMatch]] = js.native
    def startQuery(query: RegExp, searchTarget: Widget, filters: js.Object): js.Promise[js.Array[ISearchMatch]] = js.native
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
    /* CompleteClass */
    override def startQuery(query: RegExp, searchTarget: Widget, filters: IFiltersType): js.Promise[js.Array[ISearchMatch]] = js.native
  }
  /* static members */
  object GenericSearchProvider {
    
    @JSImport("@jupyterlab/documentsearch/lib/providers/genericsearchprovider", "GenericSearchProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * We choose opt out as most node types should be searched (e.g. script).
      * Even nodes like <data>, could have innerText we care about.
      *
      * Note: nodeName is capitalized, so we do the same here
      */
    @JSImport("@jupyterlab/documentsearch/lib/providers/genericsearchprovider", "GenericSearchProvider.UNSUPPORTED_ELEMENTS")
    @js.native
    def UNSUPPORTED_ELEMENTS: APPLET = js.native
    inline def UNSUPPORTED_ELEMENTS_=(x: APPLET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_ELEMENTS")(x.asInstanceOf[js.Any])
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    inline def canSearchOn(domain: Widget): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canSearchOn")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}

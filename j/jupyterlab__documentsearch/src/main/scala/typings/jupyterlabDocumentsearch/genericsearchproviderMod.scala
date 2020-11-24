package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.anon.APPLET
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchMatch
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/documentsearch/lib/providers/genericsearchprovider", JSImport.Namespace)
@js.native
object genericsearchproviderMod extends js.Object {
  
  @js.native
  class GenericSearchProvider () extends ISearchProvider[Widget] {
    
    var _changed: js.Any = js.native
    
    var _currentMatch: js.Any = js.native
    
    var _highlightNext: js.Any = js.native
    
    var _matches: js.Any = js.native
    
    var _mutationObserver: js.Any = js.native
    
    var _onWidgetChanged: js.Any = js.native
    
    var _query: js.Any = js.native
    
    var _widget: js.Any = js.native
    
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
    @JSName("currentMatchIndex")
    def currentMatchIndex_MGenericSearchProvider: Double | Null = js.native
    
    def endQuery(removeOverlay: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Set whether or not this will wrap to the beginning
      * or end of the document on invocations of highlightNext or highlightPrevious, respectively
      */
    var isSubProvider: Boolean = js.native
    
    /**
      * The same list of matches provided by the startQuery promise resolution
      */
    @JSName("matches")
    def matches_MGenericSearchProvider: js.Array[ISearchMatch] = js.native
    
    def refreshOverlay(): Unit = js.native
    
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
  }
  /* static members */
  @js.native
  object GenericSearchProvider extends js.Object {
    
    /**
      * We choose opt out as most node types should be searched (e.g. script).
      * Even nodes like <data>, could have innerText we care about.
      *
      * Note: nodeName is capitalized, so we do the same here
      */
    var UNSUPPORTED_ELEMENTS: APPLET = js.native
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): Boolean = js.native
  }
}

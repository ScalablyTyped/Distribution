package typings.iitc

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.spectrum.JQuery
import typings.std.Element
import typings.std.Text
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  object global {
    
    /**
      * you can implement your own result provider by listing to the search @see hook:
      * addHook('search', function(query: SearchQuery) {});
      */
    @JSGlobal("SearchQuery")
    @js.native
    class SearchQuery () extends StObject {
      
      /** called to add a result to the query */
      def addResult(result: SearchResult): Unit = js.native
      
      /**
        * indicating if the user has pressed enter after searching. You should not search online or
        * do heavy processing unless the user has confirmed the search term
        */
      var confirmed: Boolean = js.native
      
      /* private */ def hide(): Unit = js.native
      
      /* private */ def init(): Unit = js.native
      
      /* private */ def onResultHoverEnd(result: SearchResult, event: js.Any): Unit = js.native
      
      /* private */ def onResultHoverStart(result: SearchResult, event: js.Any): Unit = js.native
      
      /* private */ def onResultSelected(result: SearchResult, event: js.Any): Unit = js.native
      
      /* private */ def removeHoverResult(): Unit = js.native
      
      /* private */ def removeSelectedResult(): Unit = js.native
      
      /* private */ def resultLayer(result: SearchResult): LayerGroup_[_] = js.native
      
      /* private */ def show(): Unit = js.native
      
      /** the term for which the user has searched */
      var term: String = js.native
    }
    
    @JSGlobal("Search")
    @js.native
    class Search_ () extends StObject {
      
      def doSearch(term: String, confirmed: Boolean): Unit = js.native
      
      var lastSearch: SearchQuery | Null = js.native
      
      def setup(): Unit = js.native
    }
    
    @JSGlobal("search")
    @js.native
    def search: Search_ = js.native
    @scala.inline
    def search_=(x: Search_): Unit = js.Dynamic.global.updateDynamic("search")(x.asInstanceOf[js.Any])
    
    /* Rewritten from type alias, can be one of: 
      - typings.iitc.searchMod.global.SearchResultPosition
      - typings.iitc.searchMod.global.SearchResultBounds
    */
    trait SearchResult extends StObject
    object SearchResult {
      
      @scala.inline
      def SearchResultBounds(
        bounds: LatLngBoundsExpression,
        description: JQuery | js.Array[_] | Element | Text | String,
        title: String
      ): typings.iitc.searchMod.global.SearchResultBounds = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.iitc.searchMod.global.SearchResultBounds]
      }
      
      @scala.inline
      def SearchResultPosition(
        description: JQuery | js.Array[_] | Element | Text | String,
        position: LatLngExpression,
        title: String
      ): typings.iitc.searchMod.global.SearchResultPosition = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.iitc.searchMod.global.SearchResultPosition]
      }
    }
    
    @js.native
    trait SearchResultBase extends StObject {
      
      /** secondary information for this result.Will be interpreted as HTML, so make sure to escape properly. */
      var description: JQuery | js.Array[_] | Element | Text | String = js.native
      
      /** a URL to a icon to display in the result list. Should be 12x12. */
      var icon: js.UndefOr[String] = js.native
      
      /** a ILayer to be added to the map when the user selects this search result. Will be generated if not set. Set to `null` to prevent the result from being added to the map. */
      var layer: js.UndefOr[Layer] = js.native
      
      /**
        * a handler to be called when the result is removed from the map(because another result has been
        * selected or the search was cancelled by the user).
        */
      var onRemove: js.UndefOr[js.Function1[/* result */ SearchResult, Unit]] = js.native
      
      /**
        * a handler to be called when the result is selected. May return `true` to prevent the map from being repositioned.
        * You may reposition the map yourself or do other work.
        */
      var onSelected: js.UndefOr[
            js.Function2[/* result */ SearchResult, /* event */ UIEvent, js.UndefOr[Boolean]]
          ] = js.native
      
      /** Will be interpreted as HTML, so make sure to escape properly. */
      var title: String = js.native
    }
    object SearchResultBase {
      
      @scala.inline
      def apply(description: JQuery | js.Array[_] | Element | Text | String, title: String): SearchResultBase = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultBase]
      }
      
      @scala.inline
      implicit class SearchResultBaseMutableBuilder[Self <: SearchResultBase] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: JQuery | js.Array[_] | Element | Text | String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionVarargs(value: js.Any*): Self = StObject.set(x, "description", js.Array(value :_*))
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
        
        @scala.inline
        def setOnRemove(value: /* result */ SearchResult => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
        
        @scala.inline
        def setOnSelected(value: (/* result */ SearchResult, /* event */ UIEvent) => js.UndefOr[Boolean]): Self = StObject.set(x, "onSelected", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnSelectedUndefined: Self = StObject.set(x, "onSelected", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SearchResultBounds
      extends SearchResultBase
         with SearchResult {
      
      var bounds: LatLngBoundsExpression = js.native
    }
    object SearchResultBounds {
      
      @scala.inline
      def apply(
        bounds: LatLngBoundsExpression,
        description: JQuery | js.Array[_] | Element | Text | String,
        title: String
      ): SearchResultBounds = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultBounds]
      }
      
      @scala.inline
      implicit class SearchResultBoundsMutableBuilder[Self <: SearchResultBounds] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SearchResultPosition
      extends SearchResultBase
         with SearchResult {
      
      var position: LatLngExpression = js.native
    }
    object SearchResultPosition {
      
      @scala.inline
      def apply(
        description: JQuery | js.Array[_] | Element | Text | String,
        position: LatLngExpression,
        title: String
      ): SearchResultPosition = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultPosition]
      }
      
      @scala.inline
      implicit class SearchResultPositionMutableBuilder[Self <: SearchResultPosition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      }
    }
  }
}

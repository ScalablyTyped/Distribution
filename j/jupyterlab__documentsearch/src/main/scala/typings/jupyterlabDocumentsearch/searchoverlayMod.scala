package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.IDisplayState
import typings.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchoverlayMod {
  
  object createSearchOverlay {
    
    @JSImport("@jupyterlab/documentsearch/lib/searchoverlay", "createSearchOverlay")
    @js.native
    def apply(options: IOptions): Widget = js.native
    
    @js.native
    trait IOptions extends StObject {
      
      var hasOutputs: Boolean = js.native
      
      var isReadOnly: Boolean = js.native
      
      var onCaseSensitiveToggled: js.Function = js.native
      
      var onEndSearch: js.Function = js.native
      
      var onHighlightPrevious: js.Function = js.native
      
      var onHightlightNext: js.Function = js.native
      
      var onRegexToggled: js.Function = js.native
      
      var onReplaceAll: js.Function = js.native
      
      var onReplaceCurrent: js.Function = js.native
      
      var onStartQuery: js.Function = js.native
      
      var overlayState: IDisplayState = js.native
      
      var widgetChanged: Signal[SearchInstance, IDisplayState] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        hasOutputs: Boolean,
        isReadOnly: Boolean,
        onCaseSensitiveToggled: js.Function,
        onEndSearch: js.Function,
        onHighlightPrevious: js.Function,
        onHightlightNext: js.Function,
        onRegexToggled: js.Function,
        onReplaceAll: js.Function,
        onReplaceCurrent: js.Function,
        onStartQuery: js.Function,
        overlayState: IDisplayState,
        widgetChanged: Signal[SearchInstance, IDisplayState]
      ): IOptions = {
        val __obj = js.Dynamic.literal(hasOutputs = hasOutputs.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], onCaseSensitiveToggled = onCaseSensitiveToggled.asInstanceOf[js.Any], onEndSearch = onEndSearch.asInstanceOf[js.Any], onHighlightPrevious = onHighlightPrevious.asInstanceOf[js.Any], onHightlightNext = onHightlightNext.asInstanceOf[js.Any], onRegexToggled = onRegexToggled.asInstanceOf[js.Any], onReplaceAll = onReplaceAll.asInstanceOf[js.Any], onReplaceCurrent = onReplaceCurrent.asInstanceOf[js.Any], onStartQuery = onStartQuery.asInstanceOf[js.Any], overlayState = overlayState.asInstanceOf[js.Any], widgetChanged = widgetChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHasOutputs(value: Boolean): Self = StObject.set(x, "hasOutputs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCaseSensitiveToggled(value: js.Function): Self = StObject.set(x, "onCaseSensitiveToggled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnEndSearch(value: js.Function): Self = StObject.set(x, "onEndSearch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnHighlightPrevious(value: js.Function): Self = StObject.set(x, "onHighlightPrevious", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnHightlightNext(value: js.Function): Self = StObject.set(x, "onHightlightNext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnRegexToggled(value: js.Function): Self = StObject.set(x, "onRegexToggled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnReplaceAll(value: js.Function): Self = StObject.set(x, "onReplaceAll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnReplaceCurrent(value: js.Function): Self = StObject.set(x, "onReplaceCurrent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnStartQuery(value: js.Function): Self = StObject.set(x, "onStartQuery", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverlayState(value: IDisplayState): Self = StObject.set(x, "overlayState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidgetChanged(value: Signal[SearchInstance, IDisplayState]): Self = StObject.set(x, "widgetChanged", value.asInstanceOf[js.Any])
      }
    }
  }
}

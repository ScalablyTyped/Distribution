package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.IDisplayState
import typings.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchoverlayMod {
  
  object createSearchOverlay {
    
    inline def apply(options: IOptions): Widget = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @JSImport("@jupyterlab/documentsearch/lib/searchoverlay", "createSearchOverlay")
    @js.native
    val ^ : js.Any = js.native
    
    trait IOptions extends StObject {
      
      var hasOutputs: Boolean
      
      var isReadOnly: Boolean
      
      var onCaseSensitiveToggled: js.Function
      
      var onEndSearch: js.Function
      
      var onHighlightPrevious: js.Function
      
      var onHightlightNext: js.Function
      
      var onRegexToggled: js.Function
      
      var onReplaceAll: js.Function
      
      var onReplaceCurrent: js.Function
      
      var onStartQuery: js.Function
      
      var overlayState: IDisplayState
      
      var widgetChanged: Signal[SearchInstance, IDisplayState]
    }
    object IOptions {
      
      inline def apply(
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
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setHasOutputs(value: Boolean): Self = StObject.set(x, "hasOutputs", value.asInstanceOf[js.Any])
        
        inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
        
        inline def setOnCaseSensitiveToggled(value: js.Function): Self = StObject.set(x, "onCaseSensitiveToggled", value.asInstanceOf[js.Any])
        
        inline def setOnEndSearch(value: js.Function): Self = StObject.set(x, "onEndSearch", value.asInstanceOf[js.Any])
        
        inline def setOnHighlightPrevious(value: js.Function): Self = StObject.set(x, "onHighlightPrevious", value.asInstanceOf[js.Any])
        
        inline def setOnHightlightNext(value: js.Function): Self = StObject.set(x, "onHightlightNext", value.asInstanceOf[js.Any])
        
        inline def setOnRegexToggled(value: js.Function): Self = StObject.set(x, "onRegexToggled", value.asInstanceOf[js.Any])
        
        inline def setOnReplaceAll(value: js.Function): Self = StObject.set(x, "onReplaceAll", value.asInstanceOf[js.Any])
        
        inline def setOnReplaceCurrent(value: js.Function): Self = StObject.set(x, "onReplaceCurrent", value.asInstanceOf[js.Any])
        
        inline def setOnStartQuery(value: js.Function): Self = StObject.set(x, "onStartQuery", value.asInstanceOf[js.Any])
        
        inline def setOverlayState(value: IDisplayState): Self = StObject.set(x, "overlayState", value.asInstanceOf[js.Any])
        
        inline def setWidgetChanged(value: Signal[SearchInstance, IDisplayState]): Self = StObject.set(x, "widgetChanged", value.asInstanceOf[js.Any])
      }
    }
  }
}

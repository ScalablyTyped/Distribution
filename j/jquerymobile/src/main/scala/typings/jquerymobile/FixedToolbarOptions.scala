package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedToolbarOptions extends StObject {
  
  var disablePageZoom: js.UndefOr[Boolean] = js.undefined
  
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  var hideDuringFocus: js.UndefOr[String] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var supportBlacklist: js.UndefOr[js.Function] = js.undefined
  
  var tapToggle: js.UndefOr[Boolean] = js.undefined
  
  var tapToggleBlacklist: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var updatePagePadding: js.UndefOr[Boolean] = js.undefined
  
  var visibleOnPageShow: js.UndefOr[Boolean] = js.undefined
}
object FixedToolbarOptions {
  
  inline def apply(): FixedToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedToolbarOptions]
  }
  
  extension [Self <: FixedToolbarOptions](x: Self) {
    
    inline def setDisablePageZoom(value: Boolean): Self = StObject.set(x, "disablePageZoom", value.asInstanceOf[js.Any])
    
    inline def setDisablePageZoomUndefined: Self = StObject.set(x, "disablePageZoom", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setHideDuringFocus(value: String): Self = StObject.set(x, "hideDuringFocus", value.asInstanceOf[js.Any])
    
    inline def setHideDuringFocusUndefined: Self = StObject.set(x, "hideDuringFocus", js.undefined)
    
    inline def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    inline def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    inline def setSupportBlacklist(value: js.Function): Self = StObject.set(x, "supportBlacklist", value.asInstanceOf[js.Any])
    
    inline def setSupportBlacklistUndefined: Self = StObject.set(x, "supportBlacklist", js.undefined)
    
    inline def setTapToggle(value: Boolean): Self = StObject.set(x, "tapToggle", value.asInstanceOf[js.Any])
    
    inline def setTapToggleBlacklist(value: String): Self = StObject.set(x, "tapToggleBlacklist", value.asInstanceOf[js.Any])
    
    inline def setTapToggleBlacklistUndefined: Self = StObject.set(x, "tapToggleBlacklist", js.undefined)
    
    inline def setTapToggleUndefined: Self = StObject.set(x, "tapToggle", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setUpdatePagePadding(value: Boolean): Self = StObject.set(x, "updatePagePadding", value.asInstanceOf[js.Any])
    
    inline def setUpdatePagePaddingUndefined: Self = StObject.set(x, "updatePagePadding", js.undefined)
    
    inline def setVisibleOnPageShow(value: Boolean): Self = StObject.set(x, "visibleOnPageShow", value.asInstanceOf[js.Any])
    
    inline def setVisibleOnPageShowUndefined: Self = StObject.set(x, "visibleOnPageShow", js.undefined)
  }
}

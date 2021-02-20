package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedToolbarOptions extends StObject {
  
  var disablePageZoom: js.UndefOr[Boolean] = js.native
  
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  var hideDuringFocus: js.UndefOr[String] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var supportBlacklist: js.UndefOr[js.Function] = js.native
  
  var tapToggle: js.UndefOr[Boolean] = js.native
  
  var tapToggleBlacklist: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var updatePagePadding: js.UndefOr[Boolean] = js.native
  
  var visibleOnPageShow: js.UndefOr[Boolean] = js.native
}
object FixedToolbarOptions {
  
  @scala.inline
  def apply(): FixedToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedToolbarOptions]
  }
  
  @scala.inline
  implicit class FixedToolbarOptionsMutableBuilder[Self <: FixedToolbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisablePageZoom(value: Boolean): Self = StObject.set(x, "disablePageZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePageZoomUndefined: Self = StObject.set(x, "disablePageZoom", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setHideDuringFocus(value: String): Self = StObject.set(x, "hideDuringFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDuringFocusUndefined: Self = StObject.set(x, "hideDuringFocus", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    @scala.inline
    def setSupportBlacklist(value: js.Function): Self = StObject.set(x, "supportBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportBlacklistUndefined: Self = StObject.set(x, "supportBlacklist", js.undefined)
    
    @scala.inline
    def setTapToggle(value: Boolean): Self = StObject.set(x, "tapToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapToggleBlacklist(value: String): Self = StObject.set(x, "tapToggleBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapToggleBlacklistUndefined: Self = StObject.set(x, "tapToggleBlacklist", js.undefined)
    
    @scala.inline
    def setTapToggleUndefined: Self = StObject.set(x, "tapToggle", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setUpdatePagePadding(value: Boolean): Self = StObject.set(x, "updatePagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePagePaddingUndefined: Self = StObject.set(x, "updatePagePadding", js.undefined)
    
    @scala.inline
    def setVisibleOnPageShow(value: Boolean): Self = StObject.set(x, "visibleOnPageShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleOnPageShowUndefined: Self = StObject.set(x, "visibleOnPageShow", js.undefined)
  }
}

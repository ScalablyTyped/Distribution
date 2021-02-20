package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectMenuOptions extends StObject {
  
  var corners: js.UndefOr[Boolean] = js.native
  
  var hidePlaceholderMenuItems: Boolean = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var iconpos: js.UndefOr[String] = js.native
  
  var iconshadow: js.UndefOr[Boolean] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var mini: js.UndefOr[Boolean] = js.native
  
  var nativeMenu: js.UndefOr[Boolean] = js.native
  
  var overlayTheme: js.UndefOr[String] = js.native
  
  var preventFocusZoom: js.UndefOr[Boolean] = js.native
  
  var shadow: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object SelectMenuOptions {
  
  @scala.inline
  def apply(hidePlaceholderMenuItems: Boolean): SelectMenuOptions = {
    val __obj = js.Dynamic.literal(hidePlaceholderMenuItems = hidePlaceholderMenuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuOptions]
  }
  
  @scala.inline
  implicit class SelectMenuOptionsMutableBuilder[Self <: SelectMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    @scala.inline
    def setHidePlaceholderMenuItems(value: Boolean): Self = StObject.set(x, "hidePlaceholderMenuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconpos(value: String): Self = StObject.set(x, "iconpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconposUndefined: Self = StObject.set(x, "iconpos", js.undefined)
    
    @scala.inline
    def setIconshadow(value: Boolean): Self = StObject.set(x, "iconshadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconshadowUndefined: Self = StObject.set(x, "iconshadow", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    @scala.inline
    def setNativeMenu(value: Boolean): Self = StObject.set(x, "nativeMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeMenuUndefined: Self = StObject.set(x, "nativeMenu", js.undefined)
    
    @scala.inline
    def setOverlayTheme(value: String): Self = StObject.set(x, "overlayTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayThemeUndefined: Self = StObject.set(x, "overlayTheme", js.undefined)
    
    @scala.inline
    def setPreventFocusZoom(value: Boolean): Self = StObject.set(x, "preventFocusZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventFocusZoomUndefined: Self = StObject.set(x, "preventFocusZoom", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}

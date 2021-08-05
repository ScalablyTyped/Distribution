package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectMenuOptions extends StObject {
  
  var corners: js.UndefOr[Boolean] = js.undefined
  
  var hidePlaceholderMenuItems: Boolean
  
  var icon: js.UndefOr[String] = js.undefined
  
  var iconpos: js.UndefOr[String] = js.undefined
  
  var iconshadow: js.UndefOr[Boolean] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var mini: js.UndefOr[Boolean] = js.undefined
  
  var nativeMenu: js.UndefOr[Boolean] = js.undefined
  
  var overlayTheme: js.UndefOr[String] = js.undefined
  
  var preventFocusZoom: js.UndefOr[Boolean] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object SelectMenuOptions {
  
  inline def apply(hidePlaceholderMenuItems: Boolean): SelectMenuOptions = {
    val __obj = js.Dynamic.literal(hidePlaceholderMenuItems = hidePlaceholderMenuItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuOptions]
  }
  
  extension [Self <: SelectMenuOptions](x: Self) {
    
    inline def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    inline def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    inline def setHidePlaceholderMenuItems(value: Boolean): Self = StObject.set(x, "hidePlaceholderMenuItems", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconpos(value: String): Self = StObject.set(x, "iconpos", value.asInstanceOf[js.Any])
    
    inline def setIconposUndefined: Self = StObject.set(x, "iconpos", js.undefined)
    
    inline def setIconshadow(value: Boolean): Self = StObject.set(x, "iconshadow", value.asInstanceOf[js.Any])
    
    inline def setIconshadowUndefined: Self = StObject.set(x, "iconshadow", js.undefined)
    
    inline def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    inline def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setNativeMenu(value: Boolean): Self = StObject.set(x, "nativeMenu", value.asInstanceOf[js.Any])
    
    inline def setNativeMenuUndefined: Self = StObject.set(x, "nativeMenu", js.undefined)
    
    inline def setOverlayTheme(value: String): Self = StObject.set(x, "overlayTheme", value.asInstanceOf[js.Any])
    
    inline def setOverlayThemeUndefined: Self = StObject.set(x, "overlayTheme", js.undefined)
    
    inline def setPreventFocusZoom(value: Boolean): Self = StObject.set(x, "preventFocusZoom", value.asInstanceOf[js.Any])
    
    inline def setPreventFocusZoomUndefined: Self = StObject.set(x, "preventFocusZoom", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}

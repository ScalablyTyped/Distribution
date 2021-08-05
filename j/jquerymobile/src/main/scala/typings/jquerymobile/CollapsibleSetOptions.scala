package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleSetOptions extends StObject {
  
  var collapsedIcon: js.UndefOr[String] = js.undefined
  
  var expandedIcon: js.UndefOr[String] = js.undefined
  
  var iconpos: js.UndefOr[String] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var inset: js.UndefOr[Boolean] = js.undefined
  
  var mini: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object CollapsibleSetOptions {
  
  inline def apply(): CollapsibleSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleSetOptions]
  }
  
  extension [Self <: CollapsibleSetOptions](x: Self) {
    
    inline def setCollapsedIcon(value: String): Self = StObject.set(x, "collapsedIcon", value.asInstanceOf[js.Any])
    
    inline def setCollapsedIconUndefined: Self = StObject.set(x, "collapsedIcon", js.undefined)
    
    inline def setExpandedIcon(value: String): Self = StObject.set(x, "expandedIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandedIconUndefined: Self = StObject.set(x, "expandedIcon", js.undefined)
    
    inline def setIconpos(value: String): Self = StObject.set(x, "iconpos", value.asInstanceOf[js.Any])
    
    inline def setIconposUndefined: Self = StObject.set(x, "iconpos", js.undefined)
    
    inline def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    inline def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}

package typings.griddleReact.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleStyleConfig extends StObject {
  
  var classNames: js.UndefOr[GriddleStyleElements[String]] = js.undefined
  
  var icons: js.UndefOr[GriddleStyleElements[GriddleStyleIcons]] = js.undefined
  
  var styles: js.UndefOr[GriddleStyleElements[CSSProperties]] = js.undefined
}
object GriddleStyleConfig {
  
  inline def apply(): GriddleStyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleConfig]
  }
  
  extension [Self <: GriddleStyleConfig](x: Self) {
    
    inline def setClassNames(value: GriddleStyleElements[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setIcons(value: GriddleStyleElements[GriddleStyleIcons]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setStyles(value: GriddleStyleElements[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}

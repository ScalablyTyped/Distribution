package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOpaqueColor extends StObject {
  
  /**
    * An opaque RGB color.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.undefined
  
  /**
    * An opaque theme color.
    */
  var themeColor: js.UndefOr[String | Null] = js.undefined
}
object SchemaOpaqueColor {
  
  inline def apply(): SchemaOpaqueColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOpaqueColor]
  }
  
  extension [Self <: SchemaOpaqueColor](x: Self) {
    
    inline def setRgbColor(value: SchemaRgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    inline def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorNull: Self = StObject.set(x, "themeColor", null)
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}

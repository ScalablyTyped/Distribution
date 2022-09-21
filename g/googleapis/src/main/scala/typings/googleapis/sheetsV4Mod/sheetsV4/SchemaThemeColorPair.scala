package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThemeColorPair extends StObject {
  
  /**
    * The concrete color corresponding to the theme color type.
    */
  var color: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The type of the spreadsheet theme color.
    */
  var colorType: js.UndefOr[String | Null] = js.undefined
}
object SchemaThemeColorPair {
  
  inline def apply(): SchemaThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThemeColorPair]
  }
  
  extension [Self <: SchemaThemeColorPair](x: Self) {
    
    inline def setColor(value: SchemaColorStyle): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setColorTypeNull: Self = StObject.set(x, "colorType", null)
    
    inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}

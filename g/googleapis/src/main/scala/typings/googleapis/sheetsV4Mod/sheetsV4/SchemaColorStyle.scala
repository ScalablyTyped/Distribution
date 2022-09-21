package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColorStyle extends StObject {
  
  /**
    * RGB color. The [`alpha`](/sheets/api/reference/rest/v4/spreadsheets/other#Color.FIELDS.alpha) value in the [`Color`](/sheets/api/reference/rest/v4/spreadsheets/other#color) object isn't generally supported.
    */
  var rgbColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * Theme color.
    */
  var themeColor: js.UndefOr[String | Null] = js.undefined
}
object SchemaColorStyle {
  
  inline def apply(): SchemaColorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColorStyle]
  }
  
  extension [Self <: SchemaColorStyle](x: Self) {
    
    inline def setRgbColor(value: SchemaColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    inline def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorNull: Self = StObject.set(x, "themeColor", null)
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}

package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpreadsheetTheme extends StObject {
  
  /**
    * Name of the primary font family.
    */
  var primaryFontFamily: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The spreadsheet theme color pairs. To update you must provide all theme color pairs.
    */
  var themeColors: js.UndefOr[js.Array[SchemaThemeColorPair]] = js.undefined
}
object SchemaSpreadsheetTheme {
  
  inline def apply(): SchemaSpreadsheetTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpreadsheetTheme]
  }
  
  extension [Self <: SchemaSpreadsheetTheme](x: Self) {
    
    inline def setPrimaryFontFamily(value: String): Self = StObject.set(x, "primaryFontFamily", value.asInstanceOf[js.Any])
    
    inline def setPrimaryFontFamilyNull: Self = StObject.set(x, "primaryFontFamily", null)
    
    inline def setPrimaryFontFamilyUndefined: Self = StObject.set(x, "primaryFontFamily", js.undefined)
    
    inline def setThemeColors(value: js.Array[SchemaThemeColorPair]): Self = StObject.set(x, "themeColors", value.asInstanceOf[js.Any])
    
    inline def setThemeColorsUndefined: Self = StObject.set(x, "themeColors", js.undefined)
    
    inline def setThemeColorsVarargs(value: SchemaThemeColorPair*): Self = StObject.set(x, "themeColors", js.Array(value*))
  }
}

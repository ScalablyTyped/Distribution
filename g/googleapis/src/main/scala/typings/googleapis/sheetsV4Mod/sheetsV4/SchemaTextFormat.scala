package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The format of a run of text in a cell. Absent values indicate that the
  * field isn&#39;t specified.
  */
trait SchemaTextFormat extends StObject {
  
  /**
    * True if the text is bold.
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The font family.
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the font.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The foreground color of the text.
    */
  var foregroundColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * True if the text is italicized.
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the text has a strikethrough.
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the text is underlined.
    */
  var underline: js.UndefOr[Boolean] = js.undefined
}
object SchemaTextFormat {
  
  inline def apply(): SchemaTextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextFormat]
  }
  
  extension [Self <: SchemaTextFormat](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setForegroundColor(value: SchemaColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}

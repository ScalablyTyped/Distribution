package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextFormat extends StObject {
  
  /**
    * True if the text is bold.
    */
  var bold: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The font family.
    */
  var fontFamily: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the font.
    */
  var fontSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The foreground color of the text. Deprecated: Use foreground_color_style.
    */
  var foregroundColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The foreground color of the text. If foreground_color is also set, this field takes precedence.
    */
  var foregroundColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * True if the text is italicized.
    */
  var italic: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The link destination of the text, if any. Setting the link field in a TextFormatRun will clear the cell's existing links or a cell-level link set in the same request. When a link is set, the text foreground color will be set to the default link color and the text will be underlined. If these fields are modified in the same request, those values will be used instead of the link defaults.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * True if the text has a strikethrough.
    */
  var strikethrough: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True if the text is underlined.
    */
  var underline: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTextFormat {
  
  inline def apply(): SchemaTextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextFormat]
  }
  
  extension [Self <: SchemaTextFormat](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldNull: Self = StObject.set(x, "bold", null)
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setForegroundColor(value: SchemaColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "foregroundColorStyle", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorStyleUndefined: Self = StObject.set(x, "foregroundColorStyle", js.undefined)
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicNull: Self = StObject.set(x, "italic", null)
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughNull: Self = StObject.set(x, "strikethrough", null)
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineNull: Self = StObject.set(x, "underline", null)
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}

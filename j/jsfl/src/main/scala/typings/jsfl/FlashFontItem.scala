package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashFontItem extends StObject {
  
  // Specifies whether the Font item is bitmapped.
  var bitmap: Boolean
  
  // Specifies whether the Font item is bold.
  var bold: Boolean
  
  // Specifies items that can be selected in the Font Embedding dialog.
  var embedRanges: String
  
  // Specifies whether variant glyphs should be output in the font when publishing a SWF file.
  var embedVariantGlyphs: Boolean
  
  // Specifies characters to embed.
  var embeddedCharacters: String
  
  // The name of the device font associated with the Font item.
  var font: String
  
  // Specifies the format of the font that is output when publishing a SWF filem.
  var isDefineFont4Symbol: Boolean
  
  // Specifies whether the Font item is italic.
  var italic: Boolean
  
  // The size of the Font item, in points.
  var size: Double
}
object FlashFontItem {
  
  inline def apply(
    bitmap: Boolean,
    bold: Boolean,
    embedRanges: String,
    embedVariantGlyphs: Boolean,
    embeddedCharacters: String,
    font: String,
    isDefineFont4Symbol: Boolean,
    italic: Boolean,
    size: Double
  ): FlashFontItem = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], embedRanges = embedRanges.asInstanceOf[js.Any], embedVariantGlyphs = embedVariantGlyphs.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], isDefineFont4Symbol = isDefineFont4Symbol.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFontItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashFontItem] (val x: Self) extends AnyVal {
    
    inline def setBitmap(value: Boolean): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setEmbedRanges(value: String): Self = StObject.set(x, "embedRanges", value.asInstanceOf[js.Any])
    
    inline def setEmbedVariantGlyphs(value: Boolean): Self = StObject.set(x, "embedVariantGlyphs", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedCharacters(value: String): Self = StObject.set(x, "embeddedCharacters", value.asInstanceOf[js.Any])
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setIsDefineFont4Symbol(value: Boolean): Self = StObject.set(x, "isDefineFont4Symbol", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

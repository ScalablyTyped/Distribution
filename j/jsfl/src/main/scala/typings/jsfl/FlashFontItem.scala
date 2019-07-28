package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashFontItem extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(bitmap = bitmap, bold = bold, embedRanges = embedRanges, embedVariantGlyphs = embedVariantGlyphs, embeddedCharacters = embeddedCharacters, font = font, isDefineFont4Symbol = isDefineFont4Symbol, italic = italic, size = size)
  
    __obj.asInstanceOf[FlashFontItem]
  }
}


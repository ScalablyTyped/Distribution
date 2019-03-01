package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashFontItem extends js.Object {
  // Specifies whether the Font item is bitmapped.
  var bitmap: scala.Boolean
  // Specifies whether the Font item is bold.
  var bold: scala.Boolean
  // Specifies items that can be selected in the Font Embedding dialog.
  var embedRanges: java.lang.String
  // Specifies whether variant glyphs should be output in the font when publishing a SWF file.
  var embedVariantGlyphs: scala.Boolean
  // Specifies characters to embed.
  var embeddedCharacters: java.lang.String
  // The name of the device font associated with the Font item.
  var font: java.lang.String
  // Specifies the format of the font that is output when publishing a SWF filem.
  var isDefineFont4Symbol: scala.Boolean
  // Specifies whether the Font item is italic.
  var italic: scala.Boolean
  // The size of the Font item, in points.
  var size: scala.Double
}

object FlashFontItem {
  @scala.inline
  def apply(
    bitmap: scala.Boolean,
    bold: scala.Boolean,
    embedRanges: java.lang.String,
    embedVariantGlyphs: scala.Boolean,
    embeddedCharacters: java.lang.String,
    font: java.lang.String,
    isDefineFont4Symbol: scala.Boolean,
    italic: scala.Boolean,
    size: scala.Double
  ): FlashFontItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitmap")(bitmap)
    __obj.updateDynamic("bold")(bold)
    __obj.updateDynamic("embedRanges")(embedRanges)
    __obj.updateDynamic("embedVariantGlyphs")(embedVariantGlyphs)
    __obj.updateDynamic("embeddedCharacters")(embeddedCharacters)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("isDefineFont4Symbol")(isDefineFont4Symbol)
    __obj.updateDynamic("italic")(italic)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[FlashFontItem]
  }
}


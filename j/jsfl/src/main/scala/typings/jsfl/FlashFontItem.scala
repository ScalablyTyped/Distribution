package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashFontItem extends js.Object {
  // Specifies whether the Font item is bitmapped.
  var bitmap: Boolean = js.native
  // Specifies whether the Font item is bold.
  var bold: Boolean = js.native
  // Specifies items that can be selected in the Font Embedding dialog.
  var embedRanges: String = js.native
  // Specifies whether variant glyphs should be output in the font when publishing a SWF file.
  var embedVariantGlyphs: Boolean = js.native
  // Specifies characters to embed.
  var embeddedCharacters: String = js.native
  // The name of the device font associated with the Font item.
  var font: String = js.native
  // Specifies the format of the font that is output when publishing a SWF filem.
  var isDefineFont4Symbol: Boolean = js.native
  // Specifies whether the Font item is italic.
  var italic: Boolean = js.native
  // The size of the Font item, in points.
  var size: Double = js.native
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
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], embedRanges = embedRanges.asInstanceOf[js.Any], embedVariantGlyphs = embedVariantGlyphs.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], isDefineFont4Symbol = isDefineFont4Symbol.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFontItem]
  }
  @scala.inline
  implicit class FlashFontItemOps[Self <: FlashFontItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBitmap(value: Boolean): Self = this.set("bitmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbedRanges(value: String): Self = this.set("embedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbedVariantGlyphs(value: Boolean): Self = this.set("embedVariantGlyphs", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbeddedCharacters(value: String): Self = this.set("embeddedCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDefineFont4Symbol(value: Boolean): Self = this.set("isDefineFont4Symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}


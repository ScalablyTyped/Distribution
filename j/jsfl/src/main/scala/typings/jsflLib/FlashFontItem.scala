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


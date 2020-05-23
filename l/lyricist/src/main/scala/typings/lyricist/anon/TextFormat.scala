package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFormat extends js.Object {
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object TextFormat {
  @scala.inline
  def apply(textFormat: LyricistTextFormat = null): TextFormat = {
    val __obj = js.Dynamic.literal()
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFormat]
  }
}


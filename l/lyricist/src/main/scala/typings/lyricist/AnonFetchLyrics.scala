package typings.lyricist

import typings.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchLyrics extends js.Object {
  var fetchLyrics: js.UndefOr[Boolean] = js.undefined
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object AnonFetchLyrics {
  @scala.inline
  def apply(fetchLyrics: js.UndefOr[Boolean] = js.undefined, textFormat: LyricistTextFormat = null): AnonFetchLyrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchLyrics)) __obj.updateDynamic("fetchLyrics")(fetchLyrics.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchLyrics]
  }
}


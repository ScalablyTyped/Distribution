package typings.lyricist

import typings.lyricist.lyricistMod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchLyrics extends js.Object {
  var fetchLyrics: js.UndefOr[Boolean] = js.undefined
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object Anon_FetchLyrics {
  @scala.inline
  def apply(fetchLyrics: js.UndefOr[Boolean] = js.undefined, textFormat: LyricistTextFormat = null): Anon_FetchLyrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchLyrics)) __obj.updateDynamic("fetchLyrics")(fetchLyrics)
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat)
    __obj.asInstanceOf[Anon_FetchLyrics]
  }
}


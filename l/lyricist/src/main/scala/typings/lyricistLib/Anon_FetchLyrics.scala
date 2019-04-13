package typings
package lyricistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchLyrics extends js.Object {
  var fetchLyrics: js.UndefOr[scala.Boolean] = js.undefined
  var textFormat: js.UndefOr[lyricistLib.lyricistMod.LyricistTextFormat] = js.undefined
}

object Anon_FetchLyrics {
  @scala.inline
  def apply(
    fetchLyrics: js.UndefOr[scala.Boolean] = js.undefined,
    textFormat: lyricistLib.lyricistMod.LyricistTextFormat = null
  ): Anon_FetchLyrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchLyrics)) __obj.updateDynamic("fetchLyrics")(fetchLyrics)
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat)
    __obj.asInstanceOf[Anon_FetchLyrics]
  }
}


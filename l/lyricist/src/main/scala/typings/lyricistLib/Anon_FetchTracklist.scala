package typings
package lyricistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchTracklist extends js.Object {
  var fetchTracklist: js.UndefOr[scala.Boolean] = js.undefined
  var textFormat: js.UndefOr[lyricistLib.lyricistMod.LyricistTextFormat] = js.undefined
}

object Anon_FetchTracklist {
  @scala.inline
  def apply(
    fetchTracklist: js.UndefOr[scala.Boolean] = js.undefined,
    textFormat: lyricistLib.lyricistMod.LyricistTextFormat = null
  ): Anon_FetchTracklist = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchTracklist)) __obj.updateDynamic("fetchTracklist")(fetchTracklist)
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat)
    __obj.asInstanceOf[Anon_FetchTracklist]
  }
}


package typings.lyricist

import typings.lyricist.lyricistMod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchTracklist extends js.Object {
  var fetchTracklist: js.UndefOr[Boolean] = js.undefined
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object Anon_FetchTracklist {
  @scala.inline
  def apply(fetchTracklist: js.UndefOr[Boolean] = js.undefined, textFormat: LyricistTextFormat = null): Anon_FetchTracklist = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchTracklist)) __obj.updateDynamic("fetchTracklist")(fetchTracklist.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FetchTracklist]
  }
}


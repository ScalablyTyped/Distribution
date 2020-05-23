package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchTracklist extends js.Object {
  var fetchTracklist: js.UndefOr[Boolean] = js.undefined
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object FetchTracklist {
  @scala.inline
  def apply(fetchTracklist: js.UndefOr[Boolean] = js.undefined, textFormat: LyricistTextFormat = null): FetchTracklist = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchTracklist)) __obj.updateDynamic("fetchTracklist")(fetchTracklist.get.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchTracklist]
  }
}


package typings.lyricist

import typings.lyricist.mod.LyricistTextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchTracklist extends js.Object {
  var fetchTracklist: js.UndefOr[Boolean] = js.undefined
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}

object AnonFetchTracklist {
  @scala.inline
  def apply(fetchTracklist: js.UndefOr[Boolean] = js.undefined, textFormat: LyricistTextFormat = null): AnonFetchTracklist = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchTracklist)) __obj.updateDynamic("fetchTracklist")(fetchTracklist.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchTracklist]
  }
}


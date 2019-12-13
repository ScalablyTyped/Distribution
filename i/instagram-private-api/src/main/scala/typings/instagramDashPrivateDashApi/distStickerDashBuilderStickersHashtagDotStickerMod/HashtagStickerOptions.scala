package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersHashtagDotStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagStickerOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var tagName: String
  var width: js.UndefOr[Double] = js.undefined
}

object HashtagStickerOptions {
  @scala.inline
  def apply(tagName: String, height: Int | Double = null, width: Int | Double = null): HashtagStickerOptions = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagStickerOptions]
  }
}


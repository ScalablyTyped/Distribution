package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMentionDotStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionStickerOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var userId: String
  var width: js.UndefOr[Double] = js.undefined
}

object MentionStickerOptions {
  @scala.inline
  def apply(userId: String, height: Int | Double = null, width: Int | Double = null): MentionStickerOptions = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionStickerOptions]
  }
}


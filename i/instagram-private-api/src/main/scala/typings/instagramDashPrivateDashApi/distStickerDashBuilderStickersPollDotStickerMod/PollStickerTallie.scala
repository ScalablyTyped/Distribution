package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersPollDotStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollStickerTallie extends js.Object {
  var fontSize: js.UndefOr[Double] = js.undefined
  var text: String
}

object PollStickerTallie {
  @scala.inline
  def apply(text: String, fontSize: Int | Double = null): PollStickerTallie = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollStickerTallie]
  }
}


package typings.instagramPrivateApi.pollStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollStickerTallie extends js.Object {
  var fontSize: js.UndefOr[Double] = js.undefined
  var text: String
}

object PollStickerTallie {
  @scala.inline
  def apply(text: String, fontSize: js.UndefOr[Double] = js.undefined): PollStickerTallie = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollStickerTallie]
  }
}


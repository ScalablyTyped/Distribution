package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersPollDotStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollStickerOptions extends js.Object {
  var question: String
  var tallies: js.Tuple2[PollStickerTallie, PollStickerTallie]
}

object PollStickerOptions {
  @scala.inline
  def apply(question: String, tallies: js.Tuple2[PollStickerTallie, PollStickerTallie]): PollStickerOptions = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PollStickerOptions]
  }
}


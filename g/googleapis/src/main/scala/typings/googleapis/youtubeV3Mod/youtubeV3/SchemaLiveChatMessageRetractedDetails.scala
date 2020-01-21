package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatMessageRetractedDetails extends js.Object {
  var retractedMessageId: js.UndefOr[String] = js.native
}

object SchemaLiveChatMessageRetractedDetails {
  @scala.inline
  def apply(retractedMessageId: String = null): SchemaLiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    if (retractedMessageId != null) __obj.updateDynamic("retractedMessageId")(retractedMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatMessageRetractedDetails]
  }
}


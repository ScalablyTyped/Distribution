package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatMessageDeletedDetails extends js.Object {
  var deletedMessageId: js.UndefOr[String] = js.native
}

object SchemaLiveChatMessageDeletedDetails {
  @scala.inline
  def apply(deletedMessageId: String = null): SchemaLiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    if (deletedMessageId != null) __obj.updateDynamic("deletedMessageId")(deletedMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatMessageDeletedDetails]
  }
}


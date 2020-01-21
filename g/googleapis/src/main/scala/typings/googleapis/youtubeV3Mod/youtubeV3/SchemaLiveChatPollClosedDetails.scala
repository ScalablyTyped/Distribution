package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatPollClosedDetails extends js.Object {
  /**
    * The id of the poll that was closed.
    */
  var pollId: js.UndefOr[String] = js.native
}

object SchemaLiveChatPollClosedDetails {
  @scala.inline
  def apply(pollId: String = null): SchemaLiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    if (pollId != null) __obj.updateDynamic("pollId")(pollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatPollClosedDetails]
  }
}


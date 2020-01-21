package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatPollVotedDetails extends js.Object {
  /**
    * The poll item the user chose.
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * The poll the user voted on.
    */
  var pollId: js.UndefOr[String] = js.native
}

object SchemaLiveChatPollVotedDetails {
  @scala.inline
  def apply(itemId: String = null, pollId: String = null): SchemaLiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (pollId != null) __obj.updateDynamic("pollId")(pollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatPollVotedDetails]
  }
}


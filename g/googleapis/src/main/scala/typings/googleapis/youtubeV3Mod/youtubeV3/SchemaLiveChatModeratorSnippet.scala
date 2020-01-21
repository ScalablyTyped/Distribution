package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatModeratorSnippet extends js.Object {
  /**
    * The ID of the live chat this moderator can act on.
    */
  var liveChatId: js.UndefOr[String] = js.native
  /**
    * Details about the moderator.
    */
  var moderatorDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
}

object SchemaLiveChatModeratorSnippet {
  @scala.inline
  def apply(liveChatId: String = null, moderatorDetails: SchemaChannelProfileDetails = null): SchemaLiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId.asInstanceOf[js.Any])
    if (moderatorDetails != null) __obj.updateDynamic("moderatorDetails")(moderatorDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatModeratorSnippet]
  }
}


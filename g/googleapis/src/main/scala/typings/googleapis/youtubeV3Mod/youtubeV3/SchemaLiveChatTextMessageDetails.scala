package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatTextMessageDetails extends js.Object {
  /**
    * The user&#39;s message.
    */
  var messageText: js.UndefOr[String] = js.native
}

object SchemaLiveChatTextMessageDetails {
  @scala.inline
  def apply(messageText: String = null): SchemaLiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    if (messageText != null) __obj.updateDynamic("messageText")(messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatTextMessageDetails]
  }
}


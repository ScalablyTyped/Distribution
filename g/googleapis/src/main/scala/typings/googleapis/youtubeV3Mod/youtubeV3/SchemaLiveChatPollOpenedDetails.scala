package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatPollOpenedDetails extends js.Object {
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[SchemaLiveChatPollItem]] = js.native
  var prompt: js.UndefOr[String] = js.native
}

object SchemaLiveChatPollOpenedDetails {
  @scala.inline
  def apply(id: String = null, items: js.Array[SchemaLiveChatPollItem] = null, prompt: String = null): SchemaLiveChatPollOpenedDetails = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatPollOpenedDetails]
  }
}


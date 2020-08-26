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
  def apply(): SchemaLiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatTextMessageDetails]
  }
  @scala.inline
  implicit class SchemaLiveChatTextMessageDetailsOps[Self <: SchemaLiveChatTextMessageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessageText(value: String): Self = this.set("messageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageText: Self = this.set("messageText", js.undefined)
  }
  
}


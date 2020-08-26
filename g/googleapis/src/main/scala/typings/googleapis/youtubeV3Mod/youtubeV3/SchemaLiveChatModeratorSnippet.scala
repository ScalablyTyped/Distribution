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
  def apply(): SchemaLiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatModeratorSnippet]
  }
  @scala.inline
  implicit class SchemaLiveChatModeratorSnippetOps[Self <: SchemaLiveChatModeratorSnippet] (val x: Self) extends AnyVal {
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
    def setLiveChatId(value: String): Self = this.set("liveChatId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveChatId: Self = this.set("liveChatId", js.undefined)
    @scala.inline
    def setModeratorDetails(value: SchemaChannelProfileDetails): Self = this.set("moderatorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModeratorDetails: Self = this.set("moderatorDetails", js.undefined)
  }
  
}


package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatPollEditedDetails extends js.Object {
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[SchemaLiveChatPollItem]] = js.native
  var prompt: js.UndefOr[String] = js.native
}

object SchemaLiveChatPollEditedDetails {
  @scala.inline
  def apply(): SchemaLiveChatPollEditedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollEditedDetails]
  }
  @scala.inline
  implicit class SchemaLiveChatPollEditedDetailsOps[Self <: SchemaLiveChatPollEditedDetails] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaLiveChatPollItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaLiveChatPollItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
  }
  
}


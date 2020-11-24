package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaLiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollVotedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatPollVotedDetailsOps[Self <: SchemaLiveChatPollVotedDetails] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setPollId(value: String): Self = this.set("pollId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollId: Self = this.set("pollId", js.undefined)
  }
}

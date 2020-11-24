package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatMessageDeletedDetails extends js.Object {
  
  var deletedMessageId: js.UndefOr[String] = js.native
}
object SchemaLiveChatMessageDeletedDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageDeletedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatMessageDeletedDetailsOps[Self <: SchemaLiveChatMessageDeletedDetails] (val x: Self) extends AnyVal {
    
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
    def setDeletedMessageId(value: String): Self = this.set("deletedMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedMessageId: Self = this.set("deletedMessageId", js.undefined)
  }
}

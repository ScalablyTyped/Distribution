package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatMessageRetractedDetails extends js.Object {
  
  var retractedMessageId: js.UndefOr[String] = js.native
}
object SchemaLiveChatMessageRetractedDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageRetractedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatMessageRetractedDetailsOps[Self <: SchemaLiveChatMessageRetractedDetails] (val x: Self) extends AnyVal {
    
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
    def setRetractedMessageId(value: String): Self = this.set("retractedMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetractedMessageId: Self = this.set("retractedMessageId", js.undefined)
  }
}

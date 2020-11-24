package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReviewReplyResult extends js.Object {
  
  /**
    * The time at which the reply took effect.
    */
  var lastEdited: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * The reply text that was applied.
    */
  var replyText: js.UndefOr[String] = js.native
}
object SchemaReviewReplyResult {
  
  @scala.inline
  def apply(): SchemaReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewReplyResult]
  }
  
  @scala.inline
  implicit class SchemaReviewReplyResultOps[Self <: SchemaReviewReplyResult] (val x: Self) extends AnyVal {
    
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
    def setLastEdited(value: SchemaTimestamp): Self = this.set("lastEdited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEdited: Self = this.set("lastEdited", js.undefined)
    
    @scala.inline
    def setReplyText(value: String): Self = this.set("replyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyText: Self = this.set("replyText", js.undefined)
  }
}

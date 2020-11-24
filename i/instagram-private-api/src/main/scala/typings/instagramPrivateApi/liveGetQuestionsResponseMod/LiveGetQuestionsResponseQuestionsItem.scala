package typings.instagramPrivateApi.liveGetQuestionsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveGetQuestionsResponseQuestionsItem extends js.Object {
  
  var qid: String = js.native
  
  var source: String = js.native
  
  var story_sticker_text: String = js.native
  
  var text: String = js.native
  
  var timestamp: Double = js.native
  
  var user: LiveGetQuestionsResponseUser = js.native
}
object LiveGetQuestionsResponseQuestionsItem {
  
  @scala.inline
  def apply(
    qid: String,
    source: String,
    story_sticker_text: String,
    text: String,
    timestamp: Double,
    user: LiveGetQuestionsResponseUser
  ): LiveGetQuestionsResponseQuestionsItem = {
    val __obj = js.Dynamic.literal(qid = qid.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], story_sticker_text = story_sticker_text.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveGetQuestionsResponseQuestionsItem]
  }
  
  @scala.inline
  implicit class LiveGetQuestionsResponseQuestionsItemOps[Self <: LiveGetQuestionsResponseQuestionsItem] (val x: Self) extends AnyVal {
    
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
    def setQid(value: String): Self = this.set("qid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_sticker_text(value: String): Self = this.set("story_sticker_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: LiveGetQuestionsResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}

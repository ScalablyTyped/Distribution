package typings.instagramPrivateApi.storyQuestionResponsesFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuestionResponsesFeedResponseRootObject extends js.Object {
  
  var responder_info: StoryQuestionResponsesFeedResponseResponderInfo = js.native
  
  var status: String = js.native
}
object StoryQuestionResponsesFeedResponseRootObject {
  
  @scala.inline
  def apply(responder_info: StoryQuestionResponsesFeedResponseResponderInfo, status: String): StoryQuestionResponsesFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(responder_info = responder_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class StoryQuestionResponsesFeedResponseRootObjectOps[Self <: StoryQuestionResponsesFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setResponder_info(value: StoryQuestionResponsesFeedResponseResponderInfo): Self = this.set("responder_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}

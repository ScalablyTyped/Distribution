package typings.instagramPrivateApi.storyQuestionResponsesFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuestionResponsesFeedResponseRespondersItem extends js.Object {
  
  var has_shared_response: Boolean = js.native
  
  var id: String = js.native
  
  var response: String = js.native
  
  var ts: Double = js.native
  
  var user: StoryQuestionResponsesFeedResponseUser = js.native
}
object StoryQuestionResponsesFeedResponseRespondersItem {
  
  @scala.inline
  def apply(
    has_shared_response: Boolean,
    id: String,
    response: String,
    ts: Double,
    user: StoryQuestionResponsesFeedResponseUser
  ): StoryQuestionResponsesFeedResponseRespondersItem = {
    val __obj = js.Dynamic.literal(has_shared_response = has_shared_response.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseRespondersItem]
  }
  
  @scala.inline
  implicit class StoryQuestionResponsesFeedResponseRespondersItemOps[Self <: StoryQuestionResponsesFeedResponseRespondersItem] (val x: Self) extends AnyVal {
    
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
    def setHas_shared_response(value: Boolean): Self = this.set("has_shared_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: StoryQuestionResponsesFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}

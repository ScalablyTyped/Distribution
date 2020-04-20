package typings.instagramPrivateApi.storyQuestionResponsesFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuestionResponsesFeedResponseRootObject extends js.Object {
  var responder_info: StoryQuestionResponsesFeedResponseResponderInfo
  var status: String
}

object StoryQuestionResponsesFeedResponseRootObject {
  @scala.inline
  def apply(responder_info: StoryQuestionResponsesFeedResponseResponderInfo, status: String): StoryQuestionResponsesFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(responder_info = responder_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseRootObject]
  }
}


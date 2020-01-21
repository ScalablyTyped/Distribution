package typings.instagramPrivateApi.liveGetQuestionsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveGetQuestionsResponseQuestionsItem extends js.Object {
  var qid: String
  var source: String
  var story_sticker_text: String
  var text: String
  var timestamp: Double
  var user: LiveGetQuestionsResponseUser
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
}


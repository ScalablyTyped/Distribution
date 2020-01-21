package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPollTallie extends js.Object {
  var count: `0`
  var font_size: Double
  var text: String
}

object StoryPollTallie {
  @scala.inline
  def apply(count: `0`, font_size: Double, text: String): StoryPollTallie = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryPollTallie]
  }
}


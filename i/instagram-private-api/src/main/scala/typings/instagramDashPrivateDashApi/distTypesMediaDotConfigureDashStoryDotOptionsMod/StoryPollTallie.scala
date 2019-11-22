package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`0`
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
    val __obj = js.Dynamic.literal(count = count, font_size = font_size, text = text)
  
    __obj.asInstanceOf[StoryPollTallie]
  }
}


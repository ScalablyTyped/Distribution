package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`0`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPoll extends StorySticker {
  var is_sticker: `true`
  var question: String
  var tallies: js.Tuple2[StoryPollTallie, StoryPollTallie]
  var viewer_can_vote: `true`
  var viewer_vote: `0`
}

object StoryPoll {
  @scala.inline
  def apply(
    height: Double,
    is_sticker: `true`,
    question: String,
    rotation: Double,
    tallies: js.Tuple2[StoryPollTallie, StoryPollTallie],
    viewer_can_vote: `true`,
    viewer_vote: `0`,
    width: Double,
    x: Double,
    y: Double
  ): StoryPoll = {
    val __obj = js.Dynamic.literal(height = height, is_sticker = is_sticker, question = question, rotation = rotation, tallies = tallies, viewer_can_vote = viewer_can_vote, viewer_vote = viewer_vote, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryPoll]
  }
}


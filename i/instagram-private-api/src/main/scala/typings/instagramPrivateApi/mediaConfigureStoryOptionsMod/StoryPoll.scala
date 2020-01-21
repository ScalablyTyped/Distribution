package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any], viewer_vote = viewer_vote.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryPoll]
  }
}


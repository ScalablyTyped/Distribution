package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryPoll
  extends StObject
     with StorySticker {
  
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
    question: String,
    rotation: Double,
    tallies: js.Tuple2[StoryPollTallie, StoryPollTallie],
    width: Double,
    x: Double,
    y: Double
  ): StoryPoll = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = true, question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = true, viewer_vote = 0, width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryPoll]
  }
  
  @scala.inline
  implicit class StoryPollMutableBuilder[Self <: StoryPoll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs_sticker(value: `true`): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTallies(value: js.Tuple2[StoryPollTallie, StoryPollTallie]): Self = StObject.set(x, "tallies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_vote(value: `true`): Self = StObject.set(x, "viewer_can_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_vote(value: `0`): Self = StObject.set(x, "viewer_vote", value.asInstanceOf[js.Any])
  }
}

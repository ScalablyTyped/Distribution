package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseSliderSticker extends StObject {
  
  var background_color: String = js.native
  
  var emoji: String = js.native
  
  var question: String = js.native
  
  var slider_id: Double = js.native
  
  var slider_vote_average: Null = js.native
  
  var slider_vote_count: Double = js.native
  
  var text_color: String = js.native
  
  var viewer_can_vote: Boolean = js.native
  
  var viewer_vote: js.UndefOr[Double] = js.native
}
object ReelsMediaFeedResponseSliderSticker {
  
  @scala.inline
  def apply(
    background_color: String,
    emoji: String,
    question: String,
    slider_id: Double,
    slider_vote_average: Null,
    slider_vote_count: Double,
    text_color: String,
    viewer_can_vote: Boolean
  ): ReelsMediaFeedResponseSliderSticker = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], slider_id = slider_id.asInstanceOf[js.Any], slider_vote_average = slider_vote_average.asInstanceOf[js.Any], slider_vote_count = slider_vote_count.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseSliderSticker]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseSliderStickerMutableBuilder[Self <: ReelsMediaFeedResponseSliderSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider_id(value: Double): Self = StObject.set(x, "slider_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider_vote_average(value: Null): Self = StObject.set(x, "slider_vote_average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider_vote_count(value: Double): Self = StObject.set(x, "slider_vote_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_vote(value: Boolean): Self = StObject.set(x, "viewer_can_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_vote(value: Double): Self = StObject.set(x, "viewer_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_voteUndefined: Self = StObject.set(x, "viewer_vote", js.undefined)
  }
}

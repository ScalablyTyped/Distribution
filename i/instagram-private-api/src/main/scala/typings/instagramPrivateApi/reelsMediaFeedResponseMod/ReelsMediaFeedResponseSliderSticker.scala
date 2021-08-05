package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseSliderSticker extends StObject {
  
  var background_color: String
  
  var emoji: String
  
  var question: String
  
  var slider_id: Double
  
  var slider_vote_average: Null
  
  var slider_vote_count: Double
  
  var text_color: String
  
  var viewer_can_vote: Boolean
  
  var viewer_vote: js.UndefOr[Double] = js.undefined
}
object ReelsMediaFeedResponseSliderSticker {
  
  inline def apply(
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
  
  extension [Self <: ReelsMediaFeedResponseSliderSticker](x: Self) {
    
    inline def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setSlider_id(value: Double): Self = StObject.set(x, "slider_id", value.asInstanceOf[js.Any])
    
    inline def setSlider_vote_average(value: Null): Self = StObject.set(x, "slider_vote_average", value.asInstanceOf[js.Any])
    
    inline def setSlider_vote_count(value: Double): Self = StObject.set(x, "slider_vote_count", value.asInstanceOf[js.Any])
    
    inline def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    inline def setViewer_can_vote(value: Boolean): Self = StObject.set(x, "viewer_can_vote", value.asInstanceOf[js.Any])
    
    inline def setViewer_vote(value: Double): Self = StObject.set(x, "viewer_vote", value.asInstanceOf[js.Any])
    
    inline def setViewer_voteUndefined: Self = StObject.set(x, "viewer_vote", js.undefined)
  }
}

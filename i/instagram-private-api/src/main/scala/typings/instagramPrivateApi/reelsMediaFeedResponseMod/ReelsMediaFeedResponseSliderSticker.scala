package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseSliderSticker extends js.Object {
  
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
  implicit class ReelsMediaFeedResponseSliderStickerOps[Self <: ReelsMediaFeedResponseSliderSticker] (val x: Self) extends AnyVal {
    
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
    def setBackground_color(value: String): Self = this.set("background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmoji(value: String): Self = this.set("emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider_id(value: Double): Self = this.set("slider_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider_vote_average(value: Null): Self = this.set("slider_vote_average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider_vote_count(value: Double): Self = this.set("slider_vote_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = this.set("text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_vote(value: Boolean): Self = this.set("viewer_can_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_vote(value: Double): Self = this.set("viewer_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewer_vote: Self = this.set("viewer_vote", js.undefined)
  }
}

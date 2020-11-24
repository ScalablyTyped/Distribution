package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseQuizSticker extends js.Object {
  
  var correct_answer: Double = js.native
  
  var end_background_color: String = js.native
  
  var finished: Boolean = js.native
  
  var id: String = js.native
  
  var question: String = js.native
  
  var quiz_id: Double = js.native
  
  var start_background_color: String = js.native
  
  var tallies: js.Array[ReelsMediaFeedResponseTalliesItem] = js.native
  
  var text_color: String = js.native
  
  var viewer_answer: js.UndefOr[Double] = js.native
  
  var viewer_can_answer: Boolean = js.native
}
object ReelsMediaFeedResponseQuizSticker {
  
  @scala.inline
  def apply(
    correct_answer: Double,
    end_background_color: String,
    finished: Boolean,
    id: String,
    question: String,
    quiz_id: Double,
    start_background_color: String,
    tallies: js.Array[ReelsMediaFeedResponseTalliesItem],
    text_color: String,
    viewer_can_answer: Boolean
  ): ReelsMediaFeedResponseQuizSticker = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_answer = viewer_can_answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseQuizSticker]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseQuizStickerOps[Self <: ReelsMediaFeedResponseQuizSticker] (val x: Self) extends AnyVal {
    
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
    def setCorrect_answer(value: Double): Self = this.set("correct_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_background_color(value: String): Self = this.set("end_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: Boolean): Self = this.set("finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiz_id(value: Double): Self = this.set("quiz_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_background_color(value: String): Self = this.set("start_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTalliesVarargs(value: ReelsMediaFeedResponseTalliesItem*): Self = this.set("tallies", js.Array(value :_*))
    
    @scala.inline
    def setTallies(value: js.Array[ReelsMediaFeedResponseTalliesItem]): Self = this.set("tallies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = this.set("text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_answer(value: Boolean): Self = this.set("viewer_can_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_answer(value: Double): Self = this.set("viewer_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewer_answer: Self = this.set("viewer_answer", js.undefined)
  }
}

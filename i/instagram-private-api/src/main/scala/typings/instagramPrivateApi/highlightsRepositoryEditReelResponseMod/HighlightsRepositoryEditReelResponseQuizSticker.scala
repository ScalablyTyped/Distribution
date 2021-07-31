package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseQuizSticker extends StObject {
  
  var correct_answer: Double
  
  var end_background_color: String
  
  var finished: Boolean
  
  var id: String
  
  var question: String
  
  var quiz_id: String
  
  var start_background_color: String
  
  var tallies: js.Array[HighlightsRepositoryEditReelResponseTalliesItem]
  
  var text_color: String
  
  var viewer_can_answer: Boolean
}
object HighlightsRepositoryEditReelResponseQuizSticker {
  
  @scala.inline
  def apply(
    correct_answer: Double,
    end_background_color: String,
    finished: Boolean,
    id: String,
    question: String,
    quiz_id: String,
    start_background_color: String,
    tallies: js.Array[HighlightsRepositoryEditReelResponseTalliesItem],
    text_color: String,
    viewer_can_answer: Boolean
  ): HighlightsRepositoryEditReelResponseQuizSticker = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_answer = viewer_can_answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseQuizSticker]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseQuizStickerMutableBuilder[Self <: HighlightsRepositoryEditReelResponseQuizSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrect_answer(value: Double): Self = StObject.set(x, "correct_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_background_color(value: String): Self = StObject.set(x, "end_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiz_id(value: String): Self = StObject.set(x, "quiz_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_background_color(value: String): Self = StObject.set(x, "start_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTallies(value: js.Array[HighlightsRepositoryEditReelResponseTalliesItem]): Self = StObject.set(x, "tallies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTalliesVarargs(value: HighlightsRepositoryEditReelResponseTalliesItem*): Self = StObject.set(x, "tallies", js.Array(value :_*))
    
    @scala.inline
    def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_answer(value: Boolean): Self = StObject.set(x, "viewer_can_answer", value.asInstanceOf[js.Any])
  }
}

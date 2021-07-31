package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryQuiz
  extends StObject
     with StorySticker {
  
  var correct_answer: String
  
  var end_background_color: String
  
  var options: js.Array[Count]
  
  var question: String
  
  var start_background_color: String
  
  var text_color: String
  
  var viewer_answer: Double
  
  var viewer_can_answer: Boolean
}
object StoryQuiz {
  
  @scala.inline
  def apply(
    correct_answer: String,
    end_background_color: String,
    height: Double,
    options: js.Array[Count],
    question: String,
    rotation: Double,
    start_background_color: String,
    text_color: String,
    viewer_answer: Double,
    viewer_can_answer: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuiz = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_answer = viewer_answer.asInstanceOf[js.Any], viewer_can_answer = viewer_can_answer.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuiz]
  }
  
  @scala.inline
  implicit class StoryQuizMutableBuilder[Self <: StoryQuiz] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrect_answer(value: String): Self = StObject.set(x, "correct_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_background_color(value: String): Self = StObject.set(x, "end_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Array[Count]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: Count*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_background_color(value: String): Self = StObject.set(x, "start_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_answer(value: Double): Self = StObject.set(x, "viewer_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_answer(value: Boolean): Self = StObject.set(x, "viewer_can_answer", value.asInstanceOf[js.Any])
  }
}

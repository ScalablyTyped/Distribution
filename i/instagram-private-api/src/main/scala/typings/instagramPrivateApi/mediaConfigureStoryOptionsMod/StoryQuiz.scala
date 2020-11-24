package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryQuiz extends StorySticker {
  
  var correct_answer: String = js.native
  
  var end_background_color: String = js.native
  
  var options: js.Array[Count] = js.native
  
  var question: String = js.native
  
  var start_background_color: String = js.native
  
  var text_color: String = js.native
  
  var viewer_answer: Double = js.native
  
  var viewer_can_answer: Boolean = js.native
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
  implicit class StoryQuizOps[Self <: StoryQuiz] (val x: Self) extends AnyVal {
    
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
    def setCorrect_answer(value: String): Self = this.set("correct_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_background_color(value: String): Self = this.set("end_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: Count*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Count]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_background_color(value: String): Self = this.set("start_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = this.set("text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_answer(value: Double): Self = this.set("viewer_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_answer(value: Boolean): Self = this.set("viewer_can_answer", value.asInstanceOf[js.Any])
  }
}

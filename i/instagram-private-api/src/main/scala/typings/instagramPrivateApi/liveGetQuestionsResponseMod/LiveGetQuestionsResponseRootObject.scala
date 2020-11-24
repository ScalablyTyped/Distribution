package typings.instagramPrivateApi.liveGetQuestionsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveGetQuestionsResponseRootObject extends js.Object {
  
  var questions: js.Array[LiveGetQuestionsResponseQuestionsItem] = js.native
  
  var status: String = js.native
}
object LiveGetQuestionsResponseRootObject {
  
  @scala.inline
  def apply(questions: js.Array[LiveGetQuestionsResponseQuestionsItem], status: String): LiveGetQuestionsResponseRootObject = {
    val __obj = js.Dynamic.literal(questions = questions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveGetQuestionsResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveGetQuestionsResponseRootObjectOps[Self <: LiveGetQuestionsResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setQuestionsVarargs(value: LiveGetQuestionsResponseQuestionsItem*): Self = this.set("questions", js.Array(value :_*))
    
    @scala.inline
    def setQuestions(value: js.Array[LiveGetQuestionsResponseQuestionsItem]): Self = this.set("questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}

package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1KnowledgeAnswers extends js.Object {
  
  /** A list of answers from Knowledge Connector. */
  var answers: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]] = js.native
}
object GoogleCloudDialogflowV2beta1KnowledgeAnswers {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1KnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1KnowledgeAnswers]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1KnowledgeAnswersOps[Self <: GoogleCloudDialogflowV2beta1KnowledgeAnswers] (val x: Self) extends AnyVal {
    
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
    def setAnswersVarargs(value: GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer*): Self = this.set("answers", js.Array(value :_*))
    
    @scala.inline
    def setAnswers(value: js.Array[GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]): Self = this.set("answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswers: Self = this.set("answers", js.undefined)
  }
}

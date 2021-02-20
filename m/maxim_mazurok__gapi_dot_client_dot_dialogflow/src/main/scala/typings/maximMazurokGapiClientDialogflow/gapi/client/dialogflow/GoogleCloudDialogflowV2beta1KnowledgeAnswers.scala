package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1KnowledgeAnswers extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2beta1KnowledgeAnswersMutableBuilder[Self <: GoogleCloudDialogflowV2beta1KnowledgeAnswers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswers(value: js.Array[GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    @scala.inline
    def setAnswersVarargs(value: GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer*): Self = StObject.set(x, "answers", js.Array(value :_*))
  }
}

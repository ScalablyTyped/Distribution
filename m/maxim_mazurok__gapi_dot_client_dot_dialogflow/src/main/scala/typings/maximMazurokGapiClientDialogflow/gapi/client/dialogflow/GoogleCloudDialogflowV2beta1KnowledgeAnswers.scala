package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1KnowledgeAnswers extends StObject {
  
  /** A list of answers from Knowledge Connector. */
  var answers: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]] = js.undefined
}
object GoogleCloudDialogflowV2beta1KnowledgeAnswers {
  
  inline def apply(): GoogleCloudDialogflowV2beta1KnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1KnowledgeAnswers]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1KnowledgeAnswers](x: Self) {
    
    inline def setAnswers(value: js.Array[GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer*): Self = StObject.set(x, "answers", js.Array(value :_*))
  }
}

package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of querying a Knowledge base.
  */
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers extends StObject {
  
  /**
    * A list of answers from Knowledge Connector.
    */
  var answers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswers(value: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    @scala.inline
    def setAnswersVarargs(value: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer*): Self = StObject.set(x, "answers", js.Array(value :_*))
  }
}

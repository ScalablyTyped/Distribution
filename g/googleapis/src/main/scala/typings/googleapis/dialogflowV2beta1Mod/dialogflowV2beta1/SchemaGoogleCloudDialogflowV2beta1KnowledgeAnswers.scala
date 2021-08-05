package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

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
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswers](x: Self) {
    
    inline def setAnswers(value: js.Array[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer*): Self = StObject.set(x, "answers", js.Array(value :_*))
  }
}

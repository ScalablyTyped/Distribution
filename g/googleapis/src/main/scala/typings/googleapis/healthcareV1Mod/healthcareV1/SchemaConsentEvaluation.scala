package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsentEvaluation extends StObject {
  
  /**
    * The evaluation result.
    */
  var evaluationResult: js.UndefOr[String | Null] = js.undefined
}
object SchemaConsentEvaluation {
  
  inline def apply(): SchemaConsentEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsentEvaluation]
  }
  
  extension [Self <: SchemaConsentEvaluation](x: Self) {
    
    inline def setEvaluationResult(value: String): Self = StObject.set(x, "evaluationResult", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultNull: Self = StObject.set(x, "evaluationResult", null)
    
    inline def setEvaluationResultUndefined: Self = StObject.set(x, "evaluationResult", js.undefined)
  }
}

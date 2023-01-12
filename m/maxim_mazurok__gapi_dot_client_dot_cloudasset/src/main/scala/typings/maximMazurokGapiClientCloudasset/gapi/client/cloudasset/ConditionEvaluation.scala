package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionEvaluation extends StObject {
  
  /** The evaluation result. */
  var evaluationValue: js.UndefOr[String] = js.undefined
}
object ConditionEvaluation {
  
  inline def apply(): ConditionEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionEvaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionEvaluation] (val x: Self) extends AnyVal {
    
    inline def setEvaluationValue(value: String): Self = StObject.set(x, "evaluationValue", value.asInstanceOf[js.Any])
    
    inline def setEvaluationValueUndefined: Self = StObject.set(x, "evaluationValue", js.undefined)
  }
}

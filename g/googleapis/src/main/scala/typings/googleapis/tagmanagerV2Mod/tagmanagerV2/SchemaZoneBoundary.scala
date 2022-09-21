package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaZoneBoundary extends StObject {
  
  /**
    * The conditions that, when conjoined, make up the boundary.
    */
  var condition: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * Custom evaluation trigger IDs. A zone will evaluate its boundary conditions when any of the listed triggers are true.
    */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaZoneBoundary {
  
  inline def apply(): SchemaZoneBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneBoundary]
  }
  
  extension [Self <: SchemaZoneBoundary](x: Self) {
    
    inline def setCondition(value: js.Array[SchemaCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: SchemaCondition*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setCustomEvaluationTriggerId(value: js.Array[String]): Self = StObject.set(x, "customEvaluationTriggerId", value.asInstanceOf[js.Any])
    
    inline def setCustomEvaluationTriggerIdNull: Self = StObject.set(x, "customEvaluationTriggerId", null)
    
    inline def setCustomEvaluationTriggerIdUndefined: Self = StObject.set(x, "customEvaluationTriggerId", js.undefined)
    
    inline def setCustomEvaluationTriggerIdVarargs(value: String*): Self = StObject.set(x, "customEvaluationTriggerId", js.Array(value*))
  }
}

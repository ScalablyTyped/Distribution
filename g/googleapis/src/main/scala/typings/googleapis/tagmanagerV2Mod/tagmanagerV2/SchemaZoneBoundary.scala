package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Zone&#39;s boundaries.
  */
trait SchemaZoneBoundary extends StObject {
  
  /**
    * The conditions that, when conjoined, make up the boundary.
    */
  var condition: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * Custom evaluation trigger IDs. A zone will evaluate its boundary
    * conditions when any of the listed triggers are true.
    */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaZoneBoundary {
  
  @scala.inline
  def apply(): SchemaZoneBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneBoundary]
  }
  
  @scala.inline
  implicit class SchemaZoneBoundaryMutableBuilder[Self <: SchemaZoneBoundary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: js.Array[SchemaCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setConditionVarargs(value: SchemaCondition*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    @scala.inline
    def setCustomEvaluationTriggerId(value: js.Array[String]): Self = StObject.set(x, "customEvaluationTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEvaluationTriggerIdUndefined: Self = StObject.set(x, "customEvaluationTriggerId", js.undefined)
    
    @scala.inline
    def setCustomEvaluationTriggerIdVarargs(value: String*): Self = StObject.set(x, "customEvaluationTriggerId", js.Array(value :_*))
  }
}

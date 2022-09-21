package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryPlan extends StObject {
  
  /**
    * The nodes in the query plan. Plan nodes are returned in pre-order starting with the plan root. Each PlanNode's `id` corresponds to its index in `plan_nodes`.
    */
  var planNodes: js.UndefOr[js.Array[SchemaPlanNode]] = js.undefined
}
object SchemaQueryPlan {
  
  inline def apply(): SchemaQueryPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryPlan]
  }
  
  extension [Self <: SchemaQueryPlan](x: Self) {
    
    inline def setPlanNodes(value: js.Array[SchemaPlanNode]): Self = StObject.set(x, "planNodes", value.asInstanceOf[js.Any])
    
    inline def setPlanNodesUndefined: Self = StObject.set(x, "planNodes", js.undefined)
    
    inline def setPlanNodesVarargs(value: SchemaPlanNode*): Self = StObject.set(x, "planNodes", js.Array(value*))
  }
}

package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains an ordered list of nodes appearing in the query plan.
  */
trait SchemaQueryPlan extends StObject {
  
  /**
    * The nodes in the query plan. Plan nodes are returned in pre-order
    * starting with the plan root. Each PlanNode&#39;s `id` corresponds to its
    * index in `plan_nodes`.
    */
  var planNodes: js.UndefOr[js.Array[SchemaPlanNode]] = js.undefined
}
object SchemaQueryPlan {
  
  @scala.inline
  def apply(): SchemaQueryPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryPlan]
  }
  
  @scala.inline
  implicit class SchemaQueryPlanMutableBuilder[Self <: SchemaQueryPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlanNodes(value: js.Array[SchemaPlanNode]): Self = StObject.set(x, "planNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNodesUndefined: Self = StObject.set(x, "planNodes", js.undefined)
    
    @scala.inline
    def setPlanNodesVarargs(value: SchemaPlanNode*): Self = StObject.set(x, "planNodes", js.Array(value :_*))
  }
}

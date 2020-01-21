package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains an ordered list of nodes appearing in the query plan.
  */
@js.native
trait SchemaQueryPlan extends js.Object {
  /**
    * The nodes in the query plan. Plan nodes are returned in pre-order
    * starting with the plan root. Each PlanNode&#39;s `id` corresponds to its
    * index in `plan_nodes`.
    */
  var planNodes: js.UndefOr[js.Array[SchemaPlanNode]] = js.native
}

object SchemaQueryPlan {
  @scala.inline
  def apply(planNodes: js.Array[SchemaPlanNode] = null): SchemaQueryPlan = {
    val __obj = js.Dynamic.literal()
    if (planNodes != null) __obj.updateDynamic("planNodes")(planNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryPlan]
  }
}


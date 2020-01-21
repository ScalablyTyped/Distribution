package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The workflow graph.
  */
@js.native
trait SchemaWorkflowGraph extends js.Object {
  /**
    * Output only. The workflow nodes.
    */
  var nodes: js.UndefOr[js.Array[SchemaWorkflowNode]] = js.native
}

object SchemaWorkflowGraph {
  @scala.inline
  def apply(nodes: js.Array[SchemaWorkflowNode] = null): SchemaWorkflowGraph = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkflowGraph]
  }
}


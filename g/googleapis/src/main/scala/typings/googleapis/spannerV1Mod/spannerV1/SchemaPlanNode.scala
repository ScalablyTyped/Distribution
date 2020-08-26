package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node information for nodes appearing in a QueryPlan.plan_nodes.
  */
@js.native
trait SchemaPlanNode extends js.Object {
  /**
    * List of child node `index`es and their relationship to this parent.
    */
  var childLinks: js.UndefOr[js.Array[SchemaChildLink]] = js.native
  /**
    * The display name for the node.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The execution statistics associated with the node, contained in a group
    * of key-value pairs. Only present if the plan was returned as a result of
    * a profile query. For example, number of executions, number of rows/time
    * per execution etc.
    */
  var executionStats: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The `PlanNode`&#39;s index in node list.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Used to determine the type of node. May be needed for visualizing
    * different kinds of nodes differently. For example, If the node is a
    * SCALAR node, it will have a condensed representation which can be used to
    * directly embed a description of the node in its parent.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Attributes relevant to the node contained in a group of key-value pairs.
    * For example, a Parameter Reference node could have the following
    * information in its metadata:      { &quot;parameter_reference&quot;:
    * &quot;param1&quot;,       &quot;parameter_type&quot;: &quot;array&quot; }
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Condensed representation for SCALAR nodes.
    */
  var shortRepresentation: js.UndefOr[SchemaShortRepresentation] = js.native
}

object SchemaPlanNode {
  @scala.inline
  def apply(): SchemaPlanNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlanNode]
  }
  @scala.inline
  implicit class SchemaPlanNodeOps[Self <: SchemaPlanNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildLinksVarargs(value: SchemaChildLink*): Self = this.set("childLinks", js.Array(value :_*))
    @scala.inline
    def setChildLinks(value: js.Array[SchemaChildLink]): Self = this.set("childLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildLinks: Self = this.set("childLinks", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setExecutionStats(value: StringDictionary[js.Any]): Self = this.set("executionStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStats: Self = this.set("executionStats", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setShortRepresentation(value: SchemaShortRepresentation): Self = this.set("shortRepresentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortRepresentation: Self = this.set("shortRepresentation", js.undefined)
  }
  
}


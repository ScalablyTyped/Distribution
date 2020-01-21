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
  def apply(
    childLinks: js.Array[SchemaChildLink] = null,
    displayName: String = null,
    executionStats: StringDictionary[js.Any] = null,
    index: Int | Double = null,
    kind: String = null,
    metadata: StringDictionary[js.Any] = null,
    shortRepresentation: SchemaShortRepresentation = null
  ): SchemaPlanNode = {
    val __obj = js.Dynamic.literal()
    if (childLinks != null) __obj.updateDynamic("childLinks")(childLinks.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (executionStats != null) __obj.updateDynamic("executionStats")(executionStats.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (shortRepresentation != null) __obj.updateDynamic("shortRepresentation")(shortRepresentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlanNode]
  }
}


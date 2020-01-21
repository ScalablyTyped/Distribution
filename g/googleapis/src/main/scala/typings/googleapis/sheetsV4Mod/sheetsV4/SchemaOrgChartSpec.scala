package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An &lt;a href=&quot;/chart/interactive/docs/gallery/orgchart&quot;&gt;org
  * chart&lt;/a&gt;. Org charts require a unique set of labels in labels and
  * may optionally include parent_labels and tooltips. parent_labels contain,
  * for each node, the label identifying the parent node.  tooltips contain,
  * for each node, an optional tooltip.  For example, to describe an OrgChart
  * with Alice as the CEO, Bob as the President (reporting to Alice) and Cathy
  * as VP of Sales (also reporting to Alice), have labels contain
  * &quot;Alice&quot;, &quot;Bob&quot;, &quot;Cathy&quot;, parent_labels
  * contain &quot;&quot;, &quot;Alice&quot;, &quot;Alice&quot; and tooltips
  * contain &quot;CEO&quot;, &quot;President&quot;, &quot;VP Sales&quot;.
  */
@js.native
trait SchemaOrgChartSpec extends js.Object {
  /**
    * The data containing the labels for all the nodes in the chart.  Labels
    * must be unique.
    */
  var labels: js.UndefOr[SchemaChartData] = js.native
  /**
    * The color of the org chart nodes.
    */
  var nodeColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The size of the org chart nodes.
    */
  var nodeSize: js.UndefOr[String] = js.native
  /**
    * The data containing the label of the parent for the corresponding node. A
    * blank value indicates that the node has no parent and is a top-level
    * node. This field is optional.
    */
  var parentLabels: js.UndefOr[SchemaChartData] = js.native
  /**
    * The color of the selected org chart nodes.
    */
  var selectedNodeColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The data containing the tooltip for the corresponding node.  A blank
    * value results in no tooltip being displayed for the node. This field is
    * optional.
    */
  var tooltips: js.UndefOr[SchemaChartData] = js.native
}

object SchemaOrgChartSpec {
  @scala.inline
  def apply(
    labels: SchemaChartData = null,
    nodeColor: SchemaColor = null,
    nodeSize: String = null,
    parentLabels: SchemaChartData = null,
    selectedNodeColor: SchemaColor = null,
    tooltips: SchemaChartData = null
  ): SchemaOrgChartSpec = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (nodeColor != null) __obj.updateDynamic("nodeColor")(nodeColor.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (parentLabels != null) __obj.updateDynamic("parentLabels")(parentLabels.asInstanceOf[js.Any])
    if (selectedNodeColor != null) __obj.updateDynamic("selectedNodeColor")(selectedNodeColor.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrgChartSpec]
  }
}


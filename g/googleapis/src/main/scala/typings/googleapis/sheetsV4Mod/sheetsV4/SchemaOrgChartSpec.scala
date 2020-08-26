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
  def apply(): SchemaOrgChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgChartSpec]
  }
  @scala.inline
  implicit class SchemaOrgChartSpecOps[Self <: SchemaOrgChartSpec] (val x: Self) extends AnyVal {
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
    def setLabels(value: SchemaChartData): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setNodeColor(value: SchemaColor): Self = this.set("nodeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeColor: Self = this.set("nodeColor", js.undefined)
    @scala.inline
    def setNodeSize(value: String): Self = this.set("nodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeSize: Self = this.set("nodeSize", js.undefined)
    @scala.inline
    def setParentLabels(value: SchemaChartData): Self = this.set("parentLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLabels: Self = this.set("parentLabels", js.undefined)
    @scala.inline
    def setSelectedNodeColor(value: SchemaColor): Self = this.set("selectedNodeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedNodeColor: Self = this.set("selectedNodeColor", js.undefined)
    @scala.inline
    def setTooltips(value: SchemaChartData): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}


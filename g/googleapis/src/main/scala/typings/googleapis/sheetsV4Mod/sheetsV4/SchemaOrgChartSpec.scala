package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaOrgChartSpec extends StObject {
  
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
  implicit class SchemaOrgChartSpecMutableBuilder[Self <: SchemaOrgChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: SchemaChartData): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setNodeColor(value: SchemaColor): Self = StObject.set(x, "nodeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeColorUndefined: Self = StObject.set(x, "nodeColor", js.undefined)
    
    @scala.inline
    def setNodeSize(value: String): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
    
    @scala.inline
    def setParentLabels(value: SchemaChartData): Self = StObject.set(x, "parentLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLabelsUndefined: Self = StObject.set(x, "parentLabels", js.undefined)
    
    @scala.inline
    def setSelectedNodeColor(value: SchemaColor): Self = StObject.set(x, "selectedNodeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNodeColorUndefined: Self = StObject.set(x, "selectedNodeColor", js.undefined)
    
    @scala.inline
    def setTooltips(value: SchemaChartData): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
  }
}

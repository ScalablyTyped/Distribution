package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrgChartSpec extends StObject {
  
  /**
    * The data containing the labels for all the nodes in the chart. Labels must be unique.
    */
  var labels: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * The color of the org chart nodes. Deprecated: Use node_color_style.
    */
  var nodeColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the org chart nodes. If node_color is also set, this field takes precedence.
    */
  var nodeColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The size of the org chart nodes.
    */
  var nodeSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data containing the label of the parent for the corresponding node. A blank value indicates that the node has no parent and is a top-level node. This field is optional.
    */
  var parentLabels: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * The color of the selected org chart nodes. Deprecated: Use selected_node_color_style.
    */
  var selectedNodeColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the selected org chart nodes. If selected_node_color is also set, this field takes precedence.
    */
  var selectedNodeColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The data containing the tooltip for the corresponding node. A blank value results in no tooltip being displayed for the node. This field is optional.
    */
  var tooltips: js.UndefOr[SchemaChartData] = js.undefined
}
object SchemaOrgChartSpec {
  
  inline def apply(): SchemaOrgChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgChartSpec]
  }
  
  extension [Self <: SchemaOrgChartSpec](x: Self) {
    
    inline def setLabels(value: SchemaChartData): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setNodeColor(value: SchemaColor): Self = StObject.set(x, "nodeColor", value.asInstanceOf[js.Any])
    
    inline def setNodeColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "nodeColorStyle", value.asInstanceOf[js.Any])
    
    inline def setNodeColorStyleUndefined: Self = StObject.set(x, "nodeColorStyle", js.undefined)
    
    inline def setNodeColorUndefined: Self = StObject.set(x, "nodeColor", js.undefined)
    
    inline def setNodeSize(value: String): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
    
    inline def setNodeSizeNull: Self = StObject.set(x, "nodeSize", null)
    
    inline def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
    
    inline def setParentLabels(value: SchemaChartData): Self = StObject.set(x, "parentLabels", value.asInstanceOf[js.Any])
    
    inline def setParentLabelsUndefined: Self = StObject.set(x, "parentLabels", js.undefined)
    
    inline def setSelectedNodeColor(value: SchemaColor): Self = StObject.set(x, "selectedNodeColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedNodeColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "selectedNodeColorStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedNodeColorStyleUndefined: Self = StObject.set(x, "selectedNodeColorStyle", js.undefined)
    
    inline def setSelectedNodeColorUndefined: Self = StObject.set(x, "selectedNodeColor", js.undefined)
    
    inline def setTooltips(value: SchemaChartData): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
    
    inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
  }
}

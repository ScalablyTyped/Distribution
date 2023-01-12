package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesSankeyNodesOptionsObject extends StObject {
  
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) An optional column index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Note that
    * this option name is counter intuitive in inverted charts, like for
    * example an organization chart rendered top down. In this case the
    * "columns" are horizontal.
    */
  var column: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
    * node. The options are the same as the ones for series.sankey.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesArcDiagramDataLabelsOptionsObject | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[
      SeriesArcDiagramDataLabelsOptionsObject | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject
    ])
  ] = js.undefined
  
  /**
    * (Highcharts) The job description for the node card, will be inserted by
    * the default `dataLabel.nodeFormatter`.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) An image for the node card, will be inserted by the default
    * `dataLabel.nodeFormatter`.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Layout for the node's children. If `hanging`, this node's
    * children will hang below their parent, allowing a tighter packing of
    * nodes in the diagram.
    *
    * Note: Since @next version, the `hanging` layout is set by default for
    * children of a parent using `hanging` layout.
    */
  var layout: js.UndefOr[SeriesOrganizationNodesLayoutValue] = js.undefined
  
  /**
    * (Highcharts) An optional level index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Alias of
    * `nodes.column`, but in inverted sankeys and org charts, the levels are
    * laid out as rows.
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The horizontal offset of a node. Positive values shift the
    * node right, negative shift it left.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size.
    */
  var offsetHorizontal: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts) The vertical offset of a node. Positive values shift the
    * node down, negative shift it up.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size.
    */
  var offsetVertical: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts) The job title for the node card, will be inserted by the
    * default `dataLabel.nodeFormatter`.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SeriesSankeyNodesOptionsObject {
  
  inline def apply(): SeriesSankeyNodesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSankeyNodesOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesSankeyNodesOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    inline def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDataLabels(
      value: SeriesArcDiagramDataLabelsOptionsObject | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[
          SeriesArcDiagramDataLabelsOptionsObject | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject
        ])
    ): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDataLabelsVarargs(
      value: (SeriesArcDiagramDataLabelsOptionsObject | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject)*
    ): Self = StObject.set(x, "dataLabels", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLayout(value: SeriesOrganizationNodesLayoutValue): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffsetHorizontal(value: Double | String): Self = StObject.set(x, "offsetHorizontal", value.asInstanceOf[js.Any])
    
    inline def setOffsetHorizontalUndefined: Self = StObject.set(x, "offsetHorizontal", js.undefined)
    
    inline def setOffsetVertical(value: Double | String): Self = StObject.set(x, "offsetVertical", value.asInstanceOf[js.Any])
    
    inline def setOffsetVerticalUndefined: Self = StObject.set(x, "offsetVertical", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesSankeyNodesOptionsObject extends StObject {
  
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) An optional column index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Note that
    * this option name is counter intuitive in inverted charts, like for
    * example an organization chart rendered top down. In this case the
    * "columns" are horizontal.
    */
  var column: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
    * node. The options are the same as the ones for series.sankey.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
  ] = js.native
  
  /**
    * (Highcharts) The job description for the node card, will be inserted by
    * the default `dataLabel.nodeFormatter`.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) An image for the node card, will be inserted by the default
    * `dataLabel.nodeFormatter`.
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Layout for the node's children. If `hanging`, this node's
    * children will hang below their parent, allowing a tighter packing of
    * nodes in the diagram.
    */
  var layout: js.UndefOr[SeriesOrganizationNodesLayoutValue] = js.native
  
  /**
    * (Highcharts) An optional level index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Alias of
    * `nodes.column`, but in inverted sankeys and org charts, the levels are
    * laid out as rows.
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) In a horizontal layout, the vertical offset of a node in
    * terms of weight. Positive values shift the node downwards, negative shift
    * it upwards. In a vertical layout, like organization chart, the offset is
    * horizontal.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size plus `nodePadding`.
    */
  var offset: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The job title for the node card, will be inserted by the
    * default `dataLabel.nodeFormatter`.
    */
  var title: js.UndefOr[String] = js.native
}
object SeriesSankeyNodesOptionsObject {
  
  @scala.inline
  def apply(): SeriesSankeyNodesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSankeyNodesOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesSankeyNodesOptionsObjectMutableBuilder[Self <: SeriesSankeyNodesOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setDataLabels(
      value: SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
    ): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: (SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject)*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLayout(value: SeriesOrganizationNodesLayoutValue): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

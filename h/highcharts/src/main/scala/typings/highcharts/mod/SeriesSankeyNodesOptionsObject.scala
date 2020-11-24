package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesSankeyNodesOptionsObject extends js.Object {
  
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
  implicit class SeriesSankeyNodesOptionsObjectOps[Self <: SeriesSankeyNodesOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: (SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject)*): Self = this.set("dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDataLabels(
      value: SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
    ): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLayout(value: SeriesOrganizationNodesLayoutValue): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

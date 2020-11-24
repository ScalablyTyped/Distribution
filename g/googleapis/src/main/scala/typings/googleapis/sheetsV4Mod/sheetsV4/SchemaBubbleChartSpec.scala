package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/bubblechart&quot;&gt;bubble
  * chart&lt;/a&gt;.
  */
@js.native
trait SchemaBubbleChartSpec extends js.Object {
  
  /**
    * The bubble border color.
    */
  var bubbleBorderColor: js.UndefOr[SchemaColor] = js.native
  
  /**
    * The data containing the bubble labels.  These do not need to be unique.
    */
  var bubbleLabels: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * The max radius size of the bubbles, in pixels. If specified, the field
    * must be a positive value.
    */
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.native
  
  /**
    * The minimum radius size of the bubbles, in pixels. If specific, the field
    * must be a positive value.
    */
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.native
  
  /**
    * The opacity of the bubbles between 0 and 1.0. 0 is fully transparent and
    * 1 is fully opaque.
    */
  var bubbleOpacity: js.UndefOr[Double] = js.native
  
  /**
    * The data contianing the bubble sizes.  Bubble sizes are used to draw the
    * bubbles at different sizes relative to each other. If specified,
    * group_ids must also be specified.  This field is optional.
    */
  var bubbleSizes: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * The format of the text inside the bubbles. Underline and Strikethrough
    * are not supported.
    */
  var bubbleTextStyle: js.UndefOr[SchemaTextFormat] = js.native
  
  /**
    * The data containing the bubble x-values.  These values locate the bubbles
    * in the chart horizontally.
    */
  var domain: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * The data containing the bubble group IDs. All bubbles with the same group
    * ID are drawn in the same color. If bubble_sizes is specified then this
    * field must also be specified but may contain blank values. This field is
    * optional.
    */
  var groupIds: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * Where the legend of the chart should be drawn.
    */
  var legendPosition: js.UndefOr[String] = js.native
  
  /**
    * The data contianing the bubble y-values.  These values locate the bubbles
    * in the chart vertically.
    */
  var series: js.UndefOr[SchemaChartData] = js.native
}
object SchemaBubbleChartSpec {
  
  @scala.inline
  def apply(): SchemaBubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBubbleChartSpec]
  }
  
  @scala.inline
  implicit class SchemaBubbleChartSpecOps[Self <: SchemaBubbleChartSpec] (val x: Self) extends AnyVal {
    
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
    def setBubbleBorderColor(value: SchemaColor): Self = this.set("bubbleBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleBorderColor: Self = this.set("bubbleBorderColor", js.undefined)
    
    @scala.inline
    def setBubbleLabels(value: SchemaChartData): Self = this.set("bubbleLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleLabels: Self = this.set("bubbleLabels", js.undefined)
    
    @scala.inline
    def setBubbleMaxRadiusSize(value: Double): Self = this.set("bubbleMaxRadiusSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleMaxRadiusSize: Self = this.set("bubbleMaxRadiusSize", js.undefined)
    
    @scala.inline
    def setBubbleMinRadiusSize(value: Double): Self = this.set("bubbleMinRadiusSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleMinRadiusSize: Self = this.set("bubbleMinRadiusSize", js.undefined)
    
    @scala.inline
    def setBubbleOpacity(value: Double): Self = this.set("bubbleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleOpacity: Self = this.set("bubbleOpacity", js.undefined)
    
    @scala.inline
    def setBubbleSizes(value: SchemaChartData): Self = this.set("bubbleSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleSizes: Self = this.set("bubbleSizes", js.undefined)
    
    @scala.inline
    def setBubbleTextStyle(value: SchemaTextFormat): Self = this.set("bubbleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleTextStyle: Self = this.set("bubbleTextStyle", js.undefined)
    
    @scala.inline
    def setDomain(value: SchemaChartData): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setGroupIds(value: SchemaChartData): Self = this.set("groupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIds: Self = this.set("groupIds", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setSeries(value: SchemaChartData): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
}

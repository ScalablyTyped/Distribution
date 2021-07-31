package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/bubblechart&quot;&gt;bubble
  * chart&lt;/a&gt;.
  */
trait SchemaBubbleChartSpec extends StObject {
  
  /**
    * The bubble border color.
    */
  var bubbleBorderColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The data containing the bubble labels.  These do not need to be unique.
    */
  var bubbleLabels: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * The max radius size of the bubbles, in pixels. If specified, the field
    * must be a positive value.
    */
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum radius size of the bubbles, in pixels. If specific, the field
    * must be a positive value.
    */
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the bubbles between 0 and 1.0. 0 is fully transparent and
    * 1 is fully opaque.
    */
  var bubbleOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The data contianing the bubble sizes.  Bubble sizes are used to draw the
    * bubbles at different sizes relative to each other. If specified,
    * group_ids must also be specified.  This field is optional.
    */
  var bubbleSizes: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * The format of the text inside the bubbles. Underline and Strikethrough
    * are not supported.
    */
  var bubbleTextStyle: js.UndefOr[SchemaTextFormat] = js.undefined
  
  /**
    * The data containing the bubble x-values.  These values locate the bubbles
    * in the chart horizontally.
    */
  var domain: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * The data containing the bubble group IDs. All bubbles with the same group
    * ID are drawn in the same color. If bubble_sizes is specified then this
    * field must also be specified but may contain blank values. This field is
    * optional.
    */
  var groupIds: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * Where the legend of the chart should be drawn.
    */
  var legendPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The data contianing the bubble y-values.  These values locate the bubbles
    * in the chart vertically.
    */
  var series: js.UndefOr[SchemaChartData] = js.undefined
}
object SchemaBubbleChartSpec {
  
  @scala.inline
  def apply(): SchemaBubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBubbleChartSpec]
  }
  
  @scala.inline
  implicit class SchemaBubbleChartSpecMutableBuilder[Self <: SchemaBubbleChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbleBorderColor(value: SchemaColor): Self = StObject.set(x, "bubbleBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleBorderColorUndefined: Self = StObject.set(x, "bubbleBorderColor", js.undefined)
    
    @scala.inline
    def setBubbleLabels(value: SchemaChartData): Self = StObject.set(x, "bubbleLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleLabelsUndefined: Self = StObject.set(x, "bubbleLabels", js.undefined)
    
    @scala.inline
    def setBubbleMaxRadiusSize(value: Double): Self = StObject.set(x, "bubbleMaxRadiusSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleMaxRadiusSizeUndefined: Self = StObject.set(x, "bubbleMaxRadiusSize", js.undefined)
    
    @scala.inline
    def setBubbleMinRadiusSize(value: Double): Self = StObject.set(x, "bubbleMinRadiusSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleMinRadiusSizeUndefined: Self = StObject.set(x, "bubbleMinRadiusSize", js.undefined)
    
    @scala.inline
    def setBubbleOpacity(value: Double): Self = StObject.set(x, "bubbleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleOpacityUndefined: Self = StObject.set(x, "bubbleOpacity", js.undefined)
    
    @scala.inline
    def setBubbleSizes(value: SchemaChartData): Self = StObject.set(x, "bubbleSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleSizesUndefined: Self = StObject.set(x, "bubbleSizes", js.undefined)
    
    @scala.inline
    def setBubbleTextStyle(value: SchemaTextFormat): Self = StObject.set(x, "bubbleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleTextStyleUndefined: Self = StObject.set(x, "bubbleTextStyle", js.undefined)
    
    @scala.inline
    def setDomain(value: SchemaChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setGroupIds(value: SchemaChartData): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdsUndefined: Self = StObject.set(x, "groupIds", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    @scala.inline
    def setSeries(value: SchemaChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}

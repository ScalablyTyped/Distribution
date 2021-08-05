package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesPackedBubbleDataLabelsFormatterContextObject
  extends StObject
     with PointLabelObject {
  
  /**
    * The color of the node.
    */
  @JSName("color")
  var color_SeriesPackedBubbleDataLabelsFormatterContextObject: ColorString
  
  /**
    * The ID of the node.
    */
  @JSName("key")
  var key_SeriesPackedBubbleDataLabelsFormatterContextObject: String
}
object SeriesPackedBubbleDataLabelsFormatterContextObject {
  
  inline def apply(
    color: ColorString,
    colorIndex: Double,
    key: String,
    percentage: Double,
    point: Point,
    series: Series
  ): SeriesPackedBubbleDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsFormatterContextObject]
  }
  
  extension [Self <: SeriesPackedBubbleDataLabelsFormatterContextObject](x: Self) {
    
    inline def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

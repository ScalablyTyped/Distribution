package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesFlowmapDataOptions extends StObject {
  
  /**
    * (Highmaps) A `curveFactor` with a higher value than 0 will curve the link
    * clockwise. A negative value will curve the link counter clockwise. If the
    * value is 0 the link will be straight.
    */
  var curveFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) The fill color of an individual link.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highmaps) The opacity of the link color fill.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) ID referencing a map point holding coordinates of the link
    * origin or coordinates in terms of array of `[longitude, latitude]` or
    * object with `lon` and `lat` properties.
    */
  var from: js.UndefOr[String | LonLatArray | MapLonLatObject] = js.undefined
  
  /**
    * (Highmaps) If set to `true`, the line will grow towards its end.
    */
  var growTowards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highmaps) Specify the `lineWidth` of the link.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) Specifying a `markerEnd` here will create an arrow symbol
    * indicating the direction of flow at the destination of one individual
    * link. If one has been previously specified at the higher level option it
    * will be overridden for the current link.
    */
  var markerEnd: js.UndefOr[SeriesFlowmapDataMarkerEndOptions | Null] = js.undefined
  
  /**
    * (Highmaps) The opacity of an individual link.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) ID referencing a map point holding coordinates of the link
    * origin or coordinates in terms of array of `[longitude, latitude]` or
    * object with `lon` and `lat` properties.
    */
  var to: js.UndefOr[String | LonLatArray | MapLonLatObject] = js.undefined
  
  /**
    * (Highmaps) The weight of a link determines its thickness compared to
    * other links.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object SeriesFlowmapDataOptions {
  
  inline def apply(): SeriesFlowmapDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesFlowmapDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesFlowmapDataOptions] (val x: Self) extends AnyVal {
    
    inline def setCurveFactor(value: Double): Self = StObject.set(x, "curveFactor", value.asInstanceOf[js.Any])
    
    inline def setCurveFactorUndefined: Self = StObject.set(x, "curveFactor", js.undefined)
    
    inline def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFrom(value: String | LonLatArray | MapLonLatObject): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setGrowTowards(value: Boolean): Self = StObject.set(x, "growTowards", value.asInstanceOf[js.Any])
    
    inline def setGrowTowardsUndefined: Self = StObject.set(x, "growTowards", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMarkerEnd(value: SeriesFlowmapDataMarkerEndOptions): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    inline def setMarkerEndNull: Self = StObject.set(x, "markerEnd", null)
    
    inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setTo(value: String | LonLatArray | MapLonLatObject): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}

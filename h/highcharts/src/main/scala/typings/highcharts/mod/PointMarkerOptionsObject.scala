package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointMarkerOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
    * between values. Set to `false` to disable animation. Defaults to `{
    * duration: 50 }`.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the marker.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) Enable or disable the point marker. If
    * `undefined`, the markers are hidden when the data is dense, and shown for
    * more widespread data points.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) The threshold for how dense the point markers
    * should be before they are hidden, given that `enabled` is not defined.
    * The number indicates the horizontal distance between the two closest
    * points in the series, as multiples of the `marker.radius`. In other
    * words, the default value of 2 means points are hidden if overlapping
    * horizontally.
    */
  var enabledThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) The fill color of the point marker. When
    * `undefined`, the series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The fill opacity of the bubble markers.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `width` must also be set.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[String | ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) The radius of the point marker.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) States for a single point marker.
    */
  var states: js.UndefOr[PointStatesOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
    * undefined, the symbol is pulled from options.symbols. Other possible
    * values are `'circle'`, `'square'`,`'diamond'`, `'triangle'` and
    * `'triangle-down'`.
    *
    * Additionally, the URL to a graphic can be given on this form:
    * `'url(graphic.png)'`. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbol: js.UndefOr[String | SymbolKeyValue] = js.undefined
  
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `height` must also be set.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PointMarkerOptionsObject {
  
  @scala.inline
  def apply(): PointMarkerOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointMarkerOptionsObject]
  }
  
  @scala.inline
  implicit class PointMarkerOptionsObjectMutableBuilder[Self <: PointMarkerOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledThreshold(value: Double): Self = StObject.set(x, "enabledThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledThresholdUndefined: Self = StObject.set(x, "enabledThreshold", js.undefined)
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLineColor(value: String | ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStates(value: PointStatesOptionsObject): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setSymbol(value: String | SymbolKeyValue): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

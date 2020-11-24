package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointMarkerOptionsObject extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
    * between values. Set to `false` to disable animation. Defaults to `{
    * duration: 50 }`.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the marker.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) Enable or disable the point marker. If
    * `undefined`, the markers are hidden when the data is dense, and shown for
    * more widespread data points.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) The threshold for how dense the point markers
    * should be before they are hidden, given that `enabled` is not defined.
    * The number indicates the horizontal distance between the two closest
    * points in the series, as multiples of the `marker.radius`. In other
    * words, the default value of 2 means points are hidden if overlapping
    * horizontally.
    */
  var enabledThreshold: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The fill color of the point marker. When
    * `undefined`, the series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The fill opacity of the bubble markers.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `width` must also be set.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[String | ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The radius of the point marker.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) States for a single point marker.
    */
  var states: js.UndefOr[PointStatesOptionsObject] = js.native
  
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
  var symbol: js.UndefOr[String | SymbolKeyValue] = js.native
  
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `height` must also be set.
    */
  var width: js.UndefOr[Double] = js.native
}
object PointMarkerOptionsObject {
  
  @scala.inline
  def apply(): PointMarkerOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointMarkerOptionsObject]
  }
  
  @scala.inline
  implicit class PointMarkerOptionsObjectOps[Self <: PointMarkerOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEnabledThreshold(value: Double): Self = this.set("enabledThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledThreshold: Self = this.set("enabledThreshold", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLineColor(value: String | ColorString | GradientColorObject | PatternObject): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setStates(value: PointStatesOptionsObject): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setSymbol(value: String | SymbolKeyValue): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

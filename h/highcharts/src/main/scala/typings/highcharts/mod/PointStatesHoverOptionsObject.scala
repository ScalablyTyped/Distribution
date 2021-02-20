package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointStatesHoverOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) Animation when hovering over the marker.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highcharts, Highstock) Enable or disable the point marker.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) The fill color of the marker in hover state. When
    * `undefined`, the series' or point's fillColor for normal state is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highmaps) Set the marker's fixed height on hover state.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The number of pixels to increase the height of
    * the hovered point.
    */
  var heightPlus: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's lineColor for normal state is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) The width of the point marker's outline. When
    * `undefined`, the series' or point's lineWidth for normal state is used.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The additional line width for a hovered point.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The radius of the point marker. In hover state,
    * it defaults to the normal state's radius + 2 as per the radiusPlus
    * option.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The number of pixels to increase the radius of
    * the hovered point.
    */
  var radiusPlus: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) Set the marker's fixed width on hover state.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The number of pixels to increase the width of the
    * hovered point.
    */
  var widthPlus: js.UndefOr[Double] = js.native
}
object PointStatesHoverOptionsObject {
  
  @scala.inline
  def apply(): PointStatesHoverOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesHoverOptionsObject]
  }
  
  @scala.inline
  implicit class PointStatesHoverOptionsObjectMutableBuilder[Self <: PointStatesHoverOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPlus(value: Double): Self = StObject.set(x, "heightPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPlusUndefined: Self = StObject.set(x, "heightPlus", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthPlus(value: Double): Self = StObject.set(x, "lineWidthPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthPlusUndefined: Self = StObject.set(x, "lineWidthPlus", js.undefined)
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusPlus(value: Double): Self = StObject.set(x, "radiusPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusPlusUndefined: Self = StObject.set(x, "radiusPlus", js.undefined)
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPlus(value: Double): Self = StObject.set(x, "widthPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPlusUndefined: Self = StObject.set(x, "widthPlus", js.undefined)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

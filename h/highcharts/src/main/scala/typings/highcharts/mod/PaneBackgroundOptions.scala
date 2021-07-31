package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneBackgroundOptions extends StObject {
  
  /**
    * (Highcharts) The background color or gradient for the pane.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The pane background border color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The pixel border width of the pane background.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The class name for this background.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The inner radius of the pane background. Can be either
    * numeric (pixels) or a percentage string.
    */
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts) The outer radius of the circular pane background. Can be
    * either numeric (pixels) or a percentage string.
    */
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts) The shape of the pane background. When `solid`, the
    * background is circular. When `arc`, the background extends only from the
    * min to the max of the value axis.
    */
  var shape: js.UndefOr[PaneBackgroundShapeValue] = js.undefined
}
object PaneBackgroundOptions {
  
  @scala.inline
  def apply(): PaneBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneBackgroundOptions]
  }
  
  @scala.inline
  implicit class PaneBackgroundOptionsMutableBuilder[Self <: PaneBackgroundOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | String): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | String): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setShape(value: PaneBackgroundShapeValue): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}

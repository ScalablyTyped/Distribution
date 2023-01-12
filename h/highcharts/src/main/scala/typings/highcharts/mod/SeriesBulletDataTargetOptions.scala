package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesBulletDataTargetOptions extends StObject {
  
  /**
    * (Highcharts) The border color of the rectangle representing the target.
    * When not set, the point's border color is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highcharts) The border radius of the rectangle representing the target.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The border width of the rectangle representing the target.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The color of the rectangle representing the target. When not
    * set, point's color (if set in point's options - `color`) or zone of the
    * target value (if `zones` or `negativeColor` are set) or the same color as
    * the point has is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The height of the rectangle representing the target.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The width of the rectangle representing the target. Could be
    * set as a pixel value or as a percentage of a column width.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object SeriesBulletDataTargetOptions {
  
  inline def apply(): SeriesBulletDataTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBulletDataTargetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesBulletDataTargetOptions] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: ColorString): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewInsetOptions extends StObject {
  
  /**
    * (Highmaps) The border color of the insets.
    */
  var borderColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highmaps) The pixel border width of the insets.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) The padding of the insets. Can be either a number of pixels, a
    * percentage string, or an array of either. If an array is given, it sets
    * the top, right, bottom, left paddings respectively.
    */
  var padding: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  
  /**
    * (Highmaps) What coordinate system the `field` and `borderPath` should
    * relate to. If `plotBox`, they will be fixed to the plot box and
    * responsively move in relation to the main map. If `mapBoundingBox`, they
    * will be fixed to the map bounding box, which is constant and centered in
    * different chart sizes and ratios.
    */
  var relativeTo: js.UndefOr[OptionsRelativeToValue] = js.undefined
  
  /**
    * (Highmaps) What units to use for the `field` and `borderPath` geometries.
    * If `percent` (default), they relate to the box given in `relativeTo`. If
    * `pixels`, they are absolute values.
    */
  var units: js.UndefOr[OptionsUnitsValue] = js.undefined
}
object MapViewInsetOptions {
  
  inline def apply(): MapViewInsetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewInsetOptions]
  }
  
  extension [Self <: MapViewInsetOptions](x: Self) {
    
    inline def setBorderColor(value: ColorType): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setPadding(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: (Double | String)*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setRelativeTo(value: OptionsRelativeToValue): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    inline def setUnits(value: OptionsUnitsValue): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}

package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewInsetsOptions extends StObject {
  
  /**
    * (Highmaps) The border color of the insets.
    */
  var borderColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highmaps) A geometry object of type `MultiLineString` defining the
    * border path of the inset in terms of `units`. If undefined, a border is
    * rendered around the `field` geometry. It is recommended that the
    * `borderPath` partly follows the outline of the `field` in order to make
    * pointer positioning consistent.
    */
  var borderPath: js.UndefOr[js.Object] = js.undefined
  
  /**
    * (Highmaps) The pixel border width of the insets.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) A geometry object of type `Polygon` defining where in the
    * chart the inset should be rendered, in terms of `units` and relative to
    * the `relativeTo` setting. If a `borderPath` is omitted, a border is
    * rendered around the field. If undefined, the inset is rendered in the
    * full plot area.
    */
  var field: js.UndefOr[js.Object] = js.undefined
  
  /**
    * (Highmaps) A geometry object of type `Polygon` encircling the shapes that
    * should be rendered in the inset, in terms of geographic coordinates.
    * Geometries within this geometry are removed from the default map view and
    * rendered in the inset.
    */
  var geoBounds: js.UndefOr[js.Object] = js.undefined
  
  /**
    * (Highmaps) The id of the inset, used for internal reference.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) The padding of the insets. Can be either a number of pixels, a
    * percentage string, or an array of either. If an array is given, it sets
    * the top, right, bottom, left paddings respectively.
    */
  var padding: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  
  /**
    * (Highmaps) The projection options for the inset.
    */
  var projection: js.UndefOr[js.Object | MapViewInsetsProjectionOptions] = js.undefined
  
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
object MapViewInsetsOptions {
  
  inline def apply(): MapViewInsetsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewInsetsOptions]
  }
  
  extension [Self <: MapViewInsetsOptions](x: Self) {
    
    inline def setBorderColor(value: ColorType): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderPath(value: js.Object): Self = StObject.set(x, "borderPath", value.asInstanceOf[js.Any])
    
    inline def setBorderPathUndefined: Self = StObject.set(x, "borderPath", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setField(value: js.Object): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGeoBounds(value: js.Object): Self = StObject.set(x, "geoBounds", value.asInstanceOf[js.Any])
    
    inline def setGeoBoundsUndefined: Self = StObject.set(x, "geoBounds", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPadding(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: (Double | String)*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setProjection(value: js.Object | MapViewInsetsProjectionOptions): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRelativeTo(value: OptionsRelativeToValue): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    inline def setUnits(value: OptionsUnitsValue): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}

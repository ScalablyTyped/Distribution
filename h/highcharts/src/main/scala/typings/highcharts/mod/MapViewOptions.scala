package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewOptions extends StObject {
  
  /**
    * (Highmaps) The center of the map in terms of longitude and latitude. For
    * preprojected maps (like the GeoJSON files in Map Collection v1.x), the
    * units are projected x and y units.
    */
  var center: js.UndefOr[LonLatArray] = js.undefined
  
  /**
    * (Highmaps) Generic options for the placement and appearance of map insets
    * like non-contiguous territories.
    */
  var insetOptions: js.UndefOr[MapViewInsetOptions] = js.undefined
  
  /**
    * (Highmaps) The individual MapView insets, typically used for
    * non-contiguous areas of a country. Each item inherits from the generic
    * `insetOptions`.
    *
    * Some of the TopoJSON files of the Highcharts Map Collection include a
    * property called `hc-recommended-mapview`, and some of these include
    * insets. In order to override the recommended inset options, an inset
    * option with a matching id can be applied, and it will be merged into the
    * embedded settings.
    */
  var insets: js.UndefOr[MapViewInsetsOptions | js.Array[js.Object]] = js.undefined
  
  /**
    * (Highmaps) Prevents the end user from zooming too far in on the map. See
    * zoom.
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) The padding inside the plot area when auto fitting to the map
    * bounds. A number signifies pixels, and a percentage is relative to the
    * plot area size.
    */
  var padding: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  
  /**
    * (Highmaps) The projection options allow applying client side projection
    * to a map given in geographic coordinates, typically from TopoJSON or
    * GeoJSON.
    */
  var projection: js.UndefOr[js.Object | MapViewProjectionOptions] = js.undefined
  
  /**
    * (Highmaps) The zoom level of a map. Higher zoom levels means more zoomed
    * in. An increase of 1 zooms in to a quarter of the viewed area (half the
    * width and height). Defaults to fitting to the map bounds.
    *
    * In a `WebMercator` projection, a zoom level of 0 represents the world in
    * a 256x256 pixel square. This is a common concept for WMS tiling software.
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object MapViewOptions {
  
  inline def apply(): MapViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapViewOptions] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: LonLatArray): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setInsetOptions(value: MapViewInsetOptions): Self = StObject.set(x, "insetOptions", value.asInstanceOf[js.Any])
    
    inline def setInsetOptionsUndefined: Self = StObject.set(x, "insetOptions", js.undefined)
    
    inline def setInsets(value: MapViewInsetsOptions | js.Array[js.Object]): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    
    inline def setInsetsUndefined: Self = StObject.set(x, "insets", js.undefined)
    
    inline def setInsetsVarargs(value: js.Object*): Self = StObject.set(x, "insets", js.Array(value*))
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setPadding(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: (Double | String)*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setProjection(value: js.Object | MapViewProjectionOptions): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}

package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLayerOptions extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var keepBuffer: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum zoom number the tile source has available. If it is specified, the tiles on all zoom levels higher than
    * `maxNativeZoom` will be loaded from `maxNativeZoom` level and auto-scaled.
    */
  var maxNativeZoom: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum zoom number the tile source has available. If it is specified, the tiles on all zoom levels lower than
    * `minNativeZoom` will be loaded from `minNativeZoom` level and auto-scaled.
    */
  var minNativeZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var tileSize: js.UndefOr[Double | Point_] = js.undefined
  
  var updateInterval: js.UndefOr[Double] = js.undefined
  
  var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  
  var updateWhenZooming: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object GridLayerOptions {
  
  inline def apply(): GridLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setKeepBuffer(value: Double): Self = StObject.set(x, "keepBuffer", value.asInstanceOf[js.Any])
    
    inline def setKeepBufferUndefined: Self = StObject.set(x, "keepBuffer", js.undefined)
    
    inline def setMaxNativeZoom(value: Double): Self = StObject.set(x, "maxNativeZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxNativeZoomUndefined: Self = StObject.set(x, "maxNativeZoom", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinNativeZoom(value: Double): Self = StObject.set(x, "minNativeZoom", value.asInstanceOf[js.Any])
    
    inline def setMinNativeZoomUndefined: Self = StObject.set(x, "minNativeZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setTileSize(value: Double | Point_): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    
    inline def setUpdateWhenIdle(value: Boolean): Self = StObject.set(x, "updateWhenIdle", value.asInstanceOf[js.Any])
    
    inline def setUpdateWhenIdleUndefined: Self = StObject.set(x, "updateWhenIdle", js.undefined)
    
    inline def setUpdateWhenZooming(value: Boolean): Self = StObject.set(x, "updateWhenZooming", value.asInstanceOf[js.Any])
    
    inline def setUpdateWhenZoomingUndefined: Self = StObject.set(x, "updateWhenZooming", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}

package typings.mapboxGl

import typings.mapboxGl.mod.PositionOptions
import typings.mapboxGl.mod._LngLatLike
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BearingSnap extends StObject {
    
    var bearingSnap: js.UndefOr[Double] = js.undefined
    
    var pitchWithRotate: js.UndefOr[Boolean] = js.undefined
  }
  object BearingSnap {
    
    inline def apply(): BearingSnap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BearingSnap]
    }
    
    extension [Self <: BearingSnap](x: Self) {
      
      inline def setBearingSnap(value: Double): Self = StObject.set(x, "bearingSnap", value.asInstanceOf[js.Any])
      
      inline def setBearingSnapUndefined: Self = StObject.set(x, "bearingSnap", js.undefined)
      
      inline def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
      
      inline def setPitchWithRotateUndefined: Self = StObject.set(x, "pitchWithRotate", js.undefined)
    }
  }
  
  trait Compact extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var customAttribution: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Compact {
    
    inline def apply(): Compact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compact]
    }
    
    extension [Self <: Compact](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setCustomAttribution(value: String | js.Array[String]): Self = StObject.set(x, "customAttribution", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributionUndefined: Self = StObject.set(x, "customAttribution", js.undefined)
      
      inline def setCustomAttributionVarargs(value: String*): Self = StObject.set(x, "customAttribution", js.Array(value :_*))
    }
  }
  
  trait Data extends StObject {
    
    var data: Uint8Array | Uint8ClampedArray
    
    var height: Double
    
    var width: Double
  }
  object Data {
    
    inline def apply(data: Uint8Array | Uint8ClampedArray, height: Double, width: Double): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Uint8Array | Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Diff extends StObject {
    
    var diff: js.UndefOr[Boolean] = js.undefined
    
    var localIdeographFontFamily: js.UndefOr[String] = js.undefined
  }
  object Diff {
    
    inline def apply(): Diff = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diff]
    }
    
    extension [Self <: Diff](x: Self) {
      
      inline def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      inline def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
      
      inline def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
    }
  }
  
  trait FailIfMajorPerformanceCaveat extends StObject {
    
    var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  }
  object FailIfMajorPerformanceCaveat {
    
    inline def apply(): FailIfMajorPerformanceCaveat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailIfMajorPerformanceCaveat]
    }
    
    extension [Self <: FailIfMajorPerformanceCaveat](x: Self) {
      
      inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
      
      inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    }
  }
  
  trait FitBoundsOptions extends StObject {
    
    var fitBoundsOptions: js.UndefOr[typings.mapboxGl.mod.FitBoundsOptions] = js.undefined
    
    var positionOptions: js.UndefOr[PositionOptions] = js.undefined
    
    var showAccuracyCircle: js.UndefOr[Boolean] = js.undefined
    
    var showUserLocation: js.UndefOr[Boolean] = js.undefined
    
    var trackUserLocation: js.UndefOr[Boolean] = js.undefined
  }
  object FitBoundsOptions {
    
    inline def apply(): FitBoundsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitBoundsOptions]
    }
    
    extension [Self <: FitBoundsOptions](x: Self) {
      
      inline def setFitBoundsOptions(value: typings.mapboxGl.mod.FitBoundsOptions): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
      
      inline def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
      
      inline def setPositionOptions(value: PositionOptions): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
      
      inline def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
      
      inline def setShowAccuracyCircle(value: Boolean): Self = StObject.set(x, "showAccuracyCircle", value.asInstanceOf[js.Any])
      
      inline def setShowAccuracyCircleUndefined: Self = StObject.set(x, "showAccuracyCircle", js.undefined)
      
      inline def setShowUserLocation(value: Boolean): Self = StObject.set(x, "showUserLocation", value.asInstanceOf[js.Any])
      
      inline def setShowUserLocationUndefined: Self = StObject.set(x, "showUserLocation", js.undefined)
      
      inline def setTrackUserLocation(value: Boolean): Self = StObject.set(x, "trackUserLocation", value.asInstanceOf[js.Any])
      
      inline def setTrackUserLocationUndefined: Self = StObject.set(x, "trackUserLocation", js.undefined)
    }
  }
  
  trait Lat
    extends StObject
       with _LngLatLike {
    
    var lat: Double
    
    var lng: Double
  }
  object Lat {
    
    inline def apply(lat: Double, lng: Double): Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lat]
    }
    
    extension [Self <: Lat](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lon
    extends StObject
       with _LngLatLike {
    
    var lat: Double
    
    var lon: Double
  }
  object Lon {
    
    inline def apply(lat: Double, lon: Double): Lon = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lon]
    }
    
    extension [Self <: Lon](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxWidth extends StObject {
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var unit: js.UndefOr[String] = js.undefined
  }
  object MaxWidth {
    
    inline def apply(): MaxWidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxWidth]
    }
    
    extension [Self <: MaxWidth](x: Self) {
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait PixelRatio extends StObject {
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var sdf: js.UndefOr[Boolean] = js.undefined
  }
  object PixelRatio {
    
    inline def apply(): PixelRatio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PixelRatio]
    }
    
    extension [Self <: PixelRatio](x: Self) {
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setSdf(value: Boolean): Self = StObject.set(x, "sdf", value.asInstanceOf[js.Any])
      
      inline def setSdfUndefined: Self = StObject.set(x, "sdf", js.undefined)
    }
  }
  
  trait ShowCompass extends StObject {
    
    var showCompass: js.UndefOr[Boolean] = js.undefined
    
    var showZoom: js.UndefOr[Boolean] = js.undefined
    
    var visualizePitch: js.UndefOr[Boolean] = js.undefined
  }
  object ShowCompass {
    
    inline def apply(): ShowCompass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowCompass]
    }
    
    extension [Self <: ShowCompass](x: Self) {
      
      inline def setShowCompass(value: Boolean): Self = StObject.set(x, "showCompass", value.asInstanceOf[js.Any])
      
      inline def setShowCompassUndefined: Self = StObject.set(x, "showCompass", js.undefined)
      
      inline def setShowZoom(value: Boolean): Self = StObject.set(x, "showZoom", value.asInstanceOf[js.Any])
      
      inline def setShowZoomUndefined: Self = StObject.set(x, "showZoom", js.undefined)
      
      inline def setVisualizePitch(value: Boolean): Self = StObject.set(x, "visualizePitch", value.asInstanceOf[js.Any])
      
      inline def setVisualizePitchUndefined: Self = StObject.set(x, "visualizePitch", js.undefined)
    }
  }
  
  /* Inlined {  layers :std.Array<string> | undefined,   filter :std.Array<any> | undefined} & mapbox-gl.mapbox-gl.FilterOptions */
  trait layersArraystringundefine extends StObject {
    
    var filter: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to check if the filter conforms to the Mapbox GL Style Specification.
      * Disabling validation is a performance optimization that should only be used
      * if you have previously validated the values you will be passing to this function.
      */
    var validate: js.UndefOr[Boolean | Null] = js.undefined
  }
  object layersArraystringundefine {
    
    inline def apply(): layersArraystringundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[layersArraystringundefine]
    }
    
    extension [Self <: layersArraystringundefine](x: Self) {
      
      inline def setFilter(value: js.Array[js.Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateNull: Self = StObject.set(x, "validate", null)
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  /* Inlined {  sourceLayer :string | undefined,   filter :std.Array<any> | undefined} & mapbox-gl.mapbox-gl.FilterOptions */
  trait sourceLayerstringundefine extends StObject {
    
    var filter: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var sourceLayer: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to check if the filter conforms to the Mapbox GL Style Specification.
      * Disabling validation is a performance optimization that should only be used
      * if you have previously validated the values you will be passing to this function.
      */
    var validate: js.UndefOr[Boolean | Null] = js.undefined
  }
  object sourceLayerstringundefine {
    
    inline def apply(): sourceLayerstringundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[sourceLayerstringundefine]
    }
    
    extension [Self <: sourceLayerstringundefine](x: Self) {
      
      inline def setFilter(value: js.Array[js.Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      inline def setSourceLayer(value: String): Self = StObject.set(x, "sourceLayer", value.asInstanceOf[js.Any])
      
      inline def setSourceLayerUndefined: Self = StObject.set(x, "sourceLayer", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateNull: Self = StObject.set(x, "validate", null)
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}

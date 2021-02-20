package typings.mapboxGl

import typings.mapboxGl.mod.PositionOptions
import typings.mapboxGl.mod._LngLatLike
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BearingSnap extends StObject {
    
    var bearingSnap: js.UndefOr[Double] = js.native
    
    var pitchWithRotate: js.UndefOr[Boolean] = js.native
  }
  object BearingSnap {
    
    @scala.inline
    def apply(): BearingSnap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BearingSnap]
    }
    
    @scala.inline
    implicit class BearingSnapMutableBuilder[Self <: BearingSnap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBearingSnap(value: Double): Self = StObject.set(x, "bearingSnap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearingSnapUndefined: Self = StObject.set(x, "bearingSnap", js.undefined)
      
      @scala.inline
      def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitchWithRotateUndefined: Self = StObject.set(x, "pitchWithRotate", js.undefined)
    }
  }
  
  @js.native
  trait Compact extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var customAttribution: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Compact {
    
    @scala.inline
    def apply(): Compact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compact]
    }
    
    @scala.inline
    implicit class CompactMutableBuilder[Self <: Compact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setCustomAttribution(value: String | js.Array[String]): Self = StObject.set(x, "customAttribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributionUndefined: Self = StObject.set(x, "customAttribution", js.undefined)
      
      @scala.inline
      def setCustomAttributionVarargs(value: String*): Self = StObject.set(x, "customAttribution", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: Uint8Array | Uint8ClampedArray = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: Uint8Array | Uint8ClampedArray, height: Double, width: Double): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array | Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Diff extends StObject {
    
    var diff: js.UndefOr[Boolean] = js.native
    
    var localIdeographFontFamily: js.UndefOr[String] = js.native
  }
  object Diff {
    
    @scala.inline
    def apply(): Diff = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diff]
    }
    
    @scala.inline
    implicit class DiffMutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      @scala.inline
      def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
    }
  }
  
  @js.native
  trait FailIfMajorPerformanceCaveat extends StObject {
    
    var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
  }
  object FailIfMajorPerformanceCaveat {
    
    @scala.inline
    def apply(): FailIfMajorPerformanceCaveat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailIfMajorPerformanceCaveat]
    }
    
    @scala.inline
    implicit class FailIfMajorPerformanceCaveatMutableBuilder[Self <: FailIfMajorPerformanceCaveat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    }
  }
  
  @js.native
  trait FitBoundsOptions extends StObject {
    
    var fitBoundsOptions: js.UndefOr[typings.mapboxGl.mod.FitBoundsOptions] = js.native
    
    var positionOptions: js.UndefOr[PositionOptions] = js.native
    
    var showAccuracyCircle: js.UndefOr[Boolean] = js.native
    
    var showUserLocation: js.UndefOr[Boolean] = js.native
    
    var trackUserLocation: js.UndefOr[Boolean] = js.native
  }
  object FitBoundsOptions {
    
    @scala.inline
    def apply(): FitBoundsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitBoundsOptions]
    }
    
    @scala.inline
    implicit class FitBoundsOptionsMutableBuilder[Self <: FitBoundsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFitBoundsOptions(value: typings.mapboxGl.mod.FitBoundsOptions): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
      
      @scala.inline
      def setPositionOptions(value: PositionOptions): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
      
      @scala.inline
      def setShowAccuracyCircle(value: Boolean): Self = StObject.set(x, "showAccuracyCircle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAccuracyCircleUndefined: Self = StObject.set(x, "showAccuracyCircle", js.undefined)
      
      @scala.inline
      def setShowUserLocation(value: Boolean): Self = StObject.set(x, "showUserLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUserLocationUndefined: Self = StObject.set(x, "showUserLocation", js.undefined)
      
      @scala.inline
      def setTrackUserLocation(value: Boolean): Self = StObject.set(x, "trackUserLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUserLocationUndefined: Self = StObject.set(x, "trackUserLocation", js.undefined)
    }
  }
  
  @js.native
  trait Lat extends _LngLatLike {
    
    var lat: Double = js.native
    
    var lng: Double = js.native
  }
  object Lat {
    
    @scala.inline
    def apply(lat: Double, lng: Double): Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lat]
    }
    
    @scala.inline
    implicit class LatMutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lon extends _LngLatLike {
    
    var lat: Double = js.native
    
    var lon: Double = js.native
  }
  object Lon {
    
    @scala.inline
    def apply(lat: Double, lon: Double): Lon = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lon]
    }
    
    @scala.inline
    implicit class LonMutableBuilder[Self <: Lon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaxWidth extends StObject {
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var unit: js.UndefOr[String] = js.native
  }
  object MaxWidth {
    
    @scala.inline
    def apply(): MaxWidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxWidth]
    }
    
    @scala.inline
    implicit class MaxWidthMutableBuilder[Self <: MaxWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait PixelRatio extends StObject {
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var sdf: js.UndefOr[Boolean] = js.native
  }
  object PixelRatio {
    
    @scala.inline
    def apply(): PixelRatio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PixelRatio]
    }
    
    @scala.inline
    implicit class PixelRatioMutableBuilder[Self <: PixelRatio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setSdf(value: Boolean): Self = StObject.set(x, "sdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdfUndefined: Self = StObject.set(x, "sdf", js.undefined)
    }
  }
  
  @js.native
  trait ShowCompass extends StObject {
    
    var showCompass: js.UndefOr[Boolean] = js.native
    
    var showZoom: js.UndefOr[Boolean] = js.native
    
    var visualizePitch: js.UndefOr[Boolean] = js.native
  }
  object ShowCompass {
    
    @scala.inline
    def apply(): ShowCompass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowCompass]
    }
    
    @scala.inline
    implicit class ShowCompassMutableBuilder[Self <: ShowCompass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowCompass(value: Boolean): Self = StObject.set(x, "showCompass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCompassUndefined: Self = StObject.set(x, "showCompass", js.undefined)
      
      @scala.inline
      def setShowZoom(value: Boolean): Self = StObject.set(x, "showZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowZoomUndefined: Self = StObject.set(x, "showZoom", js.undefined)
      
      @scala.inline
      def setVisualizePitch(value: Boolean): Self = StObject.set(x, "visualizePitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisualizePitchUndefined: Self = StObject.set(x, "visualizePitch", js.undefined)
    }
  }
  
  /* Inlined {  layers :std.Array<string> | undefined,   filter :std.Array<any> | undefined} & mapbox-gl.mapbox-gl.FilterOptions */
  @js.native
  trait layersArraystringundefine extends StObject {
    
    var filter: js.UndefOr[js.Array[_]] = js.native
    
    var layers: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Whether to check if the filter conforms to the Mapbox GL Style Specification.
      * Disabling validation is a performance optimization that should only be used
      * if you have previously validated the values you will be passing to this function.
      */
    var validate: js.UndefOr[Boolean | Null] = js.native
  }
  object layersArraystringundefine {
    
    @scala.inline
    def apply(): layersArraystringundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[layersArraystringundefine]
    }
    
    @scala.inline
    implicit class layersArraystringundefineMutableBuilder[Self <: layersArraystringundefine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Array[_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateNull: Self = StObject.set(x, "validate", null)
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  /* Inlined {  sourceLayer :string | undefined,   filter :std.Array<any> | undefined} & mapbox-gl.mapbox-gl.FilterOptions */
  @js.native
  trait sourceLayerstringundefine extends StObject {
    
    var filter: js.UndefOr[js.Array[_]] = js.native
    
    var sourceLayer: js.UndefOr[String] = js.native
    
    /**
      * Whether to check if the filter conforms to the Mapbox GL Style Specification.
      * Disabling validation is a performance optimization that should only be used
      * if you have previously validated the values you will be passing to this function.
      */
    var validate: js.UndefOr[Boolean | Null] = js.native
  }
  object sourceLayerstringundefine {
    
    @scala.inline
    def apply(): sourceLayerstringundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[sourceLayerstringundefine]
    }
    
    @scala.inline
    implicit class sourceLayerstringundefineMutableBuilder[Self <: sourceLayerstringundefine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Array[_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setSourceLayer(value: String): Self = StObject.set(x, "sourceLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLayerUndefined: Self = StObject.set(x, "sourceLayer", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateNull: Self = StObject.set(x, "validate", null)
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}

package typings.mapboxMapboxGlGeocoder

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.mapboxGl.anon.FailIfMajorPerformanceCaveat
import typings.mapboxGl.mod.LngLat
import typings.mapboxGl.mod.LngLatBounds
import typings.mapboxGl.mod.LngLatBoundsLike
import typings.mapboxGl.mod.LngLatLike
import typings.mapboxGl.mod.Map
import typings.mapboxGl.mod.MercatorCoordinate
import typings.mapboxGl.mod.PluginStatus
import typings.mapboxGl.mod.Point
import typings.mapboxGl.mod.PointLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofLngLat
    extends StObject
       with Instantiable2[/* lng */ Double, /* lat */ Double, LngLat] {
    
    def convert(input: LngLatLike): LngLat = js.native
  }
  
  @js.native
  trait TypeofLngLatBounds
    extends StObject
       with Instantiable0[LngLatBounds] {
    
    /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
    def convert(input: LngLatBoundsLike): LngLatBounds = js.native
  }
  
  @js.native
  trait TypeofMercatorCoordinate
    extends StObject
       with Instantiable2[/* x */ Double, /* y */ Double, MercatorCoordinate] {
    
    /** Project a LngLat to a MercatorCoordinate. */
    def fromLngLat(lngLatLike: LngLatLike): MercatorCoordinate = js.native
    def fromLngLat(lngLatLike: LngLatLike, altitude: Double): MercatorCoordinate = js.native
  }
  
  @js.native
  trait TypeofPoint
    extends StObject
       with Instantiable2[/* x */ Double, /* y */ Double, Point] {
    
    def convert(a: PointLike): Point = js.native
  }
  
  @js.native
  trait Typeofmapboxgl extends StObject {
    
    var AttributionControl: Instantiable0[typings.mapboxGl.mod.AttributionControl] = js.native
    
    var BoxZoomHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.BoxZoomHandler] = js.native
    
    var CanvasSource: Instantiable0[typings.mapboxGl.mod.CanvasSource] = js.native
    
    var Control: Instantiable0[typings.mapboxGl.mod.Control] = js.native
    
    var DoubleClickZoomHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.DoubleClickZoomHandler] = js.native
    
    var DragPanHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.DragPanHandler] = js.native
    
    var DragRotateHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.DragRotateHandler] = js.native
    
    var ErrorEvent: Instantiable0[typings.mapboxGl.mod.ErrorEvent] = js.native
    
    var Evented: Instantiable0[typings.mapboxGl.mod.Evented] = js.native
    
    var FreeCameraOptions: Instantiable0[typings.mapboxGl.mod.FreeCameraOptions] = js.native
    
    var FullscreenControl: Instantiable0[typings.mapboxGl.mod.FullscreenControl] = js.native
    
    var GeoJSONSource: Instantiable0[typings.mapboxGl.mod.GeoJSONSource] = js.native
    
    var GeolocateControl: Instantiable0[typings.mapboxGl.mod.GeolocateControl] = js.native
    
    var ImageSource: Instantiable0[typings.mapboxGl.mod.ImageSource] = js.native
    
    var KeyboardHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.KeyboardHandler] = js.native
    
    var LngLat: TypeofLngLat = js.native
    
    var LngLatBounds: TypeofLngLatBounds = js.native
    
    var Map: Instantiable0[typings.mapboxGl.mod.Map] = js.native
    
    var MapMouseEvent: Instantiable0[typings.mapboxGl.mod.MapMouseEvent] = js.native
    
    var MapTouchEvent: Instantiable0[typings.mapboxGl.mod.MapTouchEvent] = js.native
    
    var MapWheelEvent: Instantiable0[typings.mapboxGl.mod.MapWheelEvent] = js.native
    
    var MapboxEvent: Instantiable0[typings.mapboxGl.mod.MapboxEvent[js.Object]] = js.native
    
    var Marker: Instantiable0[typings.mapboxGl.mod.Marker] = js.native
    
    var MercatorCoordinate: TypeofMercatorCoordinate = js.native
    
    var NavigationControl: Instantiable0[typings.mapboxGl.mod.NavigationControl] = js.native
    
    var Point: TypeofPoint = js.native
    
    var Popup: Instantiable0[typings.mapboxGl.mod.Popup] = js.native
    
    var PositionOptions: Instantiable0[typings.mapboxGl.mod.PositionOptions] = js.native
    
    var ScaleControl: Instantiable0[typings.mapboxGl.mod.ScaleControl] = js.native
    
    var ScrollZoomHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.ScrollZoomHandler] = js.native
    
    var TouchPitchHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.TouchPitchHandler] = js.native
    
    var TouchZoomRotateHandler: Instantiable1[/* map */ Map, typings.mapboxGl.mod.TouchZoomRotateHandler] = js.native
    
    var VideoSource: Instantiable0[typings.mapboxGl.mod.VideoSource] = js.native
    
    var accessToken: String = js.native
    
    var baseApiUrl: String = js.native
    
    def clearPrewarmedResources(): Unit = js.native
    
    def clearStorage(): Unit = js.native
    def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def getRTLTextPluginStatus(): PluginStatus = js.native
    
    /**
      * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
      * 16 by default.
      */
    var maxParallelImageRequests: Double = js.native
    
    def prewarm(): Unit = js.native
    
    def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit], deferred: Boolean): Unit = js.native
    
    def supported(): Boolean = js.native
    def supported(options: FailIfMajorPerformanceCaveat): Boolean = js.native
    
    var version: String = js.native
    
    /**
      * Number of web workers instantiated on a page with GL JS maps.
      * By default, it is set to half the number of CPU cores (capped at 6).
      */
    var workerCount: Double = js.native
  }
}

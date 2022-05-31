package typings.mapboxGl

import typings.mapboxGl.anon.BearingSnap
import typings.mapboxGl.anon.Compact
import typings.mapboxGl.anon.FailIfMajorPerformanceCaveat
import typings.mapboxGl.anon.FitBoundsOptions
import typings.mapboxGl.anon.MaxWidth
import typings.mapboxGl.anon.ShowCompass
import typings.mapboxGl.mod.FullscreenControlOptions
import typings.mapboxGl.mod.GeoJSONSourceOptions
import typings.mapboxGl.mod.ImageSourceOptions
import typings.mapboxGl.mod.LngLatBoundsLike
import typings.mapboxGl.mod.LngLatLike
import typings.mapboxGl.mod.MapboxOptions
import typings.mapboxGl.mod.MarkerOptions
import typings.mapboxGl.mod.PluginStatus
import typings.mapboxGl.mod.PointLike
import typings.mapboxGl.mod.PopupOptions
import typings.mapboxGl.mod.VideoSourceOptions
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mapboxgl {
    
    @JSGlobal("mapboxgl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("mapboxgl.AttributionControl")
    @js.native
    class AttributionControl ()
      extends typings.mapboxGl.mod.AttributionControl {
      def this(options: Compact) = this()
    }
    
    @JSGlobal("mapboxgl.BoxZoomHandler")
    @js.native
    class BoxZoomHandler protected ()
      extends typings.mapboxGl.mod.BoxZoomHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.CanvasSource")
    @js.native
    class CanvasSource ()
      extends typings.mapboxGl.mod.CanvasSource
    
    @JSGlobal("mapboxgl.Control")
    @js.native
    class Control ()
      extends typings.mapboxGl.mod.Control
    
    @JSGlobal("mapboxgl.DoubleClickZoomHandler")
    @js.native
    class DoubleClickZoomHandler protected ()
      extends typings.mapboxGl.mod.DoubleClickZoomHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.DragPanHandler")
    @js.native
    class DragPanHandler protected ()
      extends typings.mapboxGl.mod.DragPanHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.DragRotateHandler")
    @js.native
    class DragRotateHandler protected ()
      extends typings.mapboxGl.mod.DragRotateHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
      def this(map: typings.mapboxGl.mod.Map, options: BearingSnap) = this()
    }
    
    @JSGlobal("mapboxgl.ErrorEvent")
    @js.native
    class ErrorEvent ()
      extends typings.mapboxGl.mod.ErrorEvent
    
    @JSGlobal("mapboxgl.Evented")
    @js.native
    class Evented ()
      extends typings.mapboxGl.mod.Evented
    
    @JSGlobal("mapboxgl.FullscreenControl")
    @js.native
    class FullscreenControl ()
      extends typings.mapboxGl.mod.FullscreenControl {
      def this(options: FullscreenControlOptions) = this()
    }
    
    @JSGlobal("mapboxgl.GeoJSONSource")
    @js.native
    class GeoJSONSource ()
      extends typings.mapboxGl.mod.GeoJSONSource {
      def this(options: GeoJSONSourceOptions) = this()
    }
    
    @JSGlobal("mapboxgl.GeolocateControl")
    @js.native
    class GeolocateControl ()
      extends typings.mapboxGl.mod.GeolocateControl {
      def this(options: FitBoundsOptions) = this()
    }
    
    @JSGlobal("mapboxgl.ImageSource")
    @js.native
    class ImageSource ()
      extends typings.mapboxGl.mod.ImageSource {
      def this(options: ImageSourceOptions) = this()
    }
    
    @JSGlobal("mapboxgl.KeyboardHandler")
    @js.native
    class KeyboardHandler protected ()
      extends typings.mapboxGl.mod.KeyboardHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.LngLat")
    @js.native
    class LngLat protected ()
      extends typings.mapboxGl.mod.LngLat {
      def this(lng: Double, lat: Double) = this()
    }
    /* static members */
    object LngLat {
      
      @JSGlobal("mapboxgl.LngLat")
      @js.native
      val ^ : js.Any = js.native
      
      inline def convert(input: LngLatLike): typings.mapboxGl.mod.LngLat = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[typings.mapboxGl.mod.LngLat]
    }
    
    @JSGlobal("mapboxgl.LngLatBounds")
    @js.native
    class LngLatBounds ()
      extends typings.mapboxGl.mod.LngLatBounds {
      def this(boundsLike: js.Tuple2[LngLatLike, LngLatLike]) = this()
      def this(boundsLike: js.Tuple4[Double, Double, Double, Double]) = this()
      def this(sw: LngLatLike, ne: LngLatLike) = this()
    }
    /* static members */
    object LngLatBounds {
      
      @JSGlobal("mapboxgl.LngLatBounds")
      @js.native
      val ^ : js.Any = js.native
      
      /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
      inline def convert(input: LngLatBoundsLike): typings.mapboxGl.mod.LngLatBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[typings.mapboxGl.mod.LngLatBounds]
    }
    
    @JSGlobal("mapboxgl.Map")
    @js.native
    class Map ()
      extends typings.mapboxGl.mod.Map {
      def this(options: MapboxOptions) = this()
    }
    
    @JSGlobal("mapboxgl.MapMouseEvent")
    @js.native
    class MapMouseEvent ()
      extends typings.mapboxGl.mod.MapMouseEvent
    
    @JSGlobal("mapboxgl.MapTouchEvent")
    @js.native
    class MapTouchEvent ()
      extends typings.mapboxGl.mod.MapTouchEvent
    
    @JSGlobal("mapboxgl.MapWheelEvent")
    @js.native
    class MapWheelEvent ()
      extends typings.mapboxGl.mod.MapWheelEvent
    
    @JSGlobal("mapboxgl.MapboxEvent")
    @js.native
    class MapboxEvent[TOrig] ()
      extends typings.mapboxGl.mod.MapboxEvent[TOrig]
    
    @JSGlobal("mapboxgl.Marker")
    @js.native
    class Marker ()
      extends typings.mapboxGl.mod.Marker {
      def this(element: HTMLElement) = this()
      def this(options: MarkerOptions) = this()
      def this(element: Unit, options: MarkerOptions) = this()
      def this(element: HTMLElement, options: MarkerOptions) = this()
    }
    
    @JSGlobal("mapboxgl.MercatorCoordinate")
    @js.native
    class MercatorCoordinate protected ()
      extends typings.mapboxGl.mod.MercatorCoordinate {
      def this(x: Double, y: Double) = this()
      def this(x: Double, y: Double, z: Double) = this()
    }
    /* static members */
    object MercatorCoordinate {
      
      @JSGlobal("mapboxgl.MercatorCoordinate")
      @js.native
      val ^ : js.Any = js.native
      
      /** Project a LngLat to a MercatorCoordinate. */
      inline def fromLngLat(lngLatLike: LngLatLike): typings.mapboxGl.mod.MercatorCoordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any]).asInstanceOf[typings.mapboxGl.mod.MercatorCoordinate]
      inline def fromLngLat(lngLatLike: LngLatLike, altitude: Double): typings.mapboxGl.mod.MercatorCoordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typings.mapboxGl.mod.MercatorCoordinate]
    }
    
    @JSGlobal("mapboxgl.NavigationControl")
    @js.native
    class NavigationControl ()
      extends typings.mapboxGl.mod.NavigationControl {
      def this(options: ShowCompass) = this()
    }
    
    @JSGlobal("mapboxgl.Point")
    @js.native
    class Point protected ()
      extends typings.mapboxGl.mod.Point {
      def this(x: Double, y: Double) = this()
    }
    /* static members */
    object Point {
      
      @JSGlobal("mapboxgl.Point")
      @js.native
      val ^ : js.Any = js.native
      
      inline def convert(a: PointLike): typings.mapboxGl.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(a.asInstanceOf[js.Any]).asInstanceOf[typings.mapboxGl.mod.Point]
    }
    
    @JSGlobal("mapboxgl.Popup")
    @js.native
    class Popup ()
      extends typings.mapboxGl.mod.Popup {
      def this(options: PopupOptions) = this()
    }
    
    @JSGlobal("mapboxgl.PositionOptions")
    @js.native
    class PositionOptions ()
      extends typings.mapboxGl.mod.PositionOptions
    
    @JSGlobal("mapboxgl.ScaleControl")
    @js.native
    class ScaleControl ()
      extends typings.mapboxGl.mod.ScaleControl {
      def this(options: MaxWidth) = this()
    }
    
    @JSGlobal("mapboxgl.ScrollZoomHandler")
    @js.native
    class ScrollZoomHandler protected ()
      extends typings.mapboxGl.mod.ScrollZoomHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.TouchPitchHandler")
    @js.native
    class TouchPitchHandler protected ()
      extends typings.mapboxGl.mod.TouchPitchHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.TouchZoomRotateHandler")
    @js.native
    class TouchZoomRotateHandler protected ()
      extends typings.mapboxGl.mod.TouchZoomRotateHandler {
      def this(map: typings.mapboxGl.mod.Map) = this()
    }
    
    @JSGlobal("mapboxgl.VideoSource")
    @js.native
    class VideoSource ()
      extends typings.mapboxGl.mod.VideoSource {
      def this(options: VideoSourceOptions) = this()
    }
    
    @JSGlobal("mapboxgl.accessToken")
    @js.native
    def accessToken: String = js.native
    inline def accessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])
    
    @JSGlobal("mapboxgl.baseApiUrl")
    @js.native
    def baseApiUrl: String = js.native
    inline def baseApiUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(x.asInstanceOf[js.Any])
    
    inline def clearPrewarmedResources(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[Unit]
    
    inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
    inline def clearStorage(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getRTLTextPluginStatus(): PluginStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[PluginStatus]
    
    /**
      * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
      * 16 by default.
      */
    @JSGlobal("mapboxgl.maxParallelImageRequests")
    @js.native
    def maxParallelImageRequests: Double = js.native
    inline def maxParallelImageRequests_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])
    
    inline def prewarm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[Unit]
    
    inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ Error, Unit], deferred: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]
    inline def supported(options: FailIfMajorPerformanceCaveat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("mapboxgl.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    /**
      * Number of web workers instantiated on a page with GL JS maps.
      * By default, it is set to half the number of CPU cores (capped at 6).
      */
    @JSGlobal("mapboxgl.workerCount")
    @js.native
    def workerCount: Double = js.native
    inline def workerCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])
  }
}

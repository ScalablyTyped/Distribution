package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.anon.FailIfMajorPerformanceCaveat
import typings.mapboxGl.mod.^
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def accessToken: String = ^.asInstanceOf[js.Dynamic].selectDynamic("accessToken").asInstanceOf[String]
inline def accessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])

inline def baseApiUrl: String = ^.asInstanceOf[js.Dynamic].selectDynamic("baseApiUrl").asInstanceOf[String]
inline def baseApiUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(x.asInstanceOf[js.Any])

inline def clearPrewarmedResources(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[Unit]

inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
inline def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getRTLTextPluginStatus(): PluginStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[PluginStatus]

/**
  * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
  * 16 by default.
  */
inline def maxParallelImageRequests: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("maxParallelImageRequests").asInstanceOf[Double]
inline def maxParallelImageRequests_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])

inline def prewarm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[Unit]

inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit], deferred: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]
inline def supported(options: FailIfMajorPerformanceCaveat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

/**
  * Number of web workers instantiated on a page with GL JS maps.
  * By default, it is set to half the number of CPU cores (capped at 6).
  */
inline def workerCount: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("workerCount").asInstanceOf[Double]
inline def workerCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.BackgroundLayout
  - typings.mapboxGl.mod.FillLayout
  - typings.mapboxGl.mod.FillExtrusionLayout
  - typings.mapboxGl.mod.LineLayout
  - typings.mapboxGl.mod.SymbolLayout
  - typings.mapboxGl.mod.RasterLayout
  - typings.mapboxGl.mod.CircleLayout
  - typings.mapboxGl.mod.HeatmapLayout
  - typings.mapboxGl.mod.HillshadeLayout
  - typings.mapboxGl.mod.SkyLayout
*/
type AnyLayout = _AnyLayout | BackgroundLayout | FillExtrusionLayout | RasterLayout | HeatmapLayout | HillshadeLayout | SkyLayout

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.GeoJSONSourceRaw
  - typings.mapboxGl.mod.VideoSourceRaw
  - typings.mapboxGl.mod.ImageSourceRaw
  - typings.mapboxGl.mod.CanvasSourceRaw
  - typings.mapboxGl.mod.VectorSource
  - typings.mapboxGl.mod.RasterSource
  - typings.mapboxGl.mod.RasterDemSource
  - typings.mapboxGl.mod.CustomSourceInterface[typings.std.HTMLImageElement | typings.std.ImageData | typings.std.ImageBitmap]
*/
type AnySourceData = _AnySourceData | (CustomSourceInterface[HTMLImageElement | ImageData | ImageBitmap])

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.GeoJSONSource
  - typings.mapboxGl.mod.VideoSource
  - typings.mapboxGl.mod.ImageSource
  - typings.mapboxGl.mod.CanvasSource
  - typings.mapboxGl.mod.VectorSourceImpl
  - typings.mapboxGl.mod.RasterSource
  - typings.mapboxGl.mod.RasterDemSource
  - typings.mapboxGl.mod.CustomSource[typings.std.HTMLImageElement | typings.std.ImageData | typings.std.ImageBitmap]
*/
type AnySourceImpl = _AnySourceImpl | (CustomSource[HTMLImageElement | ImageData | ImageBitmap])

type BackgroundLayout = Layout

type EventData = StringDictionary[Any]

type EventedListener = js.Function1[/* object */ js.UndefOr[js.Object], Any]

type Expression = Array[ExpressionName | Any]

type ExpressionSpecification = js.Array[Any]

type FillExtrusionLayout = Layout

type HeatmapLayout = Layout

type HillshadeLayout = Layout

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.LngLatBounds
  - js.Tuple2[typings.mapboxGl.mod.LngLatLike, typings.mapboxGl.mod.LngLatLike]
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - typings.mapboxGl.mod.LngLatLike
*/
type LngLatBoundsLike = _LngLatBoundsLike | (js.Tuple2[Double | LngLatLike, Double | LngLatLike]) | (js.Tuple4[Double, Double, Double, Double])

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[scala.Double, scala.Double]
  - typings.mapboxGl.mod.LngLat
  - typings.mapboxGl.anon.Lat
  - typings.mapboxGl.anon.Lon
*/
type LngLatLike = _LngLatLike | (js.Tuple2[Double, Double])

type Offset = Double | PointLike | StringDictionary[PointLike]

type PointLike = Point | (js.Tuple2[Double, Double])

type PromoteIdSpecification = StringDictionary[String] | String

type PropertyValueSpecification[T] = T | CameraFunctionSpecification[T] | ExpressionSpecification

type RasterLayout = Layout

type SkyLayout = Layout

type Sources = StringDictionary[AnySourceData]

type TransformRequestFunction = js.Function2[/* url */ String, /* resourceType */ ResourceType, RequestParameters]

type quat = js.Array[Double]

type vec3 = js.Array[Double]

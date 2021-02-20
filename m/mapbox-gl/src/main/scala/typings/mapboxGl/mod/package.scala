package typings.mapboxGl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
  */
  type AnyLayout = typings.mapboxGl.mod._AnyLayout | typings.mapboxGl.mod.BackgroundLayout | typings.mapboxGl.mod.FillExtrusionLayout | typings.mapboxGl.mod.RasterLayout | typings.mapboxGl.mod.HeatmapLayout | typings.mapboxGl.mod.HillshadeLayout
  
  type BackgroundLayout = typings.mapboxGl.mod.Layout
  
  type EventData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Expression = Array[typings.mapboxGl.mod.ExpressionName | js.Any]
  
  type FillExtrusionLayout = typings.mapboxGl.mod.Layout
  
  type HeatmapLayout = typings.mapboxGl.mod.Layout
  
  type HillshadeLayout = typings.mapboxGl.mod.Layout
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxGl.mod.LngLatBounds
    - js.Tuple2[typings.mapboxGl.mod.LngLatLike, typings.mapboxGl.mod.LngLatLike]
    - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
    - typings.mapboxGl.mod.LngLatLike
  */
  type LngLatBoundsLike = typings.mapboxGl.mod._LngLatBoundsLike | (js.Tuple2[
    scala.Double | typings.mapboxGl.mod.LngLatLike, 
    scala.Double | typings.mapboxGl.mod.LngLatLike
  ]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  
  /* Rewritten from type alias, can be one of: 
    - js.Tuple2[scala.Double, scala.Double]
    - typings.mapboxGl.mod.LngLat
    - typings.mapboxGl.anon.Lat
    - typings.mapboxGl.anon.Lon
  */
  type LngLatLike = typings.mapboxGl.mod._LngLatLike | (js.Tuple2[scala.Double, scala.Double])
  
  type PointLike = typings.mapboxGl.mod.Point | (js.Tuple2[scala.Double, scala.Double])
  
  type PromoteIdSpecification = org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String
  
  type RasterLayout = typings.mapboxGl.mod.Layout
  
  type Sources = org.scalablytyped.runtime.StringDictionary[typings.mapboxGl.mod.AnySourceData]
  
  type TransformRequestFunction = js.Function2[
    /* url */ java.lang.String, 
    /* resourceType */ typings.mapboxGl.mod.ResourceType, 
    typings.mapboxGl.mod.RequestParameters
  ]
  
  @scala.inline
  def accessToken: java.lang.String = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("accessToken").asInstanceOf[java.lang.String]
  @scala.inline
  def accessToken_=(x: java.lang.String): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def baseApiUrl: java.lang.String = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("baseApiUrl").asInstanceOf[java.lang.String]
  @scala.inline
  def baseApiUrl_=(x: java.lang.String): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def clearPrewarmedResources(): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def clearStorage(): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[scala.Unit]
  @scala.inline
  def clearStorage(callback: js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getRTLTextPluginStatus(): typings.mapboxGl.mod.PluginStatus = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[typings.mapboxGl.mod.PluginStatus]
  
  /**
    * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
    * 16 by default.
    */
  @scala.inline
  def maxParallelImageRequests: scala.Double = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("maxParallelImageRequests").asInstanceOf[scala.Double]
  @scala.inline
  def maxParallelImageRequests_=(x: scala.Double): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def prewarm(): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def setRTLTextPlugin(pluginURL: java.lang.String, callback: js.Function1[/* error */ typings.std.Error, scala.Unit]): scala.Unit = (typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setRTLTextPlugin(
    pluginURL: java.lang.String,
    callback: js.Function1[/* error */ typings.std.Error, scala.Unit],
    deferred: scala.Boolean
  ): scala.Unit = (typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def supported(): scala.Boolean = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[scala.Boolean]
  @scala.inline
  def supported(options: typings.mapboxGl.anon.FailIfMajorPerformanceCaveat): scala.Boolean = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def version: java.lang.String = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  /**
    * Number of web workers instantiated on a page with GL JS maps.
    * By default, it is set to half the number of CPU cores (capped at 6).
    */
  @scala.inline
  def workerCount: scala.Double = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("workerCount").asInstanceOf[scala.Double]
  @scala.inline
  def workerCount_=(x: scala.Double): scala.Unit = typings.mapboxGl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])
}

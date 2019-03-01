package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONOptions[P] extends LayerOptions {
  /**
    * A Function that will be used for converting GeoJSON coordinates to LatLngs.
    * The default is the coordsToLatLng static method.
    */
  var coordsToLatLng: js.UndefOr[
    js.Function1[
      /* coords */ (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]), 
      LatLng
    ]
  ] = js.undefined
  /**
    * A Function that will be used to decide whether to show a feature or not.
    *
    * The default is to show all features:
    *
    * ```
    * function (geoJsonFeature) {
    *     return true;
    * }
    * ```
    */
  var filter: js.UndefOr[
    js.Function1[
      /* geoJsonFeature */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * A Function that will be called once for each created Feature, after it
    * has been created and styled. Useful for attaching events and popups to features.
    *
    * The default is to do nothing with the newly created layers:
    *
    * ```
    * function (feature, layer) {}
    * ```
    */
  var onEachFeature: js.UndefOr[
    js.Function2[
      /* feature */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P], 
      /* layer */ Layer, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A Function defining how GeoJSON points spawn Leaflet layers.
    * It is internally called when data is added, passing the GeoJSON point
    * feature and its LatLng.
    *
    * The default is to spawn a default Marker:
    *
    * ```
    * function(geoJsonPoint, latlng) {
    *     return L.marker(latlng);
    * }
    * ```
    */
  var pointToLayer: js.UndefOr[
    js.Function2[
      /* geoJsonPoint */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P], 
      /* latlng */ LatLng, 
      Layer
    ]
  ] = js.undefined
   // should import GeoJSON typings
  /**
    * PathOptions or a Function defining the Path options for styling GeoJSON lines and polygons,
    * called internally when data is added.
    *
    * The default value is to not override any defaults:
    *
    * ```
    * function (geoJsonFeature) {
    *     return {}
    * }
    * ```
    */
  var style: js.UndefOr[PathOptions | StyleFunction[P]] = js.undefined
}

object GeoJSONOptions {
  @scala.inline
  def apply[P](
    attribution: java.lang.String = null,
    coordsToLatLng: js.Function1[
      /* coords */ (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]), 
      LatLng
    ] = null,
    filter: js.Function1[
      /* geoJsonFeature */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P], 
      scala.Boolean
    ] = null,
    onEachFeature: js.Function2[
      /* feature */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P], 
      /* layer */ Layer, 
      scala.Unit
    ] = null,
    pane: java.lang.String = null,
    pointToLayer: js.Function2[
      /* geoJsonPoint */ geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P], 
      /* latlng */ LatLng, 
      Layer
    ] = null,
    style: PathOptions | StyleFunction[P] = null
  ): GeoJSONOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (coordsToLatLng != null) __obj.updateDynamic("coordsToLatLng")(coordsToLatLng)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (onEachFeature != null) __obj.updateDynamic("onEachFeature")(onEachFeature)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (pointToLayer != null) __obj.updateDynamic("pointToLayer")(pointToLayer)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONOptions[P]]
  }
}


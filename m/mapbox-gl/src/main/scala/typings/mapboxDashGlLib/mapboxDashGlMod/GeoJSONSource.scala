package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "GeoJSONSource")
@js.native
class GeoJSONSource ()
  extends GeoJSONSourceRaw
     with AnySourceImpl {
  def this(options: GeoJSONSourceOptions) = this()
  /* CompleteClass */
  override var `type`: mapboxDashGlLib.mapboxDashGlLibStrings.vector | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem` | mapboxDashGlLib.mapboxDashGlLibStrings.geojson | mapboxDashGlLib.mapboxDashGlLibStrings.image | mapboxDashGlLib.mapboxDashGlLibStrings.video | mapboxDashGlLib.mapboxDashGlLibStrings.canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_GeoJSONSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.geojson = js.native
  def getClusterChildren(
    clusterId: scala.Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[
        geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
      ], 
      scala.Unit
    ]
  ): this.type = js.native
  def getClusterExpansionZoom(
    clusterId: scala.Double,
    callback: js.Function2[/* error */ js.Any, /* zoom */ scala.Double, scala.Unit]
  ): this.type = js.native
  def getClusterLeaves(
    cluserId: scala.Double,
    limit: scala.Double,
    offset: scala.Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[
        geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
      ], 
      scala.Unit
    ]
  ): this.type = js.native
  def setData(
    data: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ): this.type = js.native
  def setData(
    data: geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ): this.type = js.native
  def setData(data: java.lang.String): this.type = js.native
}


package typings.mapboxDashGl.mapboxDashGlMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import typings.mapboxDashGl.mapboxDashGlStrings.`raster-dem`
import typings.mapboxDashGl.mapboxDashGlStrings.canvas
import typings.mapboxDashGl.mapboxDashGlStrings.geojson
import typings.mapboxDashGl.mapboxDashGlStrings.image
import typings.mapboxDashGl.mapboxDashGlStrings.raster
import typings.mapboxDashGl.mapboxDashGlStrings.vector
import typings.mapboxDashGl.mapboxDashGlStrings.video
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
  override var `type`: vector | raster | `raster-dem` | geojson | image | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_GeoJSONSourceRaw: geojson = js.native
  def getClusterChildren(
    clusterId: Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], 
      Unit
    ]
  ): this.type = js.native
  def getClusterExpansionZoom(clusterId: Double, callback: js.Function2[/* error */ js.Any, /* zoom */ Double, Unit]): this.type = js.native
  def getClusterLeaves(
    cluserId: Double,
    limit: Double,
    offset: Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], 
      Unit
    ]
  ): this.type = js.native
  def setData(data: String): this.type = js.native
  def setData(data: Feature[Geometry, GeoJsonProperties]): this.type = js.native
  def setData(data: FeatureCollection[Geometry, GeoJsonProperties]): this.type = js.native
}


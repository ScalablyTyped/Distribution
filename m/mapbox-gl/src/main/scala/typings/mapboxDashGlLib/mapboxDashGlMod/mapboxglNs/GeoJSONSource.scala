package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONSource extends GeoJSONSourceRaw {
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


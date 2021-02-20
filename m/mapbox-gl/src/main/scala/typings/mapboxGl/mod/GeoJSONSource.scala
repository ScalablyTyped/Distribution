package typings.mapboxGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "GeoJSONSource")
@js.native
class GeoJSONSource ()
  extends GeoJSONSourceRaw
     with AnySourceImpl {
  def this(options: GeoJSONSourceOptions) = this()
  
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

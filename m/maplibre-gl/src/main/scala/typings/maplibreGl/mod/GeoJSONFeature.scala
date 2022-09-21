package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.Geometry
import typings.mapboxVectorTile.mod.VectorTileFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "GeoJSONFeature")
@js.native
open class GeoJSONFeature protected () extends StObject {
  def this(vectorTileFeature: VectorTileFeature, z: Double, x: Double, y: Double) = this()
  def this(vectorTileFeature: VectorTileFeature, z: Double, x: Double, y: Double, id: String) = this()
  def this(vectorTileFeature: VectorTileFeature, z: Double, x: Double, y: Double, id: Double) = this()
  
  var _geometry: Geometry = js.native
  
  var _vectorTileFeature: VectorTileFeature = js.native
  
  def geometry: Geometry = js.native
  def geometry_=(g: Geometry): scala.Unit = js.native
  
  var id: js.UndefOr[Double | String] = js.native
  
  var properties: StringDictionary[Any] = js.native
  
  def toJSON(): Any = js.native
  
  var `type`: typings.maplibreGl.maplibreGlStrings.Feature = js.native
}

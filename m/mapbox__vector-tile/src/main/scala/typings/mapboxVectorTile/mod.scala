package typings.mapboxVectorTile

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxVectorTile.mapboxVectorTileNumbers.`1`
import typings.mapboxVectorTile.mapboxVectorTileNumbers.`2`
import typings.mapboxVectorTile.mapboxVectorTileNumbers.`3`
import typings.mapboxVectorTile.mapboxVectorTileStrings.LineString
import typings.mapboxVectorTile.mapboxVectorTileStrings.Point
import typings.mapboxVectorTile.mapboxVectorTileStrings.Polygon
import typings.mapboxVectorTile.mapboxVectorTileStrings.Unknown
import typings.pbf.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/vector-tile", "VectorTile")
  @js.native
  open class VectorTile protected () extends StObject {
    def this(pbf: ^) = this()
    
    var layers: StringDictionary[VectorTileLayer] = js.native
  }
  
  @JSImport("@mapbox/vector-tile", "VectorTileFeature")
  @js.native
  open class VectorTileFeature () extends StObject {
    
    var bbox: js.UndefOr[js.Function0[js.Tuple4[Double, Double, Double, Double]]] = js.native
    
    var extent: Double = js.native
    
    var id: Double = js.native
    
    def loadGeometry(): js.Array[js.Array[typings.mapboxPointGeometry.mod.^]] = js.native
    
    var properties: StringDictionary[String | Double | Boolean] = js.native
    
    def toGeoJSON(x: Double, y: Double, z: Double): Feature[Geometry, GeoJsonProperties] = js.native
    
    var `type`: `1` | `2` | `3` = js.native
  }
  /* static members */
  object VectorTileFeature {
    
    @JSImport("@mapbox/vector-tile", "VectorTileFeature")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mapbox/vector-tile", "VectorTileFeature.types")
    @js.native
    def types: js.Tuple4[Unknown, Point, LineString, Polygon] = js.native
    inline def types_=(x: js.Tuple4[Unknown, Point, LineString, Polygon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@mapbox/vector-tile", "VectorTileLayer")
  @js.native
  open class VectorTileLayer protected () extends StObject {
    def this(pbf: ^) = this()
    
    var extent: Double = js.native
    
    def feature(featureIndex: Double): VectorTileFeature = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}

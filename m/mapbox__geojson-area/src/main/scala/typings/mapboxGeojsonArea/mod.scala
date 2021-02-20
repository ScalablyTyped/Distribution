package typings.mapboxGeojsonArea

import typings.geojson.mod.Geometry
import typings.geojson.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/geojson-area", "geometry")
  @js.native
  def geometry(geo: Geometry): Double = js.native
  
  @JSImport("@mapbox/geojson-area", "ring")
  @js.native
  def ring(coordinates: js.Array[Position]): Double = js.native
}

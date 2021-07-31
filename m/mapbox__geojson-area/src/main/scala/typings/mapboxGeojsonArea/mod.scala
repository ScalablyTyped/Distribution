package typings.mapboxGeojsonArea

import typings.geojson.mod.Geometry
import typings.geojson.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/geojson-area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def geometry(geo: Geometry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geometry")(geo.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def ring(coordinates: js.Array[Position]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ring")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Double]
}

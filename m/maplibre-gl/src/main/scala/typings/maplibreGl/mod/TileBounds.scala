package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TileBounds")
@js.native
open class TileBounds protected () extends StObject {
  def this(bounds: js.Tuple4[Double, Double, Double, Double]) = this()
  def this(bounds: js.Tuple4[Double, Double, Double, Double], minzoom: Double) = this()
  def this(bounds: js.Tuple4[Double, Double, Double, Double], minzoom: Double, maxzoom: Double) = this()
  def this(bounds: js.Tuple4[Double, Double, Double, Double], minzoom: Null, maxzoom: Double) = this()
  def this(bounds: js.Tuple4[Double, Double, Double, Double], minzoom: scala.Unit, maxzoom: Double) = this()
  
  var bounds: LngLatBounds = js.native
  
  def contains(tileID: CanonicalTileID): Boolean = js.native
  
  var maxzoom: Double = js.native
  
  var minzoom: Double = js.native
  
  def validateBounds(bounds: js.Tuple4[Double, Double, Double, Double]): LngLatBoundsLike = js.native
}

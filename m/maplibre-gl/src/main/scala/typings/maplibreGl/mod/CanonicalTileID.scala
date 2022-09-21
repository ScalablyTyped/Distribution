package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CanonicalTileID")
@js.native
open class CanonicalTileID protected () extends StObject {
  def this(z: Double, x: Double, y: Double) = this()
  
  def equals(id: CanonicalTileID): Boolean = js.native
  
  def getTilePoint(coord: MercatorCoordinate): ^ = js.native
  
  def isChildOf(parent: CanonicalTileID): Boolean = js.native
  
  var key: String = js.native
  
  def url(urls: js.Array[String], pixelRatio: Double): String = js.native
  def url(urls: js.Array[String], pixelRatio: Double, scheme: String): String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}

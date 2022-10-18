package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanonicalTileID extends StObject {
  
  def equals(id: CanonicalTileID): Boolean = js.native
  
  def getTilePoint(coord: MercatorCoordinate): typings.mapboxPointGeometry.mod.^ = js.native
  
  def isChildOf(parent: CanonicalTileID): Boolean = js.native
  
  var key: String = js.native
  
  def url(urls: js.Array[String], pixelRatio: Double): String = js.native
  def url(urls: js.Array[String], pixelRatio: Double, scheme: String): String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}

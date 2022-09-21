package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "OverscaledTileID")
@js.native
open class OverscaledTileID protected () extends StObject {
  def this(overscaledZ: Double, wrap: Double, z: Double, x: Double, y: Double) = this()
  
  def calculateScaledKey(targetZ: Double, withWrap: Boolean): String = js.native
  
  var canonical: CanonicalTileID = js.native
  
  def children(sourceMaxZoom: Double): js.Array[OverscaledTileID] = js.native
  
  def equals(id: OverscaledTileID): Boolean = js.native
  
  def getTilePoint(coord: MercatorCoordinate): ^ = js.native
  
  def isChildOf(parent: OverscaledTileID): Boolean = js.native
  
  def isLessThan(rhs: OverscaledTileID): Boolean = js.native
  
  var key: String = js.native
  
  def overscaleFactor(): Double = js.native
  
  var overscaledZ: Double = js.native
  
  var posMatrix: mat4 = js.native
  
  def scaledTo(targetZ: Double): OverscaledTileID = js.native
  
  def toUnwrapped(): UnwrappedTileID = js.native
  
  def unwrapTo(wrap: Double): OverscaledTileID = js.native
  
  var wrap: Double = js.native
  
  def wrapped(): OverscaledTileID = js.native
}

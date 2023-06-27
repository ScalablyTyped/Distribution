package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICanonicalTileID extends StObject {
  
  def equals(id: ICanonicalTileID): js.Object = js.native
  
  def getTilePoint(coord: IMercatorCoordinate): js.Object = js.native
  
  def isChildOf(parent: ICanonicalTileID): js.Object = js.native
  
  var key: String = js.native
  
  def url(urls: js.Array[String], pixelRatio: Double): js.Object = js.native
  def url(urls: js.Array[String], pixelRatio: Double, scheme: String): js.Object = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}

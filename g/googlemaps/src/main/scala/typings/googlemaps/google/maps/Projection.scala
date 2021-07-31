package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends StObject {
  
  def fromLatLngToPoint(latLng: LatLng): Point = js.native
  def fromLatLngToPoint(latLng: LatLng, point: Point): Point = js.native
  
  def fromPointToLatLng(pixel: Point): LatLng = js.native
  def fromPointToLatLng(pixel: Point, noWrap: Boolean): LatLng = js.native
}

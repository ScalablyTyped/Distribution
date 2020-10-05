package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.MVCObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBox extends MVCObject {
  def getBounds(): LatLngBounds = js.native
  def getPlaces(): js.Array[PlaceResult] = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
}


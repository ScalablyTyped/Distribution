package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import typings.googlemaps.googleNs.mapsNs.MVCObject
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.places.SearchBox")
@js.native
class SearchBox protected () extends MVCObject {
  def this(inputField: HTMLInputElement) = this()
  def this(inputField: HTMLInputElement, opts: SearchBoxOptions) = this()
  def getBounds(): LatLngBounds = js.native
  def getPlaces(): js.Array[PlaceResult] = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
}


package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.MVCObject
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


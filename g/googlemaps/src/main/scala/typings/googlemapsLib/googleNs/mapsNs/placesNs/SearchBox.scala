package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.places.SearchBox")
@js.native
class SearchBox protected ()
  extends googlemapsLib.googleNs.mapsNs.MVCObject {
  def this(inputField: stdLib.HTMLInputElement) = this()
  def this(inputField: stdLib.HTMLInputElement, opts: SearchBoxOptions) = this()
  def getBounds(): googlemapsLib.googleNs.mapsNs.LatLngBounds = js.native
  def getPlaces(): js.Array[PlaceResult] = js.native
  def setBounds(bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds): scala.Unit = js.native
  def setBounds(bounds: googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral): scala.Unit = js.native
}


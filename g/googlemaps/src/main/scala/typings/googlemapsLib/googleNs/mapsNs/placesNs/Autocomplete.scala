package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.places.Autocomplete")
@js.native
class Autocomplete protected ()
  extends googlemapsLib.googleNs.mapsNs.MVCObject {
  def this(inputField: stdLib.HTMLInputElement) = this()
  def this(inputField: stdLib.HTMLInputElement, opts: AutocompleteOptions) = this()
  def getBounds(): googlemapsLib.googleNs.mapsNs.LatLngBounds = js.native
  def getPlace(): PlaceResult = js.native
  def setBounds(bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds): scala.Unit = js.native
  def setBounds(bounds: googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral): scala.Unit = js.native
  def setComponentRestrictions(restrictions: ComponentRestrictions): scala.Unit = js.native
  def setFields(): scala.Unit = js.native
  def setFields(fields: js.Array[java.lang.String]): scala.Unit = js.native
  def setOptions(options: AutocompleteOptions): scala.Unit = js.native
  def setTypes(types: js.Array[java.lang.String]): scala.Unit = js.native
}


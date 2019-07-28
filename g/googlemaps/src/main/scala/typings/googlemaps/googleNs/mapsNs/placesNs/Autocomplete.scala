package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import typings.googlemaps.googleNs.mapsNs.MVCObject
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.places.Autocomplete")
@js.native
class Autocomplete protected () extends MVCObject {
  def this(inputField: HTMLInputElement) = this()
  def this(inputField: HTMLInputElement, opts: AutocompleteOptions) = this()
  def getBounds(): LatLngBounds = js.native
  def getPlace(): PlaceResult = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  def setComponentRestrictions(restrictions: ComponentRestrictions): Unit = js.native
  def setFields(): Unit = js.native
  def setFields(fields: js.Array[String]): Unit = js.native
  def setOptions(options: AutocompleteOptions): Unit = js.native
  def setTypes(types: js.Array[String]): Unit = js.native
}


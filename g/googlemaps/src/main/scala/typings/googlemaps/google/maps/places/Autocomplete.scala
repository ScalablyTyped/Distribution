package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.MVCObject
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


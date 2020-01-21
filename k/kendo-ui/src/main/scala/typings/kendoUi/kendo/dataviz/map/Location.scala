package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Location")
@js.native
class Location protected () extends Class {
  def this(lat: Double, lng: Double) = this()
  var lat: Double = js.native
  var lng: Double = js.native
  var options: LocationOptions = js.native
  def destination(destination: Location, bearing: Double): Double = js.native
  def distanceTo(distance: Double, bearing: Double): Location = js.native
  def equals(location: Location): Boolean = js.native
  def round(digits: Double): Location = js.native
  def toArray(): js.Any = js.native
  def wrap(): Location = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.map.Location")
@js.native
object Location extends js.Object {
  def create(lat: js.Any): Location = js.native
  def create(lat: js.Any, lng: Double): Location = js.native
  def create(lat: Double): Location = js.native
  def create(lat: Double, lng: Double): Location = js.native
  def create(lat: Location): Location = js.native
  def create(lat: Location, lng: Double): Location = js.native
  def fromLatLng(lnglat: js.Any): Location = js.native
  def fromLngLat(lnglat: js.Any): Location = js.native
}


package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Location")
@js.native
class Location protected ()
  extends kendoDashUiLib.kendoNs.Class {
  def this(lat: scala.Double, lng: scala.Double) = this()
  var lat: scala.Double = js.native
  var lng: scala.Double = js.native
  var options: LocationOptions = js.native
  def destination(destination: Location, bearing: scala.Double): scala.Double = js.native
  def distanceTo(distance: scala.Double, bearing: scala.Double): Location = js.native
  def equals(location: Location): scala.Boolean = js.native
  def round(digits: scala.Double): Location = js.native
  def toArray(): js.Any = js.native
  def wrap(): Location = js.native
}

@JSGlobal("kendo.dataviz.map.Location")
@js.native
object Location extends js.Object {
  def create(lat: js.Any): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def create(lat: js.Any, lng: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def create(lat: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def create(lat: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location, lng: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def create(lat: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def create(lat: scala.Double, lng: scala.Double): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def fromLatLng(lnglat: js.Any): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
  def fromLngLat(lnglat: js.Any): kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = js.native
}


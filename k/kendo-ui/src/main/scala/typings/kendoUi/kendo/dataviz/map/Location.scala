package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends Class {
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

object Location {
  @scala.inline
  def apply(
    destination: (Location, Double) => Double,
    distanceTo: (Double, Double) => Location,
    equals: Location => Boolean,
    lat: Double,
    lng: Double,
    options: LocationOptions,
    round: Double => Location,
    toArray: () => js.Any,
    wrap: () => Location
  ): Location = {
    val __obj = js.Dynamic.literal(destination = js.Any.fromFunction2(destination), distanceTo = js.Any.fromFunction2(distanceTo), equals = js.Any.fromFunction1(equals), lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], round = js.Any.fromFunction1(round), toArray = js.Any.fromFunction0(toArray), wrap = js.Any.fromFunction0(wrap))
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestination(value: (Location, Double) => Double): Self = this.set("destination", js.Any.fromFunction2(value))
    @scala.inline
    def setDistanceTo(value: (Double, Double) => Location): Self = this.set("distanceTo", js.Any.fromFunction2(value))
    @scala.inline
    def setEquals(value: Location => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: LocationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRound(value: Double => Location): Self = this.set("round", js.Any.fromFunction1(value))
    @scala.inline
    def setToArray(value: () => js.Any): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def setWrap(value: () => Location): Self = this.set("wrap", js.Any.fromFunction0(value))
  }
  
}


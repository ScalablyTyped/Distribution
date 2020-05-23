package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends Class {
  var lat: Double
  var lng: Double
  var options: LocationOptions
  def destination(destination: Location, bearing: Double): Double
  def distanceTo(distance: Double, bearing: Double): Location
  def equals(location: Location): Boolean
  def round(digits: Double): Location
  def toArray(): js.Any
  def wrap(): Location
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
}


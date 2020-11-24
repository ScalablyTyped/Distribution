package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literals are accepted in place of {@link LatLngBounds} objects throughout the API. These are automatically
  * converted to {@link LatLngBounds} objects. All {@link LatLngBoundsLiteral#south south},
  * {@link LatLngBoundsLiteral#west west}, {@link LatLngBoundsLiteral#north north} and
  * {@link LatLngBoundsLiteral#east east} must be set, otherwise an exception is thrown.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBoundsLiteral Maps JavaScript API}
  */
@js.native
trait LatLngBoundsLiteral extends _LocationBias {
  
  /**
    * East longitude in degrees. Values outside the range [-180, 180] will be wrapped to the range [-180, 180]. For
    * example, a value of -190 will be converted to 170. A value of 190 will be converted to -170. This reflects
    * the fact that longitudes wrap around the globe.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBoundsLiteral.east Maps JavaScript API}
    */
  var east: Double = js.native
  
  /**
    * North latitude in degrees. Values will be clamped to the range [-90, 90]. This means that if the value
    * specified is less than -90, it will be set to -90. And if the value is greater than 90, it will be set to 90.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBoundsLiteral.north Maps JavaScript API}
    */
  var north: Double = js.native
  
  /**
    * South latitude in degrees. Values will be clamped to the range [-90, 90]. This means that if the value
    * specified is less than -90, it will be set to -90. And if the value is greater than 90, it will be set to 90.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBoundsLiteral.south Maps JavaScript API}
    */
  var south: Double = js.native
  
  /**
    * West longitude in degrees. Values outside the range [-180, 180] will be wrapped to the range [-180, 180]. For
    * example, a value of -190 will be converted to 170. A value of 190 will be converted to -170. This reflects
    * the fact that longitudes wrap around the globe.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#LatLngBoundsLiteral.west Maps JavaScript API}
    */
  var west: Double = js.native
}
object LatLngBoundsLiteral {
  
  @scala.inline
  def apply(east: Double, north: Double, south: Double, west: Double): LatLngBoundsLiteral = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngBoundsLiteral]
  }
  
  @scala.inline
  implicit class LatLngBoundsLiteralOps[Self <: LatLngBoundsLiteral] (val x: Self) extends AnyVal {
    
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
    def setEast(value: Double): Self = this.set("east", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorth(value: Double): Self = this.set("north", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouth(value: Double): Self = this.set("south", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWest(value: Double): Self = this.set("west", value.asInstanceOf[js.Any])
  }
}

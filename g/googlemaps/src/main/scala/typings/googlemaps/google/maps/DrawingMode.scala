package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlemaps.googlemapsStrings.Point
  - typings.googlemaps.googlemapsStrings.LineString
  - typings.googlemaps.googlemapsStrings.Polygon
*/
trait DrawingMode extends js.Object

object DrawingMode {
  @scala.inline
  def LineString: typings.googlemaps.googlemapsStrings.LineString = this.cast("LineString")
  @scala.inline
  def Point: typings.googlemaps.googlemapsStrings.Point = this.cast("Point")
  @scala.inline
  def Polygon: typings.googlemaps.googlemapsStrings.Polygon = this.cast("Polygon")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


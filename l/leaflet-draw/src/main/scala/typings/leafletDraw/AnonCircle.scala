package typings.leafletDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircle extends js.Object {
  var circle: String
  var circlemarker: String
  var marker: String
  var polygon: String
  var polyline: String
  var rectangle: String
}

object AnonCircle {
  @scala.inline
  def apply(
    circle: String,
    circlemarker: String,
    marker: String,
    polygon: String,
    polyline: String,
    rectangle: String
  ): AnonCircle = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCircle]
  }
}


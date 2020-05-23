package typings.mapboxGl.mod

import typings.mapboxGl.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<mapbox-gl.mapbox-gl.CameraOptions, 'zoom' | 'bearing'>> & {  center  :{  lng  :number,   lat  :number}} */
trait CameraForBoundsResult extends js.Object {
  var bearing: Double
  /** Map center */
  var center: Lat
  var zoom: Double
}

object CameraForBoundsResult {
  @scala.inline
  def apply(bearing: Double, center: Lat, zoom: Double): CameraForBoundsResult = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraForBoundsResult]
  }
}


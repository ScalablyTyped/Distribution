package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  /**
    * An array in the format [ longitude,latitude ] at the center of the specified  bbox .
    */
  var coordinates: js.Array[Double] = js.native
  /**
    * A boolean value indicating if an  address is interpolated along a road network. This field is only present when the feature is interpolated.
    */
  var interpolated: Boolean = js.native
  /**
    * Point, a GeoJSON type from the GeoJSON specification .
    */
  var `type`: String = js.native
}

object Geometry {
  @scala.inline
  def apply(coordinates: js.Array[Double], interpolated: Boolean, `type`: String): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], interpolated = interpolated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: Double*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[Double]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolated(value: Boolean): Self = this.set("interpolated", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


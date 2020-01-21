package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  /**
    * An array in the format [ longitude,latitude ] at the center of the specified  bbox .
    */
  var coordinates: js.Array[Double]
  /**
    * A boolean value indicating if an  address is interpolated along a road network. This field is only present when the feature is interpolated.
    */
  var interpolated: Boolean
  /**
    * Point, a GeoJSON type from the GeoJSON specification .
    */
  var `type`: String
}

object Geometry {
  @scala.inline
  def apply(coordinates: js.Array[Double], interpolated: Boolean, `type`: String): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], interpolated = interpolated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}


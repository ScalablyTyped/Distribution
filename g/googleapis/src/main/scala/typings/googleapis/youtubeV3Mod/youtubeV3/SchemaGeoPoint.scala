package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Geographical coordinates of a point, in WGS84.
  */
@js.native
trait SchemaGeoPoint extends js.Object {
  /**
    * Altitude above the reference ellipsoid, in meters.
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * Latitude in degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude in degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
}

object SchemaGeoPoint {
  @scala.inline
  def apply(altitude: Int | Double = null, latitude: Int | Double = null, longitude: Int | Double = null): SchemaGeoPoint = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGeoPoint]
  }
}


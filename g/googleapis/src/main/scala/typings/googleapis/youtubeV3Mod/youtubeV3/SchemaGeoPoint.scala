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
  def apply(
    altitude: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined
  ): SchemaGeoPoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGeoPoint]
  }
}


package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location object is used by other items to indicate their locations.
  */
trait Location extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var altitude: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var poi: js.UndefOr[Boolean] = js.undefined
  var `type`: location
}

object Location {
  @scala.inline
  def apply(
    `type`: location,
    address: String = null,
    altitude: js.UndefOr[Double] = js.undefined,
    id: String = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    name: String = null,
    poi: js.UndefOr[Boolean] = js.undefined
  ): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(poi)) __obj.updateDynamic("poi")(poi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}


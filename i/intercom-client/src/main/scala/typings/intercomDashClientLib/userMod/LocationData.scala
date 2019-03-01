package typings
package intercomDashClientLib.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationData extends js.Object {
  var city_name: java.lang.String | scala.Null
  var continent_code: java.lang.String | scala.Null
  var country_code: java.lang.String | scala.Null
  var country_name: java.lang.String | scala.Null
  var latitude: scala.Double | scala.Null
  var longitude: scala.Double | scala.Null
  var postal_code: java.lang.String | scala.Null
  var region_name: java.lang.String | scala.Null
  var timezone: java.lang.String | scala.Null
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.location_data
}

object LocationData {
  @scala.inline
  def apply(
    `type`: intercomDashClientLib.intercomDashClientLibStrings.location_data,
    city_name: java.lang.String = null,
    continent_code: java.lang.String = null,
    country_code: java.lang.String = null,
    country_name: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    postal_code: java.lang.String = null,
    region_name: java.lang.String = null,
    timezone: java.lang.String = null
  ): LocationData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (city_name != null) __obj.updateDynamic("city_name")(city_name)
    if (continent_code != null) __obj.updateDynamic("continent_code")(continent_code)
    if (country_code != null) __obj.updateDynamic("country_code")(country_code)
    if (country_name != null) __obj.updateDynamic("country_name")(country_name)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code)
    if (region_name != null) __obj.updateDynamic("region_name")(region_name)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[LocationData]
  }
}


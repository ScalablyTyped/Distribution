package typings.intercomClient.userMod

import typings.intercomClient.intercomClientStrings.location_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationData extends js.Object {
  var city_name: String | Null
  var continent_code: String | Null
  var country_code: String | Null
  var country_name: String | Null
  var latitude: Double | Null
  var longitude: Double | Null
  var postal_code: String | Null
  var region_name: String | Null
  var timezone: String | Null
  var `type`: location_data
}

object LocationData {
  @scala.inline
  def apply(
    `type`: location_data,
    city_name: String = null,
    continent_code: String = null,
    country_code: String = null,
    country_name: String = null,
    latitude: Double = null.asInstanceOf[Double],
    longitude: Double = null.asInstanceOf[Double],
    postal_code: String = null,
    region_name: String = null,
    timezone: String = null
  ): LocationData = {
    val __obj = js.Dynamic.literal(city_name = city_name.asInstanceOf[js.Any], continent_code = continent_code.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], country_name = country_name.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], region_name = region_name.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
}


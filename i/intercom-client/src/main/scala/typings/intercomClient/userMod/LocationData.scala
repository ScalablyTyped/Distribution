package typings.intercomClient.userMod

import typings.intercomClient.intercomClientStrings.location_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationData extends js.Object {
  var city_name: String | Null = js.native
  var continent_code: String | Null = js.native
  var country_code: String | Null = js.native
  var country_name: String | Null = js.native
  var latitude: Double | Null = js.native
  var longitude: Double | Null = js.native
  var postal_code: String | Null = js.native
  var region_name: String | Null = js.native
  var timezone: String | Null = js.native
  var `type`: location_data = js.native
}

object LocationData {
  @scala.inline
  def apply(`type`: location_data): LocationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
  @scala.inline
  implicit class LocationDataOps[Self <: LocationData] (val x: Self) extends AnyVal {
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
    def setType(value: location_data): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity_name(value: String): Self = this.set("city_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity_nameNull: Self = this.set("city_name", null)
    @scala.inline
    def setContinent_code(value: String): Self = this.set("continent_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinent_codeNull: Self = this.set("continent_code", null)
    @scala.inline
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry_codeNull: Self = this.set("country_code", null)
    @scala.inline
    def setCountry_name(value: String): Self = this.set("country_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry_nameNull: Self = this.set("country_name", null)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitudeNull: Self = this.set("latitude", null)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitudeNull: Self = this.set("longitude", null)
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostal_codeNull: Self = this.set("postal_code", null)
    @scala.inline
    def setRegion_name(value: String): Self = this.set("region_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion_nameNull: Self = this.set("region_name", null)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezoneNull: Self = this.set("timezone", null)
  }
  
}


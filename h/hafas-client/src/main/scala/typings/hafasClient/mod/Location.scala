package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location object is used by other items to indicate their locations.
  */
@js.native
trait Location extends js.Object {
  var address: js.UndefOr[String] = js.native
  var altitude: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var poi: js.UndefOr[Boolean] = js.native
  var `type`: location = js.native
}

object Location {
  @scala.inline
  def apply(`type`: location): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setType(value: location): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPoi(value: Boolean): Self = this.set("poi", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoi: Self = this.set("poi", js.undefined)
  }
  
}


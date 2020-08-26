package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalData extends js.Object {
  var AdditionalData: js.Array[Key] = js.native
  var City: String = js.native
  var Country: String = js.native
  var County: String = js.native
  var District: String = js.native
  var HouseNumber: String = js.native
  var Label: String = js.native
  var PostalCode: String = js.native
  var State: String = js.native
  var Street: String = js.native
}

object AdditionalData {
  @scala.inline
  def apply(
    AdditionalData: js.Array[Key],
    City: String,
    Country: String,
    County: String,
    District: String,
    HouseNumber: String,
    Label: String,
    PostalCode: String,
    State: String,
    Street: String
  ): AdditionalData = {
    val __obj = js.Dynamic.literal(AdditionalData = AdditionalData.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], County = County.asInstanceOf[js.Any], District = District.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalData]
  }
  @scala.inline
  implicit class AdditionalDataOps[Self <: AdditionalData] (val x: Self) extends AnyVal {
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
    def setAdditionalDataVarargs(value: Key*): Self = this.set("AdditionalData", js.Array(value :_*))
    @scala.inline
    def setAdditionalData(value: js.Array[Key]): Self = this.set("AdditionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounty(value: String): Self = this.set("County", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistrict(value: String): Self = this.set("District", value.asInstanceOf[js.Any])
    @scala.inline
    def setHouseNumber(value: String): Self = this.set("HouseNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("PostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreet(value: String): Self = this.set("Street", value.asInstanceOf[js.Any])
  }
  
}


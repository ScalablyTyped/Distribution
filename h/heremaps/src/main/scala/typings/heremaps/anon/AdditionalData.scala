package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalData extends js.Object {
  var AdditionalData: js.Array[Key]
  var City: String
  var Country: String
  var County: String
  var District: String
  var HouseNumber: String
  var Label: String
  var PostalCode: String
  var State: String
  var Street: String
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
}


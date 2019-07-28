package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalData extends js.Object {
  var AdditionalData: js.Array[Anon_Key]
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

object Anon_AdditionalData {
  @scala.inline
  def apply(
    AdditionalData: js.Array[Anon_Key],
    City: String,
    Country: String,
    County: String,
    District: String,
    HouseNumber: String,
    Label: String,
    PostalCode: String,
    State: String,
    Street: String
  ): Anon_AdditionalData = {
    val __obj = js.Dynamic.literal(AdditionalData = AdditionalData, City = City, Country = Country, County = County, District = District, HouseNumber = HouseNumber, Label = Label, PostalCode = PostalCode, State = State, Street = Street)
  
    __obj.asInstanceOf[Anon_AdditionalData]
  }
}


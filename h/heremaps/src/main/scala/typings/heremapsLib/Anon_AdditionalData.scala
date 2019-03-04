package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalData extends js.Object {
  var AdditionalData: js.Array[Anon_Key]
  var City: java.lang.String
  var Country: java.lang.String
  var County: java.lang.String
  var District: java.lang.String
  var HouseNumber: java.lang.String
  var Label: java.lang.String
  var PostalCode: java.lang.String
  var State: java.lang.String
  var Street: java.lang.String
}

object Anon_AdditionalData {
  @scala.inline
  def apply(
    AdditionalData: js.Array[Anon_Key],
    City: java.lang.String,
    Country: java.lang.String,
    County: java.lang.String,
    District: java.lang.String,
    HouseNumber: java.lang.String,
    Label: java.lang.String,
    PostalCode: java.lang.String,
    State: java.lang.String,
    Street: java.lang.String
  ): Anon_AdditionalData = {
    val __obj = js.Dynamic.literal(AdditionalData = AdditionalData, City = City, Country = Country, County = County, District = District, HouseNumber = HouseNumber, Label = Label, PostalCode = PostalCode, State = State, Street = Street)
  
    __obj.asInstanceOf[Anon_AdditionalData]
  }
}


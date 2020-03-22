package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.BaseUserNaturalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData | 'PersonType'> */
trait CreateUserNaturalData extends js.Object {
  var Address: js.UndefOr[String | AddressData] = js.undefined
  var Birthday: Timestamp
  var CountryOfResidence: CountryISO
  var Email: String
  var FirstName: String
  var IncomeRange: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.IncomeRange] = js.undefined
  var LastName: String
  var Nationality: CountryISO
  var Occupation: js.UndefOr[String] = js.undefined
  var PersonType: NATURAL
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateUserNaturalData {
  @scala.inline
  def apply(
    Birthday: Timestamp,
    CountryOfResidence: CountryISO,
    Email: String,
    FirstName: String,
    LastName: String,
    Nationality: CountryISO,
    PersonType: NATURAL,
    Address: String | AddressData = null,
    IncomeRange: IncomeRange = null,
    Occupation: String = null,
    Tag: String = null
  ): CreateUserNaturalData = {
    val __obj = js.Dynamic.literal(Birthday = Birthday.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any])
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (IncomeRange != null) __obj.updateDynamic("IncomeRange")(IncomeRange.asInstanceOf[js.Any])
    if (Occupation != null) __obj.updateDynamic("Occupation")(Occupation.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserNaturalData]
  }
}


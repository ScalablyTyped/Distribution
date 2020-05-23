package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserNaturalData extends BaseUserNaturalData {
  var Id: String
}

object UpdateUserNaturalData {
  @scala.inline
  def apply(
    Id: String,
    PersonType: NATURAL,
    Address: String | AddressData = null,
    Birthday: js.UndefOr[Timestamp] = js.undefined,
    CountryOfResidence: CountryISO = null,
    Email: String = null,
    FirstName: String = null,
    IncomeRange: IncomeRange = null,
    LastName: String = null,
    Nationality: CountryISO = null,
    Occupation: String = null,
    Tag: String = null
  ): UpdateUserNaturalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any])
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (!js.isUndefined(Birthday)) __obj.updateDynamic("Birthday")(Birthday.get.asInstanceOf[js.Any])
    if (CountryOfResidence != null) __obj.updateDynamic("CountryOfResidence")(CountryOfResidence.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (IncomeRange != null) __obj.updateDynamic("IncomeRange")(IncomeRange.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (Nationality != null) __obj.updateDynamic("Nationality")(Nationality.asInstanceOf[js.Any])
    if (Occupation != null) __obj.updateDynamic("Occupation")(Occupation.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserNaturalData]
  }
}


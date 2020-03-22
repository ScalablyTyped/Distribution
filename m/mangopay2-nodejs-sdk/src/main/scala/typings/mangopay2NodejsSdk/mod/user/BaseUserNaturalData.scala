package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData | 'Address' | 'Occupation' | 'IncomeRange' | 'Tag'> */
trait BaseUserNaturalData extends js.Object {
  var Address: js.UndefOr[String | AddressData] = js.undefined
  var Birthday: js.UndefOr[Timestamp] = js.undefined
  var CountryOfResidence: js.UndefOr[CountryISO] = js.undefined
  var Email: js.UndefOr[String] = js.undefined
  var FirstName: js.UndefOr[String] = js.undefined
  var IncomeRange: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.IncomeRange] = js.undefined
  var LastName: js.UndefOr[String] = js.undefined
  var Nationality: js.UndefOr[CountryISO] = js.undefined
  var Occupation: js.UndefOr[String] = js.undefined
  var PersonType: NATURAL
  var Tag: js.UndefOr[String] = js.undefined
}

object BaseUserNaturalData {
  @scala.inline
  def apply(
    PersonType: NATURAL,
    Address: String | AddressData = null,
    Birthday: Int | Double = null,
    CountryOfResidence: CountryISO = null,
    Email: String = null,
    FirstName: String = null,
    IncomeRange: IncomeRange = null,
    LastName: String = null,
    Nationality: CountryISO = null,
    Occupation: String = null,
    Tag: String = null
  ): BaseUserNaturalData = {
    val __obj = js.Dynamic.literal(PersonType = PersonType.asInstanceOf[js.Any])
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Birthday != null) __obj.updateDynamic("Birthday")(Birthday.asInstanceOf[js.Any])
    if (CountryOfResidence != null) __obj.updateDynamic("CountryOfResidence")(CountryOfResidence.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (IncomeRange != null) __obj.updateDynamic("IncomeRange")(IncomeRange.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (Nationality != null) __obj.updateDynamic("Nationality")(Nationality.asInstanceOf[js.Any])
    if (Occupation != null) __obj.updateDynamic("Occupation")(Occupation.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUserNaturalData]
  }
}


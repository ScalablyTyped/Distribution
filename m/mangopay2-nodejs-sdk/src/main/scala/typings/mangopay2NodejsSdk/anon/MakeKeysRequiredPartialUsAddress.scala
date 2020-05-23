package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.mod.user.IncomeRange
import typings.mangopay2NodejsSdk.mod.user.KYCLevel
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData> */
trait MakeKeysRequiredPartialUsAddress extends js.Object {
  var Address: js.UndefOr[String | AddressData] = js.undefined
  var Birthday: Timestamp
  var Capacity: js.UndefOr[NORMAL | DECLARATIVE] = js.undefined
  var CountryOfResidence: CountryISO
  var CreationDate: js.UndefOr[Double] = js.undefined
  var Email: String
  var FirstName: String
  var Id: js.UndefOr[String] = js.undefined
  var IncomeRange: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.IncomeRange] = js.undefined
  var KYCLevel: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.KYCLevel] = js.undefined
  var LastName: String
  var Nationality: CountryISO
  var Occupation: js.UndefOr[String] = js.undefined
  var PersonType: js.UndefOr[NATURAL] = js.undefined
  var ProofOfAddress: js.UndefOr[String] = js.undefined
  var ProofOfIdentity: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object MakeKeysRequiredPartialUsAddress {
  @scala.inline
  def apply(
    Birthday: Timestamp,
    CountryOfResidence: CountryISO,
    Email: String,
    FirstName: String,
    LastName: String,
    Nationality: CountryISO,
    Address: String | AddressData = null,
    Capacity: NORMAL | DECLARATIVE = null,
    CreationDate: js.UndefOr[Double] = js.undefined,
    Id: String = null,
    IncomeRange: IncomeRange = null,
    KYCLevel: KYCLevel = null,
    Occupation: String = null,
    PersonType: NATURAL = null,
    ProofOfAddress: String = null,
    ProofOfIdentity: String = null,
    Tag: String = null
  ): MakeKeysRequiredPartialUsAddress = {
    val __obj = js.Dynamic.literal(Birthday = Birthday.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any])
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity.asInstanceOf[js.Any])
    if (!js.isUndefined(CreationDate)) __obj.updateDynamic("CreationDate")(CreationDate.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (IncomeRange != null) __obj.updateDynamic("IncomeRange")(IncomeRange.asInstanceOf[js.Any])
    if (KYCLevel != null) __obj.updateDynamic("KYCLevel")(KYCLevel.asInstanceOf[js.Any])
    if (Occupation != null) __obj.updateDynamic("Occupation")(Occupation.asInstanceOf[js.Any])
    if (PersonType != null) __obj.updateDynamic("PersonType")(PersonType.asInstanceOf[js.Any])
    if (ProofOfAddress != null) __obj.updateDynamic("ProofOfAddress")(ProofOfAddress.asInstanceOf[js.Any])
    if (ProofOfIdentity != null) __obj.updateDynamic("ProofOfIdentity")(ProofOfIdentity.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUsAddress]
  }
}


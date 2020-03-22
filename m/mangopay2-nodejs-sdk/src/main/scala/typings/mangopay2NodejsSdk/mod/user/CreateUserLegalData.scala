package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.BaseUserLegalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData | 'PersonType'> */
trait CreateUserLegalData extends js.Object {
  var CompanyNumber: js.UndefOr[String] = js.undefined
  var Email: String
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  var LegalPersonType: typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  var LegalRepresentativeAddress: js.UndefOr[AddressType] = js.undefined
  var LegalRepresentativeBirthday: Timestamp
  var LegalRepresentativeCountryOfResidence: CountryISO
  var LegalRepresentativeEmail: js.UndefOr[String] = js.undefined
  var LegalRepresentativeFirstName: String
  var LegalRepresentativeLastName: String
  var LegalRepresentativeNationality: CountryISO
  var Name: String
  var PersonType: LEGAL
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateUserLegalData {
  @scala.inline
  def apply(
    Email: String,
    LegalPersonType: LegalPersonType,
    LegalRepresentativeBirthday: Timestamp,
    LegalRepresentativeCountryOfResidence: CountryISO,
    LegalRepresentativeFirstName: String,
    LegalRepresentativeLastName: String,
    LegalRepresentativeNationality: CountryISO,
    Name: String,
    PersonType: LEGAL,
    CompanyNumber: String = null,
    HeadquartersAddress: AddressType = null,
    LegalRepresentativeAddress: AddressType = null,
    LegalRepresentativeEmail: String = null,
    Tag: String = null
  ): CreateUserLegalData = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any])
    if (CompanyNumber != null) __obj.updateDynamic("CompanyNumber")(CompanyNumber.asInstanceOf[js.Any])
    if (HeadquartersAddress != null) __obj.updateDynamic("HeadquartersAddress")(HeadquartersAddress.asInstanceOf[js.Any])
    if (LegalRepresentativeAddress != null) __obj.updateDynamic("LegalRepresentativeAddress")(LegalRepresentativeAddress.asInstanceOf[js.Any])
    if (LegalRepresentativeEmail != null) __obj.updateDynamic("LegalRepresentativeEmail")(LegalRepresentativeEmail.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserLegalData]
  }
}


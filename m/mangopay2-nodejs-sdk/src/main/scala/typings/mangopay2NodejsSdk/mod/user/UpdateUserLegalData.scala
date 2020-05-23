package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserLegalData extends BaseUserLegalData {
  var Id: String
}

object UpdateUserLegalData {
  @scala.inline
  def apply(
    Id: String,
    PersonType: LEGAL,
    CompanyNumber: String = null,
    Email: String = null,
    HeadquartersAddress: AddressType = null,
    LegalPersonType: LegalPersonType = null,
    LegalRepresentativeAddress: AddressType = null,
    LegalRepresentativeBirthday: js.UndefOr[Timestamp] = js.undefined,
    LegalRepresentativeCountryOfResidence: CountryISO = null,
    LegalRepresentativeEmail: String = null,
    LegalRepresentativeFirstName: String = null,
    LegalRepresentativeLastName: String = null,
    LegalRepresentativeNationality: CountryISO = null,
    Name: String = null,
    Tag: String = null
  ): UpdateUserLegalData = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any])
    if (CompanyNumber != null) __obj.updateDynamic("CompanyNumber")(CompanyNumber.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (HeadquartersAddress != null) __obj.updateDynamic("HeadquartersAddress")(HeadquartersAddress.asInstanceOf[js.Any])
    if (LegalPersonType != null) __obj.updateDynamic("LegalPersonType")(LegalPersonType.asInstanceOf[js.Any])
    if (LegalRepresentativeAddress != null) __obj.updateDynamic("LegalRepresentativeAddress")(LegalRepresentativeAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(LegalRepresentativeBirthday)) __obj.updateDynamic("LegalRepresentativeBirthday")(LegalRepresentativeBirthday.get.asInstanceOf[js.Any])
    if (LegalRepresentativeCountryOfResidence != null) __obj.updateDynamic("LegalRepresentativeCountryOfResidence")(LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any])
    if (LegalRepresentativeEmail != null) __obj.updateDynamic("LegalRepresentativeEmail")(LegalRepresentativeEmail.asInstanceOf[js.Any])
    if (LegalRepresentativeFirstName != null) __obj.updateDynamic("LegalRepresentativeFirstName")(LegalRepresentativeFirstName.asInstanceOf[js.Any])
    if (LegalRepresentativeLastName != null) __obj.updateDynamic("LegalRepresentativeLastName")(LegalRepresentativeLastName.asInstanceOf[js.Any])
    if (LegalRepresentativeNationality != null) __obj.updateDynamic("LegalRepresentativeNationality")(LegalRepresentativeNationality.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserLegalData]
  }
}


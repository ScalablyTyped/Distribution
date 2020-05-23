package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.user.KYCLevel
import typings.mangopay2NodejsSdk.mod.user.LegalPersonType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserLegalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData> */
trait MakeKeysRequiredPartialUs extends js.Object {
  var CompanyNumber: js.UndefOr[String] = js.undefined
  var CreationDate: js.UndefOr[Double] = js.undefined
  var Email: String
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var KYCLevel: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.KYCLevel] = js.undefined
  var LegalPersonType: typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  var LegalRepresentativeAddress: js.UndefOr[AddressType] = js.undefined
  var LegalRepresentativeBirthday: Timestamp
  var LegalRepresentativeCountryOfResidence: CountryISO
  var LegalRepresentativeEmail: js.UndefOr[String] = js.undefined
  var LegalRepresentativeFirstName: String
  var LegalRepresentativeLastName: String
  var LegalRepresentativeNationality: CountryISO
  var Name: String
  var PersonType: js.UndefOr[LEGAL] = js.undefined
  var ProofOfIdentity: js.UndefOr[String] = js.undefined
  var ProofOfRegistration: js.UndefOr[String] = js.undefined
  var ShareholderDeclaration: js.UndefOr[String] = js.undefined
  var Statute: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object MakeKeysRequiredPartialUs {
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
    CompanyNumber: String = null,
    CreationDate: js.UndefOr[Double] = js.undefined,
    HeadquartersAddress: AddressType = null,
    Id: String = null,
    KYCLevel: KYCLevel = null,
    LegalRepresentativeAddress: AddressType = null,
    LegalRepresentativeEmail: String = null,
    PersonType: LEGAL = null,
    ProofOfIdentity: String = null,
    ProofOfRegistration: String = null,
    ShareholderDeclaration: String = null,
    Statute: String = null,
    Tag: String = null
  ): MakeKeysRequiredPartialUs = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (CompanyNumber != null) __obj.updateDynamic("CompanyNumber")(CompanyNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(CreationDate)) __obj.updateDynamic("CreationDate")(CreationDate.get.asInstanceOf[js.Any])
    if (HeadquartersAddress != null) __obj.updateDynamic("HeadquartersAddress")(HeadquartersAddress.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (KYCLevel != null) __obj.updateDynamic("KYCLevel")(KYCLevel.asInstanceOf[js.Any])
    if (LegalRepresentativeAddress != null) __obj.updateDynamic("LegalRepresentativeAddress")(LegalRepresentativeAddress.asInstanceOf[js.Any])
    if (LegalRepresentativeEmail != null) __obj.updateDynamic("LegalRepresentativeEmail")(LegalRepresentativeEmail.asInstanceOf[js.Any])
    if (PersonType != null) __obj.updateDynamic("PersonType")(PersonType.asInstanceOf[js.Any])
    if (ProofOfIdentity != null) __obj.updateDynamic("ProofOfIdentity")(ProofOfIdentity.asInstanceOf[js.Any])
    if (ProofOfRegistration != null) __obj.updateDynamic("ProofOfRegistration")(ProofOfRegistration.asInstanceOf[js.Any])
    if (ShareholderDeclaration != null) __obj.updateDynamic("ShareholderDeclaration")(ShareholderDeclaration.asInstanceOf[js.Any])
    if (Statute != null) __obj.updateDynamic("Statute")(Statute.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUs]
  }
}


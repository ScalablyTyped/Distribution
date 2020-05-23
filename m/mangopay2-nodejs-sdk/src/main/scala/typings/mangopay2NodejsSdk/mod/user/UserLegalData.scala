package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLegalData extends UserData {
  /**
    * The official registered number of the business
    */
  var CompanyNumber: String
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: AddressType
  /**
    * Type for legal user.
    */
  var LegalPersonType: typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  /**
    * The address of the company’s Legal representative person
    */
  var LegalRepresentativeAddress: AddressType
  /**
    * The date of birth of the company’s Legal representative person - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  var LegalRepresentativeBirthday: Timestamp
  /**
    * The country of residence of the company’s Legal representative person
    */
  var LegalRepresentativeCountryOfResidence: CountryISO
  /**
    * The email of the company’s Legal representative person - must be valid
    */
  var LegalRepresentativeEmail: String
  /**
    * The first name of the company’s Legal representative person
    */
  var LegalRepresentativeFirstName: String
  /**
    * The last name of the company’s Legal representative person
    */
  var LegalRepresentativeLastName: String
  /**
    * The nationality of the company’s Legal representative person
    */
  var LegalRepresentativeNationality: CountryISO
  /**
    * The name of the legal user
    */
  var Name: String
  @JSName("PersonType")
  var PersonType_UserLegalData: LEGAL
  var ProofOfIdentity: String | Null
  /**
    * A MANGOPAY reference to the validated document of the proof of registration of the company
    */
  var ProofOfRegistration: String | Null
  /**
    * The shareholder declaration of the company
    */
  var ShareholderDeclaration: String | Null
  /**
    * The business statute of the company
    */
  var Statute: String | Null
}

object UserLegalData {
  @scala.inline
  def apply(
    CompanyNumber: String,
    CreationDate: Double,
    Email: String,
    HeadquartersAddress: AddressType,
    Id: String,
    KYCLevel: KYCLevel,
    LegalPersonType: LegalPersonType,
    LegalRepresentativeAddress: AddressType,
    LegalRepresentativeBirthday: Timestamp,
    LegalRepresentativeCountryOfResidence: CountryISO,
    LegalRepresentativeEmail: String,
    LegalRepresentativeFirstName: String,
    LegalRepresentativeLastName: String,
    LegalRepresentativeNationality: CountryISO,
    Name: String,
    PersonType: LEGAL,
    Tag: String,
    ProofOfIdentity: String = null,
    ProofOfRegistration: String = null,
    ShareholderDeclaration: String = null,
    Statute: String = null
  ): UserLegalData = {
    val __obj = js.Dynamic.literal(CompanyNumber = CompanyNumber.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeAddress = LegalRepresentativeAddress.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeEmail = LegalRepresentativeEmail.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], ProofOfIdentity = ProofOfIdentity.asInstanceOf[js.Any], ProofOfRegistration = ProofOfRegistration.asInstanceOf[js.Any], ShareholderDeclaration = ShareholderDeclaration.asInstanceOf[js.Any], Statute = Statute.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLegalData]
  }
}


package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserLegalData extends UserData {
  
  /**
    * The official registered number of the business
    */
  var CompanyNumber: String = js.native
  
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: AddressType = js.native
  
  /**
    * Type for legal user.
    */
  var LegalPersonType: typings.mangopay2NodejsSdk.mod.user.LegalPersonType = js.native
  
  /**
    * The address of the company’s Legal representative person
    */
  var LegalRepresentativeAddress: AddressType = js.native
  
  /**
    * The date of birth of the company’s Legal representative person - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  var LegalRepresentativeBirthday: Timestamp = js.native
  
  /**
    * The country of residence of the company’s Legal representative person
    */
  var LegalRepresentativeCountryOfResidence: CountryISO = js.native
  
  /**
    * The email of the company’s Legal representative person - must be valid
    */
  var LegalRepresentativeEmail: String = js.native
  
  /**
    * The first name of the company’s Legal representative person
    */
  var LegalRepresentativeFirstName: String = js.native
  
  /**
    * The last name of the company’s Legal representative person
    */
  var LegalRepresentativeLastName: String = js.native
  
  /**
    * The nationality of the company’s Legal representative person
    */
  var LegalRepresentativeNationality: CountryISO = js.native
  
  /**
    * The name of the legal user
    */
  var Name: String = js.native
  
  @JSName("PersonType")
  var PersonType_UserLegalData: LEGAL = js.native
  
  var ProofOfIdentity: String | Null = js.native
  
  /**
    * A MANGOPAY reference to the validated document of the proof of registration of the company
    */
  var ProofOfRegistration: String | Null = js.native
  
  /**
    * The shareholder declaration of the company
    */
  var ShareholderDeclaration: String | Null = js.native
  
  /**
    * The business statute of the company
    */
  var Statute: String | Null = js.native
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
    Tag: String
  ): UserLegalData = {
    val __obj = js.Dynamic.literal(CompanyNumber = CompanyNumber.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeAddress = LegalRepresentativeAddress.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeEmail = LegalRepresentativeEmail.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLegalData]
  }
  
  @scala.inline
  implicit class UserLegalDataOps[Self <: UserLegalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompanyNumber(value: String): Self = this.set("CompanyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = this.set("HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalPersonType(value: LegalPersonType): Self = this.set("LegalPersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeAddress(value: AddressType): Self = this.set("LegalRepresentativeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeBirthday(value: Timestamp): Self = this.set("LegalRepresentativeBirthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeCountryOfResidence(value: CountryISO): Self = this.set("LegalRepresentativeCountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeEmail(value: String): Self = this.set("LegalRepresentativeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeFirstName(value: String): Self = this.set("LegalRepresentativeFirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeLastName(value: String): Self = this.set("LegalRepresentativeLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeNationality(value: CountryISO): Self = this.set("LegalRepresentativeNationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonType(value: LEGAL): Self = this.set("PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfIdentity(value: String): Self = this.set("ProofOfIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfIdentityNull: Self = this.set("ProofOfIdentity", null)
    
    @scala.inline
    def setProofOfRegistration(value: String): Self = this.set("ProofOfRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfRegistrationNull: Self = this.set("ProofOfRegistration", null)
    
    @scala.inline
    def setShareholderDeclaration(value: String): Self = this.set("ShareholderDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareholderDeclarationNull: Self = this.set("ShareholderDeclaration", null)
    
    @scala.inline
    def setStatute(value: String): Self = this.set("Statute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuteNull: Self = this.set("Statute", null)
  }
}

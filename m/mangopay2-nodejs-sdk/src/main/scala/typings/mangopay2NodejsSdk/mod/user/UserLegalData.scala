package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserLegalData
  extends StObject
     with UserData {
  
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
    Tag: String
  ): UserLegalData = {
    val __obj = js.Dynamic.literal(CompanyNumber = CompanyNumber.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeAddress = LegalRepresentativeAddress.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeEmail = LegalRepresentativeEmail.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PersonType = "LEGAL", Tag = Tag.asInstanceOf[js.Any], ProofOfIdentity = null, ProofOfRegistration = null, ShareholderDeclaration = null, Statute = null)
    __obj.asInstanceOf[UserLegalData]
  }
  
  @scala.inline
  implicit class UserLegalDataMutableBuilder[Self <: UserLegalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyNumber(value: String): Self = StObject.set(x, "CompanyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalPersonType(value: LegalPersonType): Self = StObject.set(x, "LegalPersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeAddress(value: AddressType): Self = StObject.set(x, "LegalRepresentativeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeBirthday(value: Timestamp): Self = StObject.set(x, "LegalRepresentativeBirthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeCountryOfResidence(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeCountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeEmail(value: String): Self = StObject.set(x, "LegalRepresentativeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeFirstName(value: String): Self = StObject.set(x, "LegalRepresentativeFirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeLastName(value: String): Self = StObject.set(x, "LegalRepresentativeLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeNationality(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeNationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonType(value: LEGAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfIdentity(value: String): Self = StObject.set(x, "ProofOfIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfIdentityNull: Self = StObject.set(x, "ProofOfIdentity", null)
    
    @scala.inline
    def setProofOfRegistration(value: String): Self = StObject.set(x, "ProofOfRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfRegistrationNull: Self = StObject.set(x, "ProofOfRegistration", null)
    
    @scala.inline
    def setShareholderDeclaration(value: String): Self = StObject.set(x, "ShareholderDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareholderDeclarationNull: Self = StObject.set(x, "ShareholderDeclaration", null)
    
    @scala.inline
    def setStatute(value: String): Self = StObject.set(x, "Statute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuteNull: Self = StObject.set(x, "Statute", null)
  }
}

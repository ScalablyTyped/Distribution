package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.user.KYCLevel
import typings.mangopay2NodejsSdk.mod.user.LegalPersonType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserLegalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData> */
@js.native
trait MakeKeysRequiredPartialUs extends StObject {
  
  var CompanyNumber: js.UndefOr[String] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var Email: String = js.native
  
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var KYCLevel: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.KYCLevel] = js.native
  
  var LegalPersonType: typings.mangopay2NodejsSdk.mod.user.LegalPersonType = js.native
  
  var LegalRepresentativeAddress: js.UndefOr[AddressType] = js.native
  
  var LegalRepresentativeBirthday: Timestamp = js.native
  
  var LegalRepresentativeCountryOfResidence: CountryISO = js.native
  
  var LegalRepresentativeEmail: js.UndefOr[String] = js.native
  
  var LegalRepresentativeFirstName: String = js.native
  
  var LegalRepresentativeLastName: String = js.native
  
  var LegalRepresentativeNationality: CountryISO = js.native
  
  var Name: String = js.native
  
  var PersonType: js.UndefOr[LEGAL] = js.native
  
  var ProofOfIdentity: js.UndefOr[String | Null] = js.native
  
  var ProofOfRegistration: js.UndefOr[String | Null] = js.native
  
  var ShareholderDeclaration: js.UndefOr[String | Null] = js.native
  
  var Statute: js.UndefOr[String | Null] = js.native
  
  var Tag: js.UndefOr[String] = js.native
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
    Name: String
  ): MakeKeysRequiredPartialUs = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUs]
  }
  
  @scala.inline
  implicit class MakeKeysRequiredPartialUsMutableBuilder[Self <: MakeKeysRequiredPartialUs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyNumber(value: String): Self = StObject.set(x, "CompanyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNumberUndefined: Self = StObject.set(x, "CompanyNumber", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setKYCLevel(value: KYCLevel): Self = StObject.set(x, "KYCLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKYCLevelUndefined: Self = StObject.set(x, "KYCLevel", js.undefined)
    
    @scala.inline
    def setLegalPersonType(value: LegalPersonType): Self = StObject.set(x, "LegalPersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeAddress(value: AddressType): Self = StObject.set(x, "LegalRepresentativeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeAddressUndefined: Self = StObject.set(x, "LegalRepresentativeAddress", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeBirthday(value: Timestamp): Self = StObject.set(x, "LegalRepresentativeBirthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeCountryOfResidence(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeCountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeEmail(value: String): Self = StObject.set(x, "LegalRepresentativeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeEmailUndefined: Self = StObject.set(x, "LegalRepresentativeEmail", js.undefined)
    
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
    def setPersonTypeUndefined: Self = StObject.set(x, "PersonType", js.undefined)
    
    @scala.inline
    def setProofOfIdentity(value: String): Self = StObject.set(x, "ProofOfIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfIdentityNull: Self = StObject.set(x, "ProofOfIdentity", null)
    
    @scala.inline
    def setProofOfIdentityUndefined: Self = StObject.set(x, "ProofOfIdentity", js.undefined)
    
    @scala.inline
    def setProofOfRegistration(value: String): Self = StObject.set(x, "ProofOfRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfRegistrationNull: Self = StObject.set(x, "ProofOfRegistration", null)
    
    @scala.inline
    def setProofOfRegistrationUndefined: Self = StObject.set(x, "ProofOfRegistration", js.undefined)
    
    @scala.inline
    def setShareholderDeclaration(value: String): Self = StObject.set(x, "ShareholderDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareholderDeclarationNull: Self = StObject.set(x, "ShareholderDeclaration", null)
    
    @scala.inline
    def setShareholderDeclarationUndefined: Self = StObject.set(x, "ShareholderDeclaration", js.undefined)
    
    @scala.inline
    def setStatute(value: String): Self = StObject.set(x, "Statute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuteNull: Self = StObject.set(x, "Statute", null)
    
    @scala.inline
    def setStatuteUndefined: Self = StObject.set(x, "Statute", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}

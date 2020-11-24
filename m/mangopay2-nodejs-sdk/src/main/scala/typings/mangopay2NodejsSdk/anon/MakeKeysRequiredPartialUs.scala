package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.user.KYCLevel
import typings.mangopay2NodejsSdk.mod.user.LegalPersonType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserLegalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData> */
@js.native
trait MakeKeysRequiredPartialUs extends js.Object {
  
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
  implicit class MakeKeysRequiredPartialUsOps[Self <: MakeKeysRequiredPartialUs] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalPersonType(value: LegalPersonType): Self = this.set("LegalPersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeBirthday(value: Timestamp): Self = this.set("LegalRepresentativeBirthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeCountryOfResidence(value: CountryISO): Self = this.set("LegalRepresentativeCountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeFirstName(value: String): Self = this.set("LegalRepresentativeFirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeLastName(value: String): Self = this.set("LegalRepresentativeLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeNationality(value: CountryISO): Self = this.set("LegalRepresentativeNationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNumber(value: String): Self = this.set("CompanyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyNumber: Self = this.set("CompanyNumber", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = this.set("HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadquartersAddress: Self = this.set("HeadquartersAddress", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setKYCLevel(value: KYCLevel): Self = this.set("KYCLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKYCLevel: Self = this.set("KYCLevel", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeAddress(value: AddressType): Self = this.set("LegalRepresentativeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegalRepresentativeAddress: Self = this.set("LegalRepresentativeAddress", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeEmail(value: String): Self = this.set("LegalRepresentativeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegalRepresentativeEmail: Self = this.set("LegalRepresentativeEmail", js.undefined)
    
    @scala.inline
    def setPersonType(value: LEGAL): Self = this.set("PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonType: Self = this.set("PersonType", js.undefined)
    
    @scala.inline
    def setProofOfIdentity(value: String): Self = this.set("ProofOfIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProofOfIdentity: Self = this.set("ProofOfIdentity", js.undefined)
    
    @scala.inline
    def setProofOfIdentityNull: Self = this.set("ProofOfIdentity", null)
    
    @scala.inline
    def setProofOfRegistration(value: String): Self = this.set("ProofOfRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProofOfRegistration: Self = this.set("ProofOfRegistration", js.undefined)
    
    @scala.inline
    def setProofOfRegistrationNull: Self = this.set("ProofOfRegistration", null)
    
    @scala.inline
    def setShareholderDeclaration(value: String): Self = this.set("ShareholderDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareholderDeclaration: Self = this.set("ShareholderDeclaration", js.undefined)
    
    @scala.inline
    def setShareholderDeclarationNull: Self = this.set("ShareholderDeclaration", null)
    
    @scala.inline
    def setStatute(value: String): Self = this.set("Statute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatute: Self = this.set("Statute", js.undefined)
    
    @scala.inline
    def setStatuteNull: Self = this.set("Statute", null)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}

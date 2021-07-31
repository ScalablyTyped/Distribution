package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.BaseUserLegalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData | 'PersonType'> */
trait CreateUserLegalData extends StObject {
  
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
    Name: String
  ): CreateUserLegalData = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PersonType = "LEGAL")
    __obj.asInstanceOf[CreateUserLegalData]
  }
  
  @scala.inline
  implicit class CreateUserLegalDataMutableBuilder[Self <: CreateUserLegalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyNumber(value: String): Self = StObject.set(x, "CompanyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNumberUndefined: Self = StObject.set(x, "CompanyNumber", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
    
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
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}

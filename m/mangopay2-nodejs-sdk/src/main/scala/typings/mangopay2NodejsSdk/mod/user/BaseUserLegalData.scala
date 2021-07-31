package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserLegalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData | 'CompanyNumber' | 'LegalRepresentativeEmail' | 'LegalRepresentativeAddress' | 'HeadquartersAddress' | 'Tag'> */
trait BaseUserLegalData extends StObject {
  
  var CompanyNumber: js.UndefOr[String] = js.undefined
  
  var Email: js.UndefOr[String] = js.undefined
  
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  
  var LegalPersonType: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.LegalPersonType] = js.undefined
  
  var LegalRepresentativeAddress: js.UndefOr[AddressType] = js.undefined
  
  var LegalRepresentativeBirthday: js.UndefOr[Timestamp] = js.undefined
  
  var LegalRepresentativeCountryOfResidence: js.UndefOr[CountryISO] = js.undefined
  
  var LegalRepresentativeEmail: js.UndefOr[String] = js.undefined
  
  var LegalRepresentativeFirstName: js.UndefOr[String] = js.undefined
  
  var LegalRepresentativeLastName: js.UndefOr[String] = js.undefined
  
  var LegalRepresentativeNationality: js.UndefOr[CountryISO] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
  
  var PersonType: LEGAL
  
  var Tag: js.UndefOr[String] = js.undefined
}
object BaseUserLegalData {
  
  @scala.inline
  def apply(): BaseUserLegalData = {
    val __obj = js.Dynamic.literal(PersonType = "LEGAL")
    __obj.asInstanceOf[BaseUserLegalData]
  }
  
  @scala.inline
  implicit class BaseUserLegalDataMutableBuilder[Self <: BaseUserLegalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyNumber(value: String): Self = StObject.set(x, "CompanyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNumberUndefined: Self = StObject.set(x, "CompanyNumber", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
    
    @scala.inline
    def setLegalPersonType(value: LegalPersonType): Self = StObject.set(x, "LegalPersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalPersonTypeUndefined: Self = StObject.set(x, "LegalPersonType", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeAddress(value: AddressType): Self = StObject.set(x, "LegalRepresentativeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeAddressUndefined: Self = StObject.set(x, "LegalRepresentativeAddress", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeBirthday(value: Timestamp): Self = StObject.set(x, "LegalRepresentativeBirthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeBirthdayUndefined: Self = StObject.set(x, "LegalRepresentativeBirthday", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeCountryOfResidence(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeCountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeCountryOfResidenceUndefined: Self = StObject.set(x, "LegalRepresentativeCountryOfResidence", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeEmail(value: String): Self = StObject.set(x, "LegalRepresentativeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeEmailUndefined: Self = StObject.set(x, "LegalRepresentativeEmail", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeFirstName(value: String): Self = StObject.set(x, "LegalRepresentativeFirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeFirstNameUndefined: Self = StObject.set(x, "LegalRepresentativeFirstName", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeLastName(value: String): Self = StObject.set(x, "LegalRepresentativeLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeLastNameUndefined: Self = StObject.set(x, "LegalRepresentativeLastName", js.undefined)
    
    @scala.inline
    def setLegalRepresentativeNationality(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeNationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalRepresentativeNationalityUndefined: Self = StObject.set(x, "LegalRepresentativeNationality", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPersonType(value: LEGAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}

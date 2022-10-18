package typings.mangopay2NodejsSdk.typingsModelsUserMod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.UserLegalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.RequiredUserLegalData | 'CompanyNumber' | 'LegalRepresentativeEmail' | 'LegalRepresentativeAddress' | 'HeadquartersAddress' | 'Tag' | 'TermsAndConditionsAccepted' | 'UserCategory'> */
trait BaseUserLegalData extends StObject {
  
  var CompanyNumber: js.UndefOr[String] = js.undefined
  
  var Email: js.UndefOr[String] = js.undefined
  
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  
  var LegalPersonType: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsUserMod.user.LegalPersonType] = js.undefined
  
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
  
  var TermsAndConditionsAccepted: js.UndefOr[Boolean] = js.undefined
  
  var UserCategory: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory] = js.undefined
}
object BaseUserLegalData {
  
  inline def apply(): BaseUserLegalData = {
    val __obj = js.Dynamic.literal(PersonType = "LEGAL")
    __obj.asInstanceOf[BaseUserLegalData]
  }
  
  extension [Self <: BaseUserLegalData](x: Self) {
    
    inline def setCompanyNumber(value: String): Self = StObject.set(x, "CompanyNumber", value.asInstanceOf[js.Any])
    
    inline def setCompanyNumberUndefined: Self = StObject.set(x, "CompanyNumber", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    inline def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
    
    inline def setLegalPersonType(value: LegalPersonType): Self = StObject.set(x, "LegalPersonType", value.asInstanceOf[js.Any])
    
    inline def setLegalPersonTypeUndefined: Self = StObject.set(x, "LegalPersonType", js.undefined)
    
    inline def setLegalRepresentativeAddress(value: AddressType): Self = StObject.set(x, "LegalRepresentativeAddress", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeAddressUndefined: Self = StObject.set(x, "LegalRepresentativeAddress", js.undefined)
    
    inline def setLegalRepresentativeBirthday(value: Timestamp): Self = StObject.set(x, "LegalRepresentativeBirthday", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeBirthdayUndefined: Self = StObject.set(x, "LegalRepresentativeBirthday", js.undefined)
    
    inline def setLegalRepresentativeCountryOfResidence(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeCountryOfResidence", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeCountryOfResidenceUndefined: Self = StObject.set(x, "LegalRepresentativeCountryOfResidence", js.undefined)
    
    inline def setLegalRepresentativeEmail(value: String): Self = StObject.set(x, "LegalRepresentativeEmail", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeEmailUndefined: Self = StObject.set(x, "LegalRepresentativeEmail", js.undefined)
    
    inline def setLegalRepresentativeFirstName(value: String): Self = StObject.set(x, "LegalRepresentativeFirstName", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeFirstNameUndefined: Self = StObject.set(x, "LegalRepresentativeFirstName", js.undefined)
    
    inline def setLegalRepresentativeLastName(value: String): Self = StObject.set(x, "LegalRepresentativeLastName", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeLastNameUndefined: Self = StObject.set(x, "LegalRepresentativeLastName", js.undefined)
    
    inline def setLegalRepresentativeNationality(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeNationality", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeNationalityUndefined: Self = StObject.set(x, "LegalRepresentativeNationality", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPersonType(value: LEGAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setTermsAndConditionsAccepted(value: Boolean): Self = StObject.set(x, "TermsAndConditionsAccepted", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsAcceptedUndefined: Self = StObject.set(x, "TermsAndConditionsAccepted", js.undefined)
    
    inline def setUserCategory(value: UserCategory): Self = StObject.set(x, "UserCategory", value.asInstanceOf[js.Any])
    
    inline def setUserCategoryUndefined: Self = StObject.set(x, "UserCategory", js.undefined)
  }
}

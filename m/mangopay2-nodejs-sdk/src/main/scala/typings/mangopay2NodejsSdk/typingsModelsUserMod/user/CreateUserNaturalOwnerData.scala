package typings.mangopay2NodejsSdk.typingsModelsUserMod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.MakeKeysRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.BaseUserNaturalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.RequiredUserNaturalOwnerData | 'PersonType'> */
/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.UserNaturalData, 'Address' | 'Tag' | 'Occupation' | 'IncomeRange' | 'UserCategory'> */
trait CreateUserNaturalOwnerData extends StObject {
  
  var Address: js.UndefOr[String | AddressData] = js.undefined
  
  var Birthday: Timestamp
  
  var CountryOfResidence: CountryISO
  
  var Email: String
  
  var FirstName: String
  
  var IncomeRange: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsUserMod.user.IncomeRange] = js.undefined
  
  var LastName: String
  
  var Nationality: CountryISO
  
  var Occupation: js.UndefOr[String] = js.undefined
  
  var PersonType: NATURAL
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var TermsAndConditionsAccepted: Boolean
  
  var UserCategory: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory] = js.undefined
}
object CreateUserNaturalOwnerData {
  
  inline def apply(
    Birthday: Timestamp,
    CountryOfResidence: CountryISO,
    Email: String,
    FirstName: String,
    LastName: String,
    Nationality: CountryISO,
    TermsAndConditionsAccepted: Boolean
  ): CreateUserNaturalOwnerData = {
    val __obj = js.Dynamic.literal(Birthday = Birthday.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], PersonType = "NATURAL", TermsAndConditionsAccepted = TermsAndConditionsAccepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserNaturalOwnerData]
  }
  
  extension [Self <: CreateUserNaturalOwnerData](x: Self) {
    
    inline def setAddress(value: String | AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
    
    inline def setCountryOfResidence(value: CountryISO): Self = StObject.set(x, "CountryOfResidence", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setIncomeRange(value: IncomeRange): Self = StObject.set(x, "IncomeRange", value.asInstanceOf[js.Any])
    
    inline def setIncomeRangeUndefined: Self = StObject.set(x, "IncomeRange", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setNationality(value: CountryISO): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
    
    inline def setOccupation(value: String): Self = StObject.set(x, "Occupation", value.asInstanceOf[js.Any])
    
    inline def setOccupationUndefined: Self = StObject.set(x, "Occupation", js.undefined)
    
    inline def setPersonType(value: NATURAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setTermsAndConditionsAccepted(value: Boolean): Self = StObject.set(x, "TermsAndConditionsAccepted", value.asInstanceOf[js.Any])
    
    inline def setUserCategory(value: UserCategory): Self = StObject.set(x, "UserCategory", value.asInstanceOf[js.Any])
    
    inline def setUserCategoryUndefined: Self = StObject.set(x, "UserCategory", js.undefined)
  }
}

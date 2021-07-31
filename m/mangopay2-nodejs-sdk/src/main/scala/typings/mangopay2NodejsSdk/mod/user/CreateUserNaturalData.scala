package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.BaseUserNaturalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData | 'PersonType'> */
trait CreateUserNaturalData extends StObject {
  
  var Address: js.UndefOr[String | AddressData] = js.undefined
  
  var Birthday: Timestamp
  
  var CountryOfResidence: CountryISO
  
  var Email: String
  
  var FirstName: String
  
  var IncomeRange: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.IncomeRange] = js.undefined
  
  var LastName: String
  
  var Nationality: CountryISO
  
  var Occupation: js.UndefOr[String] = js.undefined
  
  var PersonType: NATURAL
  
  var Tag: js.UndefOr[String] = js.undefined
}
object CreateUserNaturalData {
  
  @scala.inline
  def apply(
    Birthday: Timestamp,
    CountryOfResidence: CountryISO,
    Email: String,
    FirstName: String,
    LastName: String,
    Nationality: CountryISO
  ): CreateUserNaturalData = {
    val __obj = js.Dynamic.literal(Birthday = Birthday.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], PersonType = "NATURAL")
    __obj.asInstanceOf[CreateUserNaturalData]
  }
  
  @scala.inline
  implicit class CreateUserNaturalDataMutableBuilder[Self <: CreateUserNaturalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String | AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfResidence(value: CountryISO): Self = StObject.set(x, "CountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomeRange(value: IncomeRange): Self = StObject.set(x, "IncomeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomeRangeUndefined: Self = StObject.set(x, "IncomeRange", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationality(value: CountryISO): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupation(value: String): Self = StObject.set(x, "Occupation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupationUndefined: Self = StObject.set(x, "Occupation", js.undefined)
    
    @scala.inline
    def setPersonType(value: NATURAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}

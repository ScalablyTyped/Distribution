package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData | 'Address' | 'Occupation' | 'IncomeRange' | 'Tag'> */
@js.native
trait BaseUserNaturalData extends StObject {
  
  var Address: js.UndefOr[String | AddressData] = js.native
  
  var Birthday: js.UndefOr[Timestamp] = js.native
  
  var CountryOfResidence: js.UndefOr[CountryISO] = js.native
  
  var Email: js.UndefOr[String] = js.native
  
  var FirstName: js.UndefOr[String] = js.native
  
  var IncomeRange: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.IncomeRange] = js.native
  
  var LastName: js.UndefOr[String] = js.native
  
  var Nationality: js.UndefOr[CountryISO] = js.native
  
  var Occupation: js.UndefOr[String] = js.native
  
  var PersonType: NATURAL = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object BaseUserNaturalData {
  
  @scala.inline
  def apply(PersonType: NATURAL): BaseUserNaturalData = {
    val __obj = js.Dynamic.literal(PersonType = PersonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUserNaturalData]
  }
  
  @scala.inline
  implicit class BaseUserNaturalDataMutableBuilder[Self <: BaseUserNaturalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String | AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthdayUndefined: Self = StObject.set(x, "Birthday", js.undefined)
    
    @scala.inline
    def setCountryOfResidence(value: CountryISO): Self = StObject.set(x, "CountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfResidenceUndefined: Self = StObject.set(x, "CountryOfResidence", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    @scala.inline
    def setIncomeRange(value: IncomeRange): Self = StObject.set(x, "IncomeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomeRangeUndefined: Self = StObject.set(x, "IncomeRange", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    @scala.inline
    def setNationality(value: CountryISO): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationalityUndefined: Self = StObject.set(x, "Nationality", js.undefined)
    
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

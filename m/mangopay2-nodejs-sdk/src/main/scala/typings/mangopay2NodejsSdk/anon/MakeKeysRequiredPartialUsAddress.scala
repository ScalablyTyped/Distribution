package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.mod.user.IncomeRange
import typings.mangopay2NodejsSdk.mod.user.KYCLevel
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData> */
@js.native
trait MakeKeysRequiredPartialUsAddress extends StObject {
  
  var Address: js.UndefOr[String | AddressData] = js.native
  
  var Birthday: Timestamp = js.native
  
  var Capacity: js.UndefOr[NORMAL | DECLARATIVE] = js.native
  
  var CountryOfResidence: CountryISO = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var Email: String = js.native
  
  var FirstName: String = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var IncomeRange: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.IncomeRange] = js.native
  
  var KYCLevel: js.UndefOr[typings.mangopay2NodejsSdk.mod.user.KYCLevel] = js.native
  
  var LastName: String = js.native
  
  var Nationality: CountryISO = js.native
  
  var Occupation: js.UndefOr[String] = js.native
  
  var PersonType: js.UndefOr[NATURAL] = js.native
  
  var ProofOfAddress: js.UndefOr[String | Null] = js.native
  
  var ProofOfIdentity: js.UndefOr[String | Null] = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object MakeKeysRequiredPartialUsAddress {
  
  @scala.inline
  def apply(
    Birthday: Timestamp,
    CountryOfResidence: CountryISO,
    Email: String,
    FirstName: String,
    LastName: String,
    Nationality: CountryISO
  ): MakeKeysRequiredPartialUsAddress = {
    val __obj = js.Dynamic.literal(Birthday = Birthday.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUsAddress]
  }
  
  @scala.inline
  implicit class MakeKeysRequiredPartialUsAddressMutableBuilder[Self <: MakeKeysRequiredPartialUsAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String | AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: NORMAL | DECLARATIVE): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    @scala.inline
    def setCountryOfResidence(value: CountryISO): Self = StObject.set(x, "CountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIncomeRange(value: IncomeRange): Self = StObject.set(x, "IncomeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomeRangeUndefined: Self = StObject.set(x, "IncomeRange", js.undefined)
    
    @scala.inline
    def setKYCLevel(value: KYCLevel): Self = StObject.set(x, "KYCLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKYCLevelUndefined: Self = StObject.set(x, "KYCLevel", js.undefined)
    
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
    def setPersonTypeUndefined: Self = StObject.set(x, "PersonType", js.undefined)
    
    @scala.inline
    def setProofOfAddress(value: String): Self = StObject.set(x, "ProofOfAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfAddressNull: Self = StObject.set(x, "ProofOfAddress", null)
    
    @scala.inline
    def setProofOfAddressUndefined: Self = StObject.set(x, "ProofOfAddress", js.undefined)
    
    @scala.inline
    def setProofOfIdentity(value: String): Self = StObject.set(x, "ProofOfIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfIdentityNull: Self = StObject.set(x, "ProofOfIdentity", null)
    
    @scala.inline
    def setProofOfIdentityUndefined: Self = StObject.set(x, "ProofOfIdentity", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}

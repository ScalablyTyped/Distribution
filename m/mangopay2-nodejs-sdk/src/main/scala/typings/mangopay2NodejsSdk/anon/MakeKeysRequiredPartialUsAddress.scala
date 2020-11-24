package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.mod.user.IncomeRange
import typings.mangopay2NodejsSdk.mod.user.KYCLevel
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData> */
@js.native
trait MakeKeysRequiredPartialUsAddress extends js.Object {
  
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
  implicit class MakeKeysRequiredPartialUsAddressOps[Self <: MakeKeysRequiredPartialUsAddress] (val x: Self) extends AnyVal {
    
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
    def setBirthday(value: Timestamp): Self = this.set("Birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfResidence(value: CountryISO): Self = this.set("CountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = this.set("LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationality(value: CountryISO): Self = this.set("Nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String | AddressData): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setCapacity(value: NORMAL | DECLARATIVE): Self = this.set("Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("Capacity", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIncomeRange(value: IncomeRange): Self = this.set("IncomeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomeRange: Self = this.set("IncomeRange", js.undefined)
    
    @scala.inline
    def setKYCLevel(value: KYCLevel): Self = this.set("KYCLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKYCLevel: Self = this.set("KYCLevel", js.undefined)
    
    @scala.inline
    def setOccupation(value: String): Self = this.set("Occupation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccupation: Self = this.set("Occupation", js.undefined)
    
    @scala.inline
    def setPersonType(value: NATURAL): Self = this.set("PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonType: Self = this.set("PersonType", js.undefined)
    
    @scala.inline
    def setProofOfAddress(value: String): Self = this.set("ProofOfAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProofOfAddress: Self = this.set("ProofOfAddress", js.undefined)
    
    @scala.inline
    def setProofOfAddressNull: Self = this.set("ProofOfAddress", null)
    
    @scala.inline
    def setProofOfIdentity(value: String): Self = this.set("ProofOfIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProofOfIdentity: Self = this.set("ProofOfIdentity", js.undefined)
    
    @scala.inline
    def setProofOfIdentityNull: Self = this.set("ProofOfIdentity", null)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}

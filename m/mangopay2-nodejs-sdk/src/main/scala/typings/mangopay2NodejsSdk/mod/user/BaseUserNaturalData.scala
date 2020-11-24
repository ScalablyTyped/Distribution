package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData | 'Address' | 'Occupation' | 'IncomeRange' | 'Tag'> */
@js.native
trait BaseUserNaturalData extends js.Object {
  
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
  implicit class BaseUserNaturalDataOps[Self <: BaseUserNaturalData] (val x: Self) extends AnyVal {
    
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
    def setPersonType(value: NATURAL): Self = this.set("PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String | AddressData): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setBirthday(value: Timestamp): Self = this.set("Birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthday: Self = this.set("Birthday", js.undefined)
    
    @scala.inline
    def setCountryOfResidence(value: CountryISO): Self = this.set("CountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryOfResidence: Self = this.set("CountryOfResidence", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    
    @scala.inline
    def setIncomeRange(value: IncomeRange): Self = this.set("IncomeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomeRange: Self = this.set("IncomeRange", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
    
    @scala.inline
    def setNationality(value: CountryISO): Self = this.set("Nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNationality: Self = this.set("Nationality", js.undefined)
    
    @scala.inline
    def setOccupation(value: String): Self = this.set("Occupation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccupation: Self = this.set("Occupation", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}

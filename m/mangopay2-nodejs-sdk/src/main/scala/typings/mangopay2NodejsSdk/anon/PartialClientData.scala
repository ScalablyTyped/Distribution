package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.client.PlatformCategorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.client.ClientData> */
@js.native
trait PartialClientData extends js.Object {
  
  var AdminEmails: js.UndefOr[js.Array[String]] = js.native
  
  var BillingEmails: js.UndefOr[js.Array[String]] = js.native
  
  var ClientId: js.UndefOr[String] = js.native
  
  var CompanyReference: js.UndefOr[String] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var FraudEmails: js.UndefOr[js.Array[String]] = js.native
  
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var Logo: js.UndefOr[String] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var PlatformCategorization: js.UndefOr[typings.mangopay2NodejsSdk.mod.client.PlatformCategorization] = js.native
  
  var PlatformDescription: js.UndefOr[String] = js.native
  
  var PlatformURL: js.UndefOr[String] = js.native
  
  var PrimaryButtonColour: js.UndefOr[String] = js.native
  
  var PrimaryThemeColour: js.UndefOr[String] = js.native
  
  var RegisteredName: js.UndefOr[String] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var TaxNumber: js.UndefOr[String] = js.native
  
  var TechEmails: js.UndefOr[js.Array[String]] = js.native
}
object PartialClientData {
  
  @scala.inline
  def apply(): PartialClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientData]
  }
  
  @scala.inline
  implicit class PartialClientDataOps[Self <: PartialClientData] (val x: Self) extends AnyVal {
    
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
    def setAdminEmailsVarargs(value: String*): Self = this.set("AdminEmails", js.Array(value :_*))
    
    @scala.inline
    def setAdminEmails(value: js.Array[String]): Self = this.set("AdminEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminEmails: Self = this.set("AdminEmails", js.undefined)
    
    @scala.inline
    def setBillingEmailsVarargs(value: String*): Self = this.set("BillingEmails", js.Array(value :_*))
    
    @scala.inline
    def setBillingEmails(value: js.Array[String]): Self = this.set("BillingEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingEmails: Self = this.set("BillingEmails", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    
    @scala.inline
    def setCompanyReference(value: String): Self = this.set("CompanyReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyReference: Self = this.set("CompanyReference", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setFraudEmailsVarargs(value: String*): Self = this.set("FraudEmails", js.Array(value :_*))
    
    @scala.inline
    def setFraudEmails(value: js.Array[String]): Self = this.set("FraudEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFraudEmails: Self = this.set("FraudEmails", js.undefined)
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = this.set("HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadquartersAddress: Self = this.set("HeadquartersAddress", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = this.set("Logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("Logo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPlatformCategorization(value: PlatformCategorization): Self = this.set("PlatformCategorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformCategorization: Self = this.set("PlatformCategorization", js.undefined)
    
    @scala.inline
    def setPlatformDescription(value: String): Self = this.set("PlatformDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformDescription: Self = this.set("PlatformDescription", js.undefined)
    
    @scala.inline
    def setPlatformURL(value: String): Self = this.set("PlatformURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformURL: Self = this.set("PlatformURL", js.undefined)
    
    @scala.inline
    def setPrimaryButtonColour(value: String): Self = this.set("PrimaryButtonColour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryButtonColour: Self = this.set("PrimaryButtonColour", js.undefined)
    
    @scala.inline
    def setPrimaryThemeColour(value: String): Self = this.set("PrimaryThemeColour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryThemeColour: Self = this.set("PrimaryThemeColour", js.undefined)
    
    @scala.inline
    def setRegisteredName(value: String): Self = this.set("RegisteredName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredName: Self = this.set("RegisteredName", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    
    @scala.inline
    def setTaxNumber(value: String): Self = this.set("TaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxNumber: Self = this.set("TaxNumber", js.undefined)
    
    @scala.inline
    def setTechEmailsVarargs(value: String*): Self = this.set("TechEmails", js.Array(value :_*))
    
    @scala.inline
    def setTechEmails(value: js.Array[String]): Self = this.set("TechEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechEmails: Self = this.set("TechEmails", js.undefined)
  }
}

package typings.mangopay2NodejsSdk.mod.client

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientData extends EntityBaseData {
  
  /**
    * A list of email addresses to use when contacting you for admin/commercial issues/communications
    */
  var AdminEmails: js.Array[String] = js.native
  
  /**
    * A list of email addresses to use when contacting you for billing issues/communications
    */
  var BillingEmails: js.Array[String] = js.native
  
  /**
    * An ID for the client (i.e. url friendly, lowercase etc - sort of namespace identifier)
    */
  var ClientId: String = js.native
  
  /**
    * Your unique MANGOPAY reference which you should use when contacting us
    */
  var CompanyReference: String = js.native
  
  /**
    * A list of email addresses to use when contacting you for fraud/compliance issues/communications
    */
  var FraudEmails: js.Array[String] = js.native
  
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: AddressType = js.native
  
  /**
    * The URL of the logo of your client
    */
  var Logo: String = js.native
  
  /**
    * The pretty name for the client
    */
  var Name: String = js.native
  
  /**
    * The Categorization of your platform, in terms of Business Type and Sector
    */
  var PlatformCategorization: typings.mangopay2NodejsSdk.mod.client.PlatformCategorization = js.native
  
  /**
    * A description of what your platform does
    */
  var PlatformDescription: String = js.native
  
  /**
    * The URL for your website
    */
  var PlatformURL: String = js.native
  
  /**
    * The primary branding colour to use for buttons for your merchant
    */
  var PrimaryButtonColour: String = js.native
  
  /**
    * The primary branding colour to use for your merchant
    */
  var PrimaryThemeColour: String = js.native
  
  /**
    * The registered name of your company
    */
  var RegisteredName: String = js.native
  
  /**
    * The tax (or VAT) number for your company
    */
  var TaxNumber: String = js.native
  
  /**
    * A list of email addresses to use when contacting you for technical issues/communications
    */
  var TechEmails: js.Array[String] = js.native
}
object ClientData {
  
  @scala.inline
  def apply(
    AdminEmails: js.Array[String],
    BillingEmails: js.Array[String],
    ClientId: String,
    CompanyReference: String,
    CreationDate: Double,
    FraudEmails: js.Array[String],
    HeadquartersAddress: AddressType,
    Id: String,
    Logo: String,
    Name: String,
    PlatformCategorization: PlatformCategorization,
    PlatformDescription: String,
    PlatformURL: String,
    PrimaryButtonColour: String,
    PrimaryThemeColour: String,
    RegisteredName: String,
    Tag: String,
    TaxNumber: String,
    TechEmails: js.Array[String]
  ): ClientData = {
    val __obj = js.Dynamic.literal(AdminEmails = AdminEmails.asInstanceOf[js.Any], BillingEmails = BillingEmails.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], CompanyReference = CompanyReference.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], FraudEmails = FraudEmails.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Logo = Logo.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlatformCategorization = PlatformCategorization.asInstanceOf[js.Any], PlatformDescription = PlatformDescription.asInstanceOf[js.Any], PlatformURL = PlatformURL.asInstanceOf[js.Any], PrimaryButtonColour = PrimaryButtonColour.asInstanceOf[js.Any], PrimaryThemeColour = PrimaryThemeColour.asInstanceOf[js.Any], RegisteredName = RegisteredName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TaxNumber = TaxNumber.asInstanceOf[js.Any], TechEmails = TechEmails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientData]
  }
  
  @scala.inline
  implicit class ClientDataOps[Self <: ClientData] (val x: Self) extends AnyVal {
    
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
    def setBillingEmailsVarargs(value: String*): Self = this.set("BillingEmails", js.Array(value :_*))
    
    @scala.inline
    def setBillingEmails(value: js.Array[String]): Self = this.set("BillingEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyReference(value: String): Self = this.set("CompanyReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraudEmailsVarargs(value: String*): Self = this.set("FraudEmails", js.Array(value :_*))
    
    @scala.inline
    def setFraudEmails(value: js.Array[String]): Self = this.set("FraudEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersAddress(value: AddressType): Self = this.set("HeadquartersAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: String): Self = this.set("Logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformCategorization(value: PlatformCategorization): Self = this.set("PlatformCategorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformDescription(value: String): Self = this.set("PlatformDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformURL(value: String): Self = this.set("PlatformURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryButtonColour(value: String): Self = this.set("PrimaryButtonColour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryThemeColour(value: String): Self = this.set("PrimaryThemeColour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredName(value: String): Self = this.set("RegisteredName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxNumber(value: String): Self = this.set("TaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechEmailsVarargs(value: String*): Self = this.set("TechEmails", js.Array(value :_*))
    
    @scala.inline
    def setTechEmails(value: js.Array[String]): Self = this.set("TechEmails", value.asInstanceOf[js.Any])
  }
}

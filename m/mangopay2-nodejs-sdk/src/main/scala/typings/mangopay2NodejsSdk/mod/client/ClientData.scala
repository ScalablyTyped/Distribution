package typings.mangopay2NodejsSdk.mod.client

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientData extends EntityBaseData {
  /**
    * A list of email addresses to use when contacting you for admin/commercial issues/communications
    */
  var AdminEmails: js.Array[String]
  /**
    * A list of email addresses to use when contacting you for billing issues/communications
    */
  var BillingEmails: js.Array[String]
  /**
    * An ID for the client (i.e. url friendly, lowercase etc - sort of namespace identifier)
    */
  var ClientId: String
  /**
    * Your unique MANGOPAY reference which you should use when contacting us
    */
  var CompanyReference: String
  /**
    * A list of email addresses to use when contacting you for fraud/compliance issues/communications
    */
  var FraudEmails: js.Array[String]
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: AddressType
  /**
    * The URL of the logo of your client
    */
  var Logo: String
  /**
    * The pretty name for the client
    */
  var Name: String
  /**
    * The Categorization of your platform, in terms of Business Type and Sector
    */
  var PlatformCategorization: typings.mangopay2NodejsSdk.mod.client.PlatformCategorization
  /**
    * A description of what your platform does
    */
  var PlatformDescription: String
  /**
    * The URL for your website
    */
  var PlatformURL: String
  /**
    * The primary branding colour to use for buttons for your merchant
    */
  var PrimaryButtonColour: String
  /**
    * The primary branding colour to use for your merchant
    */
  var PrimaryThemeColour: String
  /**
    * The registered name of your company
    */
  var RegisteredName: String
  /**
    * The tax (or VAT) number for your company
    */
  var TaxNumber: String
  /**
    * A list of email addresses to use when contacting you for technical issues/communications
    */
  var TechEmails: js.Array[String]
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
}


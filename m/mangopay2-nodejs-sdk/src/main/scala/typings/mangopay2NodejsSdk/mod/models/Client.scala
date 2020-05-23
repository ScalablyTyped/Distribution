package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialClientData
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.client.ClientData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Client")
@js.native
class Client ()
  extends EntityBase[ClientData]
     with ClientData {
  def this(data: PartialClientData) = this()
  /**
    * A list of email addresses to use when contacting you for admin/commercial issues/communications
    */
  /* CompleteClass */
  override var AdminEmails: js.Array[String] = js.native
  /**
    * A list of email addresses to use when contacting you for billing issues/communications
    */
  /* CompleteClass */
  override var BillingEmails: js.Array[String] = js.native
  /**
    * An ID for the client (i.e. url friendly, lowercase etc - sort of namespace identifier)
    */
  /* CompleteClass */
  override var ClientId: String = js.native
  /**
    * Your unique MANGOPAY reference which you should use when contacting us
    */
  /* CompleteClass */
  override var CompanyReference: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * A list of email addresses to use when contacting you for fraud/compliance issues/communications
    */
  /* CompleteClass */
  override var FraudEmails: js.Array[String] = js.native
  /**
    * The address of the company’s headquarters
    */
  /* CompleteClass */
  override var HeadquartersAddress: AddressType = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The URL of the logo of your client
    */
  /* CompleteClass */
  override var Logo: String = js.native
  /**
    * The pretty name for the client
    */
  /* CompleteClass */
  override var Name: String = js.native
  /**
    * The Categorization of your platform, in terms of Business Type and Sector
    */
  /* CompleteClass */
  override var PlatformCategorization: typings.mangopay2NodejsSdk.mod.client.PlatformCategorization = js.native
  /**
    * A description of what your platform does
    */
  /* CompleteClass */
  override var PlatformDescription: String = js.native
  /**
    * The URL for your website
    */
  /* CompleteClass */
  override var PlatformURL: String = js.native
  /**
    * The primary branding colour to use for buttons for your merchant
    */
  /* CompleteClass */
  override var PrimaryButtonColour: String = js.native
  /**
    * The primary branding colour to use for your merchant
    */
  /* CompleteClass */
  override var PrimaryThemeColour: String = js.native
  /**
    * The registered name of your company
    */
  /* CompleteClass */
  override var RegisteredName: String = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The tax (or VAT) number for your company
    */
  /* CompleteClass */
  override var TaxNumber: String = js.native
  /**
    * A list of email addresses to use when contacting you for technical issues/communications
    */
  /* CompleteClass */
  override var TechEmails: js.Array[String] = js.native
}


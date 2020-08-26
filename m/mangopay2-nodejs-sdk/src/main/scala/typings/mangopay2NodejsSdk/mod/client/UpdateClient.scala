package typings.mangopay2NodejsSdk.mod.client

import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClient extends js.Object {
  /**
    * A list of email addresses to use when contacting you for admin/commercial issues/communications
    */
  var AdminEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of email addresses to use when contacting you for billing issues/communications
    */
  var BillingEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of email addresses to use when contacting you for fraud/compliance issues/communications
    */
  var FraudEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  /**
    * A description of what your platform does
    */
  var PlatformDescription: js.UndefOr[String] = js.native
  /**
    * The type of platform
    */
  var PlatformType: js.UndefOr[typings.mangopay2NodejsSdk.mod.client.PlatformType] = js.native
  /**
    * The URL for your website
    */
  var PlatformURL: js.UndefOr[String] = js.native
  /**
    * The primary branding colour to use for buttons for your merchant
    */
  var PrimaryButtonColour: js.UndefOr[String] = js.native
  /**
    * The primary branding colour to use for your merchant
    */
  var PrimaryThemeColour: js.UndefOr[String] = js.native
  /**
    * The tax (or VAT) number for your company
    */
  var TaxNumber: js.UndefOr[String] = js.native
  /**
    * A list of email addresses to use when contacting you for technical issues/communications
    */
  var TechEmails: js.UndefOr[js.Array[String]] = js.native
}

object UpdateClient {
  @scala.inline
  def apply(): UpdateClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClient]
  }
  @scala.inline
  implicit class UpdateClientOps[Self <: UpdateClient] (val x: Self) extends AnyVal {
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
    def setPlatformDescription(value: String): Self = this.set("PlatformDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformDescription: Self = this.set("PlatformDescription", js.undefined)
    @scala.inline
    def setPlatformType(value: PlatformType): Self = this.set("PlatformType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformType: Self = this.set("PlatformType", js.undefined)
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


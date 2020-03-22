package typings.mangopay2NodejsSdk.mod.client

import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClient extends js.Object {
  /**
    * A list of email addresses to use when contacting you for admin/commercial issues/communications
    */
  var AdminEmails: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of email addresses to use when contacting you for billing issues/communications
    */
  var BillingEmails: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of email addresses to use when contacting you for fraud/compliance issues/communications
    */
  var FraudEmails: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  /**
    * A description of what your platform does
    */
  var PlatformDescription: js.UndefOr[String] = js.undefined
  /**
    * The type of platform
    */
  var PlatformType: js.UndefOr[typings.mangopay2NodejsSdk.mod.client.PlatformType] = js.undefined
  /**
    * The URL for your website
    */
  var PlatformURL: js.UndefOr[String] = js.undefined
  /**
    * The primary branding colour to use for buttons for your merchant
    */
  var PrimaryButtonColour: js.UndefOr[String] = js.undefined
  /**
    * The primary branding colour to use for your merchant
    */
  var PrimaryThemeColour: js.UndefOr[String] = js.undefined
  /**
    * The tax (or VAT) number for your company
    */
  var TaxNumber: js.UndefOr[String] = js.undefined
  /**
    * A list of email addresses to use when contacting you for technical issues/communications
    */
  var TechEmails: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdateClient {
  @scala.inline
  def apply(
    AdminEmails: js.Array[String] = null,
    BillingEmails: js.Array[String] = null,
    FraudEmails: js.Array[String] = null,
    HeadquartersAddress: AddressType = null,
    PlatformDescription: String = null,
    PlatformType: PlatformType = null,
    PlatformURL: String = null,
    PrimaryButtonColour: String = null,
    PrimaryThemeColour: String = null,
    TaxNumber: String = null,
    TechEmails: js.Array[String] = null
  ): UpdateClient = {
    val __obj = js.Dynamic.literal()
    if (AdminEmails != null) __obj.updateDynamic("AdminEmails")(AdminEmails.asInstanceOf[js.Any])
    if (BillingEmails != null) __obj.updateDynamic("BillingEmails")(BillingEmails.asInstanceOf[js.Any])
    if (FraudEmails != null) __obj.updateDynamic("FraudEmails")(FraudEmails.asInstanceOf[js.Any])
    if (HeadquartersAddress != null) __obj.updateDynamic("HeadquartersAddress")(HeadquartersAddress.asInstanceOf[js.Any])
    if (PlatformDescription != null) __obj.updateDynamic("PlatformDescription")(PlatformDescription.asInstanceOf[js.Any])
    if (PlatformType != null) __obj.updateDynamic("PlatformType")(PlatformType.asInstanceOf[js.Any])
    if (PlatformURL != null) __obj.updateDynamic("PlatformURL")(PlatformURL.asInstanceOf[js.Any])
    if (PrimaryButtonColour != null) __obj.updateDynamic("PrimaryButtonColour")(PrimaryButtonColour.asInstanceOf[js.Any])
    if (PrimaryThemeColour != null) __obj.updateDynamic("PrimaryThemeColour")(PrimaryThemeColour.asInstanceOf[js.Any])
    if (TaxNumber != null) __obj.updateDynamic("TaxNumber")(TaxNumber.asInstanceOf[js.Any])
    if (TechEmails != null) __obj.updateDynamic("TechEmails")(TechEmails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClient]
  }
}


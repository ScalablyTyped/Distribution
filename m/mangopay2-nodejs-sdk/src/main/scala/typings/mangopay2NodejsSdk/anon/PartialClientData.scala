package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.client.PlatformCategorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.client.ClientData> */
trait PartialClientData extends js.Object {
  var AdminEmails: js.UndefOr[js.Array[String]] = js.undefined
  var BillingEmails: js.UndefOr[js.Array[String]] = js.undefined
  var ClientId: js.UndefOr[String] = js.undefined
  var CompanyReference: js.UndefOr[String] = js.undefined
  var CreationDate: js.UndefOr[Double] = js.undefined
  var FraudEmails: js.UndefOr[js.Array[String]] = js.undefined
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var Logo: js.UndefOr[String] = js.undefined
  var Name: js.UndefOr[String] = js.undefined
  var PlatformCategorization: js.UndefOr[typings.mangopay2NodejsSdk.mod.client.PlatformCategorization] = js.undefined
  var PlatformDescription: js.UndefOr[String] = js.undefined
  var PlatformURL: js.UndefOr[String] = js.undefined
  var PrimaryButtonColour: js.UndefOr[String] = js.undefined
  var PrimaryThemeColour: js.UndefOr[String] = js.undefined
  var RegisteredName: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var TaxNumber: js.UndefOr[String] = js.undefined
  var TechEmails: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialClientData {
  @scala.inline
  def apply(
    AdminEmails: js.Array[String] = null,
    BillingEmails: js.Array[String] = null,
    ClientId: String = null,
    CompanyReference: String = null,
    CreationDate: js.UndefOr[Double] = js.undefined,
    FraudEmails: js.Array[String] = null,
    HeadquartersAddress: AddressType = null,
    Id: String = null,
    Logo: String = null,
    Name: String = null,
    PlatformCategorization: PlatformCategorization = null,
    PlatformDescription: String = null,
    PlatformURL: String = null,
    PrimaryButtonColour: String = null,
    PrimaryThemeColour: String = null,
    RegisteredName: String = null,
    Tag: String = null,
    TaxNumber: String = null,
    TechEmails: js.Array[String] = null
  ): PartialClientData = {
    val __obj = js.Dynamic.literal()
    if (AdminEmails != null) __obj.updateDynamic("AdminEmails")(AdminEmails.asInstanceOf[js.Any])
    if (BillingEmails != null) __obj.updateDynamic("BillingEmails")(BillingEmails.asInstanceOf[js.Any])
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (CompanyReference != null) __obj.updateDynamic("CompanyReference")(CompanyReference.asInstanceOf[js.Any])
    if (!js.isUndefined(CreationDate)) __obj.updateDynamic("CreationDate")(CreationDate.get.asInstanceOf[js.Any])
    if (FraudEmails != null) __obj.updateDynamic("FraudEmails")(FraudEmails.asInstanceOf[js.Any])
    if (HeadquartersAddress != null) __obj.updateDynamic("HeadquartersAddress")(HeadquartersAddress.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Logo != null) __obj.updateDynamic("Logo")(Logo.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PlatformCategorization != null) __obj.updateDynamic("PlatformCategorization")(PlatformCategorization.asInstanceOf[js.Any])
    if (PlatformDescription != null) __obj.updateDynamic("PlatformDescription")(PlatformDescription.asInstanceOf[js.Any])
    if (PlatformURL != null) __obj.updateDynamic("PlatformURL")(PlatformURL.asInstanceOf[js.Any])
    if (PrimaryButtonColour != null) __obj.updateDynamic("PrimaryButtonColour")(PrimaryButtonColour.asInstanceOf[js.Any])
    if (PrimaryThemeColour != null) __obj.updateDynamic("PrimaryThemeColour")(PrimaryThemeColour.asInstanceOf[js.Any])
    if (RegisteredName != null) __obj.updateDynamic("RegisteredName")(RegisteredName.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (TaxNumber != null) __obj.updateDynamic("TaxNumber")(TaxNumber.asInstanceOf[js.Any])
    if (TechEmails != null) __obj.updateDynamic("TechEmails")(TechEmails.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientData]
  }
}


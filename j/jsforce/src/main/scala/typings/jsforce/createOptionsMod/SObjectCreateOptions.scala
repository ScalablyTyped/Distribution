package typings.jsforce.createOptionsMod

import typings.jsforce.salesforceIdMod.SalesforceId
import typings.jsforce.salesforceObjectOptionsMod.SObjectOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SObjectCreateOptions extends SObjectOptions {
  var AccountSource: js.UndefOr[String] = js.undefined
  var BillingCity: js.UndefOr[String] = js.undefined
  var BillingCountry: js.UndefOr[String] = js.undefined
  var BillingLatitude: js.UndefOr[Double] = js.undefined
  var BillingLongitude: js.UndefOr[Double] = js.undefined
  var BillingPostalCode: js.UndefOr[String] = js.undefined
  var BillingState: js.UndefOr[String] = js.undefined
  var BillingStreet: js.UndefOr[String] = js.undefined
  var CreatedById: js.UndefOr[SalesforceId] = js.undefined
  var CreatedDate: js.UndefOr[Date] = js.undefined
  var Description: js.UndefOr[String] = js.undefined
  var Industry: js.UndefOr[String] = js.undefined
  var IsDeleted: js.UndefOr[Boolean] = js.undefined
  var Jigsaw: js.UndefOr[String] = js.undefined
  var JigsawCompanyId: js.UndefOr[String] = js.undefined
  var LastActivityDate: js.UndefOr[Date] = js.undefined
  var LastModifiedById: js.UndefOr[SalesforceId] = js.undefined
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  var LastReferencedDate: js.UndefOr[Date] = js.undefined
  var LastViewedDate: js.UndefOr[Date] = js.undefined
  var MasterRecordId: js.UndefOr[SalesforceId] = js.undefined
  var NumberOfEmployees: js.UndefOr[Double] = js.undefined
  var OwnerId: js.UndefOr[SalesforceId] = js.undefined
  var ParentId: js.UndefOr[SalesforceId] = js.undefined
  var Phone: js.UndefOr[String] = js.undefined
  var ShippingCity: js.UndefOr[String] = js.undefined
  var ShippingCountry: js.UndefOr[String] = js.undefined
  var ShippingLatitude: js.UndefOr[Double] = js.undefined
  var ShippingLongitude: js.UndefOr[Double] = js.undefined
  var ShippingPostalCode: js.UndefOr[String] = js.undefined
  var ShippingState: js.UndefOr[String] = js.undefined
  var ShippingStreet: js.UndefOr[String] = js.undefined
  var SicDesc: js.UndefOr[String] = js.undefined
  var SystemModstamp: js.UndefOr[Date] = js.undefined
  var Type: js.UndefOr[String] = js.undefined
  var Website: js.UndefOr[String] = js.undefined
}

object SObjectCreateOptions {
  @scala.inline
  def apply(
    AccountSource: String = null,
    BillingCity: String = null,
    BillingCountry: String = null,
    BillingLatitude: js.UndefOr[Double] = js.undefined,
    BillingLongitude: js.UndefOr[Double] = js.undefined,
    BillingPostalCode: String = null,
    BillingState: String = null,
    BillingStreet: String = null,
    CreatedById: SalesforceId = null,
    CreatedDate: Date = null,
    Description: String = null,
    ExtId__c: String = null,
    Id: SalesforceId = null,
    Industry: String = null,
    IsDeleted: js.UndefOr[Boolean] = js.undefined,
    Jigsaw: String = null,
    JigsawCompanyId: String = null,
    LastActivityDate: Date = null,
    LastModifiedById: SalesforceId = null,
    LastModifiedDate: Date = null,
    LastReferencedDate: Date = null,
    LastViewedDate: Date = null,
    MasterRecordId: SalesforceId = null,
    Name: String = null,
    NumberOfEmployees: js.UndefOr[Double] = js.undefined,
    OwnerId: SalesforceId = null,
    ParentId: SalesforceId = null,
    Phone: String = null,
    ShippingCity: String = null,
    ShippingCountry: String = null,
    ShippingLatitude: js.UndefOr[Double] = js.undefined,
    ShippingLongitude: js.UndefOr[Double] = js.undefined,
    ShippingPostalCode: String = null,
    ShippingState: String = null,
    ShippingStreet: String = null,
    SicDesc: String = null,
    SystemModstamp: Date = null,
    Type: String = null,
    Website: String = null
  ): SObjectCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (AccountSource != null) __obj.updateDynamic("AccountSource")(AccountSource.asInstanceOf[js.Any])
    if (BillingCity != null) __obj.updateDynamic("BillingCity")(BillingCity.asInstanceOf[js.Any])
    if (BillingCountry != null) __obj.updateDynamic("BillingCountry")(BillingCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(BillingLatitude)) __obj.updateDynamic("BillingLatitude")(BillingLatitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BillingLongitude)) __obj.updateDynamic("BillingLongitude")(BillingLongitude.get.asInstanceOf[js.Any])
    if (BillingPostalCode != null) __obj.updateDynamic("BillingPostalCode")(BillingPostalCode.asInstanceOf[js.Any])
    if (BillingState != null) __obj.updateDynamic("BillingState")(BillingState.asInstanceOf[js.Any])
    if (BillingStreet != null) __obj.updateDynamic("BillingStreet")(BillingStreet.asInstanceOf[js.Any])
    if (CreatedById != null) __obj.updateDynamic("CreatedById")(CreatedById.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExtId__c != null) __obj.updateDynamic("ExtId__c")(ExtId__c.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Industry != null) __obj.updateDynamic("Industry")(Industry.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDeleted)) __obj.updateDynamic("IsDeleted")(IsDeleted.get.asInstanceOf[js.Any])
    if (Jigsaw != null) __obj.updateDynamic("Jigsaw")(Jigsaw.asInstanceOf[js.Any])
    if (JigsawCompanyId != null) __obj.updateDynamic("JigsawCompanyId")(JigsawCompanyId.asInstanceOf[js.Any])
    if (LastActivityDate != null) __obj.updateDynamic("LastActivityDate")(LastActivityDate.asInstanceOf[js.Any])
    if (LastModifiedById != null) __obj.updateDynamic("LastModifiedById")(LastModifiedById.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (LastReferencedDate != null) __obj.updateDynamic("LastReferencedDate")(LastReferencedDate.asInstanceOf[js.Any])
    if (LastViewedDate != null) __obj.updateDynamic("LastViewedDate")(LastViewedDate.asInstanceOf[js.Any])
    if (MasterRecordId != null) __obj.updateDynamic("MasterRecordId")(MasterRecordId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfEmployees)) __obj.updateDynamic("NumberOfEmployees")(NumberOfEmployees.get.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (Phone != null) __obj.updateDynamic("Phone")(Phone.asInstanceOf[js.Any])
    if (ShippingCity != null) __obj.updateDynamic("ShippingCity")(ShippingCity.asInstanceOf[js.Any])
    if (ShippingCountry != null) __obj.updateDynamic("ShippingCountry")(ShippingCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(ShippingLatitude)) __obj.updateDynamic("ShippingLatitude")(ShippingLatitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ShippingLongitude)) __obj.updateDynamic("ShippingLongitude")(ShippingLongitude.get.asInstanceOf[js.Any])
    if (ShippingPostalCode != null) __obj.updateDynamic("ShippingPostalCode")(ShippingPostalCode.asInstanceOf[js.Any])
    if (ShippingState != null) __obj.updateDynamic("ShippingState")(ShippingState.asInstanceOf[js.Any])
    if (ShippingStreet != null) __obj.updateDynamic("ShippingStreet")(ShippingStreet.asInstanceOf[js.Any])
    if (SicDesc != null) __obj.updateDynamic("SicDesc")(SicDesc.asInstanceOf[js.Any])
    if (SystemModstamp != null) __obj.updateDynamic("SystemModstamp")(SystemModstamp.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Website != null) __obj.updateDynamic("Website")(Website.asInstanceOf[js.Any])
    __obj.asInstanceOf[SObjectCreateOptions]
  }
}


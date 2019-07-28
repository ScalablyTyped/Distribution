package typings.jsforce.createDashOptionsMod

import typings.jsforce.salesforceDashIdMod.SalesforceId
import typings.jsforce.salesforceDashObjectDashOptionsMod.SObjectOptions
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
    BillingLatitude: Int | Double = null,
    BillingLongitude: Int | Double = null,
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
    NumberOfEmployees: Int | Double = null,
    OwnerId: SalesforceId = null,
    ParentId: SalesforceId = null,
    Phone: String = null,
    ShippingCity: String = null,
    ShippingCountry: String = null,
    ShippingLatitude: Int | Double = null,
    ShippingLongitude: Int | Double = null,
    ShippingPostalCode: String = null,
    ShippingState: String = null,
    ShippingStreet: String = null,
    SicDesc: String = null,
    SystemModstamp: Date = null,
    Type: String = null,
    Website: String = null
  ): SObjectCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (AccountSource != null) __obj.updateDynamic("AccountSource")(AccountSource)
    if (BillingCity != null) __obj.updateDynamic("BillingCity")(BillingCity)
    if (BillingCountry != null) __obj.updateDynamic("BillingCountry")(BillingCountry)
    if (BillingLatitude != null) __obj.updateDynamic("BillingLatitude")(BillingLatitude.asInstanceOf[js.Any])
    if (BillingLongitude != null) __obj.updateDynamic("BillingLongitude")(BillingLongitude.asInstanceOf[js.Any])
    if (BillingPostalCode != null) __obj.updateDynamic("BillingPostalCode")(BillingPostalCode)
    if (BillingState != null) __obj.updateDynamic("BillingState")(BillingState)
    if (BillingStreet != null) __obj.updateDynamic("BillingStreet")(BillingStreet)
    if (CreatedById != null) __obj.updateDynamic("CreatedById")(CreatedById)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExtId__c != null) __obj.updateDynamic("ExtId__c")(ExtId__c)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Industry != null) __obj.updateDynamic("Industry")(Industry)
    if (!js.isUndefined(IsDeleted)) __obj.updateDynamic("IsDeleted")(IsDeleted)
    if (Jigsaw != null) __obj.updateDynamic("Jigsaw")(Jigsaw)
    if (JigsawCompanyId != null) __obj.updateDynamic("JigsawCompanyId")(JigsawCompanyId)
    if (LastActivityDate != null) __obj.updateDynamic("LastActivityDate")(LastActivityDate)
    if (LastModifiedById != null) __obj.updateDynamic("LastModifiedById")(LastModifiedById)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (LastReferencedDate != null) __obj.updateDynamic("LastReferencedDate")(LastReferencedDate)
    if (LastViewedDate != null) __obj.updateDynamic("LastViewedDate")(LastViewedDate)
    if (MasterRecordId != null) __obj.updateDynamic("MasterRecordId")(MasterRecordId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NumberOfEmployees != null) __obj.updateDynamic("NumberOfEmployees")(NumberOfEmployees.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId)
    if (Phone != null) __obj.updateDynamic("Phone")(Phone)
    if (ShippingCity != null) __obj.updateDynamic("ShippingCity")(ShippingCity)
    if (ShippingCountry != null) __obj.updateDynamic("ShippingCountry")(ShippingCountry)
    if (ShippingLatitude != null) __obj.updateDynamic("ShippingLatitude")(ShippingLatitude.asInstanceOf[js.Any])
    if (ShippingLongitude != null) __obj.updateDynamic("ShippingLongitude")(ShippingLongitude.asInstanceOf[js.Any])
    if (ShippingPostalCode != null) __obj.updateDynamic("ShippingPostalCode")(ShippingPostalCode)
    if (ShippingState != null) __obj.updateDynamic("ShippingState")(ShippingState)
    if (ShippingStreet != null) __obj.updateDynamic("ShippingStreet")(ShippingStreet)
    if (SicDesc != null) __obj.updateDynamic("SicDesc")(SicDesc)
    if (SystemModstamp != null) __obj.updateDynamic("SystemModstamp")(SystemModstamp)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (Website != null) __obj.updateDynamic("Website")(Website)
    __obj.asInstanceOf[SObjectCreateOptions]
  }
}


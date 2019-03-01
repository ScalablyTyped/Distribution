package typings
package jsforceLib.createDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SObjectCreateOptions
  extends jsforceLib.salesforceDashObjectDashOptionsMod.SObjectOptions {
  var AccountSource: js.UndefOr[java.lang.String] = js.undefined
  var BillingCity: js.UndefOr[java.lang.String] = js.undefined
  var BillingCountry: js.UndefOr[java.lang.String] = js.undefined
  var BillingLatitude: js.UndefOr[scala.Double] = js.undefined
  var BillingLongitude: js.UndefOr[scala.Double] = js.undefined
  var BillingPostalCode: js.UndefOr[java.lang.String] = js.undefined
  var BillingState: js.UndefOr[java.lang.String] = js.undefined
  var BillingStreet: js.UndefOr[java.lang.String] = js.undefined
  var CreatedById: js.UndefOr[jsforceLib.salesforceDashIdMod.SalesforceId] = js.undefined
  var CreatedDate: js.UndefOr[stdLib.Date] = js.undefined
  var Description: js.UndefOr[java.lang.String] = js.undefined
  var Industry: js.UndefOr[java.lang.String] = js.undefined
  var IsDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var Jigsaw: js.UndefOr[java.lang.String] = js.undefined
  var JigsawCompanyId: js.UndefOr[java.lang.String] = js.undefined
  var LastActivityDate: js.UndefOr[stdLib.Date] = js.undefined
  var LastModifiedById: js.UndefOr[jsforceLib.salesforceDashIdMod.SalesforceId] = js.undefined
  var LastModifiedDate: js.UndefOr[stdLib.Date] = js.undefined
  var LastReferencedDate: js.UndefOr[stdLib.Date] = js.undefined
  var LastViewedDate: js.UndefOr[stdLib.Date] = js.undefined
  var MasterRecordId: js.UndefOr[jsforceLib.salesforceDashIdMod.SalesforceId] = js.undefined
  var NumberOfEmployees: js.UndefOr[scala.Double] = js.undefined
  var OwnerId: js.UndefOr[jsforceLib.salesforceDashIdMod.SalesforceId] = js.undefined
  var ParentId: js.UndefOr[jsforceLib.salesforceDashIdMod.SalesforceId] = js.undefined
  var Phone: js.UndefOr[java.lang.String] = js.undefined
  var ShippingCity: js.UndefOr[java.lang.String] = js.undefined
  var ShippingCountry: js.UndefOr[java.lang.String] = js.undefined
  var ShippingLatitude: js.UndefOr[scala.Double] = js.undefined
  var ShippingLongitude: js.UndefOr[scala.Double] = js.undefined
  var ShippingPostalCode: js.UndefOr[java.lang.String] = js.undefined
  var ShippingState: js.UndefOr[java.lang.String] = js.undefined
  var ShippingStreet: js.UndefOr[java.lang.String] = js.undefined
  var SicDesc: js.UndefOr[java.lang.String] = js.undefined
  var SystemModstamp: js.UndefOr[stdLib.Date] = js.undefined
  var Type: js.UndefOr[java.lang.String] = js.undefined
  var Website: js.UndefOr[java.lang.String] = js.undefined
}

object SObjectCreateOptions {
  @scala.inline
  def apply(
    AccountSource: java.lang.String = null,
    BillingCity: java.lang.String = null,
    BillingCountry: java.lang.String = null,
    BillingLatitude: scala.Int | scala.Double = null,
    BillingLongitude: scala.Int | scala.Double = null,
    BillingPostalCode: java.lang.String = null,
    BillingState: java.lang.String = null,
    BillingStreet: java.lang.String = null,
    CreatedById: jsforceLib.salesforceDashIdMod.SalesforceId = null,
    CreatedDate: stdLib.Date = null,
    Description: java.lang.String = null,
    ExtId__c: java.lang.String = null,
    Id: jsforceLib.salesforceDashIdMod.SalesforceId = null,
    Industry: java.lang.String = null,
    IsDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    Jigsaw: java.lang.String = null,
    JigsawCompanyId: java.lang.String = null,
    LastActivityDate: stdLib.Date = null,
    LastModifiedById: jsforceLib.salesforceDashIdMod.SalesforceId = null,
    LastModifiedDate: stdLib.Date = null,
    LastReferencedDate: stdLib.Date = null,
    LastViewedDate: stdLib.Date = null,
    MasterRecordId: jsforceLib.salesforceDashIdMod.SalesforceId = null,
    Name: java.lang.String = null,
    NumberOfEmployees: scala.Int | scala.Double = null,
    OwnerId: jsforceLib.salesforceDashIdMod.SalesforceId = null,
    ParentId: jsforceLib.salesforceDashIdMod.SalesforceId = null,
    Phone: java.lang.String = null,
    ShippingCity: java.lang.String = null,
    ShippingCountry: java.lang.String = null,
    ShippingLatitude: scala.Int | scala.Double = null,
    ShippingLongitude: scala.Int | scala.Double = null,
    ShippingPostalCode: java.lang.String = null,
    ShippingState: java.lang.String = null,
    ShippingStreet: java.lang.String = null,
    SicDesc: java.lang.String = null,
    SystemModstamp: stdLib.Date = null,
    Type: java.lang.String = null,
    Website: java.lang.String = null
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


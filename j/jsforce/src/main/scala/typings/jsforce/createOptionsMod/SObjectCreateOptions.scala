package typings.jsforce.createOptionsMod

import typings.jsforce.salesforceIdMod.SalesforceId
import typings.jsforce.salesforceObjectOptionsMod.SObjectOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SObjectCreateOptions extends SObjectOptions {
  
  var AccountSource: js.UndefOr[String] = js.native
  
  var BillingCity: js.UndefOr[String] = js.native
  
  var BillingCountry: js.UndefOr[String] = js.native
  
  var BillingLatitude: js.UndefOr[Double] = js.native
  
  var BillingLongitude: js.UndefOr[Double] = js.native
  
  var BillingPostalCode: js.UndefOr[String] = js.native
  
  var BillingState: js.UndefOr[String] = js.native
  
  var BillingStreet: js.UndefOr[String] = js.native
  
  var CreatedById: js.UndefOr[SalesforceId] = js.native
  
  var CreatedDate: js.UndefOr[Date] = js.native
  
  var Description: js.UndefOr[String] = js.native
  
  var Industry: js.UndefOr[String] = js.native
  
  var IsDeleted: js.UndefOr[Boolean] = js.native
  
  var Jigsaw: js.UndefOr[String] = js.native
  
  var JigsawCompanyId: js.UndefOr[String] = js.native
  
  var LastActivityDate: js.UndefOr[Date] = js.native
  
  var LastModifiedById: js.UndefOr[SalesforceId] = js.native
  
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  var LastReferencedDate: js.UndefOr[Date] = js.native
  
  var LastViewedDate: js.UndefOr[Date] = js.native
  
  var MasterRecordId: js.UndefOr[SalesforceId] = js.native
  
  var NumberOfEmployees: js.UndefOr[Double] = js.native
  
  var OwnerId: js.UndefOr[SalesforceId] = js.native
  
  var ParentId: js.UndefOr[SalesforceId] = js.native
  
  var Phone: js.UndefOr[String] = js.native
  
  var ShippingCity: js.UndefOr[String] = js.native
  
  var ShippingCountry: js.UndefOr[String] = js.native
  
  var ShippingLatitude: js.UndefOr[Double] = js.native
  
  var ShippingLongitude: js.UndefOr[Double] = js.native
  
  var ShippingPostalCode: js.UndefOr[String] = js.native
  
  var ShippingState: js.UndefOr[String] = js.native
  
  var ShippingStreet: js.UndefOr[String] = js.native
  
  var SicDesc: js.UndefOr[String] = js.native
  
  var SystemModstamp: js.UndefOr[Date] = js.native
  
  var Type: js.UndefOr[String] = js.native
  
  var Website: js.UndefOr[String] = js.native
}
object SObjectCreateOptions {
  
  @scala.inline
  def apply(): SObjectCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SObjectCreateOptions]
  }
  
  @scala.inline
  implicit class SObjectCreateOptionsOps[Self <: SObjectCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setAccountSource(value: String): Self = this.set("AccountSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountSource: Self = this.set("AccountSource", js.undefined)
    
    @scala.inline
    def setBillingCity(value: String): Self = this.set("BillingCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingCity: Self = this.set("BillingCity", js.undefined)
    
    @scala.inline
    def setBillingCountry(value: String): Self = this.set("BillingCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingCountry: Self = this.set("BillingCountry", js.undefined)
    
    @scala.inline
    def setBillingLatitude(value: Double): Self = this.set("BillingLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingLatitude: Self = this.set("BillingLatitude", js.undefined)
    
    @scala.inline
    def setBillingLongitude(value: Double): Self = this.set("BillingLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingLongitude: Self = this.set("BillingLongitude", js.undefined)
    
    @scala.inline
    def setBillingPostalCode(value: String): Self = this.set("BillingPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPostalCode: Self = this.set("BillingPostalCode", js.undefined)
    
    @scala.inline
    def setBillingState(value: String): Self = this.set("BillingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingState: Self = this.set("BillingState", js.undefined)
    
    @scala.inline
    def setBillingStreet(value: String): Self = this.set("BillingStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingStreet: Self = this.set("BillingStreet", js.undefined)
    
    @scala.inline
    def setCreatedById(value: SalesforceId): Self = this.set("CreatedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedById: Self = this.set("CreatedById", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIndustry(value: String): Self = this.set("Industry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndustry: Self = this.set("Industry", js.undefined)
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("IsDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDeleted: Self = this.set("IsDeleted", js.undefined)
    
    @scala.inline
    def setJigsaw(value: String): Self = this.set("Jigsaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJigsaw: Self = this.set("Jigsaw", js.undefined)
    
    @scala.inline
    def setJigsawCompanyId(value: String): Self = this.set("JigsawCompanyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJigsawCompanyId: Self = this.set("JigsawCompanyId", js.undefined)
    
    @scala.inline
    def setLastActivityDate(value: Date): Self = this.set("LastActivityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastActivityDate: Self = this.set("LastActivityDate", js.undefined)
    
    @scala.inline
    def setLastModifiedById(value: SalesforceId): Self = this.set("LastModifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedById: Self = this.set("LastModifiedById", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLastReferencedDate(value: Date): Self = this.set("LastReferencedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastReferencedDate: Self = this.set("LastReferencedDate", js.undefined)
    
    @scala.inline
    def setLastViewedDate(value: Date): Self = this.set("LastViewedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastViewedDate: Self = this.set("LastViewedDate", js.undefined)
    
    @scala.inline
    def setMasterRecordId(value: SalesforceId): Self = this.set("MasterRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterRecordId: Self = this.set("MasterRecordId", js.undefined)
    
    @scala.inline
    def setNumberOfEmployees(value: Double): Self = this.set("NumberOfEmployees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfEmployees: Self = this.set("NumberOfEmployees", js.undefined)
    
    @scala.inline
    def setOwnerId(value: SalesforceId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setParentId(value: SalesforceId): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("ParentId", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("Phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("Phone", js.undefined)
    
    @scala.inline
    def setShippingCity(value: String): Self = this.set("ShippingCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCity: Self = this.set("ShippingCity", js.undefined)
    
    @scala.inline
    def setShippingCountry(value: String): Self = this.set("ShippingCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCountry: Self = this.set("ShippingCountry", js.undefined)
    
    @scala.inline
    def setShippingLatitude(value: Double): Self = this.set("ShippingLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingLatitude: Self = this.set("ShippingLatitude", js.undefined)
    
    @scala.inline
    def setShippingLongitude(value: Double): Self = this.set("ShippingLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingLongitude: Self = this.set("ShippingLongitude", js.undefined)
    
    @scala.inline
    def setShippingPostalCode(value: String): Self = this.set("ShippingPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingPostalCode: Self = this.set("ShippingPostalCode", js.undefined)
    
    @scala.inline
    def setShippingState(value: String): Self = this.set("ShippingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingState: Self = this.set("ShippingState", js.undefined)
    
    @scala.inline
    def setShippingStreet(value: String): Self = this.set("ShippingStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingStreet: Self = this.set("ShippingStreet", js.undefined)
    
    @scala.inline
    def setSicDesc(value: String): Self = this.set("SicDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSicDesc: Self = this.set("SicDesc", js.undefined)
    
    @scala.inline
    def setSystemModstamp(value: Date): Self = this.set("SystemModstamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemModstamp: Self = this.set("SystemModstamp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = this.set("Website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsite: Self = this.set("Website", js.undefined)
  }
}

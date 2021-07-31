package typings.jsforce

import typings.jsforce.salesforceIdMod.SalesforceId
import typings.jsforce.salesforceObjectOptionsMod.SObjectOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createOptionsMod {
  
  trait SObjectCreateOptions
    extends StObject
       with SObjectOptions {
    
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
    def apply(): SObjectCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SObjectCreateOptions]
    }
    
    @scala.inline
    implicit class SObjectCreateOptionsMutableBuilder[Self <: SObjectCreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountSource(value: String): Self = StObject.set(x, "AccountSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountSourceUndefined: Self = StObject.set(x, "AccountSource", js.undefined)
      
      @scala.inline
      def setBillingCity(value: String): Self = StObject.set(x, "BillingCity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingCityUndefined: Self = StObject.set(x, "BillingCity", js.undefined)
      
      @scala.inline
      def setBillingCountry(value: String): Self = StObject.set(x, "BillingCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingCountryUndefined: Self = StObject.set(x, "BillingCountry", js.undefined)
      
      @scala.inline
      def setBillingLatitude(value: Double): Self = StObject.set(x, "BillingLatitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingLatitudeUndefined: Self = StObject.set(x, "BillingLatitude", js.undefined)
      
      @scala.inline
      def setBillingLongitude(value: Double): Self = StObject.set(x, "BillingLongitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingLongitudeUndefined: Self = StObject.set(x, "BillingLongitude", js.undefined)
      
      @scala.inline
      def setBillingPostalCode(value: String): Self = StObject.set(x, "BillingPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingPostalCodeUndefined: Self = StObject.set(x, "BillingPostalCode", js.undefined)
      
      @scala.inline
      def setBillingState(value: String): Self = StObject.set(x, "BillingState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingStateUndefined: Self = StObject.set(x, "BillingState", js.undefined)
      
      @scala.inline
      def setBillingStreet(value: String): Self = StObject.set(x, "BillingStreet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingStreetUndefined: Self = StObject.set(x, "BillingStreet", js.undefined)
      
      @scala.inline
      def setCreatedById(value: SalesforceId): Self = StObject.set(x, "CreatedById", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByIdUndefined: Self = StObject.set(x, "CreatedById", js.undefined)
      
      @scala.inline
      def setCreatedDate(value: Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setIndustry(value: String): Self = StObject.set(x, "Industry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndustryUndefined: Self = StObject.set(x, "Industry", js.undefined)
      
      @scala.inline
      def setIsDeleted(value: Boolean): Self = StObject.set(x, "IsDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDeletedUndefined: Self = StObject.set(x, "IsDeleted", js.undefined)
      
      @scala.inline
      def setJigsaw(value: String): Self = StObject.set(x, "Jigsaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJigsawCompanyId(value: String): Self = StObject.set(x, "JigsawCompanyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJigsawCompanyIdUndefined: Self = StObject.set(x, "JigsawCompanyId", js.undefined)
      
      @scala.inline
      def setJigsawUndefined: Self = StObject.set(x, "Jigsaw", js.undefined)
      
      @scala.inline
      def setLastActivityDate(value: Date): Self = StObject.set(x, "LastActivityDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastActivityDateUndefined: Self = StObject.set(x, "LastActivityDate", js.undefined)
      
      @scala.inline
      def setLastModifiedById(value: SalesforceId): Self = StObject.set(x, "LastModifiedById", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedByIdUndefined: Self = StObject.set(x, "LastModifiedById", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      @scala.inline
      def setLastReferencedDate(value: Date): Self = StObject.set(x, "LastReferencedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastReferencedDateUndefined: Self = StObject.set(x, "LastReferencedDate", js.undefined)
      
      @scala.inline
      def setLastViewedDate(value: Date): Self = StObject.set(x, "LastViewedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastViewedDateUndefined: Self = StObject.set(x, "LastViewedDate", js.undefined)
      
      @scala.inline
      def setMasterRecordId(value: SalesforceId): Self = StObject.set(x, "MasterRecordId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterRecordIdUndefined: Self = StObject.set(x, "MasterRecordId", js.undefined)
      
      @scala.inline
      def setNumberOfEmployees(value: Double): Self = StObject.set(x, "NumberOfEmployees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfEmployeesUndefined: Self = StObject.set(x, "NumberOfEmployees", js.undefined)
      
      @scala.inline
      def setOwnerId(value: SalesforceId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
      
      @scala.inline
      def setParentId(value: SalesforceId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "Phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "Phone", js.undefined)
      
      @scala.inline
      def setShippingCity(value: String): Self = StObject.set(x, "ShippingCity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingCityUndefined: Self = StObject.set(x, "ShippingCity", js.undefined)
      
      @scala.inline
      def setShippingCountry(value: String): Self = StObject.set(x, "ShippingCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingCountryUndefined: Self = StObject.set(x, "ShippingCountry", js.undefined)
      
      @scala.inline
      def setShippingLatitude(value: Double): Self = StObject.set(x, "ShippingLatitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingLatitudeUndefined: Self = StObject.set(x, "ShippingLatitude", js.undefined)
      
      @scala.inline
      def setShippingLongitude(value: Double): Self = StObject.set(x, "ShippingLongitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingLongitudeUndefined: Self = StObject.set(x, "ShippingLongitude", js.undefined)
      
      @scala.inline
      def setShippingPostalCode(value: String): Self = StObject.set(x, "ShippingPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingPostalCodeUndefined: Self = StObject.set(x, "ShippingPostalCode", js.undefined)
      
      @scala.inline
      def setShippingState(value: String): Self = StObject.set(x, "ShippingState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingStateUndefined: Self = StObject.set(x, "ShippingState", js.undefined)
      
      @scala.inline
      def setShippingStreet(value: String): Self = StObject.set(x, "ShippingStreet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingStreetUndefined: Self = StObject.set(x, "ShippingStreet", js.undefined)
      
      @scala.inline
      def setSicDesc(value: String): Self = StObject.set(x, "SicDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSicDescUndefined: Self = StObject.set(x, "SicDesc", js.undefined)
      
      @scala.inline
      def setSystemModstamp(value: Date): Self = StObject.set(x, "SystemModstamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemModstampUndefined: Self = StObject.set(x, "SystemModstamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "Website", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteUndefined: Self = StObject.set(x, "Website", js.undefined)
    }
  }
}

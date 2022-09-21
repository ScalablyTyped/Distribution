package typings.jsforce

import typings.jsforce.salesforceIdMod.SalesforceId
import typings.jsforce.salesforceObjectOptionsMod.SObjectOptions
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
    
    var CreatedDate: js.UndefOr[js.Date] = js.undefined
    
    var Description: js.UndefOr[String] = js.undefined
    
    var Industry: js.UndefOr[String] = js.undefined
    
    var IsDeleted: js.UndefOr[Boolean] = js.undefined
    
    var Jigsaw: js.UndefOr[String] = js.undefined
    
    var JigsawCompanyId: js.UndefOr[String] = js.undefined
    
    var LastActivityDate: js.UndefOr[js.Date] = js.undefined
    
    var LastModifiedById: js.UndefOr[SalesforceId] = js.undefined
    
    var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
    
    var LastReferencedDate: js.UndefOr[js.Date] = js.undefined
    
    var LastViewedDate: js.UndefOr[js.Date] = js.undefined
    
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
    
    var SystemModstamp: js.UndefOr[js.Date] = js.undefined
    
    var Type: js.UndefOr[String] = js.undefined
    
    var Website: js.UndefOr[String] = js.undefined
  }
  object SObjectCreateOptions {
    
    inline def apply(): SObjectCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SObjectCreateOptions]
    }
    
    extension [Self <: SObjectCreateOptions](x: Self) {
      
      inline def setAccountSource(value: String): Self = StObject.set(x, "AccountSource", value.asInstanceOf[js.Any])
      
      inline def setAccountSourceUndefined: Self = StObject.set(x, "AccountSource", js.undefined)
      
      inline def setBillingCity(value: String): Self = StObject.set(x, "BillingCity", value.asInstanceOf[js.Any])
      
      inline def setBillingCityUndefined: Self = StObject.set(x, "BillingCity", js.undefined)
      
      inline def setBillingCountry(value: String): Self = StObject.set(x, "BillingCountry", value.asInstanceOf[js.Any])
      
      inline def setBillingCountryUndefined: Self = StObject.set(x, "BillingCountry", js.undefined)
      
      inline def setBillingLatitude(value: Double): Self = StObject.set(x, "BillingLatitude", value.asInstanceOf[js.Any])
      
      inline def setBillingLatitudeUndefined: Self = StObject.set(x, "BillingLatitude", js.undefined)
      
      inline def setBillingLongitude(value: Double): Self = StObject.set(x, "BillingLongitude", value.asInstanceOf[js.Any])
      
      inline def setBillingLongitudeUndefined: Self = StObject.set(x, "BillingLongitude", js.undefined)
      
      inline def setBillingPostalCode(value: String): Self = StObject.set(x, "BillingPostalCode", value.asInstanceOf[js.Any])
      
      inline def setBillingPostalCodeUndefined: Self = StObject.set(x, "BillingPostalCode", js.undefined)
      
      inline def setBillingState(value: String): Self = StObject.set(x, "BillingState", value.asInstanceOf[js.Any])
      
      inline def setBillingStateUndefined: Self = StObject.set(x, "BillingState", js.undefined)
      
      inline def setBillingStreet(value: String): Self = StObject.set(x, "BillingStreet", value.asInstanceOf[js.Any])
      
      inline def setBillingStreetUndefined: Self = StObject.set(x, "BillingStreet", js.undefined)
      
      inline def setCreatedById(value: SalesforceId): Self = StObject.set(x, "CreatedById", value.asInstanceOf[js.Any])
      
      inline def setCreatedByIdUndefined: Self = StObject.set(x, "CreatedById", js.undefined)
      
      inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setIndustry(value: String): Self = StObject.set(x, "Industry", value.asInstanceOf[js.Any])
      
      inline def setIndustryUndefined: Self = StObject.set(x, "Industry", js.undefined)
      
      inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "IsDeleted", value.asInstanceOf[js.Any])
      
      inline def setIsDeletedUndefined: Self = StObject.set(x, "IsDeleted", js.undefined)
      
      inline def setJigsaw(value: String): Self = StObject.set(x, "Jigsaw", value.asInstanceOf[js.Any])
      
      inline def setJigsawCompanyId(value: String): Self = StObject.set(x, "JigsawCompanyId", value.asInstanceOf[js.Any])
      
      inline def setJigsawCompanyIdUndefined: Self = StObject.set(x, "JigsawCompanyId", js.undefined)
      
      inline def setJigsawUndefined: Self = StObject.set(x, "Jigsaw", js.undefined)
      
      inline def setLastActivityDate(value: js.Date): Self = StObject.set(x, "LastActivityDate", value.asInstanceOf[js.Any])
      
      inline def setLastActivityDateUndefined: Self = StObject.set(x, "LastActivityDate", js.undefined)
      
      inline def setLastModifiedById(value: SalesforceId): Self = StObject.set(x, "LastModifiedById", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedByIdUndefined: Self = StObject.set(x, "LastModifiedById", js.undefined)
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setLastReferencedDate(value: js.Date): Self = StObject.set(x, "LastReferencedDate", value.asInstanceOf[js.Any])
      
      inline def setLastReferencedDateUndefined: Self = StObject.set(x, "LastReferencedDate", js.undefined)
      
      inline def setLastViewedDate(value: js.Date): Self = StObject.set(x, "LastViewedDate", value.asInstanceOf[js.Any])
      
      inline def setLastViewedDateUndefined: Self = StObject.set(x, "LastViewedDate", js.undefined)
      
      inline def setMasterRecordId(value: SalesforceId): Self = StObject.set(x, "MasterRecordId", value.asInstanceOf[js.Any])
      
      inline def setMasterRecordIdUndefined: Self = StObject.set(x, "MasterRecordId", js.undefined)
      
      inline def setNumberOfEmployees(value: Double): Self = StObject.set(x, "NumberOfEmployees", value.asInstanceOf[js.Any])
      
      inline def setNumberOfEmployeesUndefined: Self = StObject.set(x, "NumberOfEmployees", js.undefined)
      
      inline def setOwnerId(value: SalesforceId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
      
      inline def setParentId(value: SalesforceId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "Phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "Phone", js.undefined)
      
      inline def setShippingCity(value: String): Self = StObject.set(x, "ShippingCity", value.asInstanceOf[js.Any])
      
      inline def setShippingCityUndefined: Self = StObject.set(x, "ShippingCity", js.undefined)
      
      inline def setShippingCountry(value: String): Self = StObject.set(x, "ShippingCountry", value.asInstanceOf[js.Any])
      
      inline def setShippingCountryUndefined: Self = StObject.set(x, "ShippingCountry", js.undefined)
      
      inline def setShippingLatitude(value: Double): Self = StObject.set(x, "ShippingLatitude", value.asInstanceOf[js.Any])
      
      inline def setShippingLatitudeUndefined: Self = StObject.set(x, "ShippingLatitude", js.undefined)
      
      inline def setShippingLongitude(value: Double): Self = StObject.set(x, "ShippingLongitude", value.asInstanceOf[js.Any])
      
      inline def setShippingLongitudeUndefined: Self = StObject.set(x, "ShippingLongitude", js.undefined)
      
      inline def setShippingPostalCode(value: String): Self = StObject.set(x, "ShippingPostalCode", value.asInstanceOf[js.Any])
      
      inline def setShippingPostalCodeUndefined: Self = StObject.set(x, "ShippingPostalCode", js.undefined)
      
      inline def setShippingState(value: String): Self = StObject.set(x, "ShippingState", value.asInstanceOf[js.Any])
      
      inline def setShippingStateUndefined: Self = StObject.set(x, "ShippingState", js.undefined)
      
      inline def setShippingStreet(value: String): Self = StObject.set(x, "ShippingStreet", value.asInstanceOf[js.Any])
      
      inline def setShippingStreetUndefined: Self = StObject.set(x, "ShippingStreet", js.undefined)
      
      inline def setSicDesc(value: String): Self = StObject.set(x, "SicDesc", value.asInstanceOf[js.Any])
      
      inline def setSicDescUndefined: Self = StObject.set(x, "SicDesc", js.undefined)
      
      inline def setSystemModstamp(value: js.Date): Self = StObject.set(x, "SystemModstamp", value.asInstanceOf[js.Any])
      
      inline def setSystemModstampUndefined: Self = StObject.set(x, "SystemModstamp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "Website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "Website", js.undefined)
    }
  }
}

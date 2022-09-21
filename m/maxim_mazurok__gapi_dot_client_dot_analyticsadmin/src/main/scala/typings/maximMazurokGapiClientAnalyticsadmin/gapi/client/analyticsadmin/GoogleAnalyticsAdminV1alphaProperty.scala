package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaProperty extends StObject {
  
  /** Immutable. The resource name of the parent account Format: accounts/{account_id} Example: "accounts/123" */
  var account: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when the entity was originally created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The currency type used in reports involving monetary values. Format: https://en.wikipedia.org/wiki/ISO_4217 Examples: "USD", "EUR", "JPY" */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /** Output only. If set, the time at which this property was trashed. If not set, then this property is not currently in the trash can. */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /** Required. Human-readable display name for this property. The max allowed display name length is 100 UTF-16 code units. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. If set, the time at which this trashed property will be permanently deleted. If not set, then this property is not currently in the trash can and is not slated to be
    * deleted.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** Industry associated with this property Example: AUTOMOTIVE, FOOD_AND_DRINK */
  var industryCategory: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of this property. Format: properties/{property_id} Example: "properties/1000" */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. Resource name of this property's logical parent. Note: The Property-Moving UI can be used to change the parent. Format: accounts/{account}, properties/{property} Example:
    * "accounts/100", "properties/101"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The property type for this Property resource. When creating a property, if the type is "PROPERTY_TYPE_UNSPECIFIED", then "ORDINARY_PROPERTY" will be implied.
    * "SUBPROPERTY" and "ROLLUP_PROPERTY" types cannot yet be created via Google Analytics Admin API.
    */
  var propertyType: js.UndefOr[String] = js.undefined
  
  /** Output only. The Google Analytics service level that applies to this property. */
  var serviceLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Reporting Time Zone, used as the day boundary for reports, regardless of where the data originates. If the time zone honors DST, Analytics will automatically adjust for
    * the changes. NOTE: Changing the time zone only affects data going forward, and is not applied retroactively. Format: https://www.iana.org/time-zones Example: "America/Los_Angeles"
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when entity payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaProperty {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaProperty]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaProperty](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setIndustryCategory(value: String): Self = StObject.set(x, "industryCategory", value.asInstanceOf[js.Any])
    
    inline def setIndustryCategoryUndefined: Self = StObject.set(x, "industryCategory", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPropertyType(value: String): Self = StObject.set(x, "propertyType", value.asInstanceOf[js.Any])
    
    inline def setPropertyTypeUndefined: Self = StObject.set(x, "propertyType", js.undefined)
    
    inline def setServiceLevel(value: String): Self = StObject.set(x, "serviceLevel", value.asInstanceOf[js.Any])
    
    inline def setServiceLevelUndefined: Self = StObject.set(x, "serviceLevel", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

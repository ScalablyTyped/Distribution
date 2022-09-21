package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaPropertySummary extends StObject {
  
  /**
    * Display name for the property referred to in this property summary.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of this property's logical parent. Note: The Property-Moving UI can be used to change the parent. Format: accounts/{account\}, properties/{property\} Example: "accounts/100", "properties/200"
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of property referred to by this property summary Format: properties/{property_id\} Example: "properties/1000"
    */
  var property: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The property's property type.
    */
  var propertyType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaPropertySummary {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaPropertySummary]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaPropertySummary](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyNull: Self = StObject.set(x, "property", null)
    
    inline def setPropertyType(value: String): Self = StObject.set(x, "propertyType", value.asInstanceOf[js.Any])
    
    inline def setPropertyTypeNull: Self = StObject.set(x, "propertyType", null)
    
    inline def setPropertyTypeUndefined: Self = StObject.set(x, "propertyType", js.undefined)
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}

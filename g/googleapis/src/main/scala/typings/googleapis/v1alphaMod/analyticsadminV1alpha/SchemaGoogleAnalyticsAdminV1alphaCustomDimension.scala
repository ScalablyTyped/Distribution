package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaCustomDimension extends StObject {
  
  /**
    * Optional. Description for this custom dimension. Max length of 150 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If set to true, sets this dimension as NPA and excludes it from ads personalization. This is currently only supported by user-scoped custom dimensions.
    */
  var disallowAdsPersonalization: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Display name for this custom dimension as shown in the Analytics UI. Max length of 82 characters, alphanumeric plus space and underscore starting with a letter. Legacy system-generated display names may contain square brackets, but updates to this field will never permit square brackets.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name for this CustomDimension resource. Format: properties/{property\}/customDimensions/{customDimension\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. Tagging parameter name for this custom dimension. If this is a user-scoped dimension, then this is the user property name. If this is an event-scoped dimension, then this is the event parameter name. May only contain alphanumeric and underscore characters, starting with a letter. Max length of 24 characters for user-scoped dimensions, 40 characters for event-scoped dimensions.
    */
  var parameterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The scope of this dimension.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaCustomDimension {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaCustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaCustomDimension](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisallowAdsPersonalization(value: Boolean): Self = StObject.set(x, "disallowAdsPersonalization", value.asInstanceOf[js.Any])
    
    inline def setDisallowAdsPersonalizationNull: Self = StObject.set(x, "disallowAdsPersonalization", null)
    
    inline def setDisallowAdsPersonalizationUndefined: Self = StObject.set(x, "disallowAdsPersonalization", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameNull: Self = StObject.set(x, "parameterName", null)
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
